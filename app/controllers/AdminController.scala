package controllers

import com.mohiva.play.silhouette.api.{ LoginEvent, LoginInfo, SignUpEvent }
import com.mohiva.play.silhouette.impl.providers.{ CommonSocialProfile, CredentialsProvider }
import models.user.{ RegistrationData, UserForms }

import play.api.i18n.{ Messages, MessagesApi }
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.mvc.AnyContent
import services.user.AuthenticationEnvironment
import jdub.async.Database
import models.queries._
import models.user._
import scala.concurrent.Future
import services.admin._
import play.api._
import play.api.mvc._
import com.mohiva.play.silhouette.api._
import java.io.File

import scala.util.{Success, Failure}

@javax.inject.Singleton
  class AdminController @javax.inject.Inject() (override val messagesApi: MessagesApi, 
  override val env: AuthenticationEnvironment) 
  extends BaseController {

  //create contest form        
  def contestForm = withSession { implicit request =>
    Database.query(EvaluatorQueries.getEvaluators).map { evaluators =>
    Ok(views.html.createContest(request.identity, UserForms.contestForm,evaluators) )
    //, UserForms.registrationForm
  }}


  //create a contest
  def create = UserAwareAction.async(parse.multipartFormData)  { implicit request =>
    request.identity match {
          case Some(u) => val contestSubmission = UserForms.contestForm.bindFromRequest()
                contestSubmission.fold(
                formWithErrors =>  Future.successful(BadRequest("Form Error")),
                contest =>  {
                    val insertContest = ContestCreateService.save(u,contest);
                    insertContest.onComplete {
                    case Success(contestFolder) =>
                        val x = ContestCreateService.uploadTestSet(request,contestFolder.toString) 
                    case Failure(t) => println("FAILED")
                    }
                    Future.successful(Ok(s"Contest ${contest.contest_name} created successfully"));
                })
          case None => Future.successful(Redirect(controllers.routes.RegistrationController.registrationForm()))    
    }
  }


  def inviteUsers = TODO
  def editUsers = TODO
  def contestUpdate = TODO
 
}

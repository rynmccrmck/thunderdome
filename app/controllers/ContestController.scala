package controllers

import com.mohiva.play.silhouette.api.{ LoginEvent, LoginInfo, SignUpEvent }
import com.mohiva.play.silhouette.impl.providers.{ CommonSocialProfile, CredentialsProvider }
import models.user.{ RegistrationData, UserForms }

import play.api.libs.Files.TemporaryFile
import play.api.i18n.{ Messages, MessagesApi }
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.mvc.AnyContent
import services.user.AuthenticationEnvironment
import jdub.async.Database
import models.queries.ContestQueries
import models.user._
import models.queries.ProfileQueries
import scala.concurrent.Future
import services.admin._
import play.api._
import play.api.mvc._
import com.mohiva.play.silhouette.api._

@javax.inject.Singleton
class ContestController @javax.inject.Inject() (
    override val messagesApi: MessagesApi,
    override val env: AuthenticationEnvironment
) extends BaseController {

  
  //create contest form        
  def contestForm = withSession { implicit request =>
    Future.successful(Ok(views.html.createContest(request.identity, UserForms.contestForm) ))
    //, UserForms.registrationForm
  }
  
  //view contests TODO look at filter for applicable contests?
  def contests = withSession { s =>
      Database.query(ContestQueries.GetContests).map { contests =>
      Ok(views.html.contests(s.identity, contests))
    }
  }
  
  //view contest
  def contest(contest_id:String) = withSession { s =>
      Database.query(ContestQueries.GetContest(contest_id.toInt)).map { contest =>
      Ok(views.html.contest(s.identity, contest))
    }
  }
  
  //create a contest
  def create = UserAwareAction.async(parse.multipartFormData)  { implicit request =>
    request.identity match {
          case Some(u) => val contestSubmission = UserForms.contestForm.bindFromRequest()
                        contestSubmission.fold(
                              formWithErrors =>  Future.successful(BadRequest("ARG")),
                              contest =>  {
                                 ContestCreateService.save(u,contest);
                                 uploadTestSet(request,contest.contest_name)
                                 Future.successful(Ok(s"Contest ${contest.contest_name} created successfully"))
                                }
                            )
          case None => Future.successful(Redirect(controllers.routes.RegistrationController.registrationForm()))    
    }
  }
  //move this to services
  def uploadTestSet(request: Request[MultipartFormData[TemporaryFile]],contest_id:String): String = {
    Logger.error("Called uploadFile function" + request)
    request.body.file("testset").map { picture =>
      import java.io.File
      val filename = picture.filename
      val contentType = picture.contentType
      Logger.error(s"File name : $filename, content type : $contentType")
      picture.ref.moveTo(new File(s"/tmp/${contest_id}_testset"))
      "File uploaded"
    }.getOrElse {
      "Missing file"
    }
  }  


} 
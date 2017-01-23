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
import models.queries._
import models.user._
import scala.concurrent.Future
import services.user._
import play.api._
import play.api.mvc._
import com.mohiva.play.silhouette.api._

@javax.inject.Singleton
class SubmissionController @javax.inject.Inject() (
    override val messagesApi: MessagesApi,
    override val env: AuthenticationEnvironment
) extends BaseController {
    
  def submission(contest_id:String) = withSession { s =>
    Future.successful(Ok(views.html.submission(s.identity,UserForms.submissionForm,contest_id)))
  }    
    
  def upload = Action(parse.multipartFormData) { implicit request =>
    val result = uploadFile(request)
    //evaluate!
    Redirect(routes.HomeController.index).flashing("message" -> result)
  }

  def create = UserAwareAction.async(parse.multipartFormData)  { implicit request =>
    request.identity match {
          case Some(u) => val submission = UserForms.submissionForm.bindFromRequest()
                        submission.fold(
                              formWithErrors =>  Future.successful(BadRequest("Form Error")),
                              submission =>  {
                                 uploadFile(request)
                                 //validate submission
                                 //evaluate predctions and return score
                                 val score = 0.0
                                 SubmissionService.save(u,submission,score)
                                 Future.successful(Ok(s"submission created successfully with score: $score"))
                                }
                            )
          case None => Future.successful(Redirect(controllers.routes.RegistrationController.registrationForm()))    
    }
  }

    
  def uploadFile(request: Request[MultipartFormData[TemporaryFile]]): String = {
    Logger.error("Called uploadFile function" + request)
    request.body.file("submission").map { picture =>
      import java.io.File
      val filename = picture.filename
      val contentType = picture.contentType
      Logger.error(s"File name : $filename, content type : $contentType")
      picture.ref.moveTo(new File(s"/tmp/$filename"))
      "File uploaded"
    }.getOrElse {
      "Missing file"
    }
  }

}
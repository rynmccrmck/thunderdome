package controllers

import java.io.File

import play.api.Logger
import play.api.libs.Files.TemporaryFile
import play.api.mvc.MultipartFormData
import play.api.mvc.Request
import play.api.i18n.{ Messages, MessagesApi }
import services.user.AuthenticationEnvironment

import scala.concurrent.Future

import play.api._
import play.api.mvc._

class SubmissionController @javax.inject.Inject() (
    override val messagesApi: MessagesApi,
    override val env: AuthenticationEnvironment
) extends BaseController {
    
  def submission = withSession { s =>
    Future.successful(Ok(views.html.submission(s.identity)))
  }    
    
  def upload = Action(parse.multipartFormData) { implicit request =>
    val result = uploadFile(request)
    Redirect(routes.HomeController.index).flashing("message" -> result)
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
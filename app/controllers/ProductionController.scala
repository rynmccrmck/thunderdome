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
class ProductionController @javax.inject.Inject() (
    override val messagesApi: MessagesApi,
    override val env: AuthenticationEnvironment
) extends BaseController {

  def productionModels = TODO

}
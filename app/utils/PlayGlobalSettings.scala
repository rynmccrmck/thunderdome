package utils

import java.util.TimeZone

import jdub.async.Database
import org.joda.time.DateTimeZone
import play.api.{ Application, GlobalSettings }
import services.database.Schema

import play.api._
import play.api.mvc._
import play.api.mvc.Results._

import scala.concurrent.Future

object PlayGlobalSettings extends GlobalSettings {

/*    
  // called when a route is found, but it was not possible to bind the request parameters
  override def onBadRequest(request: RequestHeader, error: String) = {
    BadRequest("Bad Request: " + error)
  } 

  // 500 - internal server error
  override def onError(request: RequestHeader, throwable: Throwable) = {
    InternalServerError(views.html.notFoundPage(throwable))
  }*/

  // 404 - page not found error
  override def onHandlerNotFound(request: RequestHeader): scala.concurrent.Future[play.api.mvc.Result] = {
    Future.successful(NotFound(views.html.notFoundPage(request)))
  }
  
  override def onStart(app: Application) = {
    DateTimeZone.setDefault(DateTimeZone.UTC)
    TimeZone.setDefault(TimeZone.getTimeZone("UTC"))

    val cnf = play.api.Play.current.configuration
    val host = cnf.getString("db.host").getOrElse("localhost")
    val port = 5432
    val database = cnf.getString("db.database")
    val username = cnf.getString("db.username").getOrElse("silhouette")
    val password = cnf.getString("db.password")
    
    Database.open(username, host, port, password, database)
    Schema.update()

    super.onStart(app)
  }

  override def onStop(app: Application) = {
    Database.close()
    super.onStop(app)
  }
}

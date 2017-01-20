package controllers

import com.mohiva.play.silhouette.api.{ LoginEvent, LoginInfo, SignUpEvent }
import com.mohiva.play.silhouette.impl.providers.{ CommonSocialProfile, CredentialsProvider }
import models.user.{ RegistrationData, UserForms }

import play.api.i18n.{ Messages, MessagesApi }
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.mvc.AnyContent
import services.user.AuthenticationEnvironment
import jdub.async.Database
import models.queries.ContestQueries

import models.queries.ProfileQueries
import scala.concurrent.Future

@javax.inject.Singleton
class ContestController @javax.inject.Inject() (
    override val messagesApi: MessagesApi,
    override val env: AuthenticationEnvironment
) extends BaseController {

    
  def contestForm = withSession { implicit request =>
    Future.successful(Ok(views.html.createContest(request.identity, UserForms.contestForm) ))
    //, UserForms.registrationForm
  }
  
  def contests = withSession { s =>
      Database.query(ContestQueries.GetContests).map { contests =>
      Ok(views.html.contests(s.identity, contests))
    }
  }
  
  def contest(contest_id:String) = withSession { s =>
      Database.query(ContestQueries.GetContest(contest_id.toInt)).map { contest =>
      Ok(views.html.contest(s.identity, contest))
    }
  }
  
  def create = withSession { implicit request =>
    val test = UserForms.contestForm.bindFromRequest()
    println(test)
    test.fold(
      formWithErrors =>  Future.successful(BadRequest(views.html.index(request.identity))),
      contest =>  Future.successful(Ok(s"Customer ${contest.contest_name} created successfully"))
    )
  }
  

} 
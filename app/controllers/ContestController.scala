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
class ContestController @javax.inject.Inject() (
    override val messagesApi: MessagesApi,
    override val env: AuthenticationEnvironment
) extends BaseController {

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
  
  def contestData(contest_id:String) = withSession { s =>
      Database.query(ContestQueries.GetContest(contest_id.toInt)).map { contest =>
      Ok(views.html.contestData(s.identity, contest))
    }
  }

  def downloadTestSet(contest_folder:String) = withSession { s =>
    val location = new File(s"./data/contests/${contest_folder}/testset/testset.csv")
    Future.successful(Ok.sendFile(location, 
        inline=true).withHeaders(CACHE_CONTROL->"max-age=3600",
        CONTENT_DISPOSITION->"attachment; filename=testset.csv", 
        CONTENT_TYPE->"application/x-download"))
  }
} 
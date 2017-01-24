package controllers

import services.admin._
import services.user._
import models.queries._
import models.user._
import models.contests._

import com.mohiva.play.silhouette.api.{ LoginEvent, LoginInfo, SignUpEvent }
import com.mohiva.play.silhouette.impl.providers.{ CommonSocialProfile, CredentialsProvider }
import models.user.{ RegistrationData, UserForms }

import play.api.libs.Files.TemporaryFile
import play.api.i18n.{ Messages, MessagesApi }
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import play.api.mvc.AnyContent
import play.api._
import play.api.mvc._

import jdub.async.Database
import services.user.AuthenticationEnvironment
import scala.io.Source
import scala.concurrent.Future
//import com.mohiva.play.silhouette.api._

@javax.inject.Singleton
class SubmissionController @javax.inject.Inject() (
    override val messagesApi: MessagesApi,
    override val env: AuthenticationEnvironment
) extends BaseController {
    
  def submissions = TODO
    
  def submission(contest_id:String) = withSession { s =>
    Database.query(ContestQueries.GetContest(contest_id.toInt)).map { contest =>
        Ok(views.html.submission(s.identity,UserForms.submissionForm,contest))
    }
  }    
    
  def create = UserAwareAction.async(parse.multipartFormData)  { implicit request =>
    request.identity match {
        case Some(u) => val submission = UserForms.submissionForm.bindFromRequest()
            submission.fold(
                formWithErrors =>  Future.successful(BadRequest("Form Error")),
                    submission =>  {
                        val tempFile = uploadFile(request)
                        if (tempFile.isDefined) {
                          Database.query(ContestQueries.GetContestDisplay(submission.contest_id.toInt))
                            .map { contest =>
                              val (contestFold,contestEval) = (contest.contest_folder.toString, contest.evaluator_name.toString)
                            val submissionMap = Evaluators.loadSubmissions2Map(tempFile.get)
                            val actualFile = Source.fromFile(s"./data/contests/${contestFold}/testset/testset_answers.csv")
                            val actuals = actualFile.getLines
                            val validator = Evaluators.loadEvaluation(contestEval)
                            println(validator.name)
                            val score = validator.score(submissionMap,actuals,0.0) 
                            actualFile.close()
                            println(s"score: $score")
                            //validate submission
                            //evaluate predctions and return score
                            SubmissionService.save(u,submission,score)}
                            Future.successful(Ok(s"submission created successfully"))
                        } else{ Future.successful(Ok(s"Something went wrong"))}
                    }
            )
        case None => Future.successful(Redirect(controllers.routes.RegistrationController.registrationForm()))    
    }
  }

    
  def uploadFile(request: Request[MultipartFormData[TemporaryFile]]): Option[String] = {
    Logger.error("Called uploadFile function" + request)
    request.body.file("submission").map { picture =>
      import java.io.File
      val filename = picture.filename
      val contentType = picture.contentType
      Logger.error(s"File name : $filename, content type : $contentType")
      val tempFile = s"/tmp/$filename"
      picture.ref.moveTo(new File(tempFile))
      Some(tempFile)
    }.getOrElse {
      None
    }
  }

}
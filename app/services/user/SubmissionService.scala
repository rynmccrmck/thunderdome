package services.user

import java.util.UUID

import com.github.mauricio.async.db.Connection
import com.mohiva.play.silhouette.api.AuthInfo
import com.mohiva.play.silhouette.impl.providers.CommonSocialProfile
import jdub.async.Database
import models.contests._
import models.queries._
import org.slf4j.LoggerFactory
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import org.joda.time.LocalDate
import models.user._
import scala.concurrent.Future

object SubmissionService {

  def save(currentUser:User,sd:SubmissionData,score:Double): Future[Any] = {
      sd match { 
          case SubmissionData(id,notes) => {
              val createdDate = new LocalDate();
              val sub:Submission = Submission(0,id,currentUser.id,createdDate,notes,score)
              println(s"Updating user [sub].")
              val statement = SubmissionQueries.insert(sub)
            Database.execute(statement).map { i =>
              Submission
            }
              }
          case _ => Future("dang")
     
      }}
}
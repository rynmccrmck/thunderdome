package services.admin

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

object ContestCreateService {

  def save(cd:ContestData): Future[Any] = {
      cd match { 
          case ContestData(a,b,c,d,e,f) => {
              val date = new LocalDate();
              val con:Contest = Contest(6,a,b,date,c,d,e,f.asInstanceOf[Option[Double]])
              println(new LocalDate())
              println(s"Updating user [$con].")
              val statement = ContestQueries.insert(Contest(6,a,b,date,c,d,e,f.asInstanceOf[Option[Double]]))
            Database.execute(statement).map { i =>
              Contest
            }
              }
          case _ => Future("dang")
     
      }}
    
  def remove = {}

  private[this] def removeProfiles = {}
}
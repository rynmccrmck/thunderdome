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

  def save(currentUser: User,cd:ContestData): Future[Any] = {
      cd match { 
          case ContestData(name,desc,start,end,evalid,bench) => {
              val createdDate = new LocalDate();
              val contestFolder = UUID.randomUUID().toString
              val con:Contest = Contest(0,name,currentUser.id,
                desc,createdDate,start,end,evalid,
                bench.asInstanceOf[Option[Double]],
                contestFolder)
              println(s"Updating user [$con].")
              val statement = ContestQueries.insert(con)
              val execute = Database.execute(statement)
              Future(contestFolder)
              }
          case _ => Future("dang")
     
      }}
    
  def remove = {}

  private[this] def removeProfiles = {}
}
package services.database

import jdub.async.Database
import models.queries.ddl._
import play.api.Logger
import play.api.libs.concurrent.Execution.Implicits.defaultContext
import services.user._

import scala.concurrent.Future

object InitData {

  val cnf = play.api.Play.current.configuration    
  val adminUser = cnf.getString("admin.user").getOrElse("admin")
  
  val records = Seq(
    "admin account" -> ("users","username",adminUser,CreateAdminAccount)
  )

  def update() = {
    Future.sequence(records.map { t =>
      Database.query(DdlQueries.DoesRecordExist(t._2._1,t._2._2,t._2._3)).flatMap { exists =>
        if (exists) {
          Future.successful(Unit)
        } else {
          Logger.info(s"Creating missing record [${t._1}].")
          val name = s"AddRecord-${t._1}"
          val statement = t._2._4
          Database.raw(name, statement.sql).map(x => Unit)
        }
      }
    })
  }
}

package services.database

import jdub.async.Database
import models.queries.ddl._
import play.api.Logger
import play.api.libs.concurrent.Execution.Implicits.defaultContext

import scala.concurrent.Future

object InitData {
  val tables = Seq(
    //initial queries (admin user, evaluators, etv)
    
  )

  def update() = {
 /*   Future.sequence(tables.map { t =>
      Database.query(DdlQueries.DoesTableExist(t._1)).flatMap { exists =>
        if (exists) {
          Future.successful(Unit)
        } else {
          Logger.info(s"Creating missing table [${t._1}].")
          val name = s"CreateTable-${t._1}"
          Database.raw(name, t._2.sql).map(x => Unit)
        }
      }
    })*/
  }
}

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
import play.api._
import play.api.mvc._
import play.api.libs.Files.TemporaryFile

import java.io.File
import scala.io.Source
import java.io.{File, BufferedWriter,FileOutputStream,OutputStreamWriter}

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
  //need refactor    
  def uploadTestSet(request: Request[MultipartFormData[TemporaryFile]],contest_id:String): String = {
    Logger.error("Called uploadFile function" + request)
    request.body.file("testset").map { testset =>
      val contestFolder = new File(s"./data/contests/${contest_id}");
      val successfulFolder = contestFolder.mkdir();
      val testSetFolder = new File(s"./data/contests/${contest_id}/testset");
      val successfulTestFolder = testSetFolder.mkdir();
      val filename = testset.filename
      val contentType = testset.contentType
      Logger.error(s"File name : $filename, content type : $contentType")
      //* VALIDATION + SUMMARY (number of lines,, etc)
      val testAnswer = new File(testSetFolder + "/testset_answers.csv")
      testset.ref.moveTo(testAnswer)
      val testPublic = Source.fromFile(testAnswer)
      val testPublicFile = new File(testSetFolder + "/testset.csv")
      val bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(testPublicFile)))
      val lines = testPublic.getLines
      while(lines.hasNext){
        bw.write(lines.next.split(",").init.mkString(",") + "\n")  
      }
      testPublic.close()
      bw.close()
      "File uploaded"
    }.getOrElse {
      "Missing file"
    }
  }  
    
  def remove = {}

  private[this] def removeProfiles = {}
}
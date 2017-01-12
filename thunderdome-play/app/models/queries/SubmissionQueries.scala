package models.queries

import java.util.UUID

import jdub.async.{ FlatSingleRowQuery, Row, Statement }
import jdub.async.queries.BaseQueries
import models.contests.{ Submission }
import org.joda.time.LocalDateTime



object SubmissionQueries extends BaseQueries[Submission] {
  override protected val tableName = "submissions"
  override protected val columns = Seq("submission_id", "contest_id", 
    "user_id", "submission_date", "submissions_notes","score")
    
  override protected val searchColumns = Seq("submission_id::text", "user_id::text","contest_id::text","score")

  val insert = Insert
  val getById = GetById
  def searchCount(q: String, groupBy: Option[String] = None) = new SearchCount(q, groupBy)
  val search = Search
  val removeById = RemoveById

  override protected def fromRow(row: Row) = {
    val submission_id = row.as[Int]("submission_id")
    val contest_id = row.as[Int]("contest_id")
    val user_id = UUID.fromString(row.as[String]("user_id"))
    val submission_date = row.as[LocalDateTime]("submission_date")
    val submissions_notes = row.as[String]("submissions_notes")
    val score = row.as[Double]("score")
    Submission(submission_id, contest_id, user_id, submission_date,
        submissions_notes, score)
  }
  
  override protected def toDataSeq(s: Submission) = {
    Seq(s.submission_id, s.contest_id, s.user_id, 
        s.submission_date, s.submission_notes, s.score)
  }

/*
  case class FindUserByUsername(username: String) extends FlatSingleRowQuery[User] {
    override val sql = getSql(Some("username = ?"))
    override val values = Seq(username)
    override def flatMap(row: Row) = Some(fromRow(row))
  }

  case class FindUserByProfile(loginInfo: LoginInfo) extends FlatSingleRowQuery[User] {
    override val sql = getSql(Some("profiles @> ARRAY[?]::text[]"))
    override val values = Seq(s"${loginInfo.providerID}:${loginInfo.providerKey}")
    override def flatMap(row: Row) = Some(fromRow(row))
  }

  
*/

}
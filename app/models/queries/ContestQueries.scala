package models.queries

import java.util.UUID

import jdub.async.{ FlatSingleRowQuery, Row, Statement, Query }
import jdub.async.queries.BaseQueries
import models.contests.{ Contest }
import org.joda.time.LocalDateTime



object ContestQueries extends BaseQueries[Contest] {
  override protected val tableName = "contests"
  override protected val columns = Seq("contest_id", "contest_name", 
    "contest_description", "contest_created", "contest_start",
    "contest_end","evaluator_id","benchmark_value")
    
  override protected val searchColumns = Seq("contest_id::text", "contest_name","evaluator_id::text")

  val insert = Insert
  val getById = GetById
  def searchCount(q: String, groupBy: Option[String] = None) = new SearchCount(q, groupBy)
  val search = Search
  val removeById = RemoveById

  case class UpdateContest(c: Contest) extends Statement {
    override val sql = updateSql(Seq("contest_name", 
        "contest_description","contest_start","contest_end",
        "evaluator_id","benchmark_value"))

    override val values = {
      Seq(c.contest_name, c.contest_description, c.contest_start, 
        c.contest_end, c.evaluator_id,c.benchmark_value)
    }
  }

  case class SetContestName(contest_id: Int, contest_name: String) extends Statement {
    override val sql = updateSql(Seq("contest_name"))
    override val values = Seq(contest_name, contest_id)
  }

  case class SetContestDescription(contest_id: Int, contest_description: String) extends Statement {
    override val sql = updateSql(Seq("contest_description"))
    override val values = Seq(contest_description, contest_id)
  }

case class SetContestStart(contest_id: Int, contest_start: LocalDateTime) extends Statement {
    override val sql = updateSql(Seq("contest_start"))
    override val values = Seq(contest_start, contest_id)
  }
  
 case class SetContestEnd(contest_id: Int, contest_end: LocalDateTime) extends Statement {
    override val sql = updateSql(Seq("contest_end"))
    override val values = Seq(contest_end, contest_id)
  }
  
  case class SetContestEvaluator(contest_id: Int, evaluator_id: Int) extends Statement {
    override val sql = updateSql(Seq("evaluator_id"))
    override val values = Seq(evaluator_id, contest_id)
  }
  
  case class SetContestBenchmark(contest_id: Int, benchmark_value: Option[Double]) extends Statement {
    override val sql = updateSql(Seq("benchmark_value"))
    override val values = Seq(benchmark_value, contest_id)
  }
  
  override protected def fromRow(row: Row) = {
    val contest_id = row.as[Int]("contest_id")
    val contest_name = row.as[String]("contest_name")
    val contest_description = row.as[String]("contest_description")
    val contest_created = row.as[LocalDateTime]("contest_created")
    val contest_start = row.as[LocalDateTime]("contest_start")
    val contest_end = row.as[LocalDateTime]("contest_end")
    val evaluator_id = row.as[Int]("evaluator_id")
    val benchmark_value = row.asOpt[Double]("benchmark_value")
    Contest(contest_id,contest_name,contest_description,contest_created,
        contest_start,contest_end,evaluator_id,benchmark_value)
  }
  
  override protected def toDataSeq(c: Contest) = {
    Seq(c.contest_id, c.contest_name, c.contest_description, c.contest_start, 
        c.contest_end, c.evaluator_id,c.benchmark_value)
  }
  
  case object GetContests extends Query[Seq[Contest]] {
  override val sql = "SELECT* FROM contests"
  override val values = Nil
  override def reduce(rows: Iterator[Row]) = rows.map { row =>
    val contest_id = row.as[Int]("contest_id")
    val contest_name = row.as[String]("contest_name")
    val contest_description = row.as[String]("contest_description")
    val contest_created = row.as[LocalDateTime]("contest_created")
    val contest_start = row.as[LocalDateTime]("contest_start")
    val contest_end = row.as[LocalDateTime]("contest_end")
    val evaluator_id = row.as[Int]("evaluator_id")
    val benchmark_value = row.asOpt[Double]("benchmark_value")
    Contest(contest_id,contest_name,contest_description,contest_created,
        contest_start,contest_end,evaluator_id,benchmark_value)
  }.toSeq
}

case class GetContest(contest_id: Int) extends Query[Contest] {
    override val sql = s"select * from contests where contest_id = ?"
    override val values =Seq(contest_id)
    //review this
    override def reduce(rows: Iterator[Row]) = rows.map(fromRow).toList(0)
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
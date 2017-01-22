package models.queries

import java.util.UUID

import jdub.async.{ FlatSingleRowQuery, Row, Statement,Query }
import jdub.async.queries.BaseQueries
import models.contests.{ Evaluator }
import org.joda.time.LocalDateTime

object EvaluatorQueries extends BaseQueries[Evaluator] {
  override protected val tableName = "evaluators"
  override protected val columns = Seq("evaluator_id", "evaluator_name")
    
  override protected val searchColumns = Seq("evaluator_id::text", "evaluator_name")

  val insert = Insert
  val getById = GetById
  def searchCount(q: String, groupBy: Option[String] = None) = new SearchCount(q, groupBy)
  val search = Search
  val removeById = RemoveById

  override protected def fromRow(row: Row) = {
    val evaluator_id = row.as[Int]("evaluator_id")
    val evaluator_name = row.as[String]("evaluator_name")
    Evaluator(evaluator_id, evaluator_name)
  }
  
  override protected def toDataSeq(e: Evaluator) = {
    Seq(e.evaluator_id, e.evaluator_name)
  }

  case object getEvaluators extends Query[Seq[Evaluator]] {
  override val sql = """select * from evaluators"""
  override val values = Nil
  override def reduce(rows: Iterator[Row]) = rows.map { row =>
    val evaluator_id = row.as[Int]("evaluator_id")
    val evaluator_name = row.as[String]("evaluator_name")
    Evaluator(evaluator_id,evaluator_name)
  }.toSeq
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
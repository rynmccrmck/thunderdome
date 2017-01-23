package models.queries.ddl

import jdub.async.{ Row, SingleRowQuery }

object DdlQueries {
  case class DoesTableExist(tableName: String) extends SingleRowQuery[Boolean] {
    override val sql = "select exists (select * from information_schema.tables WHERE table_name = ?);"
    override val values = tableName :: Nil
    override def map(row: Row) = row.as[Boolean]("exists")
  }
  case class DoesRecordExist(tableName: String, columnName:String,value:String) extends SingleRowQuery[Boolean] {
    override val sql = s"select exists (select * from ${tableName} WHERE ${columnName} = '${value}');"
    override val values = Nil
    override def map(row: Row) = row.as[Boolean]("exists")
  }
}

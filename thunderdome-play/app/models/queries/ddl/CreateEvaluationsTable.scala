package models.queries.ddl

import jdub.async.Statement


case object CreateEvaluationsTable extends Statement {
  override val sql = """
    create table evaluations
    (
       evaluation_id serial primary key, 
       evaluation_name character varying(200)
    ) with (oids = false);
  """
}
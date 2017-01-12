package models.queries.ddl

import jdub.async.Statement


case object CreateEvaluationsTable extends Statement {
  override val sql = """
    create table evaluators
    (
       evaluator_id serial primary key, 
       evaluator_name character varying(200)
    ) with (oids = false);
  """
}
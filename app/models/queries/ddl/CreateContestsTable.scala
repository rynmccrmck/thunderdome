package models.queries.ddl

import jdub.async.Statement


case object CreateContestsTable extends Statement {
  override val sql = """
    create table contests
    (
       contest_id serial primary key, 
       contest_name character varying(200) not null,
       contest_description text not null,
       contest_created date not null default CURRENT_DATE,
       contest_start date not null,
       contest_end date not null,
       evaluator_id int not null,
       benchmark_value float
    ) with (oids = false);
  """
}
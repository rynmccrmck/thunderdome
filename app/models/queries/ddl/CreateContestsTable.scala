package models.queries.ddl

import jdub.async.Statement


case object CreateContestsTable extends Statement {
  override val sql = """
    create table contests
    (
       contest_id serial primary key, 
       user_id uuid not null,
       contest_name character varying(200) not null,
       contest_description text not null,
       contest_created date not null default CURRENT_DATE,
       contest_start date not null,
       contest_end date not null,
       evaluator_id int not null,
       benchmark_value float,
       contest_folder character varying(40) not null
    ) with (oids = false);
  """
}
package models.queries.ddl

import jdub.async.Statement


case object CreateSubmissionsTable extends Statement {
  override val sql = """
    create table submissions
    (
       submission_id serial primary key, 
       contest_id int,
       user_id uuid,
       submissions_notes character varying(500),
       score float not null
    ) with (oids = false);
  """
}
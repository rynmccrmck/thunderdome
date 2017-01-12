package models.user
import org.joda.time.LocalDate


case class RegistrationData(
  username: String,
  email: String,
  password: String
)

case class ContestData(
    contest_name: String,
    contest_description:String,
    contest_start:LocalDate,
    contest_end:LocalDate,
    evaluator_id:Int,
    benchmark_value:Option[Int]
)

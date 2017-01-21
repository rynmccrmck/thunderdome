package models.contests

import org.joda.time.LocalDate
import java.util.UUID

//ADD problem type, eg regression, classification, recommendation
case class Contest(
    contest_id:Int,
    contest_name: String,
    user_id:UUID,
    contest_description:String,
    contest_created: LocalDate,
    contest_start:LocalDate,
    contest_end:LocalDate,
    evaluator_id:Int,
    benchmark_value:Option[Double]
) 
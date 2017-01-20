package models.contests

import org.joda.time.LocalDate

//ADD problem type, eg regression, classification, recommendation
case class Contest(
    contest_id: Int,
    contest_name: String,
    contest_description:String,
    contest_created: LocalDate,
    contest_start:LocalDate,
    contest_end:LocalDate,
    evaluator_id:Int,
    benchmark_value:Option[Double]
) 
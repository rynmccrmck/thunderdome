package models.contests

import org.joda.time.LocalDateTime

//ADD problem type, eg regression, classification, recommendation
case class Contest(
    contest_id: Int,
    contest_name: String,
    contest_description:String,
    contest_created: LocalDateTime,
    contest_start:LocalDateTime,
    contest_end:LocalDateTime,
    evaluator_id:Int,
    benchmark_value:Option[Double]
) 
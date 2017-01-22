package models.contests

import org.joda.time.LocalDate
import java.util.UUID

case class Submission(
    submission_id: Int,
    contest_id: Int,
    user_id:UUID,
    submission_date: LocalDate,
    submission_notes:String,
    score:Double
) 
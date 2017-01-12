package models.contests

import org.joda.time.LocalDateTime
import java.util.UUID

case class Submission(
    submission_id: Int,
    contest_id: Int,
    user_id:UUID,
    submission_date: LocalDateTime,
    submission_notes:String,
    score:Double
) 
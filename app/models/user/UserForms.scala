package models.user

import com.mohiva.play.silhouette.api.util.Credentials
import play.api.data._
import play.api.data.Forms._
import models.contests._
import org.joda.time.LocalDateTime
import java.util.UUID


object UserForms {
  val signInForm = Form(
    mapping(
      "email" -> email,
      "password" -> nonEmptyText
    )(Credentials.apply)(Credentials.unapply)
  )

  val registrationForm = Form(
    mapping(
      "username" -> nonEmptyText,
      "email" -> nonEmptyText,
      "password" -> nonEmptyText
    )(RegistrationData.apply)(RegistrationData.unapply)
  )
  
   val contestForm = Form(
    mapping(
      "contest_name" -> nonEmptyText,
      "contest_description" -> nonEmptyText,
      "contest_start" -> jodaLocalDate,
      "contest_end" -> jodaLocalDate,
      "evaluation_id" -> number,
      "benchmark_value" -> optional(bigDecimal)
    )(ContestData.apply)(ContestData.unapply)
  ) 

   val submissionForm = Form(
    mapping(
      "contest_id" -> number,
      "user_id" -> uuid,
      "submission_date" -> jodaLocalDate,
      "submission_notes" -> nonEmptyText,
      "score" -> bigDecimal
    )(SubmissionData.apply)(SubmissionData.unapply)
  ) 
  
}

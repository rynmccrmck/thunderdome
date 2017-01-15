
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contest_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class contest extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.user.User,models.contests.Contest,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.user.User,
contest: models.contests.Contest):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.35*/layout/*2.41*/.bootstrap("Play Silhouette Postgres Async Seed")/*2.90*/ {_display_(Seq[Any](format.raw/*2.92*/("""

 """),_display_(/*4.3*/(_navBar(user,"home"))),format.raw/*4.25*/("""


    """),format.raw/*7.5*/("""<div class="container">
    <div class="row">
      <div class="col-md-12">
       
        """),_display_(/*11.10*/if(user.profiles.isEmpty)/*11.35*/ {_display_(Seq[Any](format.raw/*11.37*/("""
          """),format.raw/*12.11*/("""<ul>
          <li>You are not currently logged, sign in or register!</li>
          <li><a href=""""),_display_(/*14.25*/routes/*14.31*/.RegistrationController.registrationForm),format.raw/*14.71*/("""">Register</a></li>
          <li><a href=""""),_display_(/*15.25*/routes/*15.31*/.AuthenticationController.signInForm),format.raw/*15.67*/("""">Sign In</a></li>
          </ul>
        """)))}/*17.11*/else/*17.16*/{_display_(Seq[Any](format.raw/*17.17*/("""
                    """),format.raw/*18.21*/("""<h4>Contest Details</h4>
                    <p>Name: """),_display_(/*19.31*/contest/*19.38*/.contest_name),format.raw/*19.51*/("""</p>
                    <p>Created: """),_display_(/*20.34*/contest/*20.41*/.contest_created),format.raw/*20.57*/("""</p>
                    <li><a href="">View the leaderboard</a></li>
                    <li><a href="">Read the description</a></li>
                    <li><a href="">Get the data</a></li>
                    <li><a href="">Make a submission</a></li>
                    
        """)))}),format.raw/*26.10*/("""
        
      """),format.raw/*28.7*/("""</div>
    </div>
  </div>
""")))}),format.raw/*31.2*/("""
"""))
      }
    }
  }

  def render(user:models.user.User,contest:models.contests.Contest): play.twirl.api.HtmlFormat.Appendable = apply(user,contest)

  def f:((models.user.User,models.contests.Contest) => play.twirl.api.HtmlFormat.Appendable) = (user,contest) => apply(user,contest)

  def ref: this.type = this

}


}

/**/
object contest extends contest_Scope0.contest
              /*
                  -- GENERATED --
                  DATE: Thu Jan 12 09:02:26 EST 2017
                  SOURCE: /Users/ryanmccormack/Documents/thunderdome/thunderdome-play/app/views/contest.scala.html
                  HASH: 4cadd51c2091dad968c2f83eae61d85d5a1ddc26
                  MATRIX: 565->1|718->60|732->66|789->115|828->117|857->121|899->143|932->150|1052->243|1086->268|1126->270|1165->281|1291->380|1306->386|1367->426|1438->470|1453->476|1510->512|1573->557|1586->562|1625->563|1674->584|1756->639|1772->646|1806->659|1871->697|1887->704|1924->720|2239->1004|2282->1020|2340->1048
                  LINES: 20->1|26->2|26->2|26->2|26->2|28->4|28->4|31->7|35->11|35->11|35->11|36->12|38->14|38->14|38->14|39->15|39->15|39->15|41->17|41->17|41->17|42->18|43->19|43->19|43->19|44->20|44->20|44->20|50->26|52->28|55->31
                  -- GENERATED --
              */
          
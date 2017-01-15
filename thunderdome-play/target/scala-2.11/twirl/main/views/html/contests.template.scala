
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object contests_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class contests extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.user.User,Seq[models.contests.Contest],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.user.User, 
contests: Seq[models.contests.Contest]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*2.41*/layout/*2.47*/.bootstrap("Play Silhouette Postgres Async Seed")/*2.96*/ {_display_(Seq[Any](format.raw/*2.98*/("""

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
                    """),format.raw/*18.21*/("""<p>Contest Search</p>

                    <table class="table table-striped">
                     <thead>
                    <tr>
                    <th>Name</th>
                    <th>Description</th> 
                    <th>Created</th>
                    <th>Evaluation</th>
                    <th>Link</th>
                    </tr>
                     </thead>
                     <tbody>
                     """),_display_(/*31.23*/for(contest <- contests) yield /*31.47*/{_display_(Seq[Any](format.raw/*31.48*/("""
                      """),format.raw/*32.23*/("""<tr>
                        <td>"""),_display_(/*33.30*/contest/*33.37*/.contest_name),format.raw/*33.50*/("""</td>
                        <td>"""),_display_(/*34.30*/contest/*34.37*/.contest_description),format.raw/*34.57*/("""</td> 
                        <td>"""),_display_(/*35.30*/contest/*35.37*/.contest_created),format.raw/*35.53*/("""</td>
                        <td>"RMSE"</td>
                        <td><a href="""),_display_(/*37.38*/routes/*37.44*/.ContestController.contest(contest.contest_id.toString)),format.raw/*37.99*/(""">Click</a></td>
                      </tr>
                    """)))}),format.raw/*39.22*/("""
                    """),format.raw/*40.21*/("""</tbody>
                    </table>
                    
        """)))}),format.raw/*43.10*/("""
        
      """),format.raw/*45.7*/("""</div>
    </div>
  </div>
""")))}),format.raw/*48.2*/("""
"""))
      }
    }
  }

  def render(user:models.user.User,contests:Seq[models.contests.Contest]): play.twirl.api.HtmlFormat.Appendable = apply(user,contests)

  def f:((models.user.User,Seq[models.contests.Contest]) => play.twirl.api.HtmlFormat.Appendable) = (user,contests) => apply(user,contests)

  def ref: this.type = this

}


}

/**/
object contests extends contests_Scope0.contests
              /*
                  -- GENERATED --
                  DATE: Thu Jan 12 09:02:26 EST 2017
                  SOURCE: /Users/ryanmccormack/Documents/thunderdome/thunderdome-play/app/views/contests.scala.html
                  HASH: 7c851b926dd1b4d5fa877bf794c85dc995c1d607
                  MATRIX: 572->1|732->67|746->73|803->122|842->124|871->128|913->150|946->157|1066->250|1100->275|1140->277|1179->288|1305->387|1320->393|1381->433|1452->477|1467->483|1524->519|1587->564|1600->569|1639->570|1688->591|2142->1018|2182->1042|2221->1043|2272->1066|2333->1100|2349->1107|2383->1120|2445->1155|2461->1162|2502->1182|2565->1218|2581->1225|2618->1241|2728->1324|2743->1330|2819->1385|2915->1450|2964->1471|3063->1539|3106->1555|3164->1583
                  LINES: 20->1|26->2|26->2|26->2|26->2|28->4|28->4|31->7|35->11|35->11|35->11|36->12|38->14|38->14|38->14|39->15|39->15|39->15|41->17|41->17|41->17|42->18|55->31|55->31|55->31|56->32|57->33|57->33|57->33|58->34|58->34|58->34|59->35|59->35|59->35|61->37|61->37|61->37|63->39|64->40|67->43|69->45|72->48
                  -- GENERATED --
              */
          
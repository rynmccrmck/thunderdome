
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object submit_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class submit extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.user.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.user.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.27*/layout/*1.33*/.bootstrap("Play Silhouette Postgres Async Seed")/*1.82*/ {_display_(Seq[Any](format.raw/*1.84*/("""

 """),_display_(/*3.3*/(_navBar(user,"home"))),format.raw/*3.25*/("""
 
    """),format.raw/*5.5*/("""<div class="container">
    <div class="row">
      <div class="col-md-12">
       
        """),_display_(/*9.10*/if(user.profiles.isEmpty)/*9.35*/ {_display_(Seq[Any](format.raw/*9.37*/("""
          """),format.raw/*10.11*/("""<ul>
          <li>You are not currently logged, sign in or register!</li>
          <li><a href=""""),_display_(/*12.25*/routes/*12.31*/.RegistrationController.registrationForm),format.raw/*12.71*/("""">Register</a></li>
          <li><a href=""""),_display_(/*13.25*/routes/*13.31*/.AuthenticationController.signInForm),format.raw/*13.67*/("""">Sign In</a></li>
          </ul>
        """)))}/*15.11*/else/*15.16*/{_display_(Seq[Any](format.raw/*15.17*/("""
                    """),format.raw/*16.21*/("""<p>View contests - TODO</p>
                    <p>Search and select active contests</p>
        """)))}),format.raw/*18.10*/("""
        
      """),format.raw/*20.7*/("""</div>
    </div>
  </div>
""")))}),format.raw/*23.2*/("""
"""))
      }
    }
  }

  def render(user:models.user.User): play.twirl.api.HtmlFormat.Appendable = apply(user)

  def f:((models.user.User) => play.twirl.api.HtmlFormat.Appendable) = (user) => apply(user)

  def ref: this.type = this

}


}

/**/
object submit extends submit_Scope0.submit
              /*
                  -- GENERATED --
                  DATE: Thu Jan 12 10:10:58 EST 2017
                  SOURCE: /Users/ryanmccormack/Documents/thunderdome/app/views/submit.scala.html
                  HASH: 0dfaaebf5fae7b9a0e220de6d094461dd3fa3c99
                  MATRIX: 539->1|658->26|672->32|729->81|768->83|797->87|839->109|872->116|991->209|1024->234|1063->236|1102->247|1228->346|1243->352|1304->392|1375->436|1390->442|1447->478|1510->523|1523->528|1562->529|1611->550|1740->648|1783->664|1841->692
                  LINES: 20->1|25->1|25->1|25->1|25->1|27->3|27->3|29->5|33->9|33->9|33->9|34->10|36->12|36->12|36->12|37->13|37->13|37->13|39->15|39->15|39->15|40->16|42->18|44->20|47->23
                  -- GENERATED --
              */
          
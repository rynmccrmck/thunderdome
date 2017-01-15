
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object _navBar_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class _navBar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.user.User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user:  models.user.User, test: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.41*/("""
"""),format.raw/*2.1*/("""<div>
      <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
         <a href="/" class="pull-left"><img src="/assets/images/beaker.png" height="40"></a> 
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href=""""),_display_(/*13.42*/routes/*13.48*/.HomeController.index),format.raw/*13.69*/("""">Thunderdome</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="Active"><a href=""""),_display_(/*17.42*/routes/*17.48*/.HomeController.index),format.raw/*17.69*/("""">Home</a></li>
        """),_display_(/*18.10*/if(user.profiles.isEmpty)/*18.35*/ {_display_(Seq[Any](format.raw/*18.37*/("""
        """),format.raw/*19.9*/("""<li><a href="#about">About</a></li>
        <li><a href=""""),_display_(/*20.23*/routes/*20.29*/.RegistrationController.registrationForm),format.raw/*20.69*/("""">Register</a></li>
        <li><a href=""""),_display_(/*21.23*/routes/*21.29*/.AuthenticationController.signInForm),format.raw/*21.65*/("""">Sign In</a></li>
        """)))}/*22.10*/else/*22.15*/{_display_(Seq[Any](format.raw/*22.16*/("""
            """),format.raw/*23.13*/("""<li><a href=""""),_display_(/*23.27*/routes/*23.33*/.ContestController.contests),format.raw/*23.60*/("""">Contests</a></li>
            <li><a href=""""),_display_(/*24.27*/routes/*24.33*/.ContestController.contests),format.raw/*24.60*/("""">Production Models</a></li>
            <li><a href=""""),_display_(/*25.27*/routes/*25.33*/.ProfileController.profile),format.raw/*25.59*/("""">Profile</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href=""""),_display_(/*28.27*/routes/*28.33*/.AuthenticationController.signOut),format.raw/*28.66*/("""">Log Out</a></li>
            <li><a href=""""),_display_(/*29.27*/routes/*29.33*/.HomeController.admin),format.raw/*29.54*/("""">Admin</a></li> """)))}),format.raw/*29.72*/("""
          """),format.raw/*30.11*/("""</ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>
</div>"""))
      }
    }
  }

  def render(user:models.user.User,test:String): play.twirl.api.HtmlFormat.Appendable = apply(user,test)

  def f:((models.user.User,String) => play.twirl.api.HtmlFormat.Appendable) = (user,test) => apply(user,test)

  def ref: this.type = this

}


}

/**/
object _navBar extends _navBar_Scope0._navBar
              /*
                  -- GENERATED --
                  DATE: Thu Jan 12 09:00:03 EST 2017
                  SOURCE: /Users/ryanmccormack/Documents/thunderdome/thunderdome-play/app/views/_navBar.scala.html
                  HASH: fee004177c165ba80725d520a5b2a833c934ff9e
                  MATRIX: 548->1|682->40|709->41|1365->670|1380->676|1422->697|1620->868|1635->874|1677->895|1729->920|1763->945|1803->947|1839->956|1924->1014|1939->1020|2000->1060|2069->1102|2084->1108|2141->1144|2188->1172|2201->1177|2240->1178|2281->1191|2322->1205|2337->1211|2385->1238|2458->1284|2473->1290|2521->1317|2603->1372|2618->1378|2665->1404|2804->1516|2819->1522|2873->1555|2945->1600|2960->1606|3002->1627|3051->1645|3090->1656
                  LINES: 20->1|25->1|26->2|37->13|37->13|37->13|41->17|41->17|41->17|42->18|42->18|42->18|43->19|44->20|44->20|44->20|45->21|45->21|45->21|46->22|46->22|46->22|47->23|47->23|47->23|47->23|48->24|48->24|48->24|49->25|49->25|49->25|52->28|52->28|52->28|53->29|53->29|53->29|53->29|54->30
                  -- GENERATED --
              */
          

package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object createContest_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class createContest extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[models.user.User,Form[models.user.ContestData],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.user.User, form: Form[models.user.ContestData]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.63*/("""
"""),_display_(/*2.2*/layout/*2.8*/.bootstrap("Play Silhouette Postgres Async Seed")/*2.57*/ {_display_(Seq[Any](format.raw/*2.59*/("""

      """),format.raw/*4.7*/("""<nav class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
         <a href="/" class="pull-left"><img src="/assets/images/beaker.png" height="40"></a> 
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href=""""),_display_(/*14.42*/routes/*14.48*/.HomeController.index),format.raw/*14.69*/("""">Thunderdome</a>
        </div>
        <div id="navbar" class="navbar-collapse collapse">
          <ul class="nav navbar-nav">
            <li class="active"><a href=""""),_display_(/*18.42*/routes/*18.48*/.HomeController.index),format.raw/*18.69*/("""">Home</a></li>
        """),_display_(/*19.10*/if(user.profiles.isEmpty)/*19.35*/ {_display_(Seq[Any](format.raw/*19.37*/("""
        """),format.raw/*20.9*/("""<li><a href="#about">About</a></li>
        <li><a href=""""),_display_(/*21.23*/routes/*21.29*/.RegistrationController.registrationForm),format.raw/*21.69*/("""">Register</a></li>
        <li><a href=""""),_display_(/*22.23*/routes/*22.29*/.AuthenticationController.signInForm),format.raw/*22.65*/("""">Sign In</a></li>
        """)))}/*23.10*/else/*23.15*/{_display_(Seq[Any](format.raw/*23.16*/("""
            """),format.raw/*24.13*/("""<li><a href=""""),_display_(/*24.27*/routes/*24.33*/.ContestController.contests),format.raw/*24.60*/("""">Contests</a></li>
            <li><a href=""""),_display_(/*25.27*/routes/*25.33*/.ContestController.contests),format.raw/*25.60*/("""">Production Models</a></li>
            <li><a href=""""),_display_(/*26.27*/routes/*26.33*/.ProfileController.profile),format.raw/*26.59*/("""">Profile</a></li>
          </ul>
          <ul class="nav navbar-nav navbar-right">
            <li><a href=""""),_display_(/*29.27*/routes/*29.33*/.AuthenticationController.signOut),format.raw/*29.66*/("""">Log Out</a></li>
            <li><a href=""""),_display_(/*30.27*/routes/*30.33*/.HomeController.admin),format.raw/*30.54*/("""">Admin</a></li> """)))}),format.raw/*30.72*/("""
          """),format.raw/*31.11*/("""</ul>
        </div><!--/.nav-collapse -->
      </div>
    </nav>


  <div class="container">
  <div class="form-group">
  <form method="post" action=""""),_display_(/*39.32*/controllers/*39.43*/.routes.RegistrationController.register()),format.raw/*39.84*/("""">
    <label for="exampleInputEmail1">Contest Name</label>
    <input value=""""),_display_(/*41.20*/form("contest_name")/*41.40*/.value),format.raw/*41.46*/("""" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp" placeholder="Broker Bay - 2016 House Price Prediction">
  </div>
  <div class="form-group">
    <label for="exampleSelect1">Problem Type</label>
    <select class="form-control" id="exampleSelect1">
      <option >Classification</option>
      <option>Recommendation</option>
      <option>Regression</option>
    </select>
  </div>
  <div class="form-group">
    <label for="exampleSelect2">Evaluation Metric</label>
    <select class="form-control" id="exampleSelect2">
      <option val>Root Mean Squared Error</option>
      <option>Mean Absolute Error</option>
      <option>Mean Consequential Error</option>
    </select>
  </div>
  <div class="form-group">
    <label for="exampleTextarea">Contest Description</label>
    <textarea value=""""),_display_(/*61.23*/form("contest_description")/*61.50*/.value),format.raw/*61.56*/("""" class="form-control" id="exampleTextarea" rows="3"></textarea>
  </div>
  <div class="form-group">
    <label for="exampleInputFile">Test Set File</label>
    <input type="file" class="form-control-file" id="exampleInputFile" aria-describedby="fileHelp">
    <small id="fileHelp" class="form-text text-muted">This is some placeholder block-level help text for the above input. It's a bit lighter and easily wraps to a new line.</small>
  </div>

  <button type="submit" class="btn btn-primary">Submit</button>
</form>
</div>
</div>
""")))}))
      }
    }
  }

  def render(user:models.user.User,form:Form[models.user.ContestData]): play.twirl.api.HtmlFormat.Appendable = apply(user,form)

  def f:((models.user.User,Form[models.user.ContestData]) => play.twirl.api.HtmlFormat.Appendable) = (user,form) => apply(user,form)

  def ref: this.type = this

}


}

/**/
object createContest extends createContest_Scope0.createContest
              /*
                  -- GENERATED --
                  DATE: Thu Jan 12 08:20:52 EST 2017
                  SOURCE: /Users/ryanmccormack/Documents/thunderdome/thunderdome-play/app/views/createContest.scala.html
                  HASH: afe36f907a3424cda16994e12566fae10285eafd
                  MATRIX: 583->1|739->62|766->64|779->70|836->119|875->121|909->129|1553->746|1568->752|1610->773|1808->944|1823->950|1865->971|1917->996|1951->1021|1991->1023|2027->1032|2112->1090|2127->1096|2188->1136|2257->1178|2272->1184|2329->1220|2376->1248|2389->1253|2428->1254|2469->1267|2510->1281|2525->1287|2573->1314|2646->1360|2661->1366|2709->1393|2791->1448|2806->1454|2853->1480|2992->1592|3007->1598|3061->1631|3133->1676|3148->1682|3190->1703|3239->1721|3278->1732|3458->1885|3478->1896|3540->1937|3646->2016|3675->2036|3702->2042|4552->2865|4588->2892|4615->2898
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2|28->4|38->14|38->14|38->14|42->18|42->18|42->18|43->19|43->19|43->19|44->20|45->21|45->21|45->21|46->22|46->22|46->22|47->23|47->23|47->23|48->24|48->24|48->24|48->24|49->25|49->25|49->25|50->26|50->26|50->26|53->29|53->29|53->29|54->30|54->30|54->30|54->30|55->31|63->39|63->39|63->39|65->41|65->41|65->41|85->61|85->61|85->61
                  -- GENERATED --
              */
          
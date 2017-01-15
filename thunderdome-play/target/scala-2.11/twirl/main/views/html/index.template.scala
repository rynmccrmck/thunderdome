
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.user.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.user.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.27*/layout/*1.33*/.bootstrap("Play Silhouette Postgres Async Seed")/*1.82*/ {_display_(Seq[Any](format.raw/*1.84*/("""


 """),_display_(/*4.3*/(_navBar(user,"test"))),format.raw/*4.25*/("""
  """),format.raw/*5.3*/("""<div class="container">
  
    <div class="row">
      <div class="col-md-12">
        <img style="float:right" src="/assets/images/ml-preproc.png" height = 480/>
        <h2>Welcome to ML Thunderdome!</h2>
        <h4>Many models enter, One model leaves.</h4>

      
        <ul>
        """),_display_(/*15.10*/if(user.profiles.isEmpty)/*15.35*/ {_display_(Seq[Any](format.raw/*15.37*/("""
          """),format.raw/*16.11*/("""<li>You are not currently logged, sign in or register!</li>
          <li><a href=""""),_display_(/*17.25*/routes/*17.31*/.RegistrationController.registrationForm),format.raw/*17.71*/("""">Register</a></li>
          <li><a href=""""),_display_(/*18.25*/routes/*18.31*/.AuthenticationController.signInForm),format.raw/*18.67*/("""">Sign In</a></li>
        """)))}/*19.11*/else/*19.16*/{_display_(Seq[Any](format.raw/*19.17*/("""
          """),format.raw/*20.11*/("""<li>You're signed in as user """),_display_(/*20.41*/user/*20.45*/.username.map/*20.58*/ { un =>_display_(Seq[Any](format.raw/*20.66*/(""": """),_display_(/*20.69*/{un}),format.raw/*20.73*/(""" """)))}),format.raw/*20.75*/("""</li>
          <li>
            Profiles:
            """),_display_(/*23.14*/user/*23.18*/.profiles.map/*23.31*/ { p =>_display_(Seq[Any](format.raw/*23.38*/("""
              """),format.raw/*24.15*/("""<div>"""),_display_(/*24.21*/p/*24.22*/.providerID),format.raw/*24.33*/(""": """),_display_(/*24.36*/p/*24.37*/.providerKey),format.raw/*24.49*/("""</div>
            """)))}),format.raw/*25.14*/("""
          """),format.raw/*26.11*/("""</li>
          <li><a href=""""),_display_(/*27.25*/routes/*27.31*/.ProfileController.profile),format.raw/*27.57*/("""">View Profile</a></li>
        """)))}),format.raw/*28.10*/("""
        """),format.raw/*29.9*/("""</ul>
      </div>
    </div>
  </div>
""")))}),format.raw/*33.2*/("""
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
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Thu Jan 12 22:34:53 EST 2017
                  SOURCE: /Users/ryanmccormack/Documents/thunderdome/thunderdome-play/app/views/index.scala.html
                  HASH: 49e1b1c8bc6dd5234f2c0194aa6f6d317c806b88
                  MATRIX: 537->1|656->26|670->32|727->81|766->83|796->88|838->110|867->113|1185->404|1219->429|1259->431|1298->442|1409->526|1424->532|1485->572|1556->616|1571->622|1628->658|1675->687|1688->692|1727->693|1766->704|1823->734|1836->738|1858->751|1904->759|1934->762|1959->766|1992->768|2075->824|2088->828|2110->841|2155->848|2198->863|2231->869|2241->870|2273->881|2303->884|2313->885|2346->897|2397->917|2436->928|2493->958|2508->964|2555->990|2619->1023|2655->1032|2725->1072
                  LINES: 20->1|25->1|25->1|25->1|25->1|28->4|28->4|29->5|39->15|39->15|39->15|40->16|41->17|41->17|41->17|42->18|42->18|42->18|43->19|43->19|43->19|44->20|44->20|44->20|44->20|44->20|44->20|44->20|44->20|47->23|47->23|47->23|47->23|48->24|48->24|48->24|48->24|48->24|48->24|48->24|49->25|50->26|51->27|51->27|51->27|52->28|53->29|57->33
                  -- GENERATED --
              */
          
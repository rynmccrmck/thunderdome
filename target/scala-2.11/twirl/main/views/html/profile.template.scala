
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[models.user.User,Seq[com.mohiva.play.silhouette.impl.providers.CommonSocialProfile],Request[AnyContent],Session,Flash,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(
  user: models.user.User,
  profiles: Seq[com.mohiva.play.silhouette.impl.providers.CommonSocialProfile]
)(
  implicit request: Request[AnyContent], session: Session, flash: Flash, messages: Messages
):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*6.3*/layout/*6.9*/.bootstrap("Profile")/*6.30*/ {_display_(Seq[Any](format.raw/*6.32*/("""

 """),_display_(/*8.3*/(_navBar(user,"home"))),format.raw/*8.25*/("""


  """),format.raw/*11.3*/("""<div class="profile">
    """),_display_(/*12.6*/if(user.isGuest)/*12.22*/ {_display_(Seq[Any](format.raw/*12.24*/("""
      """),format.raw/*13.7*/("""<p>
        You're playing as a guest. Why not
        <a href=""""),_display_(/*15.19*/controllers/*15.30*/.routes.RegistrationController.registrationForm()),format.raw/*15.79*/("""">register</a> or
        <a href=""""),_display_(/*16.19*/controllers/*16.30*/.routes.AuthenticationController.signInForm()),format.raw/*16.75*/("""">sign in</a>
        ?
      </p>
    """)))}/*19.7*/else/*19.12*/{_display_(Seq[Any](format.raw/*19.13*/("""
      """),_display_(/*20.8*/user/*20.12*/.username.map/*20.25*/ { un =>_display_(Seq[Any](format.raw/*20.33*/("""
        """),format.raw/*21.9*/("""<div class="username">"""),_display_(/*21.32*/un),format.raw/*21.34*/("""</div>
      """)))}/*22.8*/.getOrElse/*22.18*/ {_display_(Seq[Any](format.raw/*22.20*/("""
        """),format.raw/*23.9*/("""<div class="username">Guest</div>
      """)))}),format.raw/*24.8*/("""
      """),format.raw/*25.7*/("""<div class="logout">
        <a class="sign-out-link" href=""""),_display_(/*26.41*/controllers/*26.52*/.routes.AuthenticationController.signOut),format.raw/*26.92*/("""">Sign Out</a>
      </div>
      """),_display_(/*28.8*/defining(profiles.find(_.loginInfo.providerID == "credentials"))/*28.72*/ { credentials =>_display_(Seq[Any](format.raw/*28.89*/("""
        """),format.raw/*29.9*/("""<div class="profile-detail">
          """),_display_(/*30.12*/if(credentials.isDefined)/*30.37*/ {_display_(Seq[Any](format.raw/*30.39*/("""
            """),format.raw/*31.13*/("""<em>"""),_display_(/*31.18*/credentials/*31.29*/.get.email),format.raw/*31.39*/("""</em>
          """)))}/*32.13*/else/*32.18*/{_display_(Seq[Any](format.raw/*32.19*/("""
            """),format.raw/*33.13*/("""<a href=""""),_display_(/*33.23*/controllers/*33.34*/.routes.RegistrationController.registrationForm()),format.raw/*33.83*/("""">Create Account</a>
          """)))}),format.raw/*34.12*/("""
        """),format.raw/*35.9*/("""</div>
      """)))}),format.raw/*36.8*/("""
      """),_display_(/*37.8*/services/*37.16*/.user.SocialAuthProviders.providers.map/*37.55*/ { provider =>_display_(Seq[Any](format.raw/*37.69*/("""
        """),_display_(/*38.10*/defining(profiles.find(_.loginInfo.providerID == provider._1))/*38.72*/ { profile =>_display_(Seq[Any](format.raw/*38.85*/("""
          """),format.raw/*39.11*/("""<div class="profile-detail">
            """),_display_(/*40.14*/if(profile.isDefined)/*40.35*/ {_display_(Seq[Any](format.raw/*40.37*/("""
              """),format.raw/*41.15*/("""<div class="provider """),_display_(/*41.37*/provider/*41.45*/._1),format.raw/*41.48*/("""">
                <img src=""""),_display_(/*42.28*/routes/*42.34*/.Assets.versioned("images/providers/" + provider._1 + ".png")),format.raw/*42.95*/("""">
              </div>
              <div class="profile-links">
                <strong>"""),_display_(/*45.26*/profile/*45.33*/.get.fullName),format.raw/*45.46*/("""</strong><br/>
                """),_display_(/*46.18*/profile/*46.25*/.get.email),format.raw/*46.35*/("""<br/>
              </div>
            """)))}/*48.15*/else/*48.20*/{_display_(Seq[Any](format.raw/*48.21*/("""
              """),_display_(/*49.16*/defining(controllers.routes.AuthenticationController.authenticateSocial(provider._1))/*49.101*/ { url =>_display_(Seq[Any](format.raw/*49.110*/("""
                """),format.raw/*50.17*/("""<a href=""""),_display_(/*50.27*/url),format.raw/*50.30*/("""" class="provider """),_display_(/*50.49*/provider/*50.57*/._1),format.raw/*50.60*/("""">
                  <img src=""""),_display_(/*51.30*/routes/*51.36*/.Assets.versioned("images/providers/" + provider._1 + ".png")),format.raw/*51.97*/("""">
                </a>
                <div class="profile-links">
                  <a href=""""),_display_(/*54.29*/url),format.raw/*54.32*/("""">Connect your """),_display_(/*54.48*/provider/*54.56*/._2),format.raw/*54.59*/(""" """),format.raw/*54.60*/("""account</a>
                </div>
              """)))}),format.raw/*56.16*/("""
            """)))}),format.raw/*57.14*/("""
            """),format.raw/*58.13*/("""<div class="clear"></div>
          </div>
        """)))}),format.raw/*60.10*/("""
      """)))}),format.raw/*61.8*/("""
    """)))}),format.raw/*62.6*/("""
  """),format.raw/*63.3*/("""</div>
""")))}),format.raw/*64.2*/("""
"""))
      }
    }
  }

  def render(user:models.user.User,profiles:Seq[com.mohiva.play.silhouette.impl.providers.CommonSocialProfile],request:Request[AnyContent],session:Session,flash:Flash,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(user,profiles)(request,session,flash,messages)

  def f:((models.user.User,Seq[com.mohiva.play.silhouette.impl.providers.CommonSocialProfile]) => (Request[AnyContent],Session,Flash,Messages) => play.twirl.api.HtmlFormat.Appendable) = (user,profiles) => (request,session,flash,messages) => apply(user,profiles)(request,session,flash,messages)

  def ref: this.type = this

}


}

/**/
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Thu Jan 12 10:10:58 EST 2017
                  SOURCE: /Users/ryanmccormack/Documents/thunderdome/app/views/profile.scala.html
                  HASH: 46dc2ef5742af3d57b8f81f779de2abf9db8532c
                  MATRIX: 651->1|948->205|961->211|990->232|1029->234|1058->238|1100->260|1132->265|1185->292|1210->308|1250->310|1284->317|1376->382|1396->393|1466->442|1529->478|1549->489|1615->534|1673->575|1686->580|1725->581|1759->589|1772->593|1794->606|1840->614|1876->623|1926->646|1949->648|1981->662|2000->672|2040->674|2076->683|2147->724|2181->731|2269->792|2289->803|2350->843|2411->878|2484->942|2539->959|2575->968|2642->1008|2676->1033|2716->1035|2757->1048|2789->1053|2809->1064|2840->1074|2876->1092|2889->1097|2928->1098|2969->1111|3006->1121|3026->1132|3096->1181|3159->1213|3195->1222|3239->1236|3273->1244|3290->1252|3338->1291|3390->1305|3427->1315|3498->1377|3549->1390|3588->1401|3657->1443|3687->1464|3727->1466|3770->1481|3819->1503|3836->1511|3860->1514|3917->1544|3932->1550|4014->1611|4132->1702|4148->1709|4182->1722|4241->1754|4257->1761|4288->1771|4347->1812|4360->1817|4399->1818|4442->1834|4537->1919|4585->1928|4630->1945|4667->1955|4691->1958|4737->1977|4754->1985|4778->1988|4837->2020|4852->2026|4934->2087|5057->2183|5081->2186|5124->2202|5141->2210|5165->2213|5194->2214|5275->2264|5320->2278|5361->2291|5444->2343|5482->2351|5518->2357|5548->2360|5586->2368
                  LINES: 20->1|30->6|30->6|30->6|30->6|32->8|32->8|35->11|36->12|36->12|36->12|37->13|39->15|39->15|39->15|40->16|40->16|40->16|43->19|43->19|43->19|44->20|44->20|44->20|44->20|45->21|45->21|45->21|46->22|46->22|46->22|47->23|48->24|49->25|50->26|50->26|50->26|52->28|52->28|52->28|53->29|54->30|54->30|54->30|55->31|55->31|55->31|55->31|56->32|56->32|56->32|57->33|57->33|57->33|57->33|58->34|59->35|60->36|61->37|61->37|61->37|61->37|62->38|62->38|62->38|63->39|64->40|64->40|64->40|65->41|65->41|65->41|65->41|66->42|66->42|66->42|69->45|69->45|69->45|70->46|70->46|70->46|72->48|72->48|72->48|73->49|73->49|73->49|74->50|74->50|74->50|74->50|74->50|74->50|75->51|75->51|75->51|78->54|78->54|78->54|78->54|78->54|78->54|80->56|81->57|82->58|84->60|85->61|86->62|87->63|88->64
                  -- GENERATED --
              */
          
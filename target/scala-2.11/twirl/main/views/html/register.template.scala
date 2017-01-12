
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[models.user.User,Form[models.user.RegistrationData],Request[AnyContent],Session,Flash,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.user.User, form: Form[models.user.RegistrationData])(
  implicit request: Request[AnyContent], session: Session, flash: Flash, messages: Messages
):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.3*/layout/*3.9*/.bootstrap("Register")/*3.31*/ {_display_(Seq[Any](format.raw/*3.33*/("""


 """),_display_(/*6.3*/(_navBar(user,"home"))),format.raw/*6.25*/("""


  """),format.raw/*9.3*/("""<div class="sign-up">
    """),_display_(/*10.6*/flash/*10.11*/.get("error").map/*10.28*/ { e =>_display_(Seq[Any](format.raw/*10.35*/("""
      """),format.raw/*11.7*/("""<div class="error">"""),_display_(/*11.27*/e),format.raw/*11.28*/("""</div>
    """)))}),format.raw/*12.6*/("""
    """),format.raw/*13.5*/("""<form method="post" action=""""),_display_(/*13.34*/controllers/*13.45*/.routes.RegistrationController.register()),format.raw/*13.86*/("""">
      <input type="text" class="form-control" name="username" value=""""),_display_(/*14.71*/form("username")/*14.87*/.value),format.raw/*14.93*/("""" placeholder="Username" />
      """),_display_(/*15.8*/if(form.error("username").isDefined)/*15.44*/ {_display_(Seq[Any](format.raw/*15.46*/("""
        """),format.raw/*16.9*/("""<em>"""),_display_(/*16.14*/Messages(form.error("username").get.message)),format.raw/*16.58*/("""</em>
      """)))}),format.raw/*17.8*/("""
      """),format.raw/*18.7*/("""<input type="email" class="form-control" name="email" value=""""),_display_(/*18.69*/form("email")/*18.82*/.value),format.raw/*18.88*/("""" placeholder="Email" />
      """),_display_(/*19.8*/if(form.error("email").isDefined)/*19.41*/ {_display_(Seq[Any](format.raw/*19.43*/("""
        """),format.raw/*20.9*/("""<em>"""),_display_(/*20.14*/Messages(form.error("email").get.message)),format.raw/*20.55*/("""</em>
      """)))}),format.raw/*21.8*/("""
      """),format.raw/*22.7*/("""<input type="password" class="form-control" name="password" value="" placeholder="Password" />
      """),_display_(/*23.8*/if(form.error("password").isDefined)/*23.44*/ {_display_(Seq[Any](format.raw/*23.46*/("""
        """),format.raw/*24.9*/("""<em>"""),_display_(/*24.14*/Messages(form.error("password").get.message)),format.raw/*24.58*/("""</em>
      """)))}),format.raw/*25.8*/("""
      """),format.raw/*26.7*/("""<br/>
      <input type="submit" class="submit" value="Register" />
    </form>

    """),_display_(/*30.6*/defining(services.user.SocialAuthProviders.providers)/*30.59*/ { providers =>_display_(Seq[Any](format.raw/*30.74*/("""
      """),_display_(/*31.8*/if(providers.nonEmpty)/*31.30*/ {_display_(Seq[Any](format.raw/*31.32*/("""
        """),format.raw/*32.9*/("""<div>
          <p>Or, sign in with your social account</p>
          <div>
          """),_display_(/*35.12*/for(p <- providers if p._1 != "credentials") yield /*35.56*/ {_display_(Seq[Any](format.raw/*35.58*/("""
            """),format.raw/*36.13*/("""<a title="Sign in with """),_display_(/*36.37*/p/*36.38*/._2),format.raw/*36.41*/("""" href=""""),_display_(/*36.50*/controllers/*36.61*/.routes.AuthenticationController.authenticateSocial(p._1)),format.raw/*36.118*/("""" class="provider """),_display_(/*36.137*/p/*36.138*/._1),format.raw/*36.141*/("""">
              <img src=""""),_display_(/*37.26*/routes/*37.32*/.Assets.versioned(s"images/providers/${p._1}.png")),format.raw/*37.82*/("""">
            </a>
          """)))}),format.raw/*39.12*/("""
          """),format.raw/*40.11*/("""</div>
        </div>
      """)))}),format.raw/*42.8*/("""
    """)))}),format.raw/*43.6*/("""
  """),format.raw/*44.3*/("""</div>
""")))}),format.raw/*45.2*/("""
"""))
      }
    }
  }

  def render(user:models.user.User,form:Form[models.user.RegistrationData],request:Request[AnyContent],session:Session,flash:Flash,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(user,form)(request,session,flash,messages)

  def f:((models.user.User,Form[models.user.RegistrationData]) => (Request[AnyContent],Session,Flash,Messages) => play.twirl.api.HtmlFormat.Appendable) = (user,form) => (request,session,flash,messages) => apply(user,form)(request,session,flash,messages)

  def ref: this.type = this

}


}

/**/
object register extends register_Scope0.register
              /*
                  -- GENERATED --
                  DATE: Thu Jan 12 10:10:58 EST 2017
                  SOURCE: /Users/ryanmccormack/Documents/thunderdome/app/views/register.scala.html
                  HASH: fede0227bff3a288b5b64ab5db53c311a251d1a4
                  MATRIX: 621->1|876->163|889->169|919->191|958->193|988->198|1030->220|1061->225|1114->252|1128->257|1154->274|1199->281|1233->288|1280->308|1302->309|1344->321|1376->326|1432->355|1452->366|1514->407|1614->480|1639->496|1666->502|1727->537|1772->573|1812->575|1848->584|1880->589|1945->633|1988->646|2022->653|2111->715|2133->728|2160->734|2218->766|2260->799|2300->801|2336->810|2368->815|2430->856|2473->869|2507->876|2635->978|2680->1014|2720->1016|2756->1025|2788->1030|2853->1074|2896->1087|2930->1094|3042->1180|3104->1233|3157->1248|3191->1256|3222->1278|3262->1280|3298->1289|3412->1376|3472->1420|3512->1422|3553->1435|3604->1459|3614->1460|3638->1463|3674->1472|3694->1483|3773->1540|3820->1559|3831->1560|3856->1563|3911->1591|3926->1597|3997->1647|4059->1678|4098->1689|4157->1718|4193->1724|4223->1727|4261->1735
                  LINES: 20->1|27->3|27->3|27->3|27->3|30->6|30->6|33->9|34->10|34->10|34->10|34->10|35->11|35->11|35->11|36->12|37->13|37->13|37->13|37->13|38->14|38->14|38->14|39->15|39->15|39->15|40->16|40->16|40->16|41->17|42->18|42->18|42->18|42->18|43->19|43->19|43->19|44->20|44->20|44->20|45->21|46->22|47->23|47->23|47->23|48->24|48->24|48->24|49->25|50->26|54->30|54->30|54->30|55->31|55->31|55->31|56->32|59->35|59->35|59->35|60->36|60->36|60->36|60->36|60->36|60->36|60->36|60->36|60->36|60->36|61->37|61->37|61->37|63->39|64->40|66->42|67->43|68->44|69->45
                  -- GENERATED --
              */
          
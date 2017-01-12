
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object signin_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class signin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[models.user.User,Form[com.mohiva.play.silhouette.api.util.Credentials],Request[AnyContent],Session,Flash,Messages,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.user.User, form: Form[com.mohiva.play.silhouette.api.util.Credentials])(
  implicit request: Request[AnyContent], session: Session, flash: Flash, messages: Messages
):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*3.3*/layout/*3.9*/.bootstrap("Sign In")/*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""

 """),_display_(/*5.3*/(_navBar(user,"home"))),format.raw/*5.25*/("""

  """),format.raw/*7.3*/("""<div class="sign-in">
    """),_display_(/*8.6*/if(flash.get("error").isDefined)/*8.38*/ {_display_(Seq[Any](format.raw/*8.40*/("""
      """),format.raw/*9.7*/("""<div class="flash-error">"""),_display_(/*9.33*/flash("error")),format.raw/*9.47*/("""</div>
    """)))}),format.raw/*10.6*/("""
    """),format.raw/*11.5*/("""<form method="post" action=""""),_display_(/*11.34*/controllers/*11.45*/.routes.AuthenticationController.authenticateCredentials()),format.raw/*11.103*/("""">
      <input type="text" class="form-control" name="email" value=""""),_display_(/*12.68*/form("email")/*12.81*/.value),format.raw/*12.87*/("""" placeholder="Username" />
      """),_display_(/*13.8*/if(form.error("email").isDefined)/*13.41*/ {_display_(Seq[Any](format.raw/*13.43*/("""
        """),format.raw/*14.9*/("""<em>"""),_display_(/*14.14*/Messages(form.error("email").get.message)),format.raw/*14.55*/("""</em>
      """)))}),format.raw/*15.8*/("""
      """),format.raw/*16.7*/("""<input type="password" class="form-control" name="password" placeholder="Password" />
      """),_display_(/*17.8*/if(form.error("password").isDefined)/*17.44*/ {_display_(Seq[Any](format.raw/*17.46*/("""
        """),format.raw/*18.9*/("""<em>"""),_display_(/*18.14*/Messages(form.error("password").get.message)),format.raw/*18.58*/("""</em>
      """)))}),format.raw/*19.8*/("""
      """),format.raw/*20.7*/("""<input type="submit" class="submit" value="Sign in" />
    </form>

    <div>
      <p>Not a member? <a href=""""),_display_(/*24.34*/controllers/*24.45*/.routes.RegistrationController.registrationForm()),format.raw/*24.94*/("""">Sign up now</a></p>
    </div>

    """),_display_(/*27.6*/defining(services.user.SocialAuthProviders.providers)/*27.59*/ { providers =>_display_(Seq[Any](format.raw/*27.74*/("""
      """),_display_(/*28.8*/if(providers.nonEmpty)/*28.30*/ {_display_(Seq[Any](format.raw/*28.32*/("""
        """),format.raw/*29.9*/("""<div>
          <p>Or sign in using these providers</p>
          <div>
          """),_display_(/*32.12*/for(p <- providers if p._1 != "credentials") yield /*32.56*/ {_display_(Seq[Any](format.raw/*32.58*/("""
            """),format.raw/*33.13*/("""<a title="Sign in with """),_display_(/*33.37*/p/*33.38*/._2),format.raw/*33.41*/("""" href=""""),_display_(/*33.50*/controllers/*33.61*/.routes.AuthenticationController.authenticateSocial(p._1)),format.raw/*33.118*/("""" class="provider """),_display_(/*33.137*/p/*33.138*/._1),format.raw/*33.141*/("""">
              <img src=""""),_display_(/*34.26*/routes/*34.32*/.Assets.versioned("images/providers/" + p._1 + ".png")),format.raw/*34.86*/("""">
            </a>
          """)))}),format.raw/*36.12*/("""
          """),format.raw/*37.11*/("""</div>
        </div>
      """)))}),format.raw/*39.8*/("""
    """)))}),format.raw/*40.6*/("""
  """),format.raw/*41.3*/("""</div>
""")))}),format.raw/*42.2*/("""
"""))
      }
    }
  }

  def render(user:models.user.User,form:Form[com.mohiva.play.silhouette.api.util.Credentials],request:Request[AnyContent],session:Session,flash:Flash,messages:Messages): play.twirl.api.HtmlFormat.Appendable = apply(user,form)(request,session,flash,messages)

  def f:((models.user.User,Form[com.mohiva.play.silhouette.api.util.Credentials]) => (Request[AnyContent],Session,Flash,Messages) => play.twirl.api.HtmlFormat.Appendable) = (user,form) => (request,session,flash,messages) => apply(user,form)(request,session,flash,messages)

  def ref: this.type = this

}


}

/**/
object signin extends signin_Scope0.signin
              /*
                  -- GENERATED --
                  DATE: Thu Jan 12 10:10:58 EST 2017
                  SOURCE: /Users/ryanmccormack/Documents/thunderdome/app/views/signin.scala.html
                  HASH: 829f5bf3c7040e98bc9a07dce89ef9e8a5c90b36
                  MATRIX: 636->1|910->182|923->188|952->209|991->211|1020->215|1062->237|1092->241|1144->268|1184->300|1223->302|1256->309|1308->335|1342->349|1384->361|1416->366|1472->395|1492->406|1572->464|1669->534|1691->547|1718->553|1779->588|1821->621|1861->623|1897->632|1929->637|1991->678|2034->691|2068->698|2187->791|2232->827|2272->829|2308->838|2340->843|2405->887|2448->900|2482->907|2620->1018|2640->1029|2710->1078|2775->1117|2837->1170|2890->1185|2924->1193|2955->1215|2995->1217|3031->1226|3141->1309|3201->1353|3241->1355|3282->1368|3333->1392|3343->1393|3367->1396|3403->1405|3423->1416|3502->1473|3549->1492|3560->1493|3585->1496|3640->1524|3655->1530|3730->1584|3792->1615|3831->1626|3890->1655|3926->1661|3956->1664|3994->1672
                  LINES: 20->1|27->3|27->3|27->3|27->3|29->5|29->5|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|35->11|35->11|35->11|35->11|36->12|36->12|36->12|37->13|37->13|37->13|38->14|38->14|38->14|39->15|40->16|41->17|41->17|41->17|42->18|42->18|42->18|43->19|44->20|48->24|48->24|48->24|51->27|51->27|51->27|52->28|52->28|52->28|53->29|56->32|56->32|56->32|57->33|57->33|57->33|57->33|57->33|57->33|57->33|57->33|57->33|57->33|58->34|58->34|58->34|60->36|61->37|63->39|64->40|65->41|66->42
                  -- GENERATED --
              */
          
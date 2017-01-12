
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object admin_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class admin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[models.user.User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(user: models.user.User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.27*/layout/*1.33*/.bootstrap("Play Silhouette Postgres Async Seed")/*1.82*/ {_display_(Seq[Any](format.raw/*1.84*/("""

 """),_display_(/*3.3*/(_navBar(user,"home"))),format.raw/*3.25*/("""


    """),format.raw/*6.5*/("""<div class="container">
    <div class="row">
         <div class="col-md-12">
        <p>This is the admin tab</p>
      </div>
    </div>
    <div class="row">
      <div class="col-md-12">
        <li><a href=""""),_display_(/*14.23*/routes/*14.29*/.ContestController.contestForm),format.raw/*14.59*/("""">Create Contest</a></li>
        <li><a href=""""),_display_(/*15.23*/routes/*15.29*/.ContestController.contestForm),format.raw/*15.59*/("""">Edit Contest</a></li>
        <li><a href=""""),_display_(/*16.23*/routes/*16.29*/.UserController.userInviteForm),format.raw/*16.59*/("""">Invite Users</a></li>
        <li><a href=""""),_display_(/*17.23*/routes/*17.29*/.UserController.editUsers),format.raw/*17.54*/("""">Edit User Roles</a></li>
      </div>
    </div>
</div>
""")))}),format.raw/*21.2*/("""
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
object admin extends admin_Scope0.admin
              /*
                  -- GENERATED --
                  DATE: Thu Jan 12 10:10:58 EST 2017
                  SOURCE: /Users/ryanmccormack/Documents/thunderdome/app/views/admin.scala.html
                  HASH: e3ff05d8d6c2682506ff8366fe94d5cb78ee5bc9
                  MATRIX: 537->1|656->26|670->32|727->81|766->83|795->87|837->109|870->116|1111->330|1126->336|1177->366|1252->414|1267->420|1318->450|1391->496|1406->502|1457->532|1530->578|1545->584|1591->609|1680->668
                  LINES: 20->1|25->1|25->1|25->1|25->1|27->3|27->3|30->6|38->14|38->14|38->14|39->15|39->15|39->15|40->16|40->16|40->16|41->17|41->17|41->17|45->21
                  -- GENERATED --
              */
          
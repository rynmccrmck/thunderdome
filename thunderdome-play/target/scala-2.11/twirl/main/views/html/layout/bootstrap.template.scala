
package views.html.layout

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object bootstrap_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class bootstrap extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Seq[String],Seq[String],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, scripts: Seq[String] = Nil, stylesheets: Seq[String] = Nil)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.93*/basic(
  title,
  scripts = Seq(routes.Assets.versioned("lib/jquery/jquery.min.js").url, routes.Assets.versioned("lib/bootstrap/js/bootstrap.min.js").url) ++ scripts,
  stylesheets = Seq(routes.Assets.versioned("lib/bootstrap/css/bootstrap.min.css").url) ++ stylesheets
)/*5.2*/(content)),format.raw/*5.11*/("""
"""))
      }
    }
  }

  def render(title:String,scripts:Seq[String],stylesheets:Seq[String],content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,scripts,stylesheets)(content)

  def f:((String,Seq[String],Seq[String]) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,scripts,stylesheets) => (content) => apply(title,scripts,stylesheets)(content)

  def ref: this.type = this

}


}

/**/
object bootstrap extends bootstrap_Scope0.bootstrap
              /*
                  -- GENERATED --
                  DATE: Thu Jan 12 08:54:54 EST 2017
                  SOURCE: /Users/ryanmccormack/Documents/thunderdome/thunderdome-play/app/views/layout/bootstrap.scala.html
                  HASH: bcec4b7be0dd983b56cf59aac05cb238a3d65c17
                  MATRIX: 571->1|756->92|1034->363|1063->372
                  LINES: 20->1|25->1|29->5|29->5
                  -- GENERATED --
              */
          
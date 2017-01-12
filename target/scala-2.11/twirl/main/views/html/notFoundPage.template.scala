
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object notFoundPage_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class notFoundPage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[RequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(request: RequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.26*/("""
"""),_display_(/*2.2*/layout/*2.8*/.bootstrap("Play Silhouette Postgres Async Seed")/*2.57*/ {_display_(Seq[Any](format.raw/*2.59*/("""

    """),format.raw/*4.5*/("""<div class="container">
    <div class="row">
      <div class="col-md-12">
        <h3>OOPS!</h3>
        <p>You requested: """),_display_(/*8.28*/request/*8.35*/.path),format.raw/*8.40*/(""" """),format.raw/*8.41*/("""it was not found</p>
        <img src="/assets/images/images.jpeg" height=400>
    </div>
    </div>
    </div>
""")))}),format.raw/*13.2*/("""
"""))
      }
    }
  }

  def render(request:RequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(request)

  def f:((RequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (request) => apply(request)

  def ref: this.type = this

}


}

/**/
object notFoundPage extends notFoundPage_Scope0.notFoundPage
              /*
                  -- GENERATED --
                  DATE: Thu Jan 12 10:10:58 EST 2017
                  SOURCE: /Users/ryanmccormack/Documents/thunderdome/app/views/notFoundPage.scala.html
                  HASH: 1cbaf62f7994124e52e55ed4ec84b14116ba2416
                  MATRIX: 548->1|667->25|694->27|707->33|764->82|803->84|835->90|987->216|1002->223|1027->228|1055->229|1198->342
                  LINES: 20->1|25->1|26->2|26->2|26->2|26->2|28->4|32->8|32->8|32->8|32->8|37->13
                  -- GENERATED --
              */
          
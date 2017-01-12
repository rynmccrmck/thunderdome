
package views.html.layout

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object basic_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class basic extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[String,Seq[String],Seq[String],Option[String],Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(
  title: String,
  scripts: Seq[String] = Nil,
  stylesheets: Seq[String] = Nil,
  bodyClass: Option[String] = None
)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.17*/("""<!DOCTYPE html> 
  <head>
    <title>"""),_display_(/*8.13*/title),format.raw/*8.18*/("""</title>
    <meta charset="utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <style>body """),format.raw/*12.17*/("""{"""),format.raw/*12.18*/("""padding-top: 65px;"""),format.raw/*12.36*/("""}"""),format.raw/*12.37*/("""</style>
    """),_display_(/*13.6*/for(script <- scripts) yield /*13.28*/ {_display_(Seq[Any](format.raw/*13.30*/("""<script src=""""),_display_(/*13.44*/script),format.raw/*13.50*/(""""></script>""")))}),format.raw/*13.62*/("""

    """),format.raw/*15.5*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*15.50*/routes/*15.56*/.Assets.versioned("stylesheets/main.css")),format.raw/*15.97*/("""">
    """),_display_(/*16.6*/for(stylesheet <- stylesheets) yield /*16.36*/ {_display_(Seq[Any](format.raw/*16.38*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*16.83*/stylesheet),format.raw/*16.93*/("""" />""")))}),format.raw/*16.98*/("""
  """),format.raw/*17.3*/("""</head>
  
  
  <body"""),_display_(/*20.9*/bodyClass/*20.18*/.map(c => Html(" class=\"" + c + "\""))),format.raw/*20.57*/(""">"""),_display_(/*20.59*/content),format.raw/*20.66*/("""
  """),format.raw/*21.3*/("""</body>
  
</html>
"""))
      }
    }
  }

  def render(title:String,scripts:Seq[String],stylesheets:Seq[String],bodyClass:Option[String],content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,scripts,stylesheets,bodyClass)(content)

  def f:((String,Seq[String],Seq[String],Option[String]) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,scripts,stylesheets,bodyClass) => (content) => apply(title,scripts,stylesheets,bodyClass)(content)

  def ref: this.type = this

}


}

/**/
object basic extends basic_Scope0.basic
              /*
                  -- GENERATED --
                  DATE: Thu Jan 12 10:10:58 EST 2017
                  SOURCE: /Users/ryanmccormack/Documents/thunderdome/app/views/layout/basic.scala.html
                  HASH: b55b50cdb1124cf5ecbeb7675deb98d280c80dba
                  MATRIX: 578->1|807->135|871->173|896->178|1144->398|1173->399|1219->417|1248->418|1288->432|1326->454|1366->456|1407->470|1434->476|1477->488|1510->494|1582->539|1597->545|1659->586|1693->594|1739->624|1779->626|1851->671|1882->681|1918->686|1948->689|1996->711|2014->720|2074->759|2103->761|2131->768|2161->771
                  LINES: 20->1|30->6|32->8|32->8|36->12|36->12|36->12|36->12|37->13|37->13|37->13|37->13|37->13|37->13|39->15|39->15|39->15|39->15|40->16|40->16|40->16|40->16|40->16|40->16|41->17|44->20|44->20|44->20|44->20|44->20|45->21
                  -- GENERATED --
              */
          
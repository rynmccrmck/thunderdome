
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ryanmccormack/Documents/thunderdome/thunderdome-play/conf/routes
// @DATE:Thu Jan 12 08:37:35 EST 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:1
  HomeController_1: controllers.HomeController,
  // @LINE:5
  RegistrationController_6: controllers.RegistrationController,
  // @LINE:7
  AuthenticationController_5: controllers.AuthenticationController,
  // @LINE:13
  ProfileController_3: controllers.ProfileController,
  // @LINE:16
  ContestController_0: controllers.ContestController,
  // @LINE:18
  UserController_2: controllers.UserController,
  // @LINE:28
  Assets_4: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:1
    HomeController_1: controllers.HomeController,
    // @LINE:5
    RegistrationController_6: controllers.RegistrationController,
    // @LINE:7
    AuthenticationController_5: controllers.AuthenticationController,
    // @LINE:13
    ProfileController_3: controllers.ProfileController,
    // @LINE:16
    ContestController_0: controllers.ContestController,
    // @LINE:18
    UserController_2: controllers.UserController,
    // @LINE:28
    Assets_4: controllers.Assets
  ) = this(errorHandler, HomeController_1, RegistrationController_6, AuthenticationController_5, ProfileController_3, ContestController_0, UserController_2, Assets_4, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, HomeController_1, RegistrationController_6, AuthenticationController_5, ProfileController_3, ContestController_0, UserController_2, Assets_4, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.HomeController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin""", """controllers.HomeController.admin"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.RegistrationController.registrationForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signup""", """controllers.RegistrationController.register"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.AuthenticationController.signInForm"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin""", """controllers.AuthenticationController.authenticateCredentials"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signin/$provider<[^/]+>""", """controllers.AuthenticationController.authenticateSocial(provider:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """signout""", """controllers.AuthenticationController.signOut"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """profile""", """controllers.ProfileController.profile"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/create-contest""", """controllers.ContestController.contestForm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/edit-contest""", """controllers.ContestController.contestForm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/invite-users""", """controllers.UserController.userInviteForm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/edit-users""", """controllers.UserController.editUsers"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contests""", """controllers.ContestController.contests"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """contest/$contest_id<[^/]+>""", """controllers.ContestController.contest(contest_id:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submissions""", """controllers.ContestController.contestForm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """submission""", """controllers.ContestController.contestForm"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """favicon.ico""", """controllers.Assets.at(path:String = "/public", file:String = "favicon.ico")"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:1
  private[this] lazy val controllers_HomeController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_HomeController_index0_invoker = createInvoker(
    HomeController_1.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """"""
    )
  )

  // @LINE:2
  private[this] lazy val controllers_HomeController_admin1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin")))
  )
  private[this] lazy val controllers_HomeController_admin1_invoker = createInvoker(
    HomeController_1.admin,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.HomeController",
      "admin",
      Nil,
      "GET",
      """""",
      this.prefix + """admin"""
    )
  )

  // @LINE:5
  private[this] lazy val controllers_RegistrationController_registrationForm2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_RegistrationController_registrationForm2_invoker = createInvoker(
    RegistrationController_6.registrationForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegistrationController",
      "registrationForm",
      Nil,
      "GET",
      """ Authentication""",
      this.prefix + """signup"""
    )
  )

  // @LINE:6
  private[this] lazy val controllers_RegistrationController_register3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signup")))
  )
  private[this] lazy val controllers_RegistrationController_register3_invoker = createInvoker(
    RegistrationController_6.register,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.RegistrationController",
      "register",
      Nil,
      "POST",
      """""",
      this.prefix + """signup"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_AuthenticationController_signInForm4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_AuthenticationController_signInForm4_invoker = createInvoker(
    AuthenticationController_5.signInForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthenticationController",
      "signInForm",
      Nil,
      "GET",
      """""",
      this.prefix + """signin"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_AuthenticationController_authenticateCredentials5_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin")))
  )
  private[this] lazy val controllers_AuthenticationController_authenticateCredentials5_invoker = createInvoker(
    AuthenticationController_5.authenticateCredentials,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthenticationController",
      "authenticateCredentials",
      Nil,
      "POST",
      """""",
      this.prefix + """signin"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_AuthenticationController_authenticateSocial6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signin/"), DynamicPart("provider", """[^/]+""",true)))
  )
  private[this] lazy val controllers_AuthenticationController_authenticateSocial6_invoker = createInvoker(
    AuthenticationController_5.authenticateSocial(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthenticationController",
      "authenticateSocial",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """signin/$provider<[^/]+>"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_AuthenticationController_signOut7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("signout")))
  )
  private[this] lazy val controllers_AuthenticationController_signOut7_invoker = createInvoker(
    AuthenticationController_5.signOut,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AuthenticationController",
      "signOut",
      Nil,
      "GET",
      """""",
      this.prefix + """signout"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_ProfileController_profile8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("profile")))
  )
  private[this] lazy val controllers_ProfileController_profile8_invoker = createInvoker(
    ProfileController_3.profile,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProfileController",
      "profile",
      Nil,
      "GET",
      """ Profile""",
      this.prefix + """profile"""
    )
  )

  // @LINE:16
  private[this] lazy val controllers_ContestController_contestForm9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/create-contest")))
  )
  private[this] lazy val controllers_ContestController_contestForm9_invoker = createInvoker(
    ContestController_0.contestForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContestController",
      "contestForm",
      Nil,
      "GET",
      """ Admin""",
      this.prefix + """admin/create-contest"""
    )
  )

  // @LINE:17
  private[this] lazy val controllers_ContestController_contestForm10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/edit-contest")))
  )
  private[this] lazy val controllers_ContestController_contestForm10_invoker = createInvoker(
    ContestController_0.contestForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContestController",
      "contestForm",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/edit-contest"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UserController_userInviteForm11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/invite-users")))
  )
  private[this] lazy val controllers_UserController_userInviteForm11_invoker = createInvoker(
    UserController_2.userInviteForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "userInviteForm",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/invite-users"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_UserController_editUsers12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/edit-users")))
  )
  private[this] lazy val controllers_UserController_editUsers12_invoker = createInvoker(
    UserController_2.editUsers,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UserController",
      "editUsers",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/edit-users"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_ContestController_contests13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contests")))
  )
  private[this] lazy val controllers_ContestController_contests13_invoker = createInvoker(
    ContestController_0.contests,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContestController",
      "contests",
      Nil,
      "GET",
      """ User""",
      this.prefix + """contests"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_ContestController_contest14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("contest/"), DynamicPart("contest_id", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ContestController_contest14_invoker = createInvoker(
    ContestController_0.contest(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContestController",
      "contest",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """contest/$contest_id<[^/]+>"""
    )
  )

  // @LINE:24
  private[this] lazy val controllers_ContestController_contestForm15_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submissions")))
  )
  private[this] lazy val controllers_ContestController_contestForm15_invoker = createInvoker(
    ContestController_0.contestForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContestController",
      "contestForm",
      Nil,
      "GET",
      """""",
      this.prefix + """submissions"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ContestController_contestForm16_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("submission")))
  )
  private[this] lazy val controllers_ContestController_contestForm16_invoker = createInvoker(
    ContestController_0.contestForm,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ContestController",
      "contestForm",
      Nil,
      "GET",
      """""",
      this.prefix + """submission"""
    )
  )

  // @LINE:28
  private[this] lazy val controllers_Assets_versioned17_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned17_invoker = createInvoker(
    Assets_4.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """""",
      this.prefix + """assets/$file<.+>"""
    )
  )

  // @LINE:29
  private[this] lazy val controllers_Assets_at18_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("favicon.ico")))
  )
  private[this] lazy val controllers_Assets_at18_invoker = createInvoker(
    Assets_4.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """favicon.ico"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:1
    case controllers_HomeController_index0_route(params) =>
      call { 
        controllers_HomeController_index0_invoker.call(HomeController_1.index)
      }
  
    // @LINE:2
    case controllers_HomeController_admin1_route(params) =>
      call { 
        controllers_HomeController_admin1_invoker.call(HomeController_1.admin)
      }
  
    // @LINE:5
    case controllers_RegistrationController_registrationForm2_route(params) =>
      call { 
        controllers_RegistrationController_registrationForm2_invoker.call(RegistrationController_6.registrationForm)
      }
  
    // @LINE:6
    case controllers_RegistrationController_register3_route(params) =>
      call { 
        controllers_RegistrationController_register3_invoker.call(RegistrationController_6.register)
      }
  
    // @LINE:7
    case controllers_AuthenticationController_signInForm4_route(params) =>
      call { 
        controllers_AuthenticationController_signInForm4_invoker.call(AuthenticationController_5.signInForm)
      }
  
    // @LINE:8
    case controllers_AuthenticationController_authenticateCredentials5_route(params) =>
      call { 
        controllers_AuthenticationController_authenticateCredentials5_invoker.call(AuthenticationController_5.authenticateCredentials)
      }
  
    // @LINE:9
    case controllers_AuthenticationController_authenticateSocial6_route(params) =>
      call(params.fromPath[String]("provider", None)) { (provider) =>
        controllers_AuthenticationController_authenticateSocial6_invoker.call(AuthenticationController_5.authenticateSocial(provider))
      }
  
    // @LINE:10
    case controllers_AuthenticationController_signOut7_route(params) =>
      call { 
        controllers_AuthenticationController_signOut7_invoker.call(AuthenticationController_5.signOut)
      }
  
    // @LINE:13
    case controllers_ProfileController_profile8_route(params) =>
      call { 
        controllers_ProfileController_profile8_invoker.call(ProfileController_3.profile)
      }
  
    // @LINE:16
    case controllers_ContestController_contestForm9_route(params) =>
      call { 
        controllers_ContestController_contestForm9_invoker.call(ContestController_0.contestForm)
      }
  
    // @LINE:17
    case controllers_ContestController_contestForm10_route(params) =>
      call { 
        controllers_ContestController_contestForm10_invoker.call(ContestController_0.contestForm)
      }
  
    // @LINE:18
    case controllers_UserController_userInviteForm11_route(params) =>
      call { 
        controllers_UserController_userInviteForm11_invoker.call(UserController_2.userInviteForm)
      }
  
    // @LINE:19
    case controllers_UserController_editUsers12_route(params) =>
      call { 
        controllers_UserController_editUsers12_invoker.call(UserController_2.editUsers)
      }
  
    // @LINE:22
    case controllers_ContestController_contests13_route(params) =>
      call { 
        controllers_ContestController_contests13_invoker.call(ContestController_0.contests)
      }
  
    // @LINE:23
    case controllers_ContestController_contest14_route(params) =>
      call(params.fromPath[String]("contest_id", None)) { (contest_id) =>
        controllers_ContestController_contest14_invoker.call(ContestController_0.contest(contest_id))
      }
  
    // @LINE:24
    case controllers_ContestController_contestForm15_route(params) =>
      call { 
        controllers_ContestController_contestForm15_invoker.call(ContestController_0.contestForm)
      }
  
    // @LINE:25
    case controllers_ContestController_contestForm16_route(params) =>
      call { 
        controllers_ContestController_contestForm16_invoker.call(ContestController_0.contestForm)
      }
  
    // @LINE:28
    case controllers_Assets_versioned17_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned17_invoker.call(Assets_4.versioned(path, file))
      }
  
    // @LINE:29
    case controllers_Assets_at18_route(params) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("favicon.ico"))) { (path, file) =>
        controllers_Assets_at18_invoker.call(Assets_4.at(path, file))
      }
  }
}
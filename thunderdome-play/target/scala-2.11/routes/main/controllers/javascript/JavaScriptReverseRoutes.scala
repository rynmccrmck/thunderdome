
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ryanmccormack/Documents/thunderdome/thunderdome-play/conf/routes
// @DATE:Thu Jan 12 08:37:35 EST 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset

// @LINE:1
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:28
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:29
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "favicon.ico"})
        }
      """
    )
  
    // @LINE:28
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:7
  class ReverseAuthenticationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:10
    def signOut: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthenticationController.signOut",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signout"})
        }
      """
    )
  
    // @LINE:9
    def authenticateSocial: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthenticationController.authenticateSocial",
      """
        function(provider) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signin/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("provider", encodeURIComponent(provider))})
        }
      """
    )
  
    // @LINE:8
    def authenticateCredentials: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthenticationController.authenticateCredentials",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
        }
      """
    )
  
    // @LINE:7
    def signInForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AuthenticationController.signInForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signin"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseProfileController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def profile: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProfileController.profile",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "profile"})
        }
      """
    )
  
  }

  // @LINE:16
  class ReverseContestController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def contest: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContestController.contest",
      """
        function(contest_id) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contest/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("contest_id", encodeURIComponent(contest_id))})
        }
      """
    )
  
    // @LINE:16
    def contestForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContestController.contestForm",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/create-contest"})
          }
        
        }
      """
    )
  
    // @LINE:22
    def contests: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ContestController.contests",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contests"})
        }
      """
    )
  
  }

  // @LINE:18
  class ReverseUserController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:18
    def userInviteForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.userInviteForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/invite-users"})
        }
      """
    )
  
    // @LINE:19
    def editUsers: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UserController.editUsers",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/edit-users"})
        }
      """
    )
  
  }

  // @LINE:1
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:1
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:2
    def admin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.admin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin"})
        }
      """
    )
  
  }

  // @LINE:5
  class ReverseRegistrationController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:6
    def register: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RegistrationController.register",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
    // @LINE:5
    def registrationForm: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.RegistrationController.registrationForm",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "signup"})
        }
      """
    )
  
  }


}
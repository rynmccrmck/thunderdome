
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ryanmccormack/Documents/thunderdome/conf/routes
// @DATE:Thu Jan 12 10:10:57 EST 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAuthenticationController AuthenticationController = new controllers.ReverseAuthenticationController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseProfileController ProfileController = new controllers.ReverseProfileController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseContestController ContestController = new controllers.ReverseContestController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseUserController UserController = new controllers.ReverseUserController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseRegistrationController RegistrationController = new controllers.ReverseRegistrationController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAuthenticationController AuthenticationController = new controllers.javascript.ReverseAuthenticationController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseProfileController ProfileController = new controllers.javascript.ReverseProfileController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseContestController ContestController = new controllers.javascript.ReverseContestController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseUserController UserController = new controllers.javascript.ReverseUserController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseRegistrationController RegistrationController = new controllers.javascript.ReverseRegistrationController(RoutesPrefix.byNamePrefix());
  }

}

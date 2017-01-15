
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ryanmccormack/Documents/thunderdome/thunderdome-play/conf/routes
// @DATE:Thu Jan 12 08:37:35 EST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}

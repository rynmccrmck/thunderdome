
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/ryanmccormack/Documents/thunderdome/conf/routes
// @DATE:Thu Jan 12 10:10:57 EST 2017


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

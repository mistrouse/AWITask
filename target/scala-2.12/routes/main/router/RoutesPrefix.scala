
// @GENERATOR:play-routes-compiler
// @SOURCE:/Users/florianeMac/awi/conf/routes
// @DATE:Sat Jun 24 18:08:06 CEST 2017


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

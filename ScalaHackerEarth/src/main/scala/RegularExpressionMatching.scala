import scala.io.StdIn.readLine

object RegularExpressionMatching {
  def main(args: Array[String]): Unit = {
    println("Enter a string")
    val str = readLine()
    println("Enter a pattern")
    val pattern = readLine()
    println(regularExpression(str, pattern))
  }

  private def regularExpression(s:String, p:String):Boolean = {

    if(p.isEmpty){
      return s.isEmpty
    }
    var token: String = p.charAt(0).toString
    var remainder: String = ""
    if (p.length > 1 && p.charAt(1) == '*') {
      token += '*'
      remainder = p.substring(2)
    }
    else {
      remainder = p.substring(1)
    }

    if (s.isEmpty) {
      if (token.length == 2 && token(1) == '*') {
        return regularExpression(s, remainder)
      } else {
        return false
      }
    }

    val c:Char = s.charAt(0)

    token match {
      case t if t.length == 1 =>
        if (t.charAt(0) == '.' || c == t.charAt(0)) {
          regularExpression(s.substring(1), remainder)
        } else {
          false
        }

      case t if t.length == 2 && t(1) == '*' => // character followed by '*'
        val ch = t(0)
        if (regularExpression(s, remainder)) return true
        var i = 0
        while (i < s.length && (s.charAt(i) == ch || ch == '.')) {
          if (regularExpression(s.substring(i + 1), remainder)) return true
          i += 1
        }
        false
    }
  }
}

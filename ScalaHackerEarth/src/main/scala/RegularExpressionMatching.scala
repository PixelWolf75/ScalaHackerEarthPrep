object RegularExpressionMatching {
  def main(args: Array[String]): Unit = {

  }

  def regularExpression(s:String, p:String):Boolean = {
    var matchReg = true
    var pointer = 0
    var prev = ' '
    for(c <- s){
      var ex = p(pointer)

      if(c != ex || ex != '.'){
        ex match {
          case '*' => {

          }
          case _ => {
            pointer += 1
            ex = p(pointer)
            if (ex != '*') {
              matchReg = false
            }
            else {
              pointer += 1
            }
          }
        }
      }
      else{
        prev = c
        pointer += 1
      }
    }
    matchReg
  }
}

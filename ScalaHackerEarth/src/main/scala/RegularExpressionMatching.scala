object RegularExpressionMatching {
  def main(args: Array[String]): Unit = {

  }

  def regularExpression(s:String, p:String):Boolean = {
    var matchReg = true
    var pointer = 0
    var prev = ' '
    for(c <- s){
      var ex = p(pointer)
      
      if(c != ex){
        if(c != '.'){
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
      
      ex match{
        case '.' =>{

        }
        case '*' =>{

        }
        case _ =>{
          prev = ex
        }
      }
    }
    matchReg
  }
}

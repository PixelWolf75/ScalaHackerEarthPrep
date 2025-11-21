object PhoneNumberMapping {
  def main(args: Array[String]): Unit = {

  }

  def phoneNumberMapping(digits:String):List[String] = {
    var phoneNumMap = List()

    def addOrUpdate(ls:List[String], c:Char, index:Int):List[String] = {
      if(ls.length >= index){
        ls :+ c.toString
      }
      else{
        ls.updated(index, c.toString)
      }
    }

    def numMatch(ls:List[String], s:String, x:String = ""):List[String] = {
      if(s.isBlank){
        return ls
      }

      val num = s.charAt(0)
      val remainder = s.substring(1)
      var addOn = ""

      List()
    }

    for(num <- digits){
      num match {
        case '2' => {

        }
        case '3' => {

        }
        case '4' => {

        }
        case '5' => {

        }
        case '6' => {

        }
        case '7' => {

        }
        case '8' => {

        }
        case '9' => {

        }
      }
    }
    phoneNumMap
  }
}

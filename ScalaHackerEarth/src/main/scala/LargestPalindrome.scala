import scala.io.StdIn.readLine
import scala.util.control.Breaks.{break, breakable}

object LargestPalindrome {
  def main(args: Array[String]): Unit = {
    println("Insert string")
    val input = readLine()
    println(largestPalindrome(input))
  }

  private def largestPalindrome(s:String):String = {

    def isPalindrome(s:String):Boolean = {
      s.reverse.equals(s)
    }

    if(s.length < 2){
      s
    }
    else{
      var palindrome = s(0).toString
      var largest = s.length
      breakable{
        while (largest > 0) {
          var i = 0;
          while(i + largest <= s.length){
            val str = s.substring(i, largest + i)
            i += 1
            if(isPalindrome(str)){
              palindrome = str
              break()
            }
          }
          largest -= 1
        }
      }
      palindrome
    }
  }


}

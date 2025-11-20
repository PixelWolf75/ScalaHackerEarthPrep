import scala.io.StdIn.readInt
import scala.util.control.Breaks.{break, breakable}

object PalindromeNumber {
  def main(args: Array[String]): Unit = {
    println("Enter an integer")
    val input = readInt()
    println(palindromeNumberWithoutString(input))
  }

  def palindromeNumber(x:Int):Boolean = {
    if(x < 0){
      false
    }
    else{
      val xStr = x.toString
      xStr.reverse.equals(xStr)
    }
  }

  private def palindromeNumberWithoutString(x:Int):Boolean ={
    if (x < 0) {
      false
    }
    else {
      var digits:List[Int] = List()
      var total = x
      var isPalindrome = true
      while(total != 0){
        digits = digits :+ (total%10)
        total /= 10
      }

      breakable{
        val n = digits.length

        for (i <- 0 until n / 2) {
          if (digits(i) != digits(n - 1 - i)) {
            isPalindrome = false
          }
        }
      }

      isPalindrome
    }
  }
}

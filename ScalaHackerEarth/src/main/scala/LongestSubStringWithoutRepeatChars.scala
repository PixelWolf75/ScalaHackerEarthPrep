import scala.io.StdIn.readLine

object LongestSubStringWithoutRepeatChars {
  def main(args: Array[String]): Unit = {
    println("Enter a string")
    val input = readLine()
    println(longestSubString(input))
  }
  //test
  private def longestSubString(s : String): Int = {
    var start = 0
    var end = 0
    
    var cSet: Set[Char] = Set()
    var c = ' '
    for(i <- s.indices){
      if(c == s(i) || cSet.contains(s(i))){
        cSet = Set()
        start = i
      }
      c = s(i)
      cSet = cSet + c
      end += 1
    }
    
    end - start
  }
}

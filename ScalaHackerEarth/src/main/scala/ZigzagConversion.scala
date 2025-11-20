import scala.io.StdIn.{readInt, readLine}

object ZigzagConversion {
  def main(args: Array[String]): Unit = {
    println("Enter in input")
    val input = readLine()
    println("Enter in number of rows")
    val rows = readInt()
    println(ZigzagConversion(input, rows))
  }

  def ZigzagConversion(s:String, numRows:Int):String = {
    val zigzag = Array.fill(numRows)("")
    var str = ""
    var row = 0
    var iterator = 1
    for(c <- s){
      if(row == numRows || row < 0){
        iterator = -iterator
        row += (iterator*2)
      }

      zigzag(row) += c.toString

      row += iterator
    }

    for(strRow <- zigzag){
      str += strRow
    }

    str
  }
}

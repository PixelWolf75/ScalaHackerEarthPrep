object WaterHeight {
  def main(args: Array[String]): Unit = {

  }

  def waterHeight(heights:List[Int]):Int = {
    var volumes:List[Int] = List()
    var prev = 0
    for(i <- 0 until heights.length - 1){
      val base = heights(i)
      var volume = 0
      val j = i + 1
      heights.drop(j).foreach(h => {
        if(base < h){
          volume = base * (j - prev)
        }
        else{
          volume = h * (j - prev)
        }
      })
      volumes = volumes :+ volume
      prev += 1
    }
    volumes.max
  }
}

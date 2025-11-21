object SumTriplets {
  def main(args: Array[String]): Unit = {

  }

  def sumTriplets(nums: Array[Int]):Set[Array[Int]] = {
    var triplets = Set[Array[Int]]()
    for(i <- 0 until nums.length - 2){
      val a = nums(i)
      val remainderJ = nums.drop(i+1)
      for(j <- 0 until remainderJ.length - 1){
        val b = remainderJ(j)
        val remainderK = remainderJ.drop(j+1)
        for(c <- remainderK){
          if(a+b+c == 0){
            val arr = Array(a,b,c)
            triplets = triplets + arr
          }
        }
      }
    }
    triplets
  }
}

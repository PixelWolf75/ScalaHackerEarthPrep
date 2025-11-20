import scala.util.control.Breaks.{break, breakable}

object TwoSum {
  def main(args: Array[String]): Unit = {
    
  }
  
  def twoSum(nums: List[Int], target:Int): List[Integer] = {
    var indexA = -1
    var indexB = -1
    breakable{
      for (i <- nums.indices) {
        val a = nums(i)
        for (j <- (i + 1) until nums.size) {
          val b = nums(j)
          if (a + b == target) {
            indexA = i
            indexB = j
            break()
          }
        }
      }
    }
    List(indexA,indexB)
  }

  def twoSumEfficient(nums: List[Int], target: Int): List[Integer] = {
    
    val numSorted = nums.sorted
    var indexA = -1
    var indexB = -1
    breakable {
      for (i <- numSorted.indices) {
        val a = numSorted(i)
        for (j <- (i + 1) until numSorted.size
             if (numSorted(j) <= target)
             if(numSorted(j) + a <= target)) {
          val b = numSorted(j)
          if (a + b == target) {
            indexA = i
            indexB = j
            break()
          }
        }
      }
    }
    List(indexA, indexB)
  }
}

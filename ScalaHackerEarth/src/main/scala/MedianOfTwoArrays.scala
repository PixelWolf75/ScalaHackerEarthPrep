object MedianOfTwoArrays {
  def main(args: Array[String]): Unit = {

  }

  def median(nums1: Array[Int], nums2: Array[Int]): Double = {
    val nums = nums1 ++ nums2
    val numsSorted = nums.sorted
    if(numsSorted.isEmpty){
      0.00
    }
    else{
      if(numsSorted.length % 2 == 0){
        (numsSorted(numsSorted.length/2) + numsSorted((numsSorted.length/2)-1)) / 2.00
      }
      else{
        numsSorted(numsSorted.length/2)
      }
    }
  }
}

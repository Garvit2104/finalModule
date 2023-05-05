object binarySearch extends App{
  val myArray: Array[Int] = Array(1, 4, 6, 8, 10, 15, 16)
  val target: Int = 15
  def binarySearch(myArray: Array[Int], target: Int): Option[Int] = {
    var left: Int = 0
    var right: Int = myArray.length - 1
    while (left <= right) {
      var mid = left + (right - left) / 2
      if (myArray(mid) == target) {
        println(s"Target found at index $mid")
        return Some(mid)
      } else if (myArray(mid) < target) {
        left = mid + 1
      } else {
        right = mid - 1
      }
    }
    None
  }
  binarySearch(myArray, target)
}

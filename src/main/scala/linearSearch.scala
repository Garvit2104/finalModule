object linearSearch extends App{

  var myArray: Array[Int] = Array(1, 2, 4, 6, 7, 8, 9)
  var target: Int = 8

  def linearSearch(myArray: Array[Int], target: Int): Unit = {
    for (i <- 0 until myArray.length) {
      if (myArray(i) == target) {
        println(s"Target is found at index $i")
        return i
      }
    }
    println("Target is not found")
  }
  println(linearSearch(myArray, target))
}

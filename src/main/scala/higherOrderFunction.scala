
object higherOrderFunction extends App{
//// HOF is a function which pass atleast one function as a parameter or return
  // functionas as a output
  def sampleFunction(a: Int, f: Int => Int): Unit = {
    println(f(a)) // calling a function
  }
  def multiplyBy2(a: Int): Int = {
    a * 2
  }
    sampleFunction(25, multiplyBy2) // passing function as a parameter
  //    Another Example of HOF
  val aList: List[Int] = List(1, 2, 3).map(x => x + 1)// map is HOF-It takes anonymous fn
  val aFlatmap = List(1, 2, 3).flatMap(x => List(x, 2 * x)) // flatMap is HOF
  val aFilter = List(2, 4, 5, 7, 8, 9).filter(x => x < 5) // extract element
  println(aList)
  println(aFlatmap)
  println(aFilter)
}

object mapMethod extends App{
  // Map method is a way to store element in a key value pair where key is always unique

  val lst = List(1, 2, 3, 5, 7, 10, 13)
  val myMap = Map(1 -> "Tom", 2 -> "Max", 3 -> "John")

  println(lst.map(_ * 2)) // it takes all the element of the list and mul by 2

  println(lst.map(x => "hi" + x)) // it prepend "hi" in the list element
  println(myMap.map(x => "hi" + x))

  println(myMap.mapValues(x => "hi" + x)) // it prepend "hi" in the values

  println("hello".map(_.toUpper)) // it will iterate over every character and make upperCase
  println(List(List(1, 2, 3), List(3, 4, 5)).flatten) // it collapses one level of nested Structure
  // flatmap is a short hand of Map method it works as int to collection

  println(lst.flatMap(x => List(x, x + 1)))
}

object caseClass extends App{
  // we do not use new keywords for making an object
  val alice = Person("Alice", 25, "Software Engineer")
  println(alice)
 // pattern matching
  val x: Any = "Hello, world!"
  x match {
    case s: String => println("The value is a string: " + s)
    case i: Int => println("The value is an integer: " + i)
    case d: Double => println("The value is a double: " + d)
    case _ => println("The value is something else.")
  }
  // we can test for equality between two instances
  val isAlice = alice == Person("Alice", 25, "Software Engineer")
  println(isAlice)
}
case class Person(name: String, age: Int, occupation: String)



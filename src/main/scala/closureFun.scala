object closureFun extends App{
  // Closure is a function that's output is depend on the free
  // variable(declared variable outside the function)
  val rate = 0.10
  val time = 2

  def calcSimpleInterest(principal: Int): Double = {
    (principal * rate * time) / 100
  }
  //  Here Rate and Time are declared outside the function
  println(calcSimpleInterest(10000))

  //Another Example
  var number = 10
  val add = (x: Int) => x + number
  println(add(20))
}

object curryingFunction extends App{
//  transforming a multiple arguement fn into a chain of fn
  //   normal function -> def sum(a:Int, b: Int) = a+b
  def sumOfTwoNumber(num1: Int)(num2: Int): Int = {
    num1 + num2
  }
  val result = sumOfTwoNumber(10)(40)
  val addOne = sumOfTwoNumber(1)(_)  // partially applied fn
  val result2 = addOne(50)

  println(s"sum of two number is : $result")
  println(s"Partially applied function : $result2")
}

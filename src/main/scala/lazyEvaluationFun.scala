object lazyEvaluationFun extends App{
  // Lazy evaluation is a feature in Scala that allows expressions to be evaluated
  // only when they are needed. This means that an expression is not evaluated until
  // its value is actually required by the program
  lazy val x = {
    println("evaluating x") // this statement is  only executed once
    42 // result is cached for future use
  }
  println("before accessing x") // first print
  println(x) // call lazy val
  println("after accessing x") // print in the end
}

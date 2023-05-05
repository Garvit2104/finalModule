object partiallyApplyFun extends App{
    //  when only a subset of the parameters is passed to the function,
    //  then the function is called a partially applied function.
    val sum = (a: Int, b: Int, c: Int) => a + b + c
    val f = sum(10, _: Int, _: Int)

    println("The sum of three numbers are :" + f(20, 20))

}

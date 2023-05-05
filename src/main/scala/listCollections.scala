object listCollections extends App{
  // List is a collection of similar data type like array

  val myList: List[Int] = List(1, 2, 3, 4, 5, 6)
  val namesList: List[String] = List("Garvit", "Harsh", "Aman")

    //    Basic Operations
    println(myList)
    println(myList(2))
    println(namesList(1))
    //  Adding in List -- But list are immutable collection
    println(0 :: myList) // --> cons method --> ::-> these cons  prepend to the list
    //  above method do not change the original list
    println(1 :: 5 :: 9 :: Nil) // create new List
    println(Nil) // it return empty list
    myList.foreach(println) // taking element one by one
    namesList.foreach(println)

    println(myList.head) // return first element
    println(namesList.tail) // return last element
    println(namesList.isEmpty) // check list is empty or not
    println(myList.reverse) // it print the list in reverse order

    println(List.fill(5)(2)) // it return a list of 5 times 2

    var sum: Int = 0
    myList.foreach(sum += _)
    println(sum)
}

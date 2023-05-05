object mapColections extends App{
  //  Map stores element in key value pair

  val myMap: Map[Int, String] = Map(2301 -> "Harsh", 2302 -> "Garvit", 2303 -> "Anuj", 2304 -> "Priyansh")
  val myMap2: Map[Int, String] = Map(2402 -> "Aman")

  println(myMap(2302))
  println(myMap.keys)
  println(myMap.values)
  println(myMap.isEmpty)
  println(myMap.contains(2304))

  myMap.keys.foreach { key =>
    print("keys " + key)
    println("-> values :" + myMap(key))

  }
  println(myMap ++ myMap2)
}

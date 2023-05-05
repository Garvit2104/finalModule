object classAndObject extends App{
  var phone = new Smartphone("Pro") //creating an Instance of a Class
  phone.display()
}
class Smartphone(category: String) {          // class with primary constructor
  var model: Int = 12           //field
  val name: String = "Apple"

  def display(): Unit = {     // methods
    println("Name of the company is :" + name)
    println("model of the phone is :" + model)
    println("Category of phone is :" + category)
  }
  def this(name: String, category: String) {      // Auxiliary Constructor
    // invoking primary constructor
    this(category)
    this.model = model
  }
}

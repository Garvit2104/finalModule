object traitMixin extends App{
  val croc = new Crocodile // creating an instance
  croc.swim()
  croc.sound()
  croc.jump()
  croc.stay()
}
class Marine() {
  def swim() = println("Marine Animals enjoys Swimming")
}
// A trait is a collection of set of methods and field and It can thought as a
// combination of Interface and Abstract classes
trait dolphin {
  def jump() = println("Dolphin can jump in the water")
}
trait duck {
  def sound() = println("Duck sounds Quackk")
}
class Crocodile extends Marine with dolphin with duck { // Mixins
  def stay() = println("crocodile can live on land as well as in water")
}

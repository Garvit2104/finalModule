import scala.util.control.Breaks
object breakingNestedLoop extends App{
  var num1 = 0;
  var num2 = 0;
  val x = List(5, 10, 15);
  val y = List(20, 25, 30);
  val outloop = new Breaks;
  val inloop = new Breaks;

  outloop.breakable { // Here, breakable is used to prevent from exception
    for (num1 <- x) {

      println(" " + num1); // print list x

      inloop.breakable {
        for (num2 <- y) {

          println(" " + num2); //print list y

          if (num2 == 25) { // inloop is break when num2 is equal to 25
            inloop.break;
          }
        } // Here, inloop breakable
      }
    } // Here, outloop breakable
  }
}

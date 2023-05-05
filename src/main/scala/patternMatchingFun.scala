object patternMatchingFun extends App{
  // like Switch case in other programming language
  def Greetings(lang: String): String = {
    lang match {
      case "french" => GreetingsFrench()
      case "Hindi" => GreetingHindi()
      case _ => GreetingsEnglish()
    }
  }
  //Greet in Spanish
  def GreetingsFrench(): String = "Bonjour"
  // Greet in Hindi
  def GreetingHindi(): String = "Namaste"
  //Greet in English
  def GreetingsEnglish(): String = "Hello"
  //Call greetings function
  println(Greetings("french"))
}

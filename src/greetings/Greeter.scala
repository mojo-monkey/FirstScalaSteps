package greetings

class Greeter(message:String) {
  def greet():Unit = {
    println(message)
  }
}

object runner extends App {
  override def main(args:Array[String]):Unit = {
    val greeter = new Greeter("Hello World")
    greeter.greet()
  }
}


package greetings

object HelloWorldMessage {
  val message = "Hello World !"
  def greetings(): Unit = {println(message)}
  def greetMe(who:String): String = {
    "Hello World From " + who
  }
  def printSomething(callback: String): Unit = {
    println(callback)
  }
}

object HelloWorld {
  def main(args: Array[String]): Unit = {
    HelloWorldMessage.greetings()
    println(HelloWorldMessage.greetMe("TIMMY"))
    HelloWorldMessage.printSomething(HelloWorldMessage.greetMe("TIMMY"))
  }
}

package timer

object Timer {
  def doWithTimer(callable : () => String): Unit = {
    while(true) {
      callable()
      Thread.sleep(1000)
    }
  }

  def message(): String = {
     println("its always happening to me")
    ""
  }

   def main(args:Array[String]): Unit = {
     Timer.doWithTimer(message)
   }
}

package maths

trait Maths[T] {
  def plus(x:T, y:T):T
}

object SimpleMaths extends Maths[Int] {
   override def plus(x: Int, y: Int): Int = x+y

  def main(args:Array[String]): Unit = {
    val z = SimpleMaths.plus(1,1)
    println(z)
  }
}


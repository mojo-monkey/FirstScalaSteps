package maths

class Meter(val value: Double) extends AnyVal {
  def plus(m: Meter): Meter = new Meter(value + m.value)
}

object Runner extends App {
  val meter1 = new Meter(1)
  val meter2 = new Meter(2)

  val total = meter1.plus(meter2)
  println (total.value)
}

package s99

object P12 {
  def decode[A](ls: List[(Int, A)]) = 
    ls flatMap { e => List.fill(e._1)(e._2) }
}

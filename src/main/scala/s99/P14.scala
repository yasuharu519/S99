package s99

object P14 {

  def duplicate[A](ls: List[A]) = ls flatMap { e => List(e, e) }

  // def duplicate[A](ls: List[A]): List[A] = ls match {
  //   case Nil => Nil
  //   case x :: xs => x :: x :: duplicate(xs)
  // }
}

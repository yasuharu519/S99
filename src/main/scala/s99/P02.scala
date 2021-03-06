package s99

object P02 {
  def penultimate[A](ls: List[A]): A = ls match {
    case x::_::Nil => x
    case _::tail => penultimate(tail)
    case _ => throw new NoSuchElementException
  }
}

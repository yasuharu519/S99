package s99

trait P01 {
  def last[A](ls: List[A]): A = ls match {
    case x::Nil => x
    case _::rest => last(rest)
    case _ => throw new NoSuchElementException
  }
}

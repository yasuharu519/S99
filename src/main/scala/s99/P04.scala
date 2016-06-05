package s99

trait P04 {
  def length_imp[A](ls: List[A], counter: Int): Int = ls match {
    case x::rest => length_imp(rest, counter+1)
    case Nil => counter
  }

  def length[A](ls: List[A]): Int = length_imp(ls, 0)
}

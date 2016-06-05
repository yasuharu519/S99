package s99

object P03 {
  def nth_imp[A](num:A, ls: List[A], counter: Int): Int = ls match {
    case x::rest => if (x == num) {
      counter
    } else {
      nth_imp(num, rest, counter + 1)
    }
    case _ => throw new NoSuchElementException
  }

  def nth[A](num:A, ls: List[A]): Int = nth_imp(num, ls, 0)
}

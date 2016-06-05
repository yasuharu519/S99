package s99

trait P05 {

  def reverse_imp[A](original: List[A], result: List[A]): List[A] = original match {
    case x::rest => reverse_imp(rest, x::result)
    case Nil => result
  }

  def reverse[A](ls: List[A]): List[A] = reverse_imp(ls, Nil)
}

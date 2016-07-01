package s99

object P10 {
  def encode[A](ls: List[A]): List[(Int, A)] = {
    if (ls.isEmpty) List()
    else {
      val (packed, next) = ls span { _ == ls.head }
      if (next == Nil) List((packed.length, packed.head))
      else (packed.length, packed.head) :: encode(next)
    }
  }
}

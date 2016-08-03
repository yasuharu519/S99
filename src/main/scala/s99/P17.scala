package s99

object P17 {
  def splitSimple[A](n: Int, ls: List[A]): (List[A], List[A]) = (n, ls) match {
    case (_, Nil) => (Nil, Nil)
    case (0, ls) => (Nil, ls)
    case (n, h::tail) => {
      val (pre, post) = split(n - 1, tail)
      (h::pre, post)
    }
  }

  def splitFunctional[A](n: Int, ls:List[A]): (List[A], List[A]) =
    (ls.take(n), ls.drop(n))

  def split[A](n: Int, ls:List[A]) = splitFunctional(n, ls)
}

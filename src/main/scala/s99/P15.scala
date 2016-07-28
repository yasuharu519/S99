package s99

object P15 {
  def duplicateN[A](num: Int, ls: List[A]): List[A] =
    ls flatMap { e => List.fill(num)(e) }
}

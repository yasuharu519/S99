package s99

object P11 {
  import P10.encode
  def encodeModified[A](ls: List[A]): List[Any] =
    encode(ls) map { t => if (t._1 == 1) t._2 else t}

  def encodeModified2[A](ls: List[A]): List[Either[A, (Int,A)]] =
    encode(ls) map { t => if (t._1 == 1) Left(t._2) else Right(t) }
}


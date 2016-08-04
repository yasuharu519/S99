package s99

object P18 {
  def slice[A](a: Int, b: Int, ls: List[A]): List[A] = (a, b, ls) match {
    case (_, _, Nil) => Nil
    case (a, b, ls) if (a >= b) => Nil
    case (a, b, ls) => ls.drop(a).take(b - a)
  }

// tailRecursive
// def sliceTailRecursive[A](start:Int, end:Int, ls:List[A]): List[A] = {
//   def sliceR(count:Int, curList:List[A], result:List[A]): List[A] =
//     (count, curList) match {
//       case (_, Nil) => result.reverse
//       case (c, h :: tail) if end <= c => result.reverse
//       case (c, h :: tail) if start <= c => sliceR(c+1, tail, h :: result)
//       case (c, _ :: tail) => sliceR(c + 1, tail, result)
//     }
//  sliceR(0, ls, Nil)
// }
}

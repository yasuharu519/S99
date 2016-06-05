package s99

import org.scalatest._

class P03Spec extends FlatSpec with ShouldMatchers with P03 {
  behavior of "P03"

  it should "implements find the kth element of a list" in {
    nth(2, List(1, 1, 2, 3, 5, 8)) should be (2)
  }
}

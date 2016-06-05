package s99

import org.scalatest._

class P05Spec extends FlatSpec with ShouldMatchers with P05 {
  behavior of "P05"

  it should "implements reverse a list" in {
    reverse(List(1, 1, 2, 3, 5, 8)) should be (List(8, 5, 3, 2, 1, 1))
  }
}

package s99

import org.scalatest._

class P04Spec extends FlatSpec with ShouldMatchers with P04 {
  behavior of "P04"

  it should "implements the feature of finding the number of elements" in {
    length(List(1, 1, 2, 3, 5, 8)) should be (6)
  }
}

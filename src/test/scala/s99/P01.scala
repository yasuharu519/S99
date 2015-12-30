package s99

import org.scalatest._

class P01Spec extends FlatSpec with ShouldMatchers with P01 {
  behavior of "P01"

  it should "implements last" in {
    last(List(1, 1, 2, 3, 5, 8)) should be (8)
  }
}

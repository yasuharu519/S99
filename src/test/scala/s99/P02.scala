package s99

import org.scalatest._

class P02Spec extends FlatSpec with ShouldMatchers with P02 {
  behavior of "P02"

  it should "implements penultimate" in {
    penultimate(List(1, 1, 2, 3, 5, 8)) should be (5)
  }
}

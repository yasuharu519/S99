package s99

import org.scalatest._

class P99Spec extends FlatSpec with ShouldMatchers {

  "P01" should "implements last" in {
    P01.last(List(1, 1, 2, 3, 5, 8)) should be (8)
  }

  "P02" should "implements penultimate" in {
    P02.penultimate(List(1, 1, 2, 3, 5, 8)) should be (5)
  }

  "P03" should "implements nth" in {
    P03.nth(2, List(1, 1, 2, 3, 5, 8)) should be (2)
  }

  "P04" should "implements length" in {
    P04.length(List(1, 1, 2, 3, 5, 8)) should be (6)
  }

  "P05" should "implements reverse" in {
    P05.reverse(List(1, 1, 2, 3, 5, 8)) should be (List(8, 5, 3, 2, 1, 1))
  }

  "P06" should "implements palindrome" in {
    P06.isPalindrome(List(1, 2, 3, 2, 1)) should be (true)
  }

  "P07" should "implements flatten" in {
    P07.flatten(List(List(1, 1), 2, List(3, List(5, 8)))) should be (List(1,1, 2, 3, 5, 8))
  }

  "P08" should "implements compress" in {
    P08.compress(List('a,'a,'a,'a,'b,'c,'c,'a,'a,'d,'e,'e,'e,'e)) should be (List('a,'b,'c,'a,'d,'e))
  }

  it should "implement compressFunctional" in {
    P08.compressFunctional(List('a,'a,'a,'a,'b,'c,'c,'a,'a,'d,'e,'e,'e,'e)) should be (List('a,'b,'c,'a,'d,'e))
  }

  it should "implement compressTailRecursive" in {
    P08.compressTailRecursive(List('a,'a,'a,'a,'b,'c,'c,'a,'a,'d,'e,'e,'e,'e)) should be (List('a,'b,'c,'a,'d,'e))
  }
}

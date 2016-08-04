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

  "P09" should "implement pack" in {
    P09.pack(List('a,'a,'a,'a,'b,'c,'c,'a,'a,'d,'e,'e,'e,'e)) should be (List(List('a,'a,'a,'a),List('b),List('c,'c), List('a,'a), List('d), List('e,'e,'e,'e)))
  }

  it should "implement pack (return empty list)" in {
    P09.pack(List()) should be (List(List()))
  }

  "P10" should "implement encode" in {
    P10.encode(List('a,'a,'a,'a,'b,'c,'c,'a,'a,'d,'e,'e,'e,'e)) should be (List((4,'a),(1,'b),(2,'c),(2,'a),(1,'d),(4,'e)))
  }

  "P11" should "implement encodeModified" in {
    P11.encodeModified(List('a,'a,'a,'a,'b,'c,'c,'a,'a,'d,'e,'e,'e,'e)) should be (List((4,'a),'b,(2,'c),(2,'a),'d,(4,'e)))
  }

  "P12" should "implement decode" in {
    P12.decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))) should be (List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
  }

  "P13" should "implement encodeDirect" in {
    P13.encodeDirect(List('a,'a,'a,'a,'b,'c,'c,'a,'a,'d,'e,'e,'e,'e)) should be (List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e)))
  }

  "P14" should "implement duplicate" in {
    P14.duplicate(List('a,'b, 'c, 'c, 'd)) should be (List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd))
  }

  "P15" should "implement duplicateN" in {
    P15.duplicateN(3, List('a, 'b, 'c, 'c, 'd)) should be (List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd))
  }

  "P16" should "implement drop" in {
    P16.drop(3, List('a,'b,'c,'d,'e,'f,'g,'h,'i,'j,'k)) should be (List('a,'b,'d,'e,'g,'h,'j,'k))
  }

  "P17" should "implement split" in {
    P17.split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be (List('a, 'b, 'c), List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  }

  "P18" should "implement slice" in {
    P18.slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) should be (List('d, 'e, 'f, 'g))
  }
}

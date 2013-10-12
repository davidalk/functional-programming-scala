package patmat

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

import patmat.Huffman._

@RunWith(classOf[JUnitRunner])
class HuffmanSuite extends FunSuite {
  trait TestTrees {
    val t1 = Fork(Leaf('a', 2), Leaf('b', 3), List('a', 'b'), 5)
    val t2 = Fork(Fork(Leaf('a', 2), Leaf('b', 3), List('a', 'b'), 5), Leaf('d', 4), List('a', 'b', 'd'), 9)
  }

  test("weight of a larger tree") {
    new TestTrees {
      assert(weight(t1) === 5)
    }
  }

  test("chars of a larger tree") {
    new TestTrees {
      assert(chars(t2) === List('a', 'b', 'd'))
    }
  }

  test("string2chars(\"hello, world\")") {
    assert(string2Chars("hello, world") === List('h', 'e', 'l', 'l', 'o', ',', ' ', 'w', 'o', 'r', 'l', 'd'))
  }

  test("makeOrderedLeafList for some frequency table") {
    assert(makeOrderedLeafList(List(('t', 2), ('e', 1), ('x', 3))) === List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 3)))
  }

  test("combine of some leaf list") {
    val leaflist = List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 4))
    assert(combine(leaflist) === List(Fork(Leaf('e', 1), Leaf('t', 2), List('e', 't'), 3), Leaf('x', 4)))
  }

  test("combine of nested leaf list") {
    val leaflist = List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 4))
    val combined = combine(leaflist)
    val combinedAgain = combine(combined)

    val newLeft = Fork(Leaf('e', 1), Leaf('t', 2), List('e', 't'), 3)
    val newRight = Leaf('x', 4)
    assert(combinedAgain === List(Fork(newLeft, newRight, List('e', 't', 'x'), 7)))
  }

  test("test the until function") {
    val leafList = List(Leaf('e', 1), Leaf('t', 2), Leaf('x', 4))
    val result = until(singleton, combine)(leafList)
    assert(result === List(
      Fork(Fork(Leaf('e', 1), Leaf('t', 2), List('e', 't'), 3),
        Leaf('x', 4), List('e', 't', 'x'), 7)))

  }

  test("test the until function with 4 nodes") {
    val leafList = List(Leaf('d', 1), Leaf('c', 1), Leaf('b', 3), Leaf('a', 6))
    val result = until(singleton, combine)(leafList)
    assert(result === List(
      Fork(
        Fork(
          Fork(Leaf('d', 1), Leaf('c', 1), List('d', 'c'), 2),
          Leaf('b', 3), List('d', 'c', 'b'), 5),
        Leaf('a', 6), List('d', 'c', 'b', 'a'), 11)))
  }

  test("test the createCodeTree function") {
    var chars = List('a', 'b', 'c', 'd', 'b', 'b', 'a', 'a', 'a', 'a', 'a')
    val result = createCodeTree(chars)
    assert(result ===
      Fork(
        Fork(
          Fork(Leaf('d', 1), Leaf('c', 1), List('d', 'c'), 2),
          Leaf('b', 3), List('d', 'c', 'b'), 5),
        Leaf('a', 6), List('d', 'c', 'b', 'a'), 11))
  }

  test("decode and encode a very short text should be identity") {
    new TestTrees {
      assert(decode(t1, encode(t1)("ab".toList)) === "ab".toList)
    }
  }
  
    test("decode and encode long text") {
    new TestTrees {
      assert(decode(frenchCode, encode(frenchCode)("alongtext".toList)) === "alongtext".toList)
    }
  }
}

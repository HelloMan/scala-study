import org.scalatest.FunSuite

/**
 * Created by chaojun on 17/4/3.
 */
class Chapter2Test extends FunSuite {

  test("search 5 in Array(2,3,4,5) will return 3"){
    assertResult(Some(3)) (Chapter2.search(5,Array(2,3,4,5)))
  }

  test("Array(2,3,4,5) is sorted") {
    val chapter2 =  Chapter2
     assertResult(true)(chapter2.isSorted(Array(2, 3, 4, 5), (x: Int, y: Int) => x < y))
  }

  test("Array(2,4,3,5) is unsorted") {
    val chapter2 =  Chapter2
    assertResult(true)(chapter2.isSorted(Array(2, 4, 3, 5), (x: Int, y: Int) => x < y))
  }

  test("partial1"){
    val partial1 = Chapter2.partial1(2,(x:Int,y:Int)=>x*y)

    assertResult(6)(partial1(3))
  }

  test("curry"){
    val curry = Chapter2.curry((x:Int,y:Int)=>x*y)
    val func1 = curry(2)
    val result = func1(3)

    assertResult(6)(result)

  }

  test("uncurry") {
    val uncurry = Chapter2.uncurry((x: Int) => (y: Int) => x + y)
    assertResult(5)(uncurry(2, 3))
  }



}

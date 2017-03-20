package chapter_2

import scala.annotation.tailrec

/**
 * Created by chaojun on 17/3/20.
 */
object BinarySearch extends App{


  def search(value:Int, array:Array[Int]) : Option[Int] = {

    @tailrec
    def go(low:Int,high:Int,tmpArray:Array[Int]):Option[Int] = {
      if (tmpArray.length == 0) {
        None
      }else {
        val mid = (low + high) / 2
        if (array(mid) == value) {
          Some(mid)
        } else if (array(mid) > value) {
          go(low, mid, tmpArray.slice(low, mid))
        } else {
          go(mid + 1, high, tmpArray.slice(mid + 1, high))

        }
      }

    }

    go(0,array.length,array)
  }

  val a = search(2, Array(1, 3, 4, 6, 7, 8))
  val b = search(4, Array(1, 3, 4, 6, 7, 8))
  val c = search(2, Array(1,2))
  val d = search(2, Array(1,2,3))
  val e = search(2, Array(2))
  val f = search(2, Array())


  println(a)
  println(b)
  println(c)
  println(d)
  println(e)
  println(f)



}

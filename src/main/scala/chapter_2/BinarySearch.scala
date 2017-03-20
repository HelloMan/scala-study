package chapter_2

import scala.annotation.tailrec

/**
 * Created by chaojun on 17/3/20.
 */
object BinarySearch extends App{


  def search(value:Int, array:Array[Int]) : Option[Int] = {

    @tailrec
    def go(low:Int,high:Int):Option[Int] = {
      if (low>=high) {
        None
      }else {
        val mid = (low + high) / 2
        if (array(mid) == value) {
          Some(mid)
        } else if (array(mid) > value) {
          go(low, mid)
        } else {
          go(mid + 1, high)

        }
      }

    }

    go(0,array.length)
  }

  println(search(2, Array(1, 3, 4, 6, 7, 8)))
  println(search(4, Array(1, 3, 4, 6, 7, 8)))
  println(search(2, Array(1, 2)))
  println(search(2, Array(1)))
  println(search(2, Array(2)))
  println(search(2, Array()))







}

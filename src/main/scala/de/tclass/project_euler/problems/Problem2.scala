package de.tclass.project_euler.problems

import scala.annotation.tailrec

class Problem2 extends ProblemTrait {
  
  override def solve()={
    println(fibonacci(4000000, 1, 2, 2))
  }

  def fibonacci(max: Int, precursor: Int, cursor: Int, sum: Int): Int = {
    @tailrec
    def fibonacciFunc(max: Int, precursor: Int, cursor: Int, sum: Int): Int = (max, precursor, cursor, sum) match {
      case _ if !(max > cursor)                 => sum
      case _ if ((cursor + precursor) % 2 == 0) => fibonacciFunc(max, cursor, (cursor + precursor), sum + (cursor + precursor))
      case _                                    => fibonacciFunc(max, cursor, (cursor + precursor), sum)
    }
    fibonacciFunc(max, precursor, cursor, sum)
  }

}
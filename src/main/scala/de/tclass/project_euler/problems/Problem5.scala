package de.tclass.project_euler.problems

import scala.annotation.tailrec

class Problem5 extends ProblemTrait {

  override def solve() = {
    println(div(1,20))
  }
  @tailrec
  final def div(x: Int, counter: Int): Int = (x, counter) match {
    case _ if (counter == 21)    => x
    case _ if (x % counter == 0) => div(x, counter + 1)
    case _ if (x % counter != 0) => div(x + 1, 1)
  }

}
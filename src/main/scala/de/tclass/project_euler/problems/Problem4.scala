package de.tclass.project_euler.problems

import scala.annotation.tailrec

class Problem4 extends ProblemTrait {

  override def solve() = {
    println(palindrom())
  }
  
 def palindrom(): Int = {
    var p = 0;
    for (x <- 0 to 999)
      for (y <- 0 to 999)
        if (palindromFinder(x * y) && x * y > p) { p = x * y }
    p
  }

  def palindromFinder(x: Int): Boolean = {
    val number = x.toString.map(_.asDigit).toList
    val revNumberIterator = number.reverse.iterator
    val p = for (x <- number) yield x - revNumberIterator.next
    p.forall(x => x == 0)
  }

}
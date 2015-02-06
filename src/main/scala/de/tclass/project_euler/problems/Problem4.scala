package de.tclass.project_euler.problems

import scala.annotation.tailrec

class Problem4 extends ProblemTrait {

  override def solve() = {
    println(palindrom()+ " TODO: don't use var")
  }
  
 def palindrom(): Int = {
    val list = List[Int]();
    for (x <- 0 to 999)
      for (y <- 0 to 999)
        if (palindromFinder(x * y) && x * y > list.max) { list :+ x * y }
    list.max
  }

  def palindromFinder(x: Int): Boolean = {
    val number = x.toString.map(_.asDigit).toList
    val revNumberIterator = number.reverse.iterator
    val p = for (x <- number) yield x - revNumberIterator.next
    p.forall(x => x == 0)
  }

}
package de.tclass.project_euler.problems

import scala.annotation.tailrec

class Problem6 extends ProblemTrait {

  override def solve() = {
    println(sumSquare())
  }
  
  def sumSquare(): Int = {
    val range = 1 to 100
    val square = range.map { x => x * x }
    val sum = range.foldLeft(0)(_ + _)

    val diff = sum * sum - square.foldLeft(0)(_ + _)
    diff
  }
}
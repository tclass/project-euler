package de.tclass.project_euler.problems

import scala.annotation.tailrec

class Problem3 extends ProblemTrait {

  
  override def solve() = {
    println(prime(600851475143L,1L,List[Long]()).head)
    
  }
  @tailrec
  final def prime(goal: Long, x: Long, divider: List[Long]): List[Long] = goal match {
    case _ if (goal == 1)     => divider
    case _ if (goal % x == 0) => prime(goal / x, 2, List[Long](x) ++ divider)
    case _                    => prime(goal, x + 1, divider)
  }

}
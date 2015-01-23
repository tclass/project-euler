package de.tclass.project_euler.problems

class Problem1 extends ProblemTrait {

  override def solve() = {
    println(this.multiplies3And5(1000,0,0))
  }

  def multiplies3And5(max: Int, count: Int, sum: Int): Int = (max, count, sum) match {
    case _ if !(max > count)                     => sum
    case _ if (count % 3 == 0 || count % 5 == 0) => multiplies3And5(max, count + 1, sum + count)
    case _                                       => multiplies3And5(max, count + 1, sum)
  }

}
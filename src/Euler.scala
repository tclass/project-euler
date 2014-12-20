import scala.annotation.tailrec

class Euler {

  // Problem 1
  // just an imperative example, for now on functional with pattern matching or monads
  def multiplies3And5(max: Int, count: Int, sum: Int): Int = {
    if (max > count) {
      if (count % 3 == 0 || count % 5 == 0) {
        return multiplies3And5(max, count + 1, sum + count)
      } else {
        return multiplies3And5(max, count + 1, sum)
      }
    }
    return sum
  }

  def multiplies3And5_v2(max: Int, count: Int, sum: Int): Int = (max, count, sum) match {
    case _ if !(max > count)                     => sum
    case _ if (count % 3 == 0 || count % 5 == 0) => multiplies3And5_v2(max, count + 1, sum + count)
    case _                                       => multiplies3And5_v2(max, count + 1, sum)
  }

  // Problem 2
  def fibonacci(max: Int, precursor: Int, cursor: Int, sum: Int): Int = {
    @tailrec
    def fibonacciFunc(max: Int, precursor: Int, cursor: Int, sum: Int): Int = (max, precursor, cursor, sum) match {
      case _ if !(max > cursor)                 => sum
      case _ if ((cursor + precursor) % 2 == 0) => fibonacciFunc(max, cursor, (cursor + precursor), sum + (cursor + precursor))
      case _                                    => fibonacciFunc(max, cursor, (cursor + precursor), sum)
    }
    fibonacciFunc(max, precursor, cursor, sum)
  }

  //Problem 3
  //TODO: Not yet implemented

  //Problem 4
  // TODO: Don't use var!!
  def palindrom000(): Int = {
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

  //Problem 5
  def div(x: Int, counter: Int): Int = (x, counter) match {
    case _ if (counter == 21)    => x
    case _ if (x % counter == 0) => div(x, counter + 1)
    case _ if (x % counter != 0) => div(x + 1, 1)
  }
  
  //Problem 6
  def sumSquare():Int = {
    val range = 1 to 100
    val square = range.map { x => x*x }
    val sum = range.foldLeft(0)(_+_)
    
    val diff = sum*sum - square.foldLeft(0)(_+_)
    diff
  }

}
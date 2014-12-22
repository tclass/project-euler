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
  
  // Problem 7
  // TODO!
  
  // Problem 8
  def matrix():Int = {
    val digits = "7316717653133062491922511967442657474235534919493496983520312774506326239578318016984801869478851843858615607891129494954595017379583319528532088055111254069874715852386305071569329096329522744304355766896648950445244523161731856403098711121722383113622298934233803081353362766142828064444866452387493035890729629049156044077239071381051585930796086670172427121883998797908792274921901699720888093776657273330010533678812202354218097512545405947522435258490771167055601360483958644670632441572215539753697817977846174064955149290862569321978468622482839722413756570560574902614079729686524145351004748216637048440319989000889524345065854122758866688116427171479924442928230863465674813919123162824586178664583591245665294765456828489128831426076900422421902267105562632111110937054421750694165896040807198403850962455444362981230987879927244284909188845801561660979191338754992005240636899125607176060588611646710940507754100225698315520005593572972571636269561882670428252483600823257530420752963450"
    val s = digits.replaceAll(regex, replacement)
    digits.
  }
  
  def createMatrix(digits:String,count:Int,matrix:List[List[Int]]):List[Int] = (digits,count) match{
    case _ if(count == 5) matrix.
  }  
  
}
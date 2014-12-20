object Tests {

  def main(args: Array[String]) {
    val euler = new Euler();

    //val sum = euler.multiplies3And5(1000,0,0);
    //val erg = euler.fibonacci(4000000, 1, 2, 2)
    val erg = euler.palindrom000()

    println(erg)
  }

}
object worksheet {
  
 
  val a = List.range(0, 10)                       //> a  : List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
  val b = List.range(0, 10)                       //> b  : List[Int] = List(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
  
  a.map(x => (b.filter(y => my.palindromFinder(x,y)>0)))
                                                  //> res0: List[List[Int]] = List(List(), List(1, 2, 3, 4, 5, 6, 7, 8, 9), List(1
                                                  //| , 2, 3, 4), List(1, 2, 3), List(1, 2), List(1), List(1), List(1), List(1), L
                                                  //| ist(1))
  
  //db map (x=> (x._1, db filter (y=> x._1 == y._1) map (_._2)))
 
 	//val p = for(x <- 1 to 999) yield for(y <- 1 to 999) yield if(my.palindromFinder(x,y)>0) x*y else 0
  //p.flatMap(x => x).filter(_ != 0).last
}
object my{
def palindromFinder(x:Int,y:Int):Int ={
    val number = (x*y).toString.map(_.asDigit).toList
    val revNumberIterator = number.reverse.iterator
    val p = for(x <- number) yield x-revNumberIterator.next
    if(p.forall(x => x==0)) x*y else 0
  }
  
  }
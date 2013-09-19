package recfun

object pascal {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
    def pascal(c: Int, r: Int): Int = {
    if (c == 0) 1 else ((r + 1 - c) / c) * pascal(c - 1, r)
  }                                               //> pascal: (c: Int, r: Int)Int
  pascal(1,5)                                     //> res0: Int = 5
}
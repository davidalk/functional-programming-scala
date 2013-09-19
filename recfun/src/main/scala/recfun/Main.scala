package recfun
import common._


object Main {

  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c < 0 || r < 0 || c > r) throw new java.lang.IllegalArgumentException else if (c == 0 || c == r) 1 else pascal(c - 1, r - 1) + pascal(c, r - 1)
  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def balanceFunc(chars: List[Char], c: Int): Boolean = {
      if (chars.isEmpty && c == 0) true else 
        if (chars.isEmpty && c > 0 || chars.head == ')' && c == 0) false else 
          if (chars.head == '(') balanceFunc(chars.tail, c + 1) else 
            if (chars.head == ')') balanceFunc(chars.tail, c - 1) else
        balanceFunc(chars.tail, c)
    }

    balanceFunc(chars, 0)
  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {
    def doCountChangeMoney(money: Int, coins: List[Int]): Int = {
	    if (coins.isEmpty) 0 else
	      if (coins.head < money) doCountChangeMoney(money - coins.head, coins) + doCountChangeMoney(money, coins.tail) else 
	        if (coins.head==money) 1 + doCountChangeMoney(money, coins.tail) else doCountChangeMoney(money, coins.tail)
    }
    
    if(money<0 || coins.exists(x => x<0)) throw new java.lang.IllegalArgumentException
    else doCountChangeMoney(money, coins)
  }
  
}

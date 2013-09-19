package recfun

object pascal {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(107); 
  
    def pascal(c: Int, r: Int): Int = {
    if (c == 0) 1 else ((r + 1 - c) / c) * pascal(c - 1, r)
  };System.out.println("""pascal: (c: Int, r: Int)Int""");$skip(14); val res$0 = 
  pascal(1,5);System.out.println("""res0: Int = """ + $show(res$0))}
}

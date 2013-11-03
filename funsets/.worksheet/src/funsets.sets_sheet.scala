package funsets

object sets_sheet {
  import FunSets._;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(83); 

  val s1 = singletonSet(1);System.out.println("""s1  : Int => Boolean = """ + $show(s1 ));$skip(27); 
  val s2 = singletonSet(2);System.out.println("""s2  : Int => Boolean = """ + $show(s2 ));$skip(27); 
  val s3 = singletonSet(3);System.out.println("""s3  : Int => Boolean = """ + $show(s3 ));$skip(28); 
  val uSet1 = union(s1, s2);System.out.println("""uSet1  : Int => Boolean = """ + $show(uSet1 ));$skip(28); 
  val uSet2 = union(s1, s3);System.out.println("""uSet2  : Int => Boolean = """ + $show(uSet2 ));$skip(31); 
  val uSet3 = union(uSet1, s3);System.out.println("""uSet3  : Int => Boolean = """ + $show(uSet3 ));$skip(41); 

  printSet(map(uSet3, (x: Int) => x/0))}
}

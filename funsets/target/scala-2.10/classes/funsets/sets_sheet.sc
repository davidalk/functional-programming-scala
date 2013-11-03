package funsets

object sets_sheet {
  import FunSets._

  val s1 = singletonSet(1)                        //> s1  : Int => Boolean = <function1>
  val s2 = singletonSet(2)                        //> s2  : Int => Boolean = <function1>
  val s3 = singletonSet(3)                        //> s3  : Int => Boolean = <function1>
  val uSet1 = union(s1, s2)                       //> uSet1  : Int => Boolean = <function1>
  val uSet2 = union(s1, s3)                       //> uSet2  : Int => Boolean = <function1>
  val uSet3 = union(uSet1, s3)                    //> uSet3  : Int => Boolean = <function1>

  printSet(map(uSet3, (x: Int) => x/0))           //> java.lang.ArithmeticException: / by zero
                                                  //| 	at funsets.sets_sheet$$anonfun$main$1$$anonfun$apply$mcV$sp$1.apply$mcII
                                                  //| $sp(funsets.sets_sheet.scala:13)
                                                  //| 	at funsets.FunSets$.iter$2(FunSets.scala:76)
                                                  //| 	at funsets.FunSets$.map(FunSets.scala:80)
                                                  //| 	at funsets.sets_sheet$$anonfun$main$1.apply$mcV$sp(funsets.sets_sheet.sc
                                                  //| ala:13)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at funsets.sets_sheet$.main(funsets.sets_sheet.scala:4)
                                                  //| 	at funsets.sets_sheet.main(funsets.sets_sheet.scala)
}
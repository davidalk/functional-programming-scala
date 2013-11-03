package forcomp

import Anagrams._

object anagram_ws {

  val sentence = List("linux", "rulez")           //> sentence  : List[String] = List(linux, rulez)
  
  val sentenceOccur = sentenceOccurrences(sentence)
                                                  //> sentenceOccur  : forcomp.Anagrams.Occurrences = List((e,1), (i,1), (l,2), (n
                                                  //| ,1), (r,1), (u,2), (x,1), (z,1))
                                                  
   combinations(Nil)                              //> res0: List[forcomp.Anagrams.Occurrences] = List(List())
 
  
    
    sentenceAnagrams(Nil)                         //> res1: List[forcomp.Anagrams.Sentence] = List(List())
    
}
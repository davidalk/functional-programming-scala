package forcomp

import Anagrams._

object anagram_ws {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(96); 

  val sentence = List("linux", "rulez");System.out.println("""sentence  : List[String] = """ + $show(sentence ));$skip(55); 
  
  val sentenceOccur = sentenceOccurrences(sentence);System.out.println("""sentenceOccur  : forcomp.Anagrams.Occurrences = """ + $show(sentenceOccur ));$skip(72); val res$0 = 
                                                  
   combinations(Nil);System.out.println("""res0: List[forcomp.Anagrams.Occurrences] = """ + $show(res$0));$skip(36); val res$1 = 
 
  
    
    sentenceAnagrams(Nil);System.out.println("""res1: List[forcomp.Anagrams.Sentence] = """ + $show(res$1))}
    
}

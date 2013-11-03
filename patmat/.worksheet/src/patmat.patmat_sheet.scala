package patmat

import patmat.Huffman._

object patmat_sheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(96); val res$0 = 
 
 times("huffmanestcool".toList);System.out.println("""res0: List[(Char, Int)] = """ + $show(res$0));$skip(68); val res$1 = 
                                                  
   decodedSecret;System.out.println("""res1: List[Char] = """ + $show(res$1));$skip(46); val res$2 = 
   
   encode(frenchCode)("alongtext".toList);System.out.println("""res2: List[patmat.Huffman.Bit] = """ + $show(res$2));$skip(31); val res$3 = 
   
   
   convert(frenchCode);System.out.println("""res3: patmat.Huffman.CodeTable = """ + $show(res$3));$skip(103); val res$4 = 
                                                  
   quickEncode(frenchCode)("huffmanestcool".toList);System.out.println("""res4: List[patmat.Huffman.Bit] = """ + $show(res$4));$skip(118); val res$5 = 
                                                  
  
  createCodeTree("this is an example of a huffman tree".toList);System.out.println("""res5: patmat.Huffman.CodeTree = """ + $show(res$5));$skip(66); val res$6 = 
                                                  
  combine(Nil);System.out.println("""res6: List[patmat.Huffman.CodeTree] = """ + $show(res$6))}
}

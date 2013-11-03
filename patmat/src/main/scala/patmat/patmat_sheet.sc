package patmat

import patmat.Huffman._

object patmat_sheet {
 
 times("huffmanestcool".toList)                   //> res0: List[(Char, Int)] = List((h,1), (u,1), (f,2), (m,1), (a,1), (n,1), (e,1
                                                  //| ), (s,1), (t,1), (c,1), (o,2), (l,1))
                                                  
   decodedSecret                                  //> res1: List[Char] = List(h, u, f, f, m, a, n, e, s, t, c, o, o, l)
   
   encode(frenchCode)("alongtext".toList)         //> res2: List[patmat.Huffman.Bit] = List(1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1,
                                                  //|  0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 
                                                  //| 0, 1, 1)
   
   
   convert(frenchCode)                            //> res3: patmat.Huffman.CodeTable = List((s,List(0, 0, 0)), (d,List(0, 0, 1, 0)
                                                  //| ), (x,List(0, 0, 1, 1, 0, 0, 0)), (j,List(0, 0, 1, 1, 0, 0, 1)), (f,List(0, 
                                                  //| 0, 1, 1, 0, 1)), (z,List(0, 0, 1, 1, 1, 0, 0, 0, 0)), (k,List(0, 0, 1, 1, 1,
                                                  //|  0, 0, 0, 1, 0)), (w,List(0, 0, 1, 1, 1, 0, 0, 0, 1, 1)), (y,List(0, 0, 1, 1
                                                  //| , 1, 0, 0, 1)), (h,List(0, 0, 1, 1, 1, 0, 1)), (q,List(0, 0, 1, 1, 1, 1)), (
                                                  //| o,List(0, 1, 0, 0)), (l,List(0, 1, 0, 1)), (m,List(0, 1, 1, 0, 0)), (p,List(
                                                  //| 0, 1, 1, 0, 1)), (u,List(0, 1, 1, 1)), (r,List(1, 0, 0, 0)), (c,List(1, 0, 0
                                                  //| , 1, 0)), (v,List(1, 0, 0, 1, 1, 0)), (g,List(1, 0, 0, 1, 1, 1, 0)), (b,List
                                                  //| (1, 0, 0, 1, 1, 1, 1)), (n,List(1, 0, 1, 0)), (t,List(1, 0, 1, 1)), (e,List(
                                                  //| 1, 1, 0)), (i,List(1, 1, 1, 0)), (a,List(1, 1, 1, 1)))
                                                  
   quickEncode(frenchCode)("huffmanestcool".toList)
                                                  //> res4: List[patmat.Huffman.Bit] = List(0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0,
                                                  //|  1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 1, 1, 
                                                  //| 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 1)
                                                  
  
  createCodeTree("this is an example of a huffman tree".toList)
                                                  //> res5: patmat.Huffman.CodeTree = Fork(Fork(Fork(Leaf(e,4),Leaf(a,4),List(e, a
                                                  //| ),8),Fork(Fork(Fork(Leaf(r,1),Leaf(u,1),List(r, u),2),Leaf(m,2),List(r, u, m
                                                  //| ),4),Fork(Fork(Leaf(p,1),Leaf(x,1),List(p, x),2),Fork(Leaf(o,1),Leaf(l,1),Li
                                                  //| st(o, l),2),List(p, x, o, l),4),List(r, u, m, p, x, o, l),8),List(e, a, r, u
                                                  //| , m, p, x, o, l),16),Fork(Fork(Fork(Leaf(i,2),Leaf(h,2),List(i, h),4),Fork(L
                                                  //| eaf(n,2),Leaf(s,2),List(n, s),4),List(i, h, n, s),8),Fork(Fork(Leaf(t,2),Lea
                                                  //| f(f,3),List(t, f),5),Leaf( ,7),List(t, f,  ),12),List(i, h, n, s, t, f,  ),2
                                                  //| 0),List(e, a, r, u, m, p, x, o, l, i, h, n, s, t, f,  ),36)
                                                  
  combine(Nil)                                    //> res6: List[patmat.Huffman.CodeTree] = List()
}
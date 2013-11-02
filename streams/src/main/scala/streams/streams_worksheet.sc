package streams

import Bloxorz._


object streams_worksheet {

  trait SolutionChecker extends GameDef with Solver with StringParserTerrain {
    /**
     * This method applies a list of moves `ls` to the block at position
     * `startPos`. This can be used to verify if a certain list of moves
     * is a valid solution, i.e. leads to the goal.
     */
     def solve(ls: List[Move]): Block =
      ls.foldLeft(startBlock) { case (block, move) => move match {
        case Left => block.left
        case Right => block.right
        case Up => block.up
        case Down => block.down
      }
    }
  }

  trait Level1 extends SolutionChecker {
      /* terrain for level 1*/

    val level =
    """ooo-------
      |oSoooo----
      |ooooooooo-
      |-ooooooooo
      |-----ooToo
      |------ooo-""".stripMargin

    val optsolution = List(Right, Right, Down, Right, Right, Right, Down)
  }
  
   new Level1 {
      terrain(Pos(0,0))
      terrain(Pos(4,11))
    }                                             //> res0: streams.streams_worksheet.Level1 = streams.streams_worksheet$$anonfun$
                                                  //| main$1$$anon$1@1276ff65

     true                                         //> res1: Boolean(true) = true
}
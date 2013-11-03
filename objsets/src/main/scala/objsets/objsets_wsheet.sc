package objsets
import org.scalatest.FunSuite
import GoogleVsApple._

object objsets_wsheet {
  val set1 = new Empty                            //> set1  : objsets.Empty = objsets.Empty@11b0f38a
  val set2 = set1.incl(new Tweet("a", "a body", 20))
                                                  //> set2  : objsets.TweetSet = objsets.NonEmpty@25533ae9
  val set3 = set2.incl(new Tweet("b", "b body", 20))
                                                  //> set3  : objsets.TweetSet = objsets.NonEmpty@c3b626c
  val c = new Tweet("c", "c body", 7)             //> c  : objsets.Tweet = User: c
                                                  //| Text: c body [7]
  val d = new Tweet("d", "d body", 9)             //> d  : objsets.Tweet = User: d
                                                  //| Text: d body [9]
  val set4c = set3.incl(c)                        //> set4c  : objsets.TweetSet = objsets.NonEmpty@ebaa6ba
  val set4d = set3.incl(d)                        //> set4d  : objsets.TweetSet = objsets.NonEmpty@1804e4
  val set5 = set4c.incl(d)                        //> set5  : objsets.TweetSet = objsets.NonEmpty@28e914c8

  val set6 = set5.incl(new Tweet("e", "e body", 50))
                                                  //> set6  : objsets.TweetSet = objsets.NonEmpty@5e536b73

  def asSet(tweets: TweetSet): Set[Tweet] = {
    var res = Set[Tweet]()
    tweets.foreach(res += _)
    res
  }                                               //> asSet: (tweets: objsets.TweetSet)Set[objsets.Tweet]
  def size(set: TweetSet): Int = asSet(set).size  //> size: (set: objsets.TweetSet)Int

  //size(set5.filter(tw => tw.retweets > 7))
    size(googleTweets)                            //> res0: Int = 38
  size(appleTweets)                               //> res1: Int = 150
  appleTweets.descendingByRetweet                 //> res2: objsets.TweetList = objsets.Cons@3d2fdcd7
                                         
   
}
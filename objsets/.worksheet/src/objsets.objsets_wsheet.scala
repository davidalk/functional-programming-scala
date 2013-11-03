package objsets
import org.scalatest.FunSuite
import GoogleVsApple._

object objsets_wsheet {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(116); 
  val set1 = new Empty;System.out.println("""set1  : objsets.Empty = """ + $show(set1 ));$skip(53); 
  val set2 = set1.incl(new Tweet("a", "a body", 20));System.out.println("""set2  : objsets.TweetSet = """ + $show(set2 ));$skip(53); 
  val set3 = set2.incl(new Tweet("b", "b body", 20));System.out.println("""set3  : objsets.TweetSet = """ + $show(set3 ));$skip(38); 
  val c = new Tweet("c", "c body", 7);System.out.println("""c  : objsets.Tweet = """ + $show(c ));$skip(38); 
  val d = new Tweet("d", "d body", 9);System.out.println("""d  : objsets.Tweet = """ + $show(d ));$skip(27); 
  val set4c = set3.incl(c);System.out.println("""set4c  : objsets.TweetSet = """ + $show(set4c ));$skip(27); 
  val set4d = set3.incl(d);System.out.println("""set4d  : objsets.TweetSet = """ + $show(set4d ));$skip(27); 
  val set5 = set4c.incl(d);System.out.println("""set5  : objsets.TweetSet = """ + $show(set5 ));$skip(54); 

  val set6 = set5.incl(new Tweet("e", "e body", 50));System.out.println("""set6  : objsets.TweetSet = """ + $show(set6 ));$skip(115); 

  def asSet(tweets: TweetSet): Set[Tweet] = {
    var res = Set[Tweet]()
    tweets.foreach(res += _)
    res
  };System.out.println("""asSet: (tweets: objsets.TweetSet)Set[objsets.Tweet]""");$skip(49); 
  def size(set: TweetSet): Int = asSet(set).size;System.out.println("""size: (set: objsets.TweetSet)Int""");$skip(69); val res$0 = 

  //size(set5.filter(tw => tw.retweets > 7))
    size(googleTweets);System.out.println("""res0: Int = """ + $show(res$0));$skip(20); val res$1 = 
  size(appleTweets);System.out.println("""res1: Int = """ + $show(res$1));$skip(34); val res$2 = 
  appleTweets.descendingByRetweet;System.out.println("""res2: objsets.TweetList = """ + $show(res$2))}
                                         
   
}

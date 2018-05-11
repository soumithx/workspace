

object loops {
  def main(args:Array[String]){
    var x = 10
   /* while(x>=0){
      println(x)
      x = x-1
    }*/
   /* do{
      println(x)
      x -= 1
      } while(x >=0)
 */ 
    /*for(x <- 10 to 0 by -1){
      println(x)
    }*/
    var xy = for( x <- 1 to 10) yield x +1
    println(xy)
    }
}


object FunctionAsArgument {
  val double = (i:Int) => i*2
  val triple = (i:Int) => i*3
  def HigherOrder(x:Int,y:Int=>Int):Int={
    y(x)
  }
  def main(args:Array[String]){
   println( HigherOrder(6,double))
    println(HigherOrder(10,triple))
  }
  
}
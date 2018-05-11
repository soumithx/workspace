

object FunctionAsArgument {
  val double = (i:Int) => i*2
  val triple = (i:Int) => i*3
  def HigherOrder(x:Int,y:Int=>Int):Int={
    y(x)
  }
  def sayHello = (name:String) => {"Hello "+ " " +name}
  def main(args:Array[String]){
   println( HigherOrder(6,double))
    println(HigherOrder(10,triple))
   println( sayHello("Soumith"))
   var x= 10
   val m = (i:Int) => i * x
   
   println(m(5))
  }
  
}
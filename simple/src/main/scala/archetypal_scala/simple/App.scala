package archetypal_scala.simple

/**
 * @author ${user.name}
 */
object App {
  
  def foo(x : Int):Int={
    x + x
  }
 
  def main(args : Array[String]) {
    println( "Hello World!" )
    println(foo(1))
  }

}



object Test {
  def add(a:Int,b:Int) = a + b
  def sub(a:Int,b:Int) = a - b
  def main(args:Array[String]){
    println("Add "+add(10,11))
    println("Sub "+sub(11,10))
  }
}
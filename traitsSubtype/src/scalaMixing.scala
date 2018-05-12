abstract class x{
  type T
  def hasNext :Boolean
  def next() :T
  }
class y(s:String) extends x{
  type T = Char
  private var i = 0
  def hasNext = i<s.length
  def next() ={
    val ch = s charAt i
    i += 1
    ch
  }
}
trait Rich extends x{
  def foreach(f:T => Unit):Unit = while(hasNext) f(next())
}
class s extends y("Scala")with Rich{
  
}
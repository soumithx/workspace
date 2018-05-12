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
    val ch = s(i)
    i += 1  
    ch
  }
}
trait Rich extends x{
  def foreac(f:T => Unit):Unit = {while(hasNext) f(next())}
}
class s extends y("Scala")with Rich{
  
}
trait soumith[Int]{
  def display:Boolean
  def age():Int
}
class traitExample(to:Int) extends soumith[Int]{
var current = 0
override def display:Boolean= current < to
override def age() :Int = {
  if(display){
    val t = current
    current = current + 1
    t
  }else 0
}
}
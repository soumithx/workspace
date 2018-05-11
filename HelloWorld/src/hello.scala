import scala.io._


object hello{
  def toInt(in:String):Option[Int]=
    try{
      Some(Integer.parseInt(in))
    }
  catch{
    case e:NumberFormatException => None
  }
  def sum(in:Seq[String])={
    val x = in.flatMap(s=> toInt(s))
    x.foldLeft(0)((a,b) => a+b)
        
  }
  /*  def sub(in:Seq[String])={
    val x = in.flatMap(s=> toInt(s))
    x.foldLeft(0)((a,b) => a-b)
        
  }*/
  def main(args:Array[String]){
    println("Enter the data and press ctrl+d")
    val inp = Source.fromInputStream(System.in)
    val line = inp.getLines.toList
    println("Sum of input numbers"+sum(line))
    /*println("sub of input numbers"+sub(line))*/
    
  }
}
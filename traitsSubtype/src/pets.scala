import scala.collection.mutable.ArrayBuffer


object pets {
  def main(args:Array[String]){
    val x = new scalaSubtype("dog")
    val y = new scalaSub("cat")
    val ani =ArrayBuffer.empty[pts]
    ani.append(x)
    ani.append(y)
    ani.foreach(pts =>println(pts.name))
  }
}
import java.io._
import io.Source._

object scalaException {
  def main(args:Array[String]){
    try {
      val x = fromFile("src/sss.txt").getLines()
    }catch{
      case e:FileNotFoundException => println("Check your file")
      case _:Exception => println("Check your program")
    }
  }
}
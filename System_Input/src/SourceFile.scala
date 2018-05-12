import io.Source._
object SourceFile {
  def main(args:Array[String]){
 val x = "src/example.txt"
 for(i <-  fromFile(x).getLines()){
   println(i)
 }
}
}
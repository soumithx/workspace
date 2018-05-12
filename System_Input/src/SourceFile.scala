import io.Source._
object SourceFile {
  def main(args:Array[String]){
   val fileName = "src/example.txt"
   for(line <- fromFile(fileName).getLines()){
     println(line)
   }
   val pom = fromFile("src/lipsum.txt").getLines().toList
   pom.foreach(println)
  }
}
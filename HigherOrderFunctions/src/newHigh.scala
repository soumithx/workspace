

object newHigh {
 def main(args:Array[String]){
   val sal = Seq(2000,22,2222)
   val newsal = sal.map(_* 2)
   println(newsal)
 }
}
import scala.io.StdIn._
object SystemInput{
   def main(args:Array[String]){
     var x = false
     while (!x) {
       var name = readLine("Enter the name")
       println("Enter the score")
       var l = readDouble()
       println("you recieved "+(if (l>90) "Your Grade is A" else if(l>80) "Your Grade is B"
       else if (l>70) "Your Grade is C" else  "Your Fail"))
        println("Do you want to continue 'yes' for False, 'no' for  True")
        x = readBoolean()
       }
   }
}
object PayRoll {
  def payAmount(s:String,d:Int)={
    if(s != "y") {
      if (d > 40) 
        d * 10.5 * 1.5
      else (d <= 40)
      d * 10.5
   }else
       "employee is salaried"
 }
  def main(args:Array[String]){
          println(payAmount("n",45))
          println(payAmount("n", 40))
          println(payAmount("n", 25))
          println(payAmount("y", 10))
              
  }
}
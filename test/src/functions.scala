object functions {
  def main(args:Array[String]){
    println(abs(-10))
    println(fac(10))
    println(sum(1,2,3,4,5))
  }
 def abs(x:Int)= if (x<0) -x else x    /* absolute function */
 def fac(x:Int)={      /*factorial */
   var r = 1
   for(i <- 1 to x)
     r = r * i
     r
   }
 def fact(x:Int):Int= if(x<=0) 1 else x * fact(x-1)  /*factorial */
 def sum(x:Int*)={
   var res = 0
   for(y <- x) 
     res = res + y
     res
 }
}


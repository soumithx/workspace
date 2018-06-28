
class Employee(var name:String,var department:String){
  def this(name:String){  //auxaliay constructors,they must be defined by method named this
    this(name,"IT")
  }
}
object auxilary {
   def main(args:Array[String]){
    var emp1 = new Employee("soumith","BigDataDev")
    println(emp1.name+" "+emp1.department)
    var emp2 = new Employee("sai")
    println(emp2.name+" "+emp2.department)
   }
}


trait cars{
  def carName:String
  def carYear:String
}
class car(x:String,y:String) extends cars{
  def carName:String = "Car name is "+x
  def carYear:String = "Car model "+ y
  
}
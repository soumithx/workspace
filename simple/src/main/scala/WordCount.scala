//import org.apache.spark.SparkConf

//import org.apache.spark.SparkContext


//import org.apache.spark.rdd.RDD.rddToPairRDDFunctions

import org.apache.spark.SparkConf
import org.apache.spark.SparkContext

object WordCount {
  def main(args: Array[String]) = {
    
     val conf = new  SparkConf()
     conf.setAppName("soumith").setMaster("local")
     val sc = new SparkContext(conf)
     
     
     val d = sc.textFile("/home/soumith/Downloads/test.txt")
     val e = d.flatMap(x => x.split(" "))
     val f = e.map(x => (x,1))
     val g = f.reduceByKey(_+_)
     g.saveAsTextFile("/home/soumith/output.txt")
     
    //val df = spark.read.json("/home/soumith/gits/Datasets/Json/rows.json")
    //println(df.show())
    //spark.stop()
    

    
  }
}
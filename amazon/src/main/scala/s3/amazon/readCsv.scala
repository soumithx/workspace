package s3.amazon
import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf
import org.apache.spark.SparkConf


object readCsv {
  def main(args:Array[String])={
   val conf = new SparkConf()
   .setAppName("sample")
   .setMaster("local")
   val sc = new SparkContext(conf)
  //val d = sc.textFile("s3a://sparkscalap/movies.csv")
  //d.take(10).foreach(println)

  }
}
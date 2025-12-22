package example

object Hello {
  def main(args: Array[String]): Unit = {
    val greeting = scala.io.Source.fromResource("greeting.txt").mkString
    println(greeting)
  }
}

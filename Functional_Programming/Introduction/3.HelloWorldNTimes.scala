/*
	Compile: scalac 3.HelloWorldNTimes.scala
	Run: scala HelloWorldNTimes
*/

object HelloWorldNTimes extends App {
	def f(n: Int) = for (i <- 1 to n) {
		println("Hello World")
	}
	
	var n = scala.io.StdIn.readInt
	while (n<0 || n>50) {
		n =  scala.io.StdIn.readInt
	} 
	f(n)
} 

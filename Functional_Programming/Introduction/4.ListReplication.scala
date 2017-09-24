/*
	Compile: scalac 4HelloWorld.scala
	Run: scala HelloWorld
*/

object ListReplication extends App {
	def f(num:Int,arr:List[Int]):List[Int] = if (arr.isEmpty) Nil else List.fill(num)(arr.head):::f(num, arr.tail)
	
	def displayList(arr: List[Int]) = println f

}

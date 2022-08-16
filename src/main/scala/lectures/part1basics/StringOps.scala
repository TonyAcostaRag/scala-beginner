package lectures.part1basics

object StringOps extends App {
  
  val str: String = "Hello, I am learning scala"
  
  println(str)
  println(str.charAt(2))
  println(str.substring(7, 11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toLowerCase())
  println(str.length)
  
  val aNumberString = "2"
  val aNumber = aNumberString.toInt
  println('a' +: aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))
  
  // Scala specific: String interpolators
  
  // S-interpolators
  val name = "Tony"
  val age = 28
  val greeting = s"Hello, my name is $name and I am $age years old"
  
  println(greeting)
  
  // F-interpolators
  val speed = 1.2f
  val myth = f"$name can eat $speed%2.1f burgers per minute"
  println(myth)
  
  // Raw Interpolator
  println(raw"This is a raw \n text")
  
  val escaped = "This is a raw \n text"
  println(raw"$escaped")
  

}

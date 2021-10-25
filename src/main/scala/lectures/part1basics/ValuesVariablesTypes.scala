package lectures.part1basics

object ValuesVariablesTypes extends App {
  val x: Int = 42
  val y = 30
  println("Integer in scala: " + x)
  println("Inferred integer in scala: " + y)
  
  val aString: String = "String var"
  val bString = "Inferred String"
  println("String in scala: " + aString)
  println("Inferred string in scala: " + bString)
  
  val abolean: Boolean = true
  val bbolean = false
  println("Boolean in scala: " + abolean)
  println("Inferred boolean in scala: " + bbolean)
  
  val achar: Char = 'a'
  val bchar = 'b'
  println("Character variable: " + achar)
  println("Inferred character variable: " + bchar)
  
}

package lectures.part1basics

object Functions extends App {
  
  def aFunction (a: String, b: Int): String = {
    a + " " + b
  }
  
  println(aFunction("Concatenate function", 3))
  
  def aParameterlessFunction(): Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)
  
  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n-1)

  }
  
  println(aRepeatedFunction("Repeated string", 10))
  
}

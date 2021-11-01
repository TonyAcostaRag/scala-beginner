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

  // When you need loops, use recursion.

  def aFunctionWithSideEffects (aString: String): Unit = println(aString)

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b
    
    aSmallerFunction(n, n-1)
  }

  println(aBigFunction(3))
  
  def aFunctionWhichPrintsNameAndAge(name: String, age: Int): String = 
   "Hello my name is " + name + " and I'm " + age + " years old."

  println(aFunctionWhichPrintsNameAndAge("TonyAcostaRag", 20))
  
  def aFactorialFunction(n: Int): Int = {
    if (n > 1) n * aFactorialFunction(n - 1)
    else 1
  }

  println(aFactorialFunction(1))
  println(aFactorialFunction(2))
  println(aFactorialFunction(3))
  println(aFactorialFunction(4))
  println(aFactorialFunction(5))
 
  def fibonacciNumberPosition(n: Int): Int = {
    if (n <= 2) 1
    else fibonacciNumberPosition(n - 1) + fibonacciNumberPosition(n - 2)
  }
  
  println(fibonacciNumberPosition(8))
  
}

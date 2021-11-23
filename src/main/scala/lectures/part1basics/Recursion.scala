package lectures.part1basics

import scala.annotation.tailrec

object Recursion extends App{
  
  def factorial(n: Int): Int = {
    if (n <= 1) 1
    else {
      println("Computing factorial of " + n + " - I first need factorial of " + (n - 1))
      val result = n * factorial(n-1)
      println("Computed factorial of " + n)
      
      result
    }
  }
  
  // When you need loops, use tail recursion
  def otherFactorial(n: Int): BigInt = {
    @tailrec
    def factHelper(x: Int, accumulator: BigInt): BigInt =
      if (x <= 1) accumulator
      else factHelper(x-1, x * accumulator) // Tail Recursion - use the recursive call as the LAST expression.
    
    factHelper(n, 1)
    
  }
  
  println(otherFactorial(10))
  println(otherFactorial(5000))
  
//  println(factorial(10))
//  println(factorial(5000))

}

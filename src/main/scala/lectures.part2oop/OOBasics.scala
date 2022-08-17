package lectures.part2oop

object OOBasics extends App {
  
  val person = new Person("Tony", 28)
  println(person)
  
  println(person.name)
  println(person.age)
  
  println(person.x)
  
  person.greet("Daniel")
  person.greet()
  
  // Authors
  val octavio = new Writer("Octavio", "Paz", 1930)
  val napoleon = new Writer("Napoleon", "Hill", 1920)
  
  // Novels
  val luna = new Novel("Luna silvestre", 1933, octavio)
  val thinkGrowRich = new Novel("Think and grow rich", 1937, napoleon)

  luna.getoctavioAge()
  octavio.getFullName()

  luna.wasIsWritterBy(octavio)

  luna.copy(1960)
  luna.copy(1965)
  luna.copy(1970)

  thinkGrowRich.getoctavioAge()
  napoleon.getFullName()

  thinkGrowRich.wasIsWritterBy(octavio)

  thinkGrowRich.copy(1940)
  thinkGrowRich.copy(1945)
  thinkGrowRich.copy(1950)

  val count = new Counter

  count.incremento.print
  count.decremento.print
  
  count.incremento.incremento.incremento.print
  count.decremento.decremento.decremento.print
  
  count.inc(2).print
  count.dec(2).print
  
}

// constructor
class Person (val name: String, val age: Int) {
  // class body
  
  val x = 2
  
  println(1 + 3)
  
  // method
  def greet (name: String): Unit = println(s"${this.name} says: Hi, $name")
  
  // overloading
  def greet (): Unit = println(s"Hi, my name is $name")
  
  // overloading / multiple constructors
} 

class Writer (val first_name: String, val surname: String, val year: Int ) {
  
  def getFullName(): Unit = {
    
    println(s"Writer fullname: $first_name $surname")
  }
  
}

class Novel (name: String, year: Int, octavio: Writer) {
  
  def getoctavioAge(): Unit = {
    println(s"octavio age: " + ( year - this.octavio.year ))
  }
  
  def wasIsWritterBy(octavio: Writer): Unit =  {
    print( s"$name was It written by ${octavio.first_name}? ")
    println(octavio == this.octavio)
  }
  
  def copy(newYear: Int): Novel = {
    println(s"Data of the new Copy: $name, $newYear, ${octavio.first_name}")
    new Novel(name, newYear, octavio)
  }
  
}

class Counter (val count: Int = 0) {
  def incremento = {
    println("Incrementing")
    new Counter(count + 1)
  }

  def decremento = {
    println("Decrementing")
    new Counter(count - 1)
  }
  
  def inc(n: Int): Counter = {
    if (n <= 0) this
    else incremento.inc(n-1)
  }

  def dec(n: Int): Counter = {
    if (n <= 0) this
    else decremento.dec(n-1)
  }
 
  def print = println(count)
  
}

// class parameters are not fields.
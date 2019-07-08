import Function.{Declaration, DefaultNamedArguments, Recursion, VariableArguments, NestedFunctions, HigherOrderFunction, AnonymousFunction, Currying}

object Main {

  def main(args: Array[String]) :Unit = {
    println("Hello Scala")
    HelloScala.print()
    println("1. Function Declaration")
    println("2. Function Recursion")
    println("3. Function Default Arguments")
    println("4. Variable Arguments")
    println("5. Nested Functions")
    println("6. Higher Order Functions")
    println("7. Anonymous Functions")
    println("8. Currying Functions")
    val input : Int = scala.io.StdIn.readInt()
    run(input)
  }

  def run(x:Int) = x match {
    case 1 => Declaration.all
    case 2 => println(Recursion.factorial(5))
    case 3 => DefaultNamedArguments.all
    case 4 => VariableArguments.main(1,2,3,4,5,6,7,1,2,2)(2,2,2,2,2,2,2)
    case 5 => NestedFunctions.main(8,2)
    case 6 => println(HigherOrderFunction.main(8,2)(HigherOrderFunction.add))
    case 7 => AnonymousFunction.main
    case 8 => Currying.main()
    case _ => println("not valid")
  }

}
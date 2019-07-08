package Function

object VariableArguments {

  def main(a:Int*)(b:Int*): Unit ={
    var sum = 0
    for (i <- a)
      sum += i;
    var mul = 1
    for (i <- b)
      mul *= i
    println(sum+"-----"+mul)

  }



}

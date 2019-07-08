package Function

object Recursion {

  def factorial(n:Int) : Int = {
    if(n<=1)
      1
    else
      n * factorial(n-1)
  }
  
  def recursiveSum(x : Int*) : Int ={
    if (x.length == 0) 0
    else x.head + recursiveSum(x.tail : _*)
  }

}

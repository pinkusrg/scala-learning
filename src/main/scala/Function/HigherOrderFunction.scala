package Function

object HigherOrderFunction {

  def main(a:Int,b:Int)(function : (Int,Int)=>Int) : Int = {
    function(a,b)
  }

  def add : (Int,Int) => Int = {
    (a:Int,b:Int) => a+b
  }

  def mul : (Int,Int) => Int = {
    (a:Int,b:Int) => a*b
  }

  def sub : (Int,Int) => Int = {
    (a:Int,b:Int) => a-b
  }

  def divide : (Int,Int) => Int  = {
    (a:Int,b:Int) => a/b
  }

}

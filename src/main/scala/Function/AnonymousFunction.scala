package Function

object AnonymousFunction {

  def main: Unit = {

    var add : (Int,Int) => Int = (a:Int,b:Int) => a+b;

    println(add(2,3))

    var add1 : (Int,Int) => Int = (_:Int) + (_:Int)

    println(add1(4,5))

  }

}

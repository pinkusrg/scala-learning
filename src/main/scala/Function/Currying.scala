package Function

object Currying {

  def main(): Unit = {

    def add(a:Int,b:Int) = a +b;

    println(add(2,3));

    def add1 (a:Int) (b:Int) = a+b

    var sum = add1(34)_

    println(sum(0))

    sum = add1(_)(45)

    println(sum(0))

    def add2(a:Int) = (b:Int) => a+b

    var a = add2(23)(23)

    println(a)

    sum = add2(23)

    println(sum(23))
  }

}

package Function

object Declaration {

  def add = {
    println("Signature-1")
  }

  def add1() = {
    println("Signature-2")
  }

  def add2 {
    println("Signature-3");
  }

  def add3() {
    println("Signature-4")
  }

  def add4(a:Int,b:Int): Unit ={
    println(a+b)
    println("Signature-5")
  }

  def add5(a:Int,b:Int) {
    println(a+b);
    println("Signature-6")
  }

  def add6 : Int = {
    println("Signature-7")
    23
  }

  def add7() : Int = {
    println("Signature-8")
    45
  }

  /*def add8(a:Int,b:Int): Int ={
    println("Signature-9")
  }*/ // return type not mentioned

  def add9(a:Int,b:Int): Int ={
    println("Signature-10")
    return 122
  }

  def add10(a:Int,b:Int)={
    println("Signature-11");
    23
  }

  /*
  def add11(a:Int,b:Int)={
    println("Signature-12");
    return 23
  }*/ // return keyword is present therefore return type have to be explicitly mentioned

  def add12 = 34

  def add13() = 34

  def add14 : Unit = println("Signature-15")

  def add15(a:Int,b:Int)(c:Int) : Int = a+b-c;

  def add16(a:Int) = {
    if (a > 15)
      false
    else
      23
  }

  def all = {
    add
    add1()
    add2
    add3()
    add4(34,43)
    add5(34,44)
    println(add6)
    println(add7())
    println(add9(34,34))
    println(add10(34,34))
    println(add12)
    println(add13())
    add14
    add15(34,44)(44)
    println(add16(34))
    println(add16(1))
  }

}

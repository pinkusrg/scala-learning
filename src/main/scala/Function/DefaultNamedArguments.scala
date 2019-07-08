package Function

object DefaultNamedArguments {

  def default1(a:Int = 87, b : Int= 98): Unit = {
    println(a+b);
  }

  def default2(a:Int = 87, b: Int): Unit = {
    println(a+b)
  }

  def all = {
    default1()
    default1(0)
    default1(b = 0)
    default1(1,2)
    //default2(222) as 222 will go to a and b will remain as it is with no value hence error
    default2(b = 1)
  }
}

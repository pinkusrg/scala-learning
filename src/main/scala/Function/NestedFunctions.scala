package Function

object NestedFunctions {

  def main (a : Int,b:Int ): Unit = {
    def add {
      println(a + b)
    }
    def sub {
      println(a - b)
    }
    def mul {
      println(a * b)
    }
    def divide {
      println(a / b)
    }

    add
    sub
    mul
    divide
  }
}

object FizzBuzz {
  def main(args: Array[String]): Unit = {

    (1 to 100).map(fizzBuzz).foreach(println)

    def fizzBuzz(i: Int) = (i % 3, i % 5)
    match {
      case (0, 0) => "ふぃずばず"
      case (0, _) => "ふぃず"
      case (_, 0) => "ばず"
      case _      => i
    }


  }
}

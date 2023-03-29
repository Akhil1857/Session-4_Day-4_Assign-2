import scala.util.Try

class SquareRoot {
  def squareRootCalculator(numberList: List[Int]): List[Try[Int]] = {
    numberList.map { value =>
      Try {
        if (value < 0) throw new IllegalArgumentException("Error: Negative number")
        else math.sqrt(value).toInt
      }
    }
  }
}


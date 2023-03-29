import scala.util.{Failure, Success, Try}

object SquareRootDriver extends App{
  private val objSquareRoot = new SquareRoot
  private val list: List[Int] = List(4, 16, 25, 36)
  private val tempResult: List[Try[Int]] = objSquareRoot.squareRootCalculator(list)
  private val finalResult = tempResult.map {
    case Success(result) => result
    case Failure(exception) => exception.getMessage
  }
  print(finalResult)

}

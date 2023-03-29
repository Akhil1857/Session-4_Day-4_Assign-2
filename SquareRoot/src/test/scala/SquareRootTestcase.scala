import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

import scala.language.postfixOps
import scala.util.{Failure, Success}

class SquareRootTestcase extends AnyFlatSpec with Matchers {
  "SquareRoot" should "return the square root of every number in the list" in {
    val objectSquareRoot = new SquareRoot
    val list = List(4, 16, 25, 36)
    val result = objectSquareRoot.squareRootCalculator(list)
    val finalResults = result.map {
      case Success(result) => result
      case Failure(exception) => exception.getMessage
    }
    finalResults shouldBe List(2, 4, 5, 6)
  }

  it should "return the Error due to negative number in the List" in {
    val objectSquareRoot = new SquareRoot
    val list = List(4, 16, -25, 36)
    val result = objectSquareRoot.squareRootCalculator(list)
    val finalResults = result.map {
      case Success(result) => result
      case Failure(exception) => exception.getMessage
    }
    finalResults shouldBe List(2, 4, "Error: Negative number", 6)
  }

}

import org.scalatest.FlatSpec

class StringCalculatorTests extends FlatSpec{

  behavior of "StringCalculator.calculate"

  it should "return number if string contains a number" in{
    assert(StringCalculator.calculate("1") == 1)
  }

  it should "return sum if string contains several comma-separeted numbers" in{
    assert(StringCalculator.calculate("1,2,3") == 6)
  }
}

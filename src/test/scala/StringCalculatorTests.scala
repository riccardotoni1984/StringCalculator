import org.scalatest.FlatSpec

class StringCalculatorTests extends FlatSpec{

  behavior of "StringCalculator.calculate"

  it should "return number if string contains a number" in{
    assert(StringCalculator.calculate("1") == 1)
  }
}

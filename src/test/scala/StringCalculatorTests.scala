import org.scalatest.FlatSpec

class StringCalculatorTests extends FlatSpec{

  behavior of "StringCalculator.calculate"

  it should "return number if string contains a number" in{
    assert(StringCalculator.calculate("1") == 1)
  }

  it should "return sum if string contains several comma-separeted numbers" in{
    assert(StringCalculator.calculate("1,2,3") == 6)
  }

  it should "return sum also if string contains newLines as separators for numbers" in{
    assert(StringCalculator.calculate("1,2\n3") == 6)
  }

  it should "return sum only of positive numbers" in{
    assert(StringCalculator.calculate("-1,1,2\n3") == 6)
  }

  it should "return sum only of numbers smaller than 1000" in{
    assert(StringCalculator.calculate("1200,-1,1,2\n3") == 6)
  }

  it should "return sum if string contains custom separators" in{
    assert(StringCalculator.calculate("//;\n1;2,3") == 6)
    assert(StringCalculator.calculate("//[foo][bar]\n1,-1,foo2bar3") == 6)
  }
}

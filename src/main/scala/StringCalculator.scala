object StringCalculator {
  
  def calculate(inputString: String):Int = {
    val numberList = inputString.split("\n|,")
    numberList.
      map(x => x.toInt).
      sum
  }

}


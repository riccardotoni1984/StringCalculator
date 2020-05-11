object StringCalculator {
  
  def calculate(inputString: String):Int = {
    val numberList = inputString.split(",")
    numberList.
      map(x => x.toInt).
      sum
  }

}


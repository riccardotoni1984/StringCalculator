object StringCalculator {
  
  def calculate(inputString: String):Int = {
    val numberList = inputString.split("\n|,")
    numberList.
      map(x => x.toInt).
      filter(x => (x > 0) && (x < 1000)).
      sum
  }

}


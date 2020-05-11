object StringCalculator {
  
  def calculate(inputString: String):Int = {
    val regexToGetAllNegativeNumbers = """-\d+""".r
    val regexToGetAllNumbers = """\d+""".r
    val negativeNumberList = regexToGetAllNegativeNumbers.
      findAllIn(inputString).toList
    val numberList = regexToGetAllNumbers.
      findAllIn(inputString).toList

    (numberList ::: negativeNumberList).
      map(x => x.toInt).
      filter(x => (x < 1000)).
      sum
  }

}


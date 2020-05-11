object StringCalculator {
  
  def calculate(inputString: String):Int = {
    val negativeNumbersList = extractAllNegativeNumbers(inputString)
    val allNumbersConvertedToPositiveList = extractAndConverteAllNumbersToPositive(inputString)

    (allNumbersConvertedToPositiveList ::: negativeNumbersList).
      filter(x => (x < 1000)).
      sum
  }

  private def extractAndConverteAllNumbersToPositive(inputString: String):List[Int] = {
    val regex = """\d+""".r
    regex.
      findAllIn(inputString).
      toList.
      map(x => x.toInt)
  }

  private def extractAllNegativeNumbers(inputString: String):List[Int] = {
    val regex = """-\d+""".r
    regex.
      findAllIn(inputString).
      toList.
      map(x => x.toInt)
  }
}


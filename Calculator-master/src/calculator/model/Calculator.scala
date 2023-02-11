package calculator.model


class Calculator() {

  // Accessed by View. You should edit this method as you build functionality
  //First, ser initial state to left hand side
  var state: State = new LHS(this)
  var lefths: String = "0"
  var rightrhs: String = "0"

  def displayNumber(): Double = {
    this.state.displayNumber()
  }

  def clearPressed(): Unit = {
    this.state.clearPressed()
  }

  def numberPressed(num: Int): Unit = {
    this.state.numberPressed(num)
  }

  def dividePressed(): Unit = {
    this.state.dividePressed()
  }

  def multiplyPressed(): Unit = {
    this.state.multiplyPressed()
  }

  def subtractPressed(): Unit = {
    this.state.subtractPressed()
  }

  def addPressed(): Unit = {
    this.state.addPressed()
  }

  def equalsPressed(): Unit = {
    this.state.equalsPressed()
  }

  def decimalPressed(): Unit = {
    this.state.decimalPressed()
  }


}

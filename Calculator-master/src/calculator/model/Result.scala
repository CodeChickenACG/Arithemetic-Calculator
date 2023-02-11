package calculator.model

class Result(cal: Calculator) extends State {

  override def displayNumber(): Double = {
    cal.lefths.toDouble
  }

  override def clearPressed(): Unit = {
    cal.lefths = "0"
    cal.rightrhs = "0"
    //change state
    cal.state = new LHS(cal)
  }

  override def numberPressed(num: Int): Unit = {
    cal.lefths = num.toString
    cal.rightrhs = "0"
    //change state
    cal.state = new LHS(cal)
  }

  override def dividePressed(): Unit = {
    cal.rightrhs = "0"
    //change state
    cal.state = new dividingRightHS(cal)
  }

  override def multiplyPressed(): Unit = {
    cal.rightrhs = "0"
    //change state
    cal.state = new multiplyRHS(cal)
  }

  override def subtractPressed(): Unit = {
    cal.rightrhs = "0"
    //change state
    cal.state = new substractRHS(cal)
  }

  override def addPressed(): Unit = {
    cal.rightrhs = "0"
    //change state
    cal.state = new addRHS(cal)
  }

  override def equalsPressed(): Unit = {
    //change state
    cal.state = new Result(cal)
  }

  override def decimalPressed(): Unit = {
    cal.lefths = "0."
    //change state
    cal.state = new LHSDot(cal)
  }

}

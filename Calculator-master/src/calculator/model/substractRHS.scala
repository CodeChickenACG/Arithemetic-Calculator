package calculator.model

class substractRHS(cal: Calculator) extends State {

  override def displayNumber(): Double = {

    cal.rightrhs.toDouble

  }

  override def clearPressed(): Unit = {
    cal.lefths = "0"
    cal.rightrhs = "0"
    //change state
    cal.state = new LHS(cal)
  }

  override def numberPressed(num: Int): Unit = {
    cal.rightrhs += num.toString
  }

  override def dividePressed(): Unit = {
    cal.lefths = (cal.lefths.toDouble - cal.rightrhs.toDouble).toString
    cal.rightrhs = "0"
    //change state
    cal.state = new dividingRightHS(cal)
  }

  override def multiplyPressed(): Unit = {
    cal.lefths = (cal.lefths.toDouble - cal.rightrhs.toDouble).toString
    cal.rightrhs = "0"
    //change state
    cal.state = new multiplyRHS(cal)
  }

  override def subtractPressed(): Unit = {
    cal.lefths = (cal.lefths.toDouble - cal.rightrhs.toDouble).toString
    cal.rightrhs = "0"
    //change state
    cal.state = new substractRHS(cal)
  }

  override def addPressed(): Unit = {
    cal.lefths = (cal.lefths.toDouble - cal.rightrhs.toDouble).toString
    cal.rightrhs = "0"
    cal.state = new addRHS(cal)
  }

  override def equalsPressed(): Unit = {
    cal.lefths = (cal.lefths.toDouble - cal.rightrhs.toDouble).toString
    //change state
    cal.state = new Result(cal)
  }

  override def decimalPressed(): Unit = {
    cal.rightrhs += "."
    //change state
    cal.state = new substractRHSDot(cal)
  }

}

package calculator.model

class dividingRightHS(cal: Calculator) extends State {

  override def displayNumber(): Double = {
    cal.rightrhs.toDouble
  }

  override def clearPressed(): Unit = {
    cal.lefths = "0"
    cal.rightrhs = "0"
    cal.state = new LHS(cal)
  }

  override def numberPressed(num: Int): Unit = {
    cal.rightrhs += num.toString
  }

  override def dividePressed(): Unit = {
    val rhs: Double = math.max(1,cal.rightrhs.toDouble)
    cal.lefths = (cal.lefths.toDouble / rhs).toString
    cal.rightrhs = "0"
    //change state
    cal.state = new dividingRightHS(cal)
  }

  override def multiplyPressed(): Unit = {
    val rightHS: Double = math.max(1,cal.rightrhs.toDouble)
    cal.lefths = (cal.lefths.toDouble / rightHS).toString
    cal.rightrhs = "0"
    //change state
    cal.state = new multiplyRHS(cal)
  }

  override def subtractPressed(): Unit = {
    val rightHS: Double = math.max(1,cal.rightrhs.toDouble)
    cal.lefths = (cal.lefths.toDouble / rightHS).toString
    cal.rightrhs = "0"
    //change state
    cal.state = new substractRHS(cal)
  }

  override def addPressed(): Unit = {
    val rightHS: Double = math.max(1,cal.rightrhs.toDouble)
    cal.lefths = (cal.lefths.toDouble / rightHS).toString
    cal.rightrhs = "0"
    //change state
    cal.state = new addRHS(cal)
  }

  override def equalsPressed(): Unit = {
    cal.lefths = (cal.lefths.toDouble / cal.rightrhs.toDouble).toString
    cal.state = new Result(cal)
  }

  override def decimalPressed(): Unit = {
    cal.rightrhs += "."
    //change state
    cal.state = new dividingRightHSDot(cal)
  }

}

package calculator.model
//When a operator button is being press in this state, needs to change state, except another number is being pressed.
class LHS(cal: Calculator) extends State {

  override def displayNumber(): Double = {
    cal.lefths.toDouble
  }

  override def clearPressed(): Unit = {
    cal.lefths = "0"
    cal.rightrhs = "0"
    //change state to left hand side again, if number enter is been clear
    cal.state = new LHS(cal)
  }

  override def numberPressed(num: Int): Unit = {
    cal.lefths += num.toString
  }

  override def dividePressed(): Unit = {
    //change state to right hand side where dividing method is doing it's work
    cal.state = new dividingRightHS(cal)
  }

  override def multiplyPressed(): Unit = {
    //change state
    cal.state = new multiplyRHS(cal)
  }

  override def subtractPressed(): Unit = {
    //change state
    cal.state = new substractRHS(cal)
  }

  override def addPressed(): Unit = {
    //change state
    cal.state = new addRHS(cal)
  }

  override def equalsPressed(): Unit = {
    //change state
    cal.state = new Result(cal)
  }

  override def decimalPressed(): Unit = {
    cal.lefths += "."
    //change state
    cal.state = new LHSDot(cal)
  }

}

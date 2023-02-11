package calculator.model

class LHSDot(calc: Calculator) extends State {

  override def displayNumber(): Double = {
    calc.lefths.toDouble
  }

  override def clearPressed(): Unit = {
    calc.lefths = "0"
    calc.rightrhs = "0"
    //change state
    calc.state = new LHS(calc)
  }

  override def numberPressed(num: Int): Unit = {
    calc.lefths += num.toString
  }

  override def dividePressed(): Unit = {
    //change state
    calc.state = new dividingRightHS(calc)
  }

  override def multiplyPressed(): Unit = {
    //change state
    calc.state = new multiplyRHS(calc)
  }

  override def subtractPressed(): Unit = {
    //change state
    calc.state = new substractRHS(calc)
  }

  override def addPressed(): Unit = {
    //change state
    calc.state = new addRHS(calc)
  }

  override def equalsPressed(): Unit = {
    //change state
    calc.state = new Result(calc)
  }

  override def decimalPressed(): Unit = {
    println("Does nothing")
  }

}

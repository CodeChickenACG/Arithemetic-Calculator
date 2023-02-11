package calculator.model

class dividingRightHSDot(calc: Calculator) extends State {

  override def displayNumber(): Double = {
    calc.rightrhs.toDouble
  }

  override def clearPressed(): Unit = {
    calc.lefths = "0"
    calc.rightrhs = "0"
    //change state
    calc.state = new LHS(calc)
  }

  override def numberPressed(num: Int): Unit = {
    calc.rightrhs += num.toString
  }

  override def dividePressed(): Unit = {
    calc.lefths = (calc.lefths.toDouble / calc.rightrhs.toDouble).toString
    calc.rightrhs = "0"
    //change state
    calc.state = new dividingRightHS(calc)
  }

  override def multiplyPressed(): Unit = {
    calc.lefths = (calc.lefths.toDouble / calc.rightrhs.toDouble).toString
    calc.rightrhs = "0"
    //change state
    calc.state = new multiplyRHS(calc)
  }

  override def subtractPressed(): Unit = {
    calc.lefths = (calc.lefths.toDouble / calc.rightrhs.toDouble).toString
    calc.rightrhs = "0"
    //change state
    calc.state = new substractRHS(calc)
  }

  override def addPressed(): Unit = {
    calc.lefths = (calc.lefths.toDouble / calc.rightrhs.toDouble).toString
    calc.rightrhs = "0"
    //change state
    calc.state = new addRHS(calc)
  }

  override def equalsPressed(): Unit = {
    calc.lefths = (calc.lefths.toDouble / calc.rightrhs.toDouble).toString
    //change state
    calc.state = new Result(calc)
  }

  override def decimalPressed(): Unit = {
    println("nothing happened")
  }

}

package tests

import calculator.model.Calculator
import org.scalatest.FunSuite

class TestFullFunctionality extends FunSuite{

  val EPSILON: Double = 0.000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }

  test("check full function"){
    val calculator: Calculator = new Calculator()

    calculator.numberPressed(2)
    calculator.multiplyPressed()
    calculator.addPressed()
    calculator.numberPressed(9)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 11), calculator.displayNumber())

    calculator.clearPressed()
    assert(equalDoubles(calculator.displayNumber(), 0), calculator.displayNumber())

    calculator.numberPressed(1)
    calculator.numberPressed(5)
    calculator.decimalPressed()
    calculator.numberPressed(7)
    calculator.addPressed()
    calculator.decimalPressed()
    calculator.numberPressed(3)
    calculator.multiplyPressed()
    calculator.numberPressed(3)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 48.0), calculator.displayNumber())

    calculator.numberPressed(7)
    calculator.addPressed()
    calculator.numberPressed(3)
    calculator.equalsPressed()
    calculator.multiplyPressed()
    calculator.numberPressed(6)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 60.0), calculator.displayNumber())


  }

}

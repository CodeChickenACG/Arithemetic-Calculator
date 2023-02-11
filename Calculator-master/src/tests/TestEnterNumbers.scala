package tests

import calculator.model.Calculator
import org.scalatest.FunSuite

class TestEnterNumbers extends FunSuite {

  val EPSILON: Double = 0.000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }
  test("Test, when number is entered.") {
    val calculator: Calculator = new Calculator()

    calculator.numberPressed(1)
    calculator.numberPressed(3)
    calculator.numberPressed(2)
    assert(equalDoubles(calculator.displayNumber(), 132.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(6)
    calculator.numberPressed(9)
    calculator.numberPressed(1)
    assert(equalDoubles(calculator.displayNumber(), 691.0), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(0)
    calculator.numberPressed(0)
    calculator.numberPressed(0)
    calculator.numberPressed(0)
    calculator.numberPressed(7)
    calculator.decimalPressed()
    calculator.numberPressed(4)
    assert(equalDoubles(calculator.displayNumber(), 7.4), calculator.displayNumber())

    calculator.clearPressed()

    calculator.numberPressed(0)
    calculator.numberPressed(1)
    calculator.decimalPressed()
    calculator.numberPressed(9)
    assert(equalDoubles(calculator.displayNumber(), 1.9), calculator.displayNumber())

    calculator.clearPressed()
    calculator.decimalPressed()
    calculator.numberPressed(1)
    assert(equalDoubles(calculator.displayNumber(), 0.1), calculator.displayNumber())

    calculator.clearPressed()

    calculator.numberPressed(5)
    calculator.decimalPressed()
    calculator.decimalPressed()
    calculator.numberPressed(1)
    calculator.decimalPressed()
    calculator.numberPressed(2)
    assert(equalDoubles(calculator.displayNumber(), 5.12), calculator.displayNumber())

    calculator.clearPressed()
    calculator.numberPressed(5)
    calculator.numberPressed(8)
    calculator.decimalPressed()
    calculator.decimalPressed()
    calculator.numberPressed(0)
    calculator.decimalPressed()
    calculator.numberPressed(2)
    assert(equalDoubles(calculator.displayNumber(), 58.02), calculator.displayNumber())
  }

}

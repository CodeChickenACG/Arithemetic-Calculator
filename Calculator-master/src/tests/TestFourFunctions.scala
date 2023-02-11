package tests

import calculator.model.Calculator
import org.scalatest.FunSuite

class TestFourFunctions extends FunSuite{

  val EPSILON: Double = 0.000001

  def equalDoubles(d1: Double, d2: Double): Boolean = {
    (d1 - d2).abs < EPSILON
  }

  test("check four functions"){

    val calculator: Calculator = new Calculator()
    calculator.numberPressed(2)
    calculator.multiplyPressed()
    calculator.numberPressed(1)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 2), calculator.displayNumber())


    calculator.numberPressed(1)
    calculator.numberPressed(8)
    calculator.dividePressed()
    calculator.numberPressed(3)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 6), calculator.displayNumber())

    calculator.numberPressed(9)
    calculator.decimalPressed()
    calculator.decimalPressed()
    calculator.numberPressed(1)
    calculator.decimalPressed()
    calculator.addPressed()
    calculator.numberPressed(1)
    calculator.decimalPressed()
    calculator.numberPressed(8)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 10.9), calculator.displayNumber())

    calculator.numberPressed(5)
    calculator.decimalPressed()
    calculator.decimalPressed()
    calculator.numberPressed(3)
    calculator.decimalPressed()
    calculator.addPressed()
    calculator.decimalPressed()
    calculator.numberPressed(2)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 5.5), calculator.displayNumber())

    calculator.numberPressed(10)
    calculator.subtractPressed()
    calculator.numberPressed(1)
    calculator.decimalPressed()
    calculator.decimalPressed()
    calculator.numberPressed(6)
    calculator.equalsPressed()
    assert(equalDoubles(calculator.displayNumber(), 8.4), calculator.displayNumber())

  }

}

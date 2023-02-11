package calculator.model

abstract class State {

  def displayNumber(): Double

  def clearPressed(): Unit

  def numberPressed(number: Int): Unit

  def dividePressed(): Unit

  def multiplyPressed(): Unit

  def subtractPressed(): Unit

  def addPressed(): Unit

  def equalsPressed(): Unit

  def decimalPressed(): Unit

}

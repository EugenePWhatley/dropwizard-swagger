package provider

import model.CalculatorMessage

class CalculatorProvider {

    def calculate(CalculatorMessage calculatorMessage) {
        calculatorMessage.operation.operate(calculatorMessage.firstNumber, calculatorMessage.secondNumber)
    }
}

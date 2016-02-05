package provider

import message.CalculatorMessage
import message.Operation

class CalculatorProvider {
    private double add(double x, double y) {
        x + y
    }

    private double subtract(double x, double y) {
        x - y
    }

    private double multiply(double x, double y) {
        x * y
    }

    private def divide(double x, double y) {
        def quotient
        if (!y) {
            quotient = 'undefined'
        } else {
            quotient = x / y
        }
        quotient
    }

    def calculate(CalculatorMessage calculatorMessage) {
        if (calculatorMessage.operation == Operation.ADD) {
            add(calculatorMessage.firstNumber, calculatorMessage.secondNumber)
        } else if (calculatorMessage.operation == Operation.SUBTRACT) {
            subtract(calculatorMessage.firstNumber, calculatorMessage.secondNumber)
        } else if (calculatorMessage.operation == Operation.MULTIPLY) {
            multiply(calculatorMessage.firstNumber, calculatorMessage.secondNumber)
        } else {
            divide(calculatorMessage.firstNumber, calculatorMessage.secondNumber)
        }
    }
}

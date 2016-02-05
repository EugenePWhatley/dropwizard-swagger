package provider

import message.CalculatorMessage
import message.Operation
import spock.lang.Specification

class CalculatorProviderTest extends Specification {

    CalculatorProvider calculatorProvider
    void setup() {
        calculatorProvider = new CalculatorProvider()
    }

    def 'should create CalculatorProvider'() {
        when:
        CalculatorProvider calculatorProviderCreation = new CalculatorProvider()

        then:
        calculatorProviderCreation != null
    }

    def 'should give 0 when adding 0 and 0'() {
        when:
        def response = calculatorProvider.calculate(new CalculatorMessage(operation: Operation.ADD, firstNumber: 0, secondNumber: 0))

        then:
        response == 0
    }

    def 'should give 1 when adding 1 and 0'() {
        when:
        def response = calculatorProvider.calculate(new CalculatorMessage(operation: Operation.ADD, firstNumber: 1, secondNumber: 0))

        then:
        response == 1
    }

    def 'should give 0 when subtracting 0 and 0'() {
        when:
        def response = calculatorProvider.calculate(new CalculatorMessage(operation: Operation.SUBTRACT, firstNumber: 0, secondNumber: 0))

        then:
        response == 0
    }

    def 'should give -1 when subtracting 0 and 1'() {
        when:
        def response = calculatorProvider.calculate(new CalculatorMessage(operation: Operation.SUBTRACT, firstNumber: 0, secondNumber: 1))

        then:
        response == -1
    }
}

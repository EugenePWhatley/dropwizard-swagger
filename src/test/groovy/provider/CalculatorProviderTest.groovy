package provider

import spock.lang.Specification

class CalculatorProviderTest extends Specification {
    def 'should create CalculatorProvider'() {
        when:
        CalculatorProvider calculatorProviderCreation = new CalculatorProvider()

        then:
        calculatorProviderCreation != null
    }

    def 'should give 0 when adding 0 and 0'() {
        setup:
        CalculatorProvider calculatorProvider = new CalculatorProvider()

        when:
        def response = calculatorProvider.add(0, 0)

        then:
        response == 0
    }

    def 'should give 1 when adding 1 and 0'() {
        setup:
        CalculatorProvider calculatorProvider = new CalculatorProvider()

        when:
        def response = calculatorProvider.add(1, 0)

        then:
        response == 1
    }
}

package provider

import spock.lang.Specification

class FizzBuzzProviderTest extends Specification {
    private FizzBuzzProvider fizzBuzzProvider

    void setup() {
        fizzBuzzProvider = new FizzBuzzProvider()
    }

    def 'should create a counter provider class'() {
        when:
        FizzBuzzProvider fizzBuzzProviderCreation = new FizzBuzzProvider()

        then:
        fizzBuzzProviderCreation != null
    }

    def 'should count up to 2'() {
        setup:
        def desiredCount = 2

        when:
        def response = fizzBuzzProvider.count(desiredCount)

        then:
        response == [1, 2]
    }

    def 'should count up 4 and replace 3 with fizz'() {
        setup:
        def desiredCount = 4

        when:
        def response = fizzBuzzProvider.count(desiredCount)

        then:
        response == [1, 2, 'fizz', 4]
    }

    def 'should count up to 6 and replace 5 with buzz'() {
        setup:
        def desiredCount = 6

        when:
        def response = fizzBuzzProvider.count(desiredCount)

        then:
        response == [1, 2, 'fizz', 4, 'buzz', 6,]
    }
}

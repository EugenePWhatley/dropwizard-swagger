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
        response == [1, 2, 'Fizz', 4]
    }

    def 'should count up to 7 and replace 5 with buzz and everything divisible by 3 with fizz'() {
        setup:
        def desiredCount = 7

        when:
        def response = fizzBuzzProvider.count(desiredCount)

        then:
        response == [1, 2, 'Fizz', 4, 'Buzz', 'Fizz', 7]
    }

    def 'should count to 11 and replace everything divisible by 5 with buzz'() {
        setup:
        def desiredCount = 11

        when:
        def response = fizzBuzzProvider.count(desiredCount)

        then:
        response == [1, 2, 'Fizz', 4, 'Buzz', 'Fizz', 7, 8, 'Fizz', 'Buzz', 11]
    }

    def 'should count to 16 and replace everything divisible by both 3 and 5 with FizzBuzz'() {
        setup:
        def desiredCount = 16

        when:
        def respnse = fizzBuzzProvider.count(desiredCount)

        then:
        respnse == [1, 2, 'Fizz', 4, 'Buzz', 'Fizz', 7, 8, 'Fizz', 'Buzz', 11, 'Fizz', 13, 14, 'FizzBuzz', 16]
    }
}

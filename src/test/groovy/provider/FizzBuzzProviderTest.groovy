package provider

import spock.lang.Specification

class FizzBuzzProviderTest extends Specification {

    def 'should create a counter provider class'() {
        when:
        FizzBuzzProvider counter = new FizzBuzzProvider()

        then:
        counter != null
    }

    def 'should count up to 2'() {
        setup:
        FizzBuzzProvider counter = new FizzBuzzProvider()
        def desiredCount = 2

        when:
        def response = counter.count(desiredCount)

        then:
        response == [1,2]
    }

    def 'should count up 4 and replace 3 with fizz'() {
        setup:
        FizzBuzzProvider counter = new FizzBuzzProvider()
        def desiredCount = 4

        when:
        def response = counter.count(desiredCount)

        then:
        response == [1,2,'fizz',4]
    }
}

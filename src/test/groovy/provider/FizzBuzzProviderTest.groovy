package provider

import spock.lang.Specification

class FizzBuzzProviderTest extends Specification {

    def 'should create a counter provider class'() {
        when:
        FizzBuzzProvider counter = new FizzBuzzProvider()

        then:
        counter != null
    }

    def 'should count up to 3'() {
        setup:
        FizzBuzzProvider counter = new FizzBuzzProvider()
        def desiredCount = 3

        when:
        def response = counter.count(desiredCount)

        then:
        response == [1,2,3]
    }

    def 'should count up to 10'() {
        setup:
        FizzBuzzProvider counter = new FizzBuzzProvider()
        def desiredCount = 10

        when:
        def response = counter.count(desiredCount)

        then:
        response == [1,2,3,4,5,6,7,8,9,10]
    }
}

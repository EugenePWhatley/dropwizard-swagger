package model

import com.fasterxml.jackson.annotation.JsonValue

enum Operation {
    ADD('add'){
        @Override
        def operate(double x, double y) {
            x + y
        }
    },
    SUBTRACT('subtract') {
        @Override
        def operate(double x, double y) {
            x - y
        }
    },
    MULTIPLY('multiply') {

        @Override
        def operate(double x, double y) {
            x * y
        }
    },
    DIVIDE('divide') {

        @Override
        def operate(double x, double y) {
            def quotient
            if (!y) {
                quotient = 'undefined'
            } else {
                quotient = x / y
            }
            quotient
        }
    }

    String value

    Operation(String value) {
        this.value = value
    }

    @JsonValue
    String getValue() {
        value
    }

    abstract def operate(double x, double y)
}
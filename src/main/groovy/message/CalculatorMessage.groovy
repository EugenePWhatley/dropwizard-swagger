package message

import com.fasterxml.jackson.annotation.JsonValue
import com.wordnik.swagger.annotations.ApiModel
import com.wordnik.swagger.annotations.ApiModelProperty

import javax.validation.constraints.NotNull

enum Operation {
    ADD('add'),
    SUBTRACT('subtract'),
    MULTIPLY('multiply'),
    DIVIDE('divide')

    String value

    Operation(String value) {
        this.value = value
    }

    @JsonValue
    String getValue() {
        value
    }
}

@ApiModel
class CalculatorMessage {

    @NotNull
    @ApiModelProperty(required = true, value = 'Desired Operation')
    Operation operation

    @ApiModelProperty(required = false, value = 'value of first number to operate on')
    double firstNumber

    @ApiModelProperty(required = false, value = 'value of second number to operate on')
    double secondNumber
}

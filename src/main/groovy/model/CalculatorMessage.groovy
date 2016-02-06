package model

import com.wordnik.swagger.annotations.ApiModel
import com.wordnik.swagger.annotations.ApiModelProperty

import javax.validation.constraints.NotNull

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

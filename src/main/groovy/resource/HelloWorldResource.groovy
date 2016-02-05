package resource

import com.google.inject.Inject
import com.wordnik.swagger.annotations.Api
import com.wordnik.swagger.annotations.ApiOperation
import com.wordnik.swagger.annotations.ApiParam
import message.CalculatorMessage
import provider.CalculatorProvider
import provider.FizzBuzzProvider

import javax.validation.Valid
import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.core.MediaType

@Path('/helloWorld')
@Api('/helloWorld')
@Produces(MediaType.APPLICATION_JSON)
class HelloWorldResource {

    @Inject
    FizzBuzzProvider fizzBuzzProvider

    @Inject
    CalculatorProvider calculatorProvider

    @GET
    @ApiOperation(value = 'list of all the hello world examples')
    def helloWorldExamples() {
        [helloWorldExamples: ['FizzBuzz']]
    }

    @GET
    @Path('/fizzBuzz')
    @ApiOperation(value = 'counts up to n')
    def fizzBuzz(@QueryParam('countTo') int countTo) {
        [countUpTo: countTo, counter: fizzBuzzProvider.count(countTo)]
    }

    @GET
    @Path('/calculator')
    @Consumes(MediaType.APPLICATION_JSON)
    @ApiOperation(value = 'adds two numbers')
    def calculator(@ApiParam @Valid CalculatorMessage calculatorMessage) {
        [operation: calculatorMessage.operation.value,
         values: "$calculatorMessage.firstNumber and $calculatorMessage.secondNumber",
         answer: calculatorProvider.calculate(calculatorMessage)]
    }
}

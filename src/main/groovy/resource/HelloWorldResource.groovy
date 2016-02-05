package resource

import com.google.inject.Inject
import com.wordnik.swagger.annotations.Api
import com.wordnik.swagger.annotations.ApiOperation
import provider.CalculatorProvider
import provider.FizzBuzzProvider

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
    @ApiOperation(value = 'adds two numbers')
    def calculator(@QueryParam('x') double x, @QueryParam('y') double y) {
        [operation: 'addition', values: x + ' and ' + y, answer: calculatorProvider.add(x, y)]
    }
}

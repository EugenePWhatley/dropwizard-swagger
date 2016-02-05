package resource

import com.google.inject.Inject
import com.wordnik.swagger.annotations.Api
import com.wordnik.swagger.annotations.ApiOperation
import provider.FizzBuzzProvider

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.QueryParam
import javax.ws.rs.core.MediaType

@Path('/')
@Api('/')
class FizzBuzzResource {

	@Inject
	FizzBuzzProvider fizzBuzzProvider

	@GET
	@Path('/fizzBuzz')
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation(value = 'counts up to n')
	def helloWorld(@QueryParam('countTo') int countTo) {
		[countUpTo: countTo, counter: fizzBuzzProvider.count(countTo)]
	}
}

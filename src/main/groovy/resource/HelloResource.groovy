package resource

import com.wordnik.swagger.annotations.Api
import com.wordnik.swagger.annotations.ApiOperation

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

import static groovy.json.JsonOutput.toJson


@Path("/hello")
@Api("/hello")
class HelloResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@ApiOperation("Prints Hello World")
	static String helloWorld() {
		def output = [message: 'hello world']
		toJson(output)
	}
}

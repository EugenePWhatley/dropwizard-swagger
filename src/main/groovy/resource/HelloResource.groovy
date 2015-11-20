package resource

import com.wordnik.swagger.annotations.Api
import com.wordnik.swagger.annotations.ApiOperation

import javax.ws.rs.Consumes
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType


@Path("/hello")
@Api("/hello")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
class HelloResource {

	@GET
	@ApiOperation("Prints Hello World")
	static String helloWorld() {
		"Hello World"
	}
}

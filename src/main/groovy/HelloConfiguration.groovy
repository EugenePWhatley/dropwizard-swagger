import com.fasterxml.jackson.annotation.JsonProperty
import io.dropwizard.Configuration
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration

public class HelloConfiguration extends Configuration {
	@JsonProperty
	public SwaggerBundleConfiguration swaggerBundleConfiguration
}

import com.google.inject.Guice
import com.google.inject.Injector
import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment
import io.federecio.dropwizard.swagger.SwaggerBundle
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration
import resource.FizzBuzzResource

class HelloApplication extends Application<HelloConfiguration> {
    def static void main(final String[] args) throws Exception {
        new HelloApplication().run(args)
    }

    @Override
    def void initialize(final Bootstrap<HelloConfiguration> bootstrap) {
        bootstrap.addBundle(new SwaggerBundle<HelloConfiguration>() {
            @Override
            protected final SwaggerBundleConfiguration getSwaggerBundleConfiguration(final HelloConfiguration helloConfiguration) {
                return helloConfiguration.swaggerBundleConfiguration
            }
        })
    }

    @Override
    def void run(final HelloConfiguration configuration, final Environment environment) throws Exception {
        Injector injector = Guice.createInjector(new HelloGuiceModule(configuration, environment))
        environment.jersey().register(injector.getInstance(FizzBuzzResource))
    }
}

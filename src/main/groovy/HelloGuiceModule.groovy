import com.google.inject.AbstractModule
import io.dropwizard.setup.Environment

class HelloGuiceModule extends AbstractModule {
    private final HelloConfiguration configuration
    private final Environment environment

    HelloGuiceModule(final HelloConfiguration configuration, final Environment environment) {
        this.configuration = configuration
        this.environment = environment
    }

    @Override
    protected void configure() {
        bind(HelloConfiguration).toInstance(configuration)
        bind(Environment).toInstance(environment)
    }
}

import com.google.inject.AbstractModule
import com.google.inject.Provides
import io.dropwizard.setup.Environment
import provider.FizzBuzzProvider


class HelloGuiceModule extends AbstractModule {
    private final HelloConfiguration configuration
    private final Environment environment

    HelloGuiceModule(final HelloConfiguration configuration, final Environment environment) {
        this.configuration = configuration
        this.environment = environment
    }

    @Provides
    FizzBuzzProvider prepareFizzBuzzProvider() {
        FizzBuzzProvider fizzBuzzProvider = new FizzBuzzProvider()
        fizzBuzzProvider
    }

    @Override
    protected void configure() {
        bind(HelloConfiguration).toInstance(configuration)
        bind(Environment).toInstance(environment)
    }
}

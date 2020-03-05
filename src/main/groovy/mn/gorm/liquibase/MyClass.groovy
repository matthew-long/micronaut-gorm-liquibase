package mn.gorm.liquibase

import com.rabbitmq.client.Channel
import groovy.transform.CompileStatic
import groovy.util.logging.Slf4j
import io.micronaut.configuration.rabbitmq.connect.ChannelInitializer

import javax.inject.Inject
import javax.inject.Singleton
import javax.sql.DataSource

@CompileStatic
@Singleton
@Slf4j
class MyClass extends ChannelInitializer {
    // delete me and liquibase runs
    @Inject
    DataSource dataSource

    @Override
    void initialize(Channel channel) throws IOException {
        log.info("Rabbit channel initializer")
    }
}

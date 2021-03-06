package cz.mikealdo.base

import com.ofg.infrastructure.base.IntegrationSpec
import cz.mikealdo.storage.Application
import org.springframework.boot.test.SpringApplicationContextLoader
import org.springframework.test.context.ContextConfiguration

@ContextConfiguration(classes = [Application], loader = SpringApplicationContextLoader)
class MicroserviceIntegrationSpec extends IntegrationSpec {
}

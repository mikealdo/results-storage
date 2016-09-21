package cz.mikealdo.storage.geb.springcloud

import cz.mikealdo.storage.geb.HealthEndpointPageUISpec
import org.junit.Ignore
import org.springframework.boot.test.IntegrationTest

@IntegrationTest("spring.profiles.active:dev,springCloud")
class SpringCloudHealthEndpointUISpec extends HealthEndpointPageUISpec {
}

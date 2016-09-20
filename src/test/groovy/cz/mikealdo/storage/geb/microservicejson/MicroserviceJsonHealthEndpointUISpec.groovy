package cz.mikealdo.storage.geb.microservicejson

import cz.mikealdo.storage.geb.HealthEndpointPageUISpec
import org.springframework.boot.test.IntegrationTest

@IntegrationTest("spring.profiles.active:dev")
class MicroserviceJsonHealthEndpointUISpec extends HealthEndpointPageUISpec {
}

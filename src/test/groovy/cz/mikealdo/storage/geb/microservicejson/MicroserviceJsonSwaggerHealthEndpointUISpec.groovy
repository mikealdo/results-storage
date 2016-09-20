package cz.mikealdo.storage.geb.microservicejson

import cz.mikealdo.storage.geb.SwaggerHealthEndpointUISpec
import org.springframework.boot.test.IntegrationTest

@IntegrationTest("spring.profiles.active:dev")
class MicroserviceJsonSwaggerHealthEndpointUISpec extends SwaggerHealthEndpointUISpec {
}

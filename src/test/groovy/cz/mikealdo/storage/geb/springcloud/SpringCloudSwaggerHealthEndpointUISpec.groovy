package cz.mikealdo.storage.geb.springcloud

import cz.mikealdo.storage.geb.SwaggerHealthEndpointUISpec
import org.springframework.boot.test.IntegrationTest

@IntegrationTest("spring.profiles.active:dev,springCloud")
class SpringCloudSwaggerHealthEndpointUISpec extends SwaggerHealthEndpointUISpec {

}

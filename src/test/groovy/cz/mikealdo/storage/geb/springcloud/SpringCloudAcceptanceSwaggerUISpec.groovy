package cz.mikealdo.storage.geb.springcloud

import cz.mikealdo.storage.geb.AcceptanceSwaggerUISpec
import org.springframework.boot.test.IntegrationTest

@IntegrationTest("spring.profiles.active:dev,springCloud")
class SpringCloudAcceptanceSwaggerUISpec extends AcceptanceSwaggerUISpec {
}

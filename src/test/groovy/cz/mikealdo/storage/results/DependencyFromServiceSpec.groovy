package cz.mikealdo.storage.results

import cz.mikealdo.base.MicroserviceMvcWiremockSpec
import org.springframework.boot.test.IntegrationTest

@IntegrationTest(["stubrunner.use-microservice-definitions:true", "server.port=0", "management.port=0"])
class DependencyFromServiceSpec extends MicroserviceMvcWiremockSpec {


}

package cz.mikealdo.storage.geb.springcloud

import cz.mikealdo.storage.geb.MicroserviceControllerUISpec
import org.springframework.boot.test.IntegrationTest
import spock.lang.Ignore

@IntegrationTest("spring.profiles.active:dev,springCloud")
@Ignore("Still there are some issues with ids of page components")
class SpringCloudMicroserviceControllerUISpec extends MicroserviceControllerUISpec {

    @Override
    protected inputJson() {
        return [
                cz:
                         [this:'cz.mikealdo.results-storage']
        ]
    }
}

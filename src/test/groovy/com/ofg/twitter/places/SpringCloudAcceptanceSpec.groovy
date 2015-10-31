package com.ofg.twitter.places
import com.ofg.config.BasicProfiles
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration

@ContextConfiguration(classes = [ColleratorClientStubConfiguration])
@ActiveProfiles(BasicProfiles.SPRING_CLOUD)
class SpringCloudAcceptanceSpec extends AbstractAcceptanceSpec {

}

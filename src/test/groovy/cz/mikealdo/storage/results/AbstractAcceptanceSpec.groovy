package cz.mikealdo.storage.results

import cz.mikealdo.base.MicroserviceMvcWiremockSpec
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.MediaType

abstract class AbstractAcceptanceSpec extends MicroserviceMvcWiremockSpec {

    @Value('${acceptance-tests.timeout:8}') Integer acceptanceTestTimeout

    public static final String ROOT_PATH = '/api'
    public static final Long PAIR_ID = 1
    public static final MediaType TWITTER_PLACES_ANALYZER_MICROSERVICE_V1 = new MediaType('application', 'vnd.cz.mikealdo.results-storage.v1+json')


}

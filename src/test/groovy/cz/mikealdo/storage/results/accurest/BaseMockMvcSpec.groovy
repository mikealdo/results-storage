package cz.mikealdo.storage.results.accurest

import com.jayway.restassured.module.mockmvc.RestAssuredMockMvc
import cz.mikealdo.storage.results.ResultsStorageController
import spock.lang.Specification

abstract class BaseMockMvcSpec extends Specification {

    def setup() {
        RestAssuredMockMvc.standaloneSetup(new ResultsStorageController())
    }
}

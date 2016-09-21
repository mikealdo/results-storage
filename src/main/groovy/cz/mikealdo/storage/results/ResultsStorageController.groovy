package cz.mikealdo.storage.results

import groovy.transform.TypeChecked
import groovy.util.logging.Slf4j
import io.fourfinance.activity_tracker.activity.TrackUserActivity
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import javax.validation.constraints.NotNull

import static org.springframework.web.bind.annotation.RequestMethod.PUT

@Slf4j
@RestController
@RequestMapping('/api')
@TypeChecked
@Api(value = "competitionHash", description = "Save json string to redis cache")
public class ResultsStorageController {

    private Map<String, String> cache = new HashMap<>();

    @RequestMapping(
            value = '{competitionHash}',
            method = PUT,
            consumes = "application/vnd.cz.mikealdo.results-storage.v1+json",
            produces = "application/vnd.cz.mikealdo.results-storage.v1+json")
    @ApiOperation(value = "Async collecting and propagating of tweets for a given pairId",
            notes = "This will asynchronously call tweet collecting, place extracting and their propagation to Collerators")
    @TrackUserActivity("get places from tweets")
    getPlacesFromTweets(@PathVariable @NotNull @ApiParam(defaultValue = "0") String competitionHash, @RequestBody @NotNull String json) {
        cache.put(competitionHash, json)
    }

}

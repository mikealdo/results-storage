package cz.mikealdo.storage.results

import groovy.transform.TypeChecked
import groovy.util.logging.Slf4j
import io.fourfinance.activity_tracker.activity.TrackUserActivity
import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

import javax.validation.constraints.NotNull

import static org.springframework.web.bind.annotation.RequestMethod.PUT
import static org.springframework.web.bind.annotation.RequestMethod.GET

@Slf4j
@RestController
@RequestMapping('/api')
@TypeChecked
@Api(value = "competitionHash", description = "Save json string to redis cache")
public class ResultsStorageController {

    public static final Logger LOG = LoggerFactory.getLogger(ResultsStorageController.class);
    private Map<String, String> cache = new HashMap<>();

    @RequestMapping(
            value = '{competitionHash}',
            method = PUT,
            consumes = "application/vnd.cz.mikealdo.results-storage.v1+json",
            produces = "application/vnd.cz.mikealdo.results-storage.v1+json")
    @ApiOperation(value = "Put results into cache where the key is the incoming hash",
            notes = "Hash will be recalculated and returned to client for further usage.")
    @TrackUserActivity("put results into cache")
    saveIntoCache(@PathVariable @NotNull @ApiParam(defaultValue = "0") String competitionHash, @RequestBody @NotNull String json) {
        if (cache.get(competitionHash) == null) {
            LOG.info("Saved into cache.");
            cache.put(competitionHash, json)
        } else {
            LOG.info("Cache hitted.");
        }
        return "OK"
    }

    @RequestMapping(
            value = '{competitionHash}',
            method = GET,
            consumes = "application/vnd.cz.mikealdo.results-storage.v1+json",
            produces = "application/vnd.cz.mikealdo.results-storage.v1+json")
    @ApiOperation(value = "Retrive results from cache or return empty string when no value in cache for given hash.",
            notes = "It's completely synchronous")
    @TrackUserActivity("retrieve results from cache")
    getPlacesFromTweets(@PathVariable @NotNull @ApiParam(defaultValue = "0") String competitionHash) {
        def content = cache.get(competitionHash)
        if (content == null) {
            LOG.info("Not in cache.");
            content = ""
        } else {
            LOG.info("Cache hit with hash " + competitionHash)
        }
        return content
    }

}

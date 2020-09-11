/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.2.3).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.org.masterclass.rest;

import com.org.masterclass.model.ApiError;
import com.org.masterclass.model.Speaker;
import com.org.masterclass.model.SpeakerBean;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-11T11:47:01.281135Z[Etc/UTC]")

@Validated
@Api(value = "speakers", description = "the speakers API")
public interface SpeakersApi {

    default SpeakersApiDelegate getDelegate() {
        return new SpeakersApiDelegate() {};
    }

    /**
     * GET /speakers/{speakerId} : Find an speaker by id
     * Returns the speaker
     *
     * @param speakerId The unique speakerId to identify the entity (required)
     * @return OK (status code 200)
     *         or Speaker not found (status code 404)
     */
    @ApiOperation(value = "Find an speaker by id", nickname = "getSpeaker", notes = "Returns the speaker", response = Speaker.class, tags={ "speaker", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Speaker.class),
        @ApiResponse(code = 404, message = "Speaker not found", response = ApiError.class) })
    @RequestMapping(value = "/speakers/{speakerId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<Speaker> getSpeaker(@ApiParam(value = "The unique speakerId to identify the entity",required=true) @PathVariable("speakerId") Integer speakerId) {
        return getDelegate().getSpeaker(speakerId);
    }


    /**
     * GET /speakers : Get the list of speakers
     * Return a list of all the speakers
     *
     * @return OK (status code 200)
     */
    @ApiOperation(value = "Get the list of speakers", nickname = "getSpeakers", notes = "Return a list of all the speakers", response = Speaker.class, responseContainer = "List", tags={ "speaker", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Speaker.class, responseContainer = "List") })
    @RequestMapping(value = "/speakers",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<Speaker>> getSpeakers() {
        return getDelegate().getSpeakers();
    }


    /**
     * POST /speakers : Creates an speaker
     * Returns the speaker
     *
     * @param newSpeaker New speaker info. Must be an SpeakerBean (required)
     * @return OK (status code 200)
     *         or Errors in the input data (status code 400)
     */
    @ApiOperation(value = "Creates an speaker", nickname = "postSpeaker", notes = "Returns the speaker", response = Speaker.class, tags={ "speaker", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Speaker.class),
        @ApiResponse(code = 400, message = "Errors in the input data", response = ApiError.class) })
    @RequestMapping(value = "/speakers",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Speaker> postSpeaker(@ApiParam(value = "New speaker info. Must be an SpeakerBean" ,required=true )  @Valid @RequestBody SpeakerBean newSpeaker) {
        return getDelegate().postSpeaker(newSpeaker);
    }


    /**
     * PUT /speakers/{speakerId} : Edits an speaker
     * Returns the speaker
     *
     * @param speakerId The unique speakerId to identify the entity (required)
     * @param newSpeaker Info that wants to be changed. Must be an SpeakerBean (required)
     * @return OK (status code 200)
     *         or Errors in the input data (status code 400)
     *         or Speaker not found (status code 404)
     */
    @ApiOperation(value = "Edits an speaker", nickname = "putSpeaker", notes = "Returns the speaker", response = Speaker.class, tags={ "speaker", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "OK", response = Speaker.class),
        @ApiResponse(code = 400, message = "Errors in the input data", response = ApiError.class),
        @ApiResponse(code = 404, message = "Speaker not found", response = ApiError.class) })
    @RequestMapping(value = "/speakers/{speakerId}",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Speaker> putSpeaker(@ApiParam(value = "The unique speakerId to identify the entity",required=true) @PathVariable("speakerId") Integer speakerId,@ApiParam(value = "Info that wants to be changed. Must be an SpeakerBean" ,required=true )  @Valid @RequestBody SpeakerBean newSpeaker) {
        return getDelegate().putSpeaker(speakerId, newSpeaker);
    }

}
package com.org.masterclass.rest;

import com.org.masterclass.model.ApiError;
import com.org.masterclass.model.Speaker;
import com.org.masterclass.model.SpeakerBean;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Map;
import java.util.Optional;

/**
 * A delegate to be called by the {@link SpeakersApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-11T11:47:01.281135Z[Etc/UTC]")

public interface SpeakersApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /speakers/{speakerId} : Find an speaker by id
     * Returns the speaker
     *
     * @param speakerId The unique speakerId to identify the entity (required)
     * @return OK (status code 200)
     *         or Speaker not found (status code 404)
     * @see SpeakersApi#getSpeaker
     */
    default ResponseEntity<Speaker> getSpeaker(Integer speakerId) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"Max\", \"id\" : 10, \"age\" : 20, \"email\" : \"max@mail.com\", \"social_media\" : { \"twitter\" : { \"url\" : \"https://twitter.com/max\", \"username\" : \"max\" }, \"github\" : { \"url\" : \"https://github.com/max\", \"username\" : \"username\" } } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * GET /speakers : Get the list of speakers
     * Return a list of all the speakers
     *
     * @return OK (status code 200)
     * @see SpeakersApi#getSpeakers
     */
    default ResponseEntity<List<Speaker>> getSpeakers() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"Max\", \"id\" : 10, \"age\" : 20, \"email\" : \"max@mail.com\", \"social_media\" : { \"twitter\" : { \"url\" : \"https://twitter.com/max\", \"username\" : \"max\" }, \"github\" : { \"url\" : \"https://github.com/max\", \"username\" : \"username\" } } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

    /**
     * POST /speakers : Creates an speaker
     * Returns the speaker
     *
     * @param newSpeaker New speaker info. Must be an SpeakerBean (required)
     * @return OK (status code 200)
     *         or Errors in the input data (status code 400)
     * @see SpeakersApi#postSpeaker
     */
    default ResponseEntity<Speaker> postSpeaker(SpeakerBean newSpeaker) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"Max\", \"id\" : 10, \"age\" : 20, \"email\" : \"max@mail.com\", \"social_media\" : { \"twitter\" : { \"url\" : \"https://twitter.com/max\", \"username\" : \"max\" }, \"github\" : { \"url\" : \"https://github.com/max\", \"username\" : \"username\" } } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

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
     * @see SpeakersApi#putSpeaker
     */
    default ResponseEntity<Speaker> putSpeaker(Integer speakerId,
        SpeakerBean newSpeaker) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"name\" : \"Max\", \"id\" : 10, \"age\" : 20, \"email\" : \"max@mail.com\", \"social_media\" : { \"twitter\" : { \"url\" : \"https://twitter.com/max\", \"username\" : \"max\" }, \"github\" : { \"url\" : \"https://github.com/max\", \"username\" : \"username\" } } }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}

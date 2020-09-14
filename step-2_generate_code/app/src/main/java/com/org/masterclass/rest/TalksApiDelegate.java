package com.org.masterclass.rest;

import com.org.masterclass.model.Talk;
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
 * A delegate to be called by the {@link TalksApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-14T11:36:36.683695Z[Etc/UTC]")

public interface TalksApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /talks : Get the list of talks during the congress
     * Return a list of talks during the congress
     *
     * @return OK (status code 200)
     * @see TalksApi#getTalks
     */
    default ResponseEntity<List<Talk>> getTalks() {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"speaker\" : { \"name\" : \"Max\", \"id\" : 10, \"age\" : 20, \"email\" : \"max@mail.com\", \"social_media\" : { \"twitter\" : { \"url\" : \"https://twitter.com/max\", \"username\" : \"max\" }, \"github\" : { \"url\" : \"https://github.com/max\", \"username\" : \"username\" } } }, \"company\" : { \"sponsor_type\" : \"silver\", \"speaker\" : { \"name\" : \"Max\", \"id\" : 10, \"age\" : 20, \"email\" : \"max@mail.com\", \"social_media\" : { \"twitter\" : { \"url\" : \"https://twitter.com/max\", \"username\" : \"max\" }, \"github\" : { \"url\" : \"https://github.com/max\", \"username\" : \"username\" } } }, \"name\" : \"gfi\", \"logo\" : \"https://www.image.com/\" }, \"title\" : \"title\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}

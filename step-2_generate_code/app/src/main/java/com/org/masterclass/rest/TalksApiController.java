package com.org.masterclass.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-11T11:47:01.281135Z[Etc/UTC]")

@Controller
@RequestMapping("${openapi.Demo API.base-path:}")
public class TalksApiController implements TalksApi {

    private final TalksApiDelegate delegate;

    public TalksApiController(@org.springframework.beans.factory.annotation.Autowired(required = false) TalksApiDelegate delegate) {
        this.delegate = Optional.ofNullable(delegate).orElse(new TalksApiDelegate() {});
    }

    @Override
    public TalksApiDelegate getDelegate() {
        return delegate;
    }

}

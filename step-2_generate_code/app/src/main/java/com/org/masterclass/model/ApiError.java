package com.org.masterclass.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ApiError
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-11T11:47:01.281135Z[Etc/UTC]")

public class ApiError   {
  @JsonProperty("details")
  private String details;

  @JsonProperty("errors")
  @Valid
  private List<String> errors = null;

  @JsonProperty("message")
  private String message;

  @JsonProperty("timestamp")
  private OffsetDateTime timestamp;

  public ApiError details(String details) {
    this.details = details;
    return this;
  }

  /**
   * Useful message for the developer
   * @return details
  */
  @ApiModelProperty(example = "Speaker with id 23 does not exists", value = "Useful message for the developer")


  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public ApiError errors(List<String> errors) {
    this.errors = errors;
    return this;
  }

  public ApiError addErrorsItem(String errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * More detailed error message for the developer
   * @return errors
  */
  @ApiModelProperty(value = "More detailed error message for the developer")


  public List<String> getErrors() {
    return errors;
  }

  public void setErrors(List<String> errors) {
    this.errors = errors;
  }

  public ApiError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Useful message for the speaker
   * @return message
  */
  @ApiModelProperty(example = "Error in the input data", value = "Useful message for the speaker")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public ApiError timestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * Get timestamp
   * @return timestamp
  */
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(OffsetDateTime timestamp) {
    this.timestamp = timestamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiError apiError = (ApiError) o;
    return Objects.equals(this.details, apiError.details) &&
        Objects.equals(this.errors, apiError.errors) &&
        Objects.equals(this.message, apiError.message) &&
        Objects.equals(this.timestamp, apiError.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(details, errors, message, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiError {\n");
    
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package com.org.masterclass.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.masterclass.model.SpeakerSocialMediaGithub;
import com.org.masterclass.model.SpeakerSocialMediaTwitter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpeakerSocialMedia
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-14T11:36:36.683695Z[Etc/UTC]")

public class SpeakerSocialMedia   {
  @JsonProperty("twitter")
  private SpeakerSocialMediaTwitter twitter;

  @JsonProperty("github")
  private SpeakerSocialMediaGithub github;

  public SpeakerSocialMedia twitter(SpeakerSocialMediaTwitter twitter) {
    this.twitter = twitter;
    return this;
  }

  /**
   * Get twitter
   * @return twitter
  */
  @ApiModelProperty(value = "")

  @Valid

  public SpeakerSocialMediaTwitter getTwitter() {
    return twitter;
  }

  public void setTwitter(SpeakerSocialMediaTwitter twitter) {
    this.twitter = twitter;
  }

  public SpeakerSocialMedia github(SpeakerSocialMediaGithub github) {
    this.github = github;
    return this;
  }

  /**
   * Get github
   * @return github
  */
  @ApiModelProperty(value = "")

  @Valid

  public SpeakerSocialMediaGithub getGithub() {
    return github;
  }

  public void setGithub(SpeakerSocialMediaGithub github) {
    this.github = github;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpeakerSocialMedia speakerSocialMedia = (SpeakerSocialMedia) o;
    return Objects.equals(this.twitter, speakerSocialMedia.twitter) &&
        Objects.equals(this.github, speakerSocialMedia.github);
  }

  @Override
  public int hashCode() {
    return Objects.hash(twitter, github);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpeakerSocialMedia {\n");
    
    sb.append("    twitter: ").append(toIndentedString(twitter)).append("\n");
    sb.append("    github: ").append(toIndentedString(github)).append("\n");
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


package com.org.masterclass.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.org.masterclass.model.SpeakerSocialMedia;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Speaker
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-11T11:47:01.281135Z[Etc/UTC]")

public class Speaker   {
  @JsonProperty("age")
  private Integer age;

  @JsonProperty("email")
  private String email;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("social_media")
  private SpeakerSocialMedia socialMedia;

  public Speaker age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Age of the speaker, only between 13 and 65 are allowed
   * minimum: 13
   * maximum: 65
   * @return age
  */
  @ApiModelProperty(example = "20", value = "Age of the speaker, only between 13 and 65 are allowed")

@Min(13) @Max(65) 
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Speaker email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email of the speaker
   * @return email
  */
  @ApiModelProperty(example = "max@mail.com", value = "Email of the speaker")

@javax.validation.constraints.Email
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Speaker id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Unique id
   * @return id
  */
  @ApiModelProperty(example = "10", value = "Unique id")


  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Speaker name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the speaker
   * @return name
  */
  @ApiModelProperty(example = "Max", value = "Name of the speaker")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Speaker socialMedia(SpeakerSocialMedia socialMedia) {
    this.socialMedia = socialMedia;
    return this;
  }

  /**
   * Get socialMedia
   * @return socialMedia
  */
  @ApiModelProperty(value = "")

  @Valid

  public SpeakerSocialMedia getSocialMedia() {
    return socialMedia;
  }

  public void setSocialMedia(SpeakerSocialMedia socialMedia) {
    this.socialMedia = socialMedia;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Speaker speaker = (Speaker) o;
    return Objects.equals(this.age, speaker.age) &&
        Objects.equals(this.email, speaker.email) &&
        Objects.equals(this.id, speaker.id) &&
        Objects.equals(this.name, speaker.name) &&
        Objects.equals(this.socialMedia, speaker.socialMedia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, email, id, name, socialMedia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Speaker {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    socialMedia: ").append(toIndentedString(socialMedia)).append("\n");
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


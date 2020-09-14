package com.org.masterclass.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SpeakerBean
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-14T11:36:36.683695Z[Etc/UTC]")

public class SpeakerBean   {
  @JsonProperty("age")
  private Integer age;

  @JsonProperty("email")
  private String email;

  @JsonProperty("id")
  private Integer id;

  @JsonProperty("name")
  private String name;

  public SpeakerBean age(Integer age) {
    this.age = age;
    return this;
  }

  /**
   * Age of the speaker, only between 13 and 65 are allowed
   * @return age
  */
  @ApiModelProperty(example = "20", value = "Age of the speaker, only between 13 and 65 are allowed")


  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public SpeakerBean email(String email) {
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

  public SpeakerBean id(Integer id) {
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

  public SpeakerBean name(String name) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpeakerBean speakerBean = (SpeakerBean) o;
    return Objects.equals(this.age, speakerBean.age) &&
        Objects.equals(this.email, speakerBean.email) &&
        Objects.equals(this.id, speakerBean.id) &&
        Objects.equals(this.name, speakerBean.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, email, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpeakerBean {\n");
    
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


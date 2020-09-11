package com.org.masterclass.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.org.masterclass.model.Speaker;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Company
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2020-09-11T11:47:01.281135Z[Etc/UTC]")

public class Company   {
  @JsonProperty("name")
  private String name;

  @JsonProperty("logo")
  private String logo;

  /**
   * Gets or Sets sponsorType
   */
  public enum SponsorTypeEnum {
    GOLD("gold"),
    
    SILVER("silver"),
    
    BRONZE("bronze");

    private String value;

    SponsorTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SponsorTypeEnum fromValue(String value) {
      for (SponsorTypeEnum b : SponsorTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("sponsor_type")
  private SponsorTypeEnum sponsorType;

  @JsonProperty("speaker")
  private Speaker speaker;

  public Company name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
  */
  @ApiModelProperty(example = "gfi", required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Company logo(String logo) {
    this.logo = logo;
    return this;
  }

  /**
   * Get logo
   * @return logo
  */
  @ApiModelProperty(example = "https://www.image.com/", required = true, value = "")
  @NotNull

@Pattern(regexp="http[s]?://(?:[a-zA-Z]|[0-9]|[/.?&+!*=\\-])+(?![^,!;:\\s)])") 
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public Company sponsorType(SponsorTypeEnum sponsorType) {
    this.sponsorType = sponsorType;
    return this;
  }

  /**
   * Get sponsorType
   * @return sponsorType
  */
  @ApiModelProperty(example = "silver", value = "")


  public SponsorTypeEnum getSponsorType() {
    return sponsorType;
  }

  public void setSponsorType(SponsorTypeEnum sponsorType) {
    this.sponsorType = sponsorType;
  }

  public Company speaker(Speaker speaker) {
    this.speaker = speaker;
    return this;
  }

  /**
   * Get speaker
   * @return speaker
  */
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Speaker getSpeaker() {
    return speaker;
  }

  public void setSpeaker(Speaker speaker) {
    this.speaker = speaker;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Company company = (Company) o;
    return Objects.equals(this.name, company.name) &&
        Objects.equals(this.logo, company.logo) &&
        Objects.equals(this.sponsorType, company.sponsorType) &&
        Objects.equals(this.speaker, company.speaker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, logo, sponsorType, speaker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Company {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    sponsorType: ").append(toIndentedString(sponsorType)).append("\n");
    sb.append("    speaker: ").append(toIndentedString(speaker)).append("\n");
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


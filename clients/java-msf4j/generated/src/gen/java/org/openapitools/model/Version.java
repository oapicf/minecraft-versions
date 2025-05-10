package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * Version
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2025-05-10T01:44:16.356714070Z[Etc/UTC]", comments = "Generator version: 7.12.0")
public class Version   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("type")
  private String type;

  @JsonProperty("url")
  private String url;

  @JsonProperty("time")
  private Date time;

  @JsonProperty("releaseTime")
  private Date releaseTime;

  public Version id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "24w14potato", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Version type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "snapshot", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Version url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Get url
   * @return url
  **/
  @ApiModelProperty(example = "https://piston-meta.mojang.com/v1/packages/21df7f4ba484a6437ab5e9dca0b4dfb5dcefc802/24w14potato.json", value = "")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public Version time(Date time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(example = "2024-04-01T11:14:41.000Z", value = "")
  public Date getTime() {
    return time;
  }

  public void setTime(Date time) {
    this.time = time;
  }

  public Version releaseTime(Date releaseTime) {
    this.releaseTime = releaseTime;
    return this;
  }

   /**
   * Get releaseTime
   * @return releaseTime
  **/
  @ApiModelProperty(example = "2024-04-01T11:07:19.000Z", value = "")
  public Date getReleaseTime() {
    return releaseTime;
  }

  public void setReleaseTime(Date releaseTime) {
    this.releaseTime = releaseTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Version version = (Version) o;
    return Objects.equals(this.id, version.id) &&
        Objects.equals(this.type, version.type) &&
        Objects.equals(this.url, version.url) &&
        Objects.equals(this.time, version.time) &&
        Objects.equals(this.releaseTime, version.releaseTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, url, time, releaseTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Version {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    releaseTime: ").append(toIndentedString(releaseTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


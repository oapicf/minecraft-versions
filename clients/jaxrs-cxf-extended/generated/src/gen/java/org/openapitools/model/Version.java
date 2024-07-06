package org.openapitools.model;

import java.util.Date;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class Version  {
  
  @ApiModelProperty(example = "24w14potato", value = "")
  private String id;

  @ApiModelProperty(example = "snapshot", value = "")
  private String type;

  @ApiModelProperty(example = "https://piston-meta.mojang.com/v1/packages/21df7f4ba484a6437ab5e9dca0b4dfb5dcefc802/24w14potato.json", value = "")
  private String url;

  @ApiModelProperty(example = "2024-04-01T11:14:41Z", value = "")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date time;

  @ApiModelProperty(example = "2024-04-01T11:07:19Z", value = "")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date releaseTime;
 /**
  * Get id
  * @return id
  */
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(String id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public Version id(String id) {
    this.id = id;
    return this;
  }

 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(String type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public Version type(String type) {
    this.type = type;
    return this;
  }

 /**
  * Get url
  * @return url
  */
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  /**
   * Sets the <code>url</code> property.
   */
 public void setUrl(String url) {
    this.url = url;
  }

  /**
   * Sets the <code>url</code> property.
   */
  public Version url(String url) {
    this.url = url;
    return this;
  }

 /**
  * Get time
  * @return time
  */
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }

  /**
   * Sets the <code>time</code> property.
   */
 public void setTime(Date time) {
    this.time = time;
  }

  /**
   * Sets the <code>time</code> property.
   */
  public Version time(Date time) {
    this.time = time;
    return this;
  }

 /**
  * Get releaseTime
  * @return releaseTime
  */
  @JsonProperty("releaseTime")
  public Date getReleaseTime() {
    return releaseTime;
  }

  /**
   * Sets the <code>releaseTime</code> property.
   */
 public void setReleaseTime(Date releaseTime) {
    this.releaseTime = releaseTime;
  }

  /**
   * Sets the <code>releaseTime</code> property.
   */
  public Version releaseTime(Date releaseTime) {
    this.releaseTime = releaseTime;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}


package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * McGameVersionManifestGet200ResponseVersionsInner
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-07-06T01:32:43.130084075Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class McGameVersionManifestGet200ResponseVersionsInner   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("type")
  private String type;

  @JsonProperty("url")
  private String url;

  @JsonProperty("time")
  private OffsetDateTime time;

  @JsonProperty("releaseTime")
  private OffsetDateTime releaseTime;

  public McGameVersionManifestGet200ResponseVersionsInner id(String id) {
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

  public McGameVersionManifestGet200ResponseVersionsInner type(String type) {
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

  public McGameVersionManifestGet200ResponseVersionsInner url(String url) {
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

  public McGameVersionManifestGet200ResponseVersionsInner time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

   /**
   * Get time
   * @return time
  **/
  @ApiModelProperty(example = "2024-04-01T11:14:41Z", value = "")
  public OffsetDateTime getTime() {
    return time;
  }

  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public McGameVersionManifestGet200ResponseVersionsInner releaseTime(OffsetDateTime releaseTime) {
    this.releaseTime = releaseTime;
    return this;
  }

   /**
   * Get releaseTime
   * @return releaseTime
  **/
  @ApiModelProperty(example = "2024-04-01T11:07:19Z", value = "")
  public OffsetDateTime getReleaseTime() {
    return releaseTime;
  }

  public void setReleaseTime(OffsetDateTime releaseTime) {
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
    McGameVersionManifestGet200ResponseVersionsInner mcGameVersionManifestGet200ResponseVersionsInner = (McGameVersionManifestGet200ResponseVersionsInner) o;
    return Objects.equals(this.id, mcGameVersionManifestGet200ResponseVersionsInner.id) &&
        Objects.equals(this.type, mcGameVersionManifestGet200ResponseVersionsInner.type) &&
        Objects.equals(this.url, mcGameVersionManifestGet200ResponseVersionsInner.url) &&
        Objects.equals(this.time, mcGameVersionManifestGet200ResponseVersionsInner.time) &&
        Objects.equals(this.releaseTime, mcGameVersionManifestGet200ResponseVersionsInner.releaseTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, url, time, releaseTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class McGameVersionManifestGet200ResponseVersionsInner {\n");
    
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

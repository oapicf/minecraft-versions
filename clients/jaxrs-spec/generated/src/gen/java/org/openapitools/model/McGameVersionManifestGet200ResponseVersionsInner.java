package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("_mc_game_version_manifest_get_200_response_versions_inner")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-07-06T01:33:27.601676284Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class McGameVersionManifestGet200ResponseVersionsInner   {
  private String id;
  private String type;
  private String url;
  private Date time;
  private Date releaseTime;

  /**
   **/
  public McGameVersionManifestGet200ResponseVersionsInner id(String id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "24w14potato", value = "")
  @JsonProperty("id")
  public String getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  public McGameVersionManifestGet200ResponseVersionsInner type(String type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(example = "snapshot", value = "")
  @JsonProperty("type")
  public String getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(String type) {
    this.type = type;
  }

  /**
   **/
  public McGameVersionManifestGet200ResponseVersionsInner url(String url) {
    this.url = url;
    return this;
  }

  
  @ApiModelProperty(example = "https://piston-meta.mojang.com/v1/packages/21df7f4ba484a6437ab5e9dca0b4dfb5dcefc802/24w14potato.json", value = "")
  @JsonProperty("url")
  public String getUrl() {
    return url;
  }

  @JsonProperty("url")
  public void setUrl(String url) {
    this.url = url;
  }

  /**
   **/
  public McGameVersionManifestGet200ResponseVersionsInner time(Date time) {
    this.time = time;
    return this;
  }

  
  @ApiModelProperty(example = "2024-04-01T11:14:41Z", value = "")
  @JsonProperty("time")
  public Date getTime() {
    return time;
  }

  @JsonProperty("time")
  public void setTime(Date time) {
    this.time = time;
  }

  /**
   **/
  public McGameVersionManifestGet200ResponseVersionsInner releaseTime(Date releaseTime) {
    this.releaseTime = releaseTime;
    return this;
  }

  
  @ApiModelProperty(example = "2024-04-01T11:07:19Z", value = "")
  @JsonProperty("releaseTime")
  public Date getReleaseTime() {
    return releaseTime;
  }

  @JsonProperty("releaseTime")
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


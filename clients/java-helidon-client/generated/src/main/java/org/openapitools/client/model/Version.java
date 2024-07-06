/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;




public class Version  {
  
  private String id;

  private String type;

  private String url;

  private OffsetDateTime time;

  private OffsetDateTime releaseTime;

 /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  /**
    * Set id
  **/
  public void setId(String id) {
    this.id = id;
  }

  public Version id(String id) {
    this.id = id;
    return this;
  }

 /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  /**
    * Set type
  **/
  public void setType(String type) {
    this.type = type;
  }

  public Version type(String type) {
    this.type = type;
    return this;
  }

 /**
   * Get url
   * @return url
  **/
  public String getUrl() {
    return url;
  }

  /**
    * Set url
  **/
  public void setUrl(String url) {
    this.url = url;
  }

  public Version url(String url) {
    this.url = url;
    return this;
  }

 /**
   * Get time
   * @return time
  **/
  public OffsetDateTime getTime() {
    return time;
  }

  /**
    * Set time
  **/
  public void setTime(OffsetDateTime time) {
    this.time = time;
  }

  public Version time(OffsetDateTime time) {
    this.time = time;
    return this;
  }

 /**
   * Get releaseTime
   * @return releaseTime
  **/
  public OffsetDateTime getReleaseTime() {
    return releaseTime;
  }

  /**
    * Set releaseTime
  **/
  public void setReleaseTime(OffsetDateTime releaseTime) {
    this.releaseTime = releaseTime;
  }

  public Version releaseTime(OffsetDateTime releaseTime) {
    this.releaseTime = releaseTime;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
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


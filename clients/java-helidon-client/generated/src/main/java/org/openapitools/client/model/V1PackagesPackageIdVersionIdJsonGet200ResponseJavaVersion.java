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




public class V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion  {
  
  private String component;

  private Integer majorVersion;

 /**
   * Get component
   * @return component
  **/
  public String getComponent() {
    return component;
  }

  /**
    * Set component
  **/
  public void setComponent(String component) {
    this.component = component;
  }

  public V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion component(String component) {
    this.component = component;
    return this;
  }

 /**
   * Get majorVersion
   * @return majorVersion
  **/
  public Integer getMajorVersion() {
    return majorVersion;
  }

  /**
    * Set majorVersion
  **/
  public void setMajorVersion(Integer majorVersion) {
    this.majorVersion = majorVersion;
  }

  public V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion majorVersion(Integer majorVersion) {
    this.majorVersion = majorVersion;
    return this;
  }


  /**
    * Create a string representation of this pojo.
  **/
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion {\n");
    
    sb.append("    component: ").append(toIndentedString(component)).append("\n");
    sb.append("    majorVersion: ").append(toIndentedString(majorVersion)).append("\n");
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


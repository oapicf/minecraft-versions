/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 1.1.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.model;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class VersionPackageInfoAssetIndex {
  
  @SerializedName("id")
  private String id = null;
  @SerializedName("sha1")
  private String sha1 = null;
  @SerializedName("size")
  private Integer size = null;
  @SerializedName("totalSize")
  private Integer totalSize = null;
  @SerializedName("url")
  private String url = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSha1() {
    return sha1;
  }
  public void setSha1(String sha1) {
    this.sha1 = sha1;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getSize() {
    return size;
  }
  public void setSize(Integer size) {
    this.size = size;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getTotalSize() {
    return totalSize;
  }
  public void setTotalSize(Integer totalSize) {
    this.totalSize = totalSize;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUrl() {
    return url;
  }
  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VersionPackageInfoAssetIndex versionPackageInfoAssetIndex = (VersionPackageInfoAssetIndex) o;
    return (this.id == null ? versionPackageInfoAssetIndex.id == null : this.id.equals(versionPackageInfoAssetIndex.id)) &&
        (this.sha1 == null ? versionPackageInfoAssetIndex.sha1 == null : this.sha1.equals(versionPackageInfoAssetIndex.sha1)) &&
        (this.size == null ? versionPackageInfoAssetIndex.size == null : this.size.equals(versionPackageInfoAssetIndex.size)) &&
        (this.totalSize == null ? versionPackageInfoAssetIndex.totalSize == null : this.totalSize.equals(versionPackageInfoAssetIndex.totalSize)) &&
        (this.url == null ? versionPackageInfoAssetIndex.url == null : this.url.equals(versionPackageInfoAssetIndex.url));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.id == null ? 0: this.id.hashCode());
    result = 31 * result + (this.sha1 == null ? 0: this.sha1.hashCode());
    result = 31 * result + (this.size == null ? 0: this.size.hashCode());
    result = 31 * result + (this.totalSize == null ? 0: this.totalSize.hashCode());
    result = 31 * result + (this.url == null ? 0: this.url.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class VersionPackageInfoAssetIndex {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  sha1: ").append(sha1).append("\n");
    sb.append("  size: ").append(size).append("\n");
    sb.append("  totalSize: ").append(totalSize).append("\n");
    sb.append("  url: ").append(url).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

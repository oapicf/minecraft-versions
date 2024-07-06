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

package io.swagger.client.model
import play.api.libs.json._
import java.time.OffsetDateTime

case class V1PackagesPackageIdVersionIdJsonGet200Response (
                  version: Option[String],
                  assetIndex: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex],
                  assets: Option[Int],
                  complianceLevel: Option[Int],
                  downloads: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads],
                  id: Option[String],
                  javaVersion: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion],
                  mainClass: Option[String],
                  minimumLauncherVersion: Option[Int],
                  time: Option[OffsetDateTime],
                  releaseTime: Option[OffsetDateTime],
                  `type`: Option[String]
)

object V1PackagesPackageIdVersionIdJsonGet200Response {
implicit val format: Format[V1PackagesPackageIdVersionIdJsonGet200Response] = Json.format
}


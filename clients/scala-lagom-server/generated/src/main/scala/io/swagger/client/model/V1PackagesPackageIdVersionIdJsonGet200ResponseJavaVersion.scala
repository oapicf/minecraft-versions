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

case class V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion (
                  component: Option[String],
                  majorVersion: Option[Int]
)

object V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion {
implicit val format: Format[V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion] = Json.format
}


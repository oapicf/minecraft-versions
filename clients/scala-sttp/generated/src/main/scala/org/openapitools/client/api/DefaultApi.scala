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
package org.openapitools.client.api

import org.openapitools.client.model.VersionManifest
import org.openapitools.client.model.VersionPackageInfo
import org.openapitools.client.core.JsonSupport._
import sttp.client3._
import sttp.model.Method

object DefaultApi {
  def apply(baseUrl: String = "https://launchermeta.mojang.com") = new DefaultApi(baseUrl)
}

class DefaultApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 : VersionManifest (A list of Minecraft versions with the latest and snapshot releases)
   */
  def getMinecraftVersionManifest(
): Request[Either[ResponseException[String, Exception], VersionManifest], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/mc/game/version_manifest.json")
      .contentType("application/json")
      .response(asJson[VersionManifest])

  /**
   * Expected answers:
   *   code 200 : VersionPackageInfo (Get package version details)
   * 
   * @param packageId 
   * @param versionId 
   */
  def getMinecraftVersionPackageInfo(packageId: String, versionId: String
): Request[Either[ResponseException[String, Exception], VersionPackageInfo], Any] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/v1/packages/${packageId}/${versionId}.json")
      .contentType("application/json")
      .response(asJson[VersionPackageInfo])

}

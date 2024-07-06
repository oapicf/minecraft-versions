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

import org.openapitools.client.model.McGameVersionManifestGet200Response
import org.openapitools.client.model.V1PackagesPackageIdVersionIdJsonGet200Response
import org.openapitools.client.core.JsonSupport._
import sttp.client4._
import sttp.model.Method

object DefaultApi {
  def apply(baseUrl: String = "https://launchermeta.mojang.com") = new DefaultApi(baseUrl)
}

class DefaultApi(baseUrl: String) {

  /**
   * Expected answers:
   *   code 200 : McGameVersionManifestGet200Response (A list of Minecraft versions with the latest and snapshot releases)
   */
  def mcGameVersionManifestGet(): Request[Either[ResponseException[String, Exception], McGameVersionManifestGet200Response]] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/mc/game/version_manifest")
      .contentType("application/json")
      .response(asJson[McGameVersionManifestGet200Response])

  /**
   * Expected answers:
   *   code 200 : V1PackagesPackageIdVersionIdJsonGet200Response (Get package version details)
   * 
   * @param packageId 
   * @param versionId 
   */
  def v1PackagesPackageIdVersionIdJsonGet(packageId: String, versionId: String): Request[Either[ResponseException[String, Exception], V1PackagesPackageIdVersionIdJsonGet200Response]] =
    basicRequest
      .method(Method.GET, uri"$baseUrl/v1/packages/${packageId}/${versionId}.json")
      .contentType("application/json")
      .response(asJson[V1PackagesPackageIdVersionIdJsonGet200Response])

}

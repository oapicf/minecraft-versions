package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

import org.openapitools.client.api.McGameVersionManifestGet200Response
import org.openapitools.client.api.V1PackagesPackageIdVersionIdJsonGet200Response

object DefaultApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def mcGameVersionManifestGet(host: String): Task[McGameVersionManifestGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[McGameVersionManifestGet200Response] = jsonOf[McGameVersionManifestGet200Response]

    val path = "/mc/game/version_manifest"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[McGameVersionManifestGet200Response](req)

    } yield resp
  }

  def v1PackagesPackageIdVersionIdJsonGet(host: String, packageId: String, versionId: String): Task[V1PackagesPackageIdVersionIdJsonGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[V1PackagesPackageIdVersionIdJsonGet200Response] = jsonOf[V1PackagesPackageIdVersionIdJsonGet200Response]

    val path = "/v1/packages/{packageId}/{versionId}.json".replaceAll("\\{" + "packageId" + "\\}",escape(packageId.toString)).replaceAll("\\{" + "versionId" + "\\}",escape(versionId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[V1PackagesPackageIdVersionIdJsonGet200Response](req)

    } yield resp
  }

}

class HttpServiceDefaultApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def mcGameVersionManifestGet(): Task[McGameVersionManifestGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[McGameVersionManifestGet200Response] = jsonOf[McGameVersionManifestGet200Response]

    val path = "/mc/game/version_manifest"

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[McGameVersionManifestGet200Response](req)

    } yield resp
  }

  def v1PackagesPackageIdVersionIdJsonGet(packageId: String, versionId: String): Task[V1PackagesPackageIdVersionIdJsonGet200Response] = {
    implicit val returnTypeDecoder: EntityDecoder[V1PackagesPackageIdVersionIdJsonGet200Response] = jsonOf[V1PackagesPackageIdVersionIdJsonGet200Response]

    val path = "/v1/packages/{packageId}/{versionId}.json".replaceAll("\\{" + "packageId" + "\\}",escape(packageId.toString)).replaceAll("\\{" + "versionId" + "\\}",escape(versionId.toString))

    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[V1PackagesPackageIdVersionIdJsonGet200Response](req)

    } yield resp
  }

}

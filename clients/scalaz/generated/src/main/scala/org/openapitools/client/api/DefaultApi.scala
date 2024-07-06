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

import org.openapitools.client.api.VersionManifest
import org.openapitools.client.api.VersionPackageInfo

object DefaultApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getMinecraftVersionManifest(host: String): Task[VersionManifest] = {
    implicit val returnTypeDecoder: EntityDecoder[VersionManifest] = jsonOf[VersionManifest]

    val path = "/mc/game/version_manifest.json"

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
      resp          <- client.expect[VersionManifest](req)

    } yield resp
  }

  def getMinecraftVersionPackageInfo(host: String, packageId: String, versionId: String): Task[VersionPackageInfo] = {
    implicit val returnTypeDecoder: EntityDecoder[VersionPackageInfo] = jsonOf[VersionPackageInfo]

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
      resp          <- client.expect[VersionPackageInfo](req)

    } yield resp
  }

}

class HttpServiceDefaultApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getMinecraftVersionManifest(): Task[VersionManifest] = {
    implicit val returnTypeDecoder: EntityDecoder[VersionManifest] = jsonOf[VersionManifest]

    val path = "/mc/game/version_manifest.json"

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
      resp          <- client.expect[VersionManifest](req)

    } yield resp
  }

  def getMinecraftVersionPackageInfo(packageId: String, versionId: String): Task[VersionPackageInfo] = {
    implicit val returnTypeDecoder: EntityDecoder[VersionPackageInfo] = jsonOf[VersionPackageInfo]

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
      resp          <- client.expect[VersionPackageInfo](req)

    } yield resp
  }

}

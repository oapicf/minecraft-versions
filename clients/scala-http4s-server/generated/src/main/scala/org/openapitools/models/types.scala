package org.openapitools.models

import java.time._

import io.circe.refined._
import io.circe.syntax._
import io.circe.{ Decoder, Encoder }
import io.circe.generic.semiauto.{ deriveDecoder, deriveEncoder }

import java.time.ZonedDateTime

/**
* 
* @param latest 
* @param versions 
*/

case class GetMinecraftVersionManifest200Response(
  latest: Option[GetMinecraftVersionManifest200ResponseLatest],
  versions: Option[List[GetMinecraftVersionManifest200ResponseVersionsInner]]
)
object GetMinecraftVersionManifest200Response {
  implicit val encoderGetMinecraftVersionManifest200Response: Encoder[GetMinecraftVersionManifest200Response] = deriveEncoder[GetMinecraftVersionManifest200Response].mapJson(_.dropNullValues)
  implicit val decoderGetMinecraftVersionManifest200Response: Decoder[GetMinecraftVersionManifest200Response] = deriveDecoder[GetMinecraftVersionManifest200Response]
}

/**
* 
* @param release 
* @param snapshot 
*/

case class GetMinecraftVersionManifest200ResponseLatest(
  release: Option[String],
  snapshot: Option[String]
)
object GetMinecraftVersionManifest200ResponseLatest {
  implicit val encoderGetMinecraftVersionManifest200ResponseLatest: Encoder[GetMinecraftVersionManifest200ResponseLatest] = deriveEncoder[GetMinecraftVersionManifest200ResponseLatest].mapJson(_.dropNullValues)
  implicit val decoderGetMinecraftVersionManifest200ResponseLatest: Decoder[GetMinecraftVersionManifest200ResponseLatest] = deriveDecoder[GetMinecraftVersionManifest200ResponseLatest]
}

/**
* 
* @param id 
* @param _type 
* @param url 
* @param time 
* @param releaseTime 
*/

case class GetMinecraftVersionManifest200ResponseVersionsInner(
  id: Option[String],
  _type: Option[String],
  url: Option[String],
  time: Option[ZonedDateTime],
  releaseTime: Option[ZonedDateTime]
)
object GetMinecraftVersionManifest200ResponseVersionsInner {
  implicit val encoderGetMinecraftVersionManifest200ResponseVersionsInner: Encoder[GetMinecraftVersionManifest200ResponseVersionsInner] = deriveEncoder[GetMinecraftVersionManifest200ResponseVersionsInner].mapJson(_.dropNullValues)
  implicit val decoderGetMinecraftVersionManifest200ResponseVersionsInner: Decoder[GetMinecraftVersionManifest200ResponseVersionsInner] = deriveDecoder[GetMinecraftVersionManifest200ResponseVersionsInner]
}

/**
* 
* @param version 
* @param assetIndex 
* @param assets 
* @param complianceLevel 
* @param downloads 
* @param id 
* @param javaVersion 
* @param mainClass 
* @param minimumLauncherVersion 
* @param time 
* @param releaseTime 
* @param _type 
*/

case class V1PackagesPackageIdVersionIdJsonGet200Response(
  version: Option[String],
  assetIndex: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex],
  assets: Option[Int],
  complianceLevel: Option[Int],
  downloads: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads],
  id: Option[String],
  javaVersion: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion],
  mainClass: Option[String],
  minimumLauncherVersion: Option[Int],
  time: Option[ZonedDateTime],
  releaseTime: Option[ZonedDateTime],
  _type: Option[String]
)
object V1PackagesPackageIdVersionIdJsonGet200Response {
  implicit val encoderV1PackagesPackageIdVersionIdJsonGet200Response: Encoder[V1PackagesPackageIdVersionIdJsonGet200Response] = deriveEncoder[V1PackagesPackageIdVersionIdJsonGet200Response].mapJson(_.dropNullValues)
  implicit val decoderV1PackagesPackageIdVersionIdJsonGet200Response: Decoder[V1PackagesPackageIdVersionIdJsonGet200Response] = deriveDecoder[V1PackagesPackageIdVersionIdJsonGet200Response]
}

/**
* 
* @param id 
* @param sha1 
* @param size 
* @param totalSize 
* @param url 
*/

case class V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex(
  id: Option[String],
  sha1: Option[String],
  size: Option[Int],
  totalSize: Option[Int],
  url: Option[String]
)
object V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex {
  implicit val encoderV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex: Encoder[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex] = deriveEncoder[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex].mapJson(_.dropNullValues)
  implicit val decoderV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex: Decoder[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex] = deriveDecoder[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex]
}

/**
* 
* @param client 
* @param clientUnderscoremappings 
* @param server 
* @param serverUnderscoremappings 
*/

case class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads(
  client: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient],
  clientUnderscoremappings: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientMappings],
  server: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServer],
  serverUnderscoremappings: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServerMappings]
)
object V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {
  implicit val encoderV1PackagesPackageIdVersionIdJsonGet200ResponseDownloads: Encoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads] = deriveEncoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads].mapJson(_.dropNullValues)
  implicit val decoderV1PackagesPackageIdVersionIdJsonGet200ResponseDownloads: Decoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads] = deriveDecoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads]
}

/**
* 
* @param sha1 
* @param size 
* @param url 
*/

case class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient(
  sha1: Option[String],
  size: Option[Int],
  url: Option[String]
)
object V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient {
  implicit val encoderV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient: Encoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient] = deriveEncoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient].mapJson(_.dropNullValues)
  implicit val decoderV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient: Decoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient] = deriveDecoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient]
}

/**
* 
* @param sha1 
* @param size 
* @param url 
*/

case class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientMappings(
  sha1: Option[String],
  size: Option[Int],
  url: Option[String]
)
object V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientMappings {
  implicit val encoderV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientMappings: Encoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientMappings] = deriveEncoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientMappings].mapJson(_.dropNullValues)
  implicit val decoderV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientMappings: Decoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientMappings] = deriveDecoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientMappings]
}

/**
* 
* @param sha1 
* @param size 
* @param url 
*/

case class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServer(
  sha1: Option[String],
  size: Option[Int],
  url: Option[String]
)
object V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServer {
  implicit val encoderV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServer: Encoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServer] = deriveEncoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServer].mapJson(_.dropNullValues)
  implicit val decoderV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServer: Decoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServer] = deriveDecoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServer]
}

/**
* 
* @param sha1 
* @param size 
* @param url 
*/

case class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServerMappings(
  sha1: Option[String],
  size: Option[Int],
  url: Option[String]
)
object V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServerMappings {
  implicit val encoderV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServerMappings: Encoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServerMappings] = deriveEncoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServerMappings].mapJson(_.dropNullValues)
  implicit val decoderV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServerMappings: Decoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServerMappings] = deriveDecoder[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsServerMappings]
}

/**
* 
* @param component 
* @param majorVersion 
*/

case class V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion(
  component: Option[String],
  majorVersion: Option[Int]
)
object V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion {
  implicit val encoderV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion: Encoder[V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion] = deriveEncoder[V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion].mapJson(_.dropNullValues)
  implicit val decoderV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion: Decoder[V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion] = deriveDecoder[V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion]
}


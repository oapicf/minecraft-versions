package org.openapitools.models

import java.time._

import io.circe.refined._
import io.circe.syntax._
import io.circe.{ Decoder, Encoder }
import io.circe.generic.semiauto.{ deriveDecoder, deriveEncoder }

import java.time.ZonedDateTime

/**
* 
* @param sha1 
* @param size 
* @param url 
*/

case class Download(
  sha1: Option[String],
  size: Option[Int],
  url: Option[String]
)
object Download {
  implicit val encoderDownload: Encoder[Download] = deriveEncoder[Download].mapJson(_.dropNullValues)
  implicit val decoderDownload: Decoder[Download] = deriveDecoder[Download]
}

/**
* 
* @param id 
* @param _type 
* @param url 
* @param time 
* @param releaseTime 
*/

case class Version(
  id: Option[String],
  _type: Option[String],
  url: Option[String],
  time: Option[ZonedDateTime],
  releaseTime: Option[ZonedDateTime]
)
object Version {
  implicit val encoderVersion: Encoder[Version] = deriveEncoder[Version].mapJson(_.dropNullValues)
  implicit val decoderVersion: Decoder[Version] = deriveDecoder[Version]
}

/**
* 
* @param latest 
* @param versions 
*/

case class VersionManifest(
  latest: Option[VersionManifestLatest],
  versions: Option[List[Version]]
)
object VersionManifest {
  implicit val encoderVersionManifest: Encoder[VersionManifest] = deriveEncoder[VersionManifest].mapJson(_.dropNullValues)
  implicit val decoderVersionManifest: Decoder[VersionManifest] = deriveDecoder[VersionManifest]
}

/**
* 
* @param release 
* @param snapshot 
*/

case class VersionManifestLatest(
  release: Option[String],
  snapshot: Option[String]
)
object VersionManifestLatest {
  implicit val encoderVersionManifestLatest: Encoder[VersionManifestLatest] = deriveEncoder[VersionManifestLatest].mapJson(_.dropNullValues)
  implicit val decoderVersionManifestLatest: Decoder[VersionManifestLatest] = deriveDecoder[VersionManifestLatest]
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

case class VersionPackageInfo(
  version: Option[String],
  assetIndex: Option[VersionPackageInfoAssetIndex],
  assets: Option[Int],
  complianceLevel: Option[Int],
  downloads: Option[VersionPackageInfoDownloads],
  id: Option[String],
  javaVersion: Option[VersionPackageInfoJavaVersion],
  mainClass: Option[String],
  minimumLauncherVersion: Option[Int],
  time: Option[ZonedDateTime],
  releaseTime: Option[ZonedDateTime],
  _type: Option[String]
)
object VersionPackageInfo {
  implicit val encoderVersionPackageInfo: Encoder[VersionPackageInfo] = deriveEncoder[VersionPackageInfo].mapJson(_.dropNullValues)
  implicit val decoderVersionPackageInfo: Decoder[VersionPackageInfo] = deriveDecoder[VersionPackageInfo]
}

/**
* 
* @param id 
* @param sha1 
* @param size 
* @param totalSize 
* @param url 
*/

case class VersionPackageInfoAssetIndex(
  id: Option[String],
  sha1: Option[String],
  size: Option[Int],
  totalSize: Option[Int],
  url: Option[String]
)
object VersionPackageInfoAssetIndex {
  implicit val encoderVersionPackageInfoAssetIndex: Encoder[VersionPackageInfoAssetIndex] = deriveEncoder[VersionPackageInfoAssetIndex].mapJson(_.dropNullValues)
  implicit val decoderVersionPackageInfoAssetIndex: Decoder[VersionPackageInfoAssetIndex] = deriveDecoder[VersionPackageInfoAssetIndex]
}

/**
* 
* @param client 
* @param clientUnderscoremappings 
* @param server 
* @param serverUnderscoremappings 
*/

case class VersionPackageInfoDownloads(
  client: Option[Download],
  clientUnderscoremappings: Option[Download],
  server: Option[Download],
  serverUnderscoremappings: Option[Download]
)
object VersionPackageInfoDownloads {
  implicit val encoderVersionPackageInfoDownloads: Encoder[VersionPackageInfoDownloads] = deriveEncoder[VersionPackageInfoDownloads].mapJson(_.dropNullValues)
  implicit val decoderVersionPackageInfoDownloads: Decoder[VersionPackageInfoDownloads] = deriveDecoder[VersionPackageInfoDownloads]
}

/**
* 
* @param component 
* @param majorVersion 
*/

case class VersionPackageInfoJavaVersion(
  component: Option[String],
  majorVersion: Option[Int]
)
object VersionPackageInfoJavaVersion {
  implicit val encoderVersionPackageInfoJavaVersion: Encoder[VersionPackageInfoJavaVersion] = deriveEncoder[VersionPackageInfoJavaVersion].mapJson(_.dropNullValues)
  implicit val decoderVersionPackageInfoJavaVersion: Decoder[VersionPackageInfoJavaVersion] = deriveDecoder[VersionPackageInfoJavaVersion]
}


package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import VersionPackageInfo._

case class VersionPackageInfo (
  version: Option[String],
assetIndex: Option[VersionPackageInfoAssetIndex],
assets: Option[String],
complianceLevel: Option[Integer],
downloads: Option[VersionPackageInfoDownloads],
id: Option[String],
javaVersion: Option[VersionPackageInfoJavaVersion],
mainClass: Option[String],
minimumLauncherVersion: Option[Integer],
time: Option[OffsetDateTime],
releaseTime: Option[OffsetDateTime],
`type`: Option[String])

object VersionPackageInfo {
  import DateTimeCodecs._

  implicit val VersionPackageInfoCodecJson: CodecJson[VersionPackageInfo] = CodecJson.derive[VersionPackageInfo]
  implicit val VersionPackageInfoDecoder: EntityDecoder[VersionPackageInfo] = jsonOf[VersionPackageInfo]
  implicit val VersionPackageInfoEncoder: EntityEncoder[VersionPackageInfo] = jsonEncoderOf[VersionPackageInfo]
}

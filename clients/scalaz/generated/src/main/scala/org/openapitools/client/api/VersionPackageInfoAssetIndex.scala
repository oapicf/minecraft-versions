package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VersionPackageInfoAssetIndex._

case class VersionPackageInfoAssetIndex (
  id: Option[String],
sha1: Option[String],
size: Option[Integer],
totalSize: Option[Integer],
url: Option[String])

object VersionPackageInfoAssetIndex {
  import DateTimeCodecs._

  implicit val VersionPackageInfoAssetIndexCodecJson: CodecJson[VersionPackageInfoAssetIndex] = CodecJson.derive[VersionPackageInfoAssetIndex]
  implicit val VersionPackageInfoAssetIndexDecoder: EntityDecoder[VersionPackageInfoAssetIndex] = jsonOf[VersionPackageInfoAssetIndex]
  implicit val VersionPackageInfoAssetIndexEncoder: EntityEncoder[VersionPackageInfoAssetIndex] = jsonEncoderOf[VersionPackageInfoAssetIndex]
}

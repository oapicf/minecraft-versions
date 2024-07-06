package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VersionPackageInfoJavaVersion._

case class VersionPackageInfoJavaVersion (
  component: Option[String],
majorVersion: Option[Integer])

object VersionPackageInfoJavaVersion {
  import DateTimeCodecs._

  implicit val VersionPackageInfoJavaVersionCodecJson: CodecJson[VersionPackageInfoJavaVersion] = CodecJson.derive[VersionPackageInfoJavaVersion]
  implicit val VersionPackageInfoJavaVersionDecoder: EntityDecoder[VersionPackageInfoJavaVersion] = jsonOf[VersionPackageInfoJavaVersion]
  implicit val VersionPackageInfoJavaVersionEncoder: EntityEncoder[VersionPackageInfoJavaVersion] = jsonEncoderOf[VersionPackageInfoJavaVersion]
}

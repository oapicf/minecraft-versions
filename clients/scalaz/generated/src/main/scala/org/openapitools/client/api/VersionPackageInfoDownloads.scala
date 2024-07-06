package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VersionPackageInfoDownloads._

case class VersionPackageInfoDownloads (
  client: Option[Download],
clientMappings: Option[Download],
server: Option[Download],
serverMappings: Option[Download])

object VersionPackageInfoDownloads {
  import DateTimeCodecs._

  implicit val VersionPackageInfoDownloadsCodecJson: CodecJson[VersionPackageInfoDownloads] = CodecJson.derive[VersionPackageInfoDownloads]
  implicit val VersionPackageInfoDownloadsDecoder: EntityDecoder[VersionPackageInfoDownloads] = jsonOf[VersionPackageInfoDownloads]
  implicit val VersionPackageInfoDownloadsEncoder: EntityEncoder[VersionPackageInfoDownloads] = jsonEncoderOf[VersionPackageInfoDownloads]
}

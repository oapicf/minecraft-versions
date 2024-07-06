package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VersionManifestLatest._

case class VersionManifestLatest (
  release: Option[String],
snapshot: Option[String])

object VersionManifestLatest {
  import DateTimeCodecs._

  implicit val VersionManifestLatestCodecJson: CodecJson[VersionManifestLatest] = CodecJson.derive[VersionManifestLatest]
  implicit val VersionManifestLatestDecoder: EntityDecoder[VersionManifestLatest] = jsonOf[VersionManifestLatest]
  implicit val VersionManifestLatestEncoder: EntityEncoder[VersionManifestLatest] = jsonEncoderOf[VersionManifestLatest]
}

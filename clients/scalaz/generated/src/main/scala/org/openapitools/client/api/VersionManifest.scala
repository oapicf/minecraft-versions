package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VersionManifest._

case class VersionManifest (
  latest: Option[VersionManifestLatest],
versions: Option[List[Version]])

object VersionManifest {
  import DateTimeCodecs._

  implicit val VersionManifestCodecJson: CodecJson[VersionManifest] = CodecJson.derive[VersionManifest]
  implicit val VersionManifestDecoder: EntityDecoder[VersionManifest] = jsonOf[VersionManifest]
  implicit val VersionManifestEncoder: EntityEncoder[VersionManifest] = jsonEncoderOf[VersionManifest]
}

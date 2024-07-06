package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import McGameVersionManifestGet200ResponseLatest._

case class McGameVersionManifestGet200ResponseLatest (
  release: Option[String],
snapshot: Option[String])

object McGameVersionManifestGet200ResponseLatest {
  import DateTimeCodecs._

  implicit val McGameVersionManifestGet200ResponseLatestCodecJson: CodecJson[McGameVersionManifestGet200ResponseLatest] = CodecJson.derive[McGameVersionManifestGet200ResponseLatest]
  implicit val McGameVersionManifestGet200ResponseLatestDecoder: EntityDecoder[McGameVersionManifestGet200ResponseLatest] = jsonOf[McGameVersionManifestGet200ResponseLatest]
  implicit val McGameVersionManifestGet200ResponseLatestEncoder: EntityEncoder[McGameVersionManifestGet200ResponseLatest] = jsonEncoderOf[McGameVersionManifestGet200ResponseLatest]
}

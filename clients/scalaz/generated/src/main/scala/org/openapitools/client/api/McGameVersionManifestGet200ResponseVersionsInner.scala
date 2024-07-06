package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import McGameVersionManifestGet200ResponseVersionsInner._

case class McGameVersionManifestGet200ResponseVersionsInner (
  id: Option[String],
`type`: Option[String],
url: Option[String],
time: Option[OffsetDateTime],
releaseTime: Option[OffsetDateTime])

object McGameVersionManifestGet200ResponseVersionsInner {
  import DateTimeCodecs._

  implicit val McGameVersionManifestGet200ResponseVersionsInnerCodecJson: CodecJson[McGameVersionManifestGet200ResponseVersionsInner] = CodecJson.derive[McGameVersionManifestGet200ResponseVersionsInner]
  implicit val McGameVersionManifestGet200ResponseVersionsInnerDecoder: EntityDecoder[McGameVersionManifestGet200ResponseVersionsInner] = jsonOf[McGameVersionManifestGet200ResponseVersionsInner]
  implicit val McGameVersionManifestGet200ResponseVersionsInnerEncoder: EntityEncoder[McGameVersionManifestGet200ResponseVersionsInner] = jsonEncoderOf[McGameVersionManifestGet200ResponseVersionsInner]
}

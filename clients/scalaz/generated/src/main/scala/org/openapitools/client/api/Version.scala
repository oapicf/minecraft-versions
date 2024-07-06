package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import Version._

case class Version (
  id: Option[String],
`type`: Option[String],
url: Option[String],
time: Option[OffsetDateTime],
releaseTime: Option[OffsetDateTime])

object Version {
  import DateTimeCodecs._

  implicit val VersionCodecJson: CodecJson[Version] = CodecJson.derive[Version]
  implicit val VersionDecoder: EntityDecoder[Version] = jsonOf[Version]
  implicit val VersionEncoder: EntityEncoder[Version] = jsonEncoderOf[Version]
}

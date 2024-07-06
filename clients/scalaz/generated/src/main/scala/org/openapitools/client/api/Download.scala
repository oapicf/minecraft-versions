package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Download._

case class Download (
  sha1: Option[String],
size: Option[Integer],
url: Option[String])

object Download {
  import DateTimeCodecs._

  implicit val DownloadCodecJson: CodecJson[Download] = CodecJson.derive[Download]
  implicit val DownloadDecoder: EntityDecoder[Download] = jsonOf[Download]
  implicit val DownloadEncoder: EntityEncoder[Download] = jsonEncoderOf[Download]
}

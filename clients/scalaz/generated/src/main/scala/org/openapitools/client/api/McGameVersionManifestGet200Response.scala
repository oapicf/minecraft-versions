package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import McGameVersionManifestGet200Response._

case class McGameVersionManifestGet200Response (
  latest: Option[McGameVersionManifestGet200ResponseLatest],
versions: Option[List[McGameVersionManifestGet200ResponseVersionsInner]])

object McGameVersionManifestGet200Response {
  import DateTimeCodecs._

  implicit val McGameVersionManifestGet200ResponseCodecJson: CodecJson[McGameVersionManifestGet200Response] = CodecJson.derive[McGameVersionManifestGet200Response]
  implicit val McGameVersionManifestGet200ResponseDecoder: EntityDecoder[McGameVersionManifestGet200Response] = jsonOf[McGameVersionManifestGet200Response]
  implicit val McGameVersionManifestGet200ResponseEncoder: EntityEncoder[McGameVersionManifestGet200Response] = jsonEncoderOf[McGameVersionManifestGet200Response]
}

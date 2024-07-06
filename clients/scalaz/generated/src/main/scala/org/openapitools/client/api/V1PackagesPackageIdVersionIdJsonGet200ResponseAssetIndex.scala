package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex._

case class V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex (
  id: Option[String],
sha1: Option[String],
size: Option[Integer],
totalSize: Option[Integer],
url: Option[String])

object V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex {
  import DateTimeCodecs._

  implicit val V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexCodecJson: CodecJson[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex] = CodecJson.derive[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex]
  implicit val V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexDecoder: EntityDecoder[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex] = jsonOf[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex]
  implicit val V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexEncoder: EntityEncoder[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex] = jsonEncoderOf[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex]
}

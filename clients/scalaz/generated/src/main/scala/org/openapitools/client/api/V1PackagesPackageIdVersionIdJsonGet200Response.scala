package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import V1PackagesPackageIdVersionIdJsonGet200Response._

case class V1PackagesPackageIdVersionIdJsonGet200Response (
  version: Option[String],
assetIndex: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex],
assets: Option[Integer],
complianceLevel: Option[Integer],
downloads: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads],
id: Option[String],
javaVersion: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion],
mainClass: Option[String],
minimumLauncherVersion: Option[Integer],
time: Option[OffsetDateTime],
releaseTime: Option[OffsetDateTime],
`type`: Option[String])

object V1PackagesPackageIdVersionIdJsonGet200Response {
  import DateTimeCodecs._

  implicit val V1PackagesPackageIdVersionIdJsonGet200ResponseCodecJson: CodecJson[V1PackagesPackageIdVersionIdJsonGet200Response] = CodecJson.derive[V1PackagesPackageIdVersionIdJsonGet200Response]
  implicit val V1PackagesPackageIdVersionIdJsonGet200ResponseDecoder: EntityDecoder[V1PackagesPackageIdVersionIdJsonGet200Response] = jsonOf[V1PackagesPackageIdVersionIdJsonGet200Response]
  implicit val V1PackagesPackageIdVersionIdJsonGet200ResponseEncoder: EntityEncoder[V1PackagesPackageIdVersionIdJsonGet200Response] = jsonEncoderOf[V1PackagesPackageIdVersionIdJsonGet200Response]
}

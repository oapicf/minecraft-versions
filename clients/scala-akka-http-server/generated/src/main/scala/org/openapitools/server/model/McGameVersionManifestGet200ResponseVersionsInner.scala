package org.openapitools.server.model

import java.time.OffsetDateTime

/**
 * @param id  for example: ''24w14potato''
 * @param `type`  for example: ''snapshot''
 * @param url  for example: ''https://piston-meta.mojang.com/v1/packages/21df7f4ba484a6437ab5e9dca0b4dfb5dcefc802/24w14potato.json''
 * @param time  for example: ''2024-04-01T11:14:41Z''
 * @param releaseTime  for example: ''2024-04-01T11:07:19Z''
*/
final case class McGameVersionManifestGet200ResponseVersionsInner (
  id: Option[String] = None,
  `type`: Option[String] = None,
  url: Option[String] = None,
  time: Option[OffsetDateTime] = None,
  releaseTime: Option[OffsetDateTime] = None
)


package org.openapitools.server.model


/**
 * @param release  for example: ''1.21''
 * @param snapshot  for example: ''24w14potato''
*/
final case class VersionManifestLatest (
  release: Option[String] = None,
  snapshot: Option[String] = None
)


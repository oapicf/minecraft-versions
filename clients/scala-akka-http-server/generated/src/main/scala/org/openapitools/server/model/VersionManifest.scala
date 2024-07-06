package org.openapitools.server.model


/**
 * @param latest  for example: ''null''
 * @param versions  for example: ''null''
*/
final case class VersionManifest (
  latest: Option[VersionManifestLatest] = None,
  versions: Option[Seq[Version]] = None
)


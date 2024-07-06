package org.openapitools.server.model


/**
 * @param latest  for example: ''null''
 * @param versions  for example: ''null''
*/
final case class McGameVersionManifestGet200Response (
  latest: Option[McGameVersionManifestGet200ResponseLatest] = None,
  versions: Option[Seq[McGameVersionManifestGet200ResponseVersionsInner]] = None
)


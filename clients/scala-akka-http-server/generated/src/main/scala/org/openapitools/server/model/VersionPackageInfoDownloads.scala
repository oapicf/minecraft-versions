package org.openapitools.server.model


/**
 * @param client  for example: ''null''
 * @param clientMappings  for example: ''null''
 * @param server  for example: ''null''
 * @param serverMappings  for example: ''null''
*/
final case class VersionPackageInfoDownloads (
  client: Option[Download] = None,
  clientMappings: Option[Download] = None,
  server: Option[Download] = None,
  serverMappings: Option[Download] = None
)


package org.openapitools.server.model


/**
 * @param component  for example: ''null''
 * @param majorVersion  for example: ''null''
*/
final case class VersionPackageInfoJavaVersion (
  component: Option[String] = None,
  majorVersion: Option[Int] = None
)


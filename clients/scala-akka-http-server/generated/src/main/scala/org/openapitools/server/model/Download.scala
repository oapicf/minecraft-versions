package org.openapitools.server.model


/**
 * @param sha1  for example: ''null''
 * @param size  for example: ''null''
 * @param url  for example: ''null''
*/
final case class Download (
  sha1: Option[String] = None,
  size: Option[Int] = None,
  url: Option[String] = None
)


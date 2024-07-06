package org.openapitools.server.model


/**
 * @param id  for example: ''null''
 * @param sha1  for example: ''null''
 * @param size  for example: ''null''
 * @param totalSize  for example: ''null''
 * @param url  for example: ''null''
*/
final case class V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex (
  id: Option[String] = None,
  sha1: Option[String] = None,
  size: Option[Int] = None,
  totalSize: Option[Int] = None,
  url: Option[String] = None
)


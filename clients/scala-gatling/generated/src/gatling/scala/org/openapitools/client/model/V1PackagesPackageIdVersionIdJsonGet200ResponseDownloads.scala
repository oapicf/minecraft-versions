
package org.openapitools.client.model


case class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads (
    _client: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient],
    _clientMappings: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient],
    _server: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient],
    _serverMappings: Option[V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient]
)
object V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads {
    def toStringBody(var_client: Object, var_clientMappings: Object, var_server: Object, var_serverMappings: Object) =
        s"""
        | {
        | "client":$var_client,"clientMappings":$var_clientMappings,"server":$var_server,"serverMappings":$var_serverMappings
        | }
        """.stripMargin
}

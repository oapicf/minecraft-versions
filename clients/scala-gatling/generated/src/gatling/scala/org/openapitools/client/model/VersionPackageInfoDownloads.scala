
package org.openapitools.client.model


case class VersionPackageInfoDownloads (
    _client: Option[Download],
    _clientMappings: Option[Download],
    _server: Option[Download],
    _serverMappings: Option[Download]
)
object VersionPackageInfoDownloads {
    def toStringBody(var_client: Object, var_clientMappings: Object, var_server: Object, var_serverMappings: Object) =
        s"""
        | {
        | "client":$var_client,"clientMappings":$var_clientMappings,"server":$var_server,"serverMappings":$var_serverMappings
        | }
        """.stripMargin
}

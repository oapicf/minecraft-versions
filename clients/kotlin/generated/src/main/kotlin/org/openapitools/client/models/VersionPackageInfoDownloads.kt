/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models

import org.openapitools.client.models.Download

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param client 
 * @param clientMappings 
 * @param server 
 * @param serverMappings 
 */


data class VersionPackageInfoDownloads (

    @Json(name = "client")
    val client: Download? = null,

    @Json(name = "client_mappings")
    val clientMappings: Download? = null,

    @Json(name = "server")
    val server: Download? = null,

    @Json(name = "server_mappings")
    val serverMappings: Download? = null

)


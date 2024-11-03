/**
* 
* SDK for Minecraft versions info
*
* The version of the OpenAPI document: 0.12.1-pre.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.api.model

import org.openapitools.server.api.model.Version
import org.openapitools.server.api.model.VersionManifestLatest

        
import com.google.gson.annotations.SerializedName
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonInclude
/**
 * 
 * @param latest 
 * @param versions 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
data class VersionManifest (
    val latest: VersionManifestLatest? = null,
    val versions: kotlin.Array<Version>? = null
) {

}


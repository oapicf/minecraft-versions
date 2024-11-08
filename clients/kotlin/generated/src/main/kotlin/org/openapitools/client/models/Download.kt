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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * 
 *
 * @param sha1 
 * @param propertySize 
 * @param url 
 */


data class Download (

    @Json(name = "sha1")
    val sha1: kotlin.String? = null,

    @Json(name = "size")
    val propertySize: kotlin.Int? = null,

    @Json(name = "url")
    val url: kotlin.String? = null

) {


}


/**
* 
* SDK for Minecraft versions info
*
* The version of the OpenAPI document: 0.9.0-pre.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.models

import org.openapitools.server.models.VersionPackageInfoAssetIndex
import org.openapitools.server.models.VersionPackageInfoDownloads
import org.openapitools.server.models.VersionPackageInfoJavaVersion

/**
 * 
 * @param version 
 * @param assetIndex 
 * @param assets 
 * @param complianceLevel 
 * @param downloads 
 * @param id 
 * @param javaVersion 
 * @param mainClass 
 * @param minimumLauncherVersion 
 * @param time 
 * @param releaseTime 
 * @param type 
 */
data class VersionPackageInfo(
    val version: kotlin.String? = null,
    val assetIndex: VersionPackageInfoAssetIndex? = null,
    val assets: kotlin.String? = null,
    val complianceLevel: kotlin.Int? = null,
    val downloads: VersionPackageInfoDownloads? = null,
    val id: kotlin.String? = null,
    val javaVersion: VersionPackageInfoJavaVersion? = null,
    val mainClass: kotlin.String? = null,
    val minimumLauncherVersion: kotlin.Int? = null,
    val time: java.time.OffsetDateTime? = null,
    val releaseTime: java.time.OffsetDateTime? = null,
    val type: kotlin.String? = null
) 


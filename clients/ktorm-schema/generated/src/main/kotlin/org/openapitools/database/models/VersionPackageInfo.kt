/**
* 
* SDK for Minecraft versions info
*
* The version of the OpenAPI document: 1.1.1-pre.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


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
object VersionPackageInfos : BaseTable<VersionPackageInfo>("VersionPackageInfo") {
    val version = text("version") /* null */
    val assetIndex = long("assetIndex") /* null */
    val assets = text("assets") /* null */
    val complianceLevel = int("complianceLevel") /* null */
    val downloads = long("downloads") /* null */
    val id = text("id") /* null */
    val javaVersion = long("javaVersion") /* null */
    val mainClass = text("mainClass") /* null */
    val minimumLauncherVersion = int("minimumLauncherVersion") /* null */
    val time = datetime("time") /* null */
    val releaseTime = datetime("releaseTime") /* null */
    val type = text("type") /* null */

    /**
     * Create an entity of type VersionPackageInfo from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = VersionPackageInfo(
        version = row[version]  /* kotlin.String? */,
        assetIndex = VersionPackageInfoAssetIndexs.createEntity(row, withReferences) /* VersionPackageInfoAssetIndex? */,
        assets = row[assets]  /* kotlin.String? */,
        complianceLevel = row[complianceLevel]  /* kotlin.Int? */,
        downloads = VersionPackageInfoDownloadss.createEntity(row, withReferences) /* VersionPackageInfoDownloads? */,
        id = row[id]  /* kotlin.String? */,
        javaVersion = VersionPackageInfoJavaVersions.createEntity(row, withReferences) /* VersionPackageInfoJavaVersion? */,
        mainClass = row[mainClass]  /* kotlin.String? */,
        minimumLauncherVersion = row[minimumLauncherVersion]  /* kotlin.Int? */,
        time = row[time]  /* java.time.LocalDateTime? */,
        releaseTime = row[releaseTime]  /* java.time.LocalDateTime? */,
        type = row[type]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type VersionPackageInfo to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = VersionPackageInfo()
    * database.update(VersionPackageInfos, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: VersionPackageInfo) {
        this.apply {
            set(VersionPackageInfos.version, entity.version)
            set(VersionPackageInfos.assetIndex, entity.assetIndex)
            set(VersionPackageInfos.assets, entity.assets)
            set(VersionPackageInfos.complianceLevel, entity.complianceLevel)
            set(VersionPackageInfos.downloads, entity.downloads)
            set(VersionPackageInfos.id, entity.id)
            set(VersionPackageInfos.javaVersion, entity.javaVersion)
            set(VersionPackageInfos.mainClass, entity.mainClass)
            set(VersionPackageInfos.minimumLauncherVersion, entity.minimumLauncherVersion)
            set(VersionPackageInfos.time, entity.time)
            set(VersionPackageInfos.releaseTime, entity.releaseTime)
            set(VersionPackageInfos.type, entity.type)
        }
    }

}



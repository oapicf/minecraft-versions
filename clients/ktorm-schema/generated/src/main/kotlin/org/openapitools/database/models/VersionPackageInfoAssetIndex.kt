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
package org.openapitools.database.models

import org.ktorm.dsl.*
import org.ktorm.schema.*
import org.ktorm.database.Database
import .*


/**
 * 
 * @param id 
 * @param sha1 
 * @param propertySize 
 * @param totalSize 
 * @param url 
 */
object VersionPackageInfoAssetIndexs : BaseTable<VersionPackageInfoAssetIndex>("VersionPackageInfo_assetIndex") {
    val id = text("id") /* null */
    val sha1 = text("sha1") /* null */
    val propertySize = int("size") /* null */
    val totalSize = int("totalSize") /* null */
    val url = text("url") /* null */

    /**
     * Create an entity of type VersionPackageInfoAssetIndex from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = VersionPackageInfoAssetIndex(
        id = row[id]  /* kotlin.String? */,
        sha1 = row[sha1]  /* kotlin.String? */,
        propertySize = row[propertySize]  /* kotlin.Int? */,
        totalSize = row[totalSize]  /* kotlin.Int? */,
        url = row[url]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type VersionPackageInfoAssetIndex to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = VersionPackageInfoAssetIndex()
    * database.update(VersionPackageInfoAssetIndexs, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: VersionPackageInfoAssetIndex) {
        this.apply {
            set(VersionPackageInfoAssetIndexs.id, entity.id)
            set(VersionPackageInfoAssetIndexs.sha1, entity.sha1)
            set(VersionPackageInfoAssetIndexs.propertySize, entity.propertySize)
            set(VersionPackageInfoAssetIndexs.totalSize, entity.totalSize)
            set(VersionPackageInfoAssetIndexs.url, entity.url)
        }
    }

}


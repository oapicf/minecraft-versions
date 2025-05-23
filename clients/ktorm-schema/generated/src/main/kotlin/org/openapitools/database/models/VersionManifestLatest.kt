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
 * @param release 
 * @param snapshot 
 */
object VersionManifestLatests : BaseTable<VersionManifestLatest>("VersionManifest_latest") {
    val release = text("release") /* null */
    val snapshot = text("snapshot") /* null */

    /**
     * Create an entity of type VersionManifestLatest from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = VersionManifestLatest(
        release = row[release]  /* kotlin.String? */,
        snapshot = row[snapshot]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type VersionManifestLatest to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = VersionManifestLatest()
    * database.update(VersionManifestLatests, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: VersionManifestLatest) {
        this.apply {
            set(VersionManifestLatests.release, entity.release)
            set(VersionManifestLatests.snapshot, entity.snapshot)
        }
    }

}



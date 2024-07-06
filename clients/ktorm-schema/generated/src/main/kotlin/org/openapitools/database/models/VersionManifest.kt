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
 * @param latest 
 * @param versions 
 */
object VersionManifests : BaseTable<VersionManifest>("VersionManifest") {
    val latest = long("latest") /* null */

    /**
     * Create an entity of type VersionManifest from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = VersionManifest(
        latest = VersionManifestLatests.createEntity(row, withReferences) /* VersionManifestLatest? */,
        versions = emptyList() /* kotlin.Array<Version>? */
    )

    /**
    * Assign all the columns from the entity of type VersionManifest to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = VersionManifest()
    * database.update(VersionManifests, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: VersionManifest) {
        this.apply {
            set(VersionManifests.latest, entity.latest)
        }
    }

}


object VersionManifestVersion : BaseTable<Pair<kotlin.Long, kotlin.Long>>("VersionManifestVersion") {
    val versionManifest = long("versionManifest")
    val version = long("version")

    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean): Pair<kotlin.Long, kotlin.Long> =
        Pair(row[versionManifest] ?: 0, row[version] ?: 0)

    fun AssignmentsBuilder.assignFrom(entity: Pair<kotlin.Long, kotlin.Long>) {
        this.apply {
            set(VersionManifestVersion.versionManifest, entity.first)
            set(VersionManifestVersion.version, entity.second)
        }
    }

}


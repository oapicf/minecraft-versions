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
 * @param type 
 * @param url 
 * @param time 
 * @param releaseTime 
 */
object McGameVersionManifestGet200ResponseVersionsInners : BaseTable<McGameVersionManifestGet200ResponseVersionsInner>("_mc_game_version_manifest_get_200_response_versions_inner") {
    val id = text("id") /* null */
    val type = text("type") /* null */
    val url = text("url") /* null */
    val time = datetime("time") /* null */
    val releaseTime = datetime("releaseTime") /* null */

    /**
     * Create an entity of type McGameVersionManifestGet200ResponseVersionsInner from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = McGameVersionManifestGet200ResponseVersionsInner(
        id = row[id]  /* kotlin.String? */,
        type = row[type]  /* kotlin.String? */,
        url = row[url]  /* kotlin.String? */,
        time = row[time]  /* java.time.LocalDateTime? */,
        releaseTime = row[releaseTime]  /* java.time.LocalDateTime? */
    )

    /**
    * Assign all the columns from the entity of type McGameVersionManifestGet200ResponseVersionsInner to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = McGameVersionManifestGet200ResponseVersionsInner()
    * database.update(McGameVersionManifestGet200ResponseVersionsInners, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: McGameVersionManifestGet200ResponseVersionsInner) {
        this.apply {
            set(McGameVersionManifestGet200ResponseVersionsInners.id, entity.id)
            set(McGameVersionManifestGet200ResponseVersionsInners.type, entity.type)
            set(McGameVersionManifestGet200ResponseVersionsInners.url, entity.url)
            set(McGameVersionManifestGet200ResponseVersionsInners.time, entity.time)
            set(McGameVersionManifestGet200ResponseVersionsInners.releaseTime, entity.releaseTime)
        }
    }

}


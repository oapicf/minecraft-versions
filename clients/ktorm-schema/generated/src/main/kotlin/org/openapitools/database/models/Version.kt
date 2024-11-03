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
object Versions : BaseTable<Version>("Version") {
    val id = text("id") /* null */
    val type = text("type") /* null */
    val url = text("url") /* null */
    val time = datetime("time") /* null */
    val releaseTime = datetime("releaseTime") /* null */

    /**
     * Create an entity of type Version from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = Version(
        id = row[id]  /* kotlin.String? */,
        type = row[type]  /* kotlin.String? */,
        url = row[url]  /* kotlin.String? */,
        time = row[time]  /* java.time.LocalDateTime? */,
        releaseTime = row[releaseTime]  /* java.time.LocalDateTime? */
    )

    /**
    * Assign all the columns from the entity of type Version to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = Version()
    * database.update(Versions, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: Version) {
        this.apply {
            set(Versions.id, entity.id)
            set(Versions.type, entity.type)
            set(Versions.url, entity.url)
            set(Versions.time, entity.time)
            set(Versions.releaseTime, entity.releaseTime)
        }
    }

}



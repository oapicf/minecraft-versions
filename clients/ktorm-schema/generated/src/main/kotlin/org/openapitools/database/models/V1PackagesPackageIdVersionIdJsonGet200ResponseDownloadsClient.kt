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
 * @param sha1 
 * @param propertySize 
 * @param url 
 */
object V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClients : BaseTable<V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient>("_v1_packages__packageId___versionId__json_get_200_response_downloads_client") {
    val sha1 = text("sha1") /* null */
    val propertySize = int("size") /* null */
    val url = text("url") /* null */

    /**
     * Create an entity of type V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient from the model
     */
    override fun doCreateEntity(row: QueryRowSet, withReferences: Boolean) = V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient(
        sha1 = row[sha1]  /* kotlin.String? */,
        propertySize = row[propertySize]  /* kotlin.Int? */,
        url = row[url]  /* kotlin.String? */
    )

    /**
    * Assign all the columns from the entity of type V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient to the DML expression.
    *
    * Usage:
    *
    * ```kotlin
    * let entity = V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient()
    * database.update(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClients, {
    *     assignFrom(entity)
    * })
    * ```
    * @return the builder with the columns for the update or insert.
    */
    fun AssignmentsBuilder.assignFrom(entity: V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient) {
        this.apply {
            set(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClients.sha1, entity.sha1)
            set(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClients.propertySize, entity.propertySize)
            set(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClients.url, entity.url)
        }
    }

}


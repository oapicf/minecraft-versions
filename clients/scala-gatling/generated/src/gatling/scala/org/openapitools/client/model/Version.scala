
package org.openapitools.client.model

import java.time.OffsetDateTime

case class Version (
    _id: Option[String],
    _type: Option[String],
    _url: Option[String],
    _time: Option[OffsetDateTime],
    _releaseTime: Option[OffsetDateTime]
)
object Version {
    def toStringBody(var_id: Object, var_type: Object, var_url: Object, var_time: Object, var_releaseTime: Object) =
        s"""
        | {
        | "id":$var_id,"type":$var_type,"url":$var_url,"time":$var_time,"releaseTime":$var_releaseTime
        | }
        """.stripMargin
}

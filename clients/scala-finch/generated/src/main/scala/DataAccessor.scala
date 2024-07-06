package org.openapitools

// TODO: properly handle custom imports
import java.io._
import java.util.UUID
import java.time._
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}

import org.openapitools.models._

trait DataAccessor {
    // TODO: apiInfo -> apis -> operations = TODO error
    private object TODO extends CommonError("Not implemented") {
        def message = "Not implemented"
    }

        /**
        * 
        * @return A VersionManifest
        */
        def Default_getMinecraftVersionManifest(): Either[CommonError,VersionManifest] = Left(TODO)

        /**
        * 
        * @return A VersionPackageInfo
        */
        def Default_getMinecraftVersionPackageInfo(packageId: String, versionId: String): Either[CommonError,VersionPackageInfo] = Left(TODO)

}
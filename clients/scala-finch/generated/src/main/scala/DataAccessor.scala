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
        * @return A GetMinecraftVersionManifest200Response
        */
        def Default_getMinecraftVersionManifest(): Either[CommonError,GetMinecraftVersionManifest200Response] = Left(TODO)

        /**
        * 
        * @return A V1PackagesPackageIdVersionIdJsonGet200Response
        */
        def Default_v1PackagesPackageIdVersionIdJsonGet(packageId: String, versionId: String): Either[CommonError,V1PackagesPackageIdVersionIdJsonGet200Response] = Left(TODO)

}
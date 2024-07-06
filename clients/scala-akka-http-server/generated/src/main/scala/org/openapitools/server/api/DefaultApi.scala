package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.GetMinecraftVersionManifest200Response
import org.openapitools.server.model.V1PackagesPackageIdVersionIdJsonGet200Response


class DefaultApi(
    defaultService: DefaultApiService,
    defaultMarshaller: DefaultApiMarshaller
) {

  
  import defaultMarshaller._

  lazy val route: Route =
    path("mc" / "game" / "version_manifest.json") { 
      get {  
            defaultService.getMinecraftVersionManifest()
      }
    } ~
    path("v1" / "packages" / Segment / "{versionId}.json") { (packageId, versionId) => 
      get {  
            defaultService.v1PackagesPackageIdVersionIdJsonGet(packageId = packageId, versionId = versionId)
      }
    }
}


trait DefaultApiService {

  def getMinecraftVersionManifest200(responseGetMinecraftVersionManifest200Response: GetMinecraftVersionManifest200Response)(implicit toEntityMarshallerGetMinecraftVersionManifest200Response: ToEntityMarshaller[GetMinecraftVersionManifest200Response]): Route =
    complete((200, responseGetMinecraftVersionManifest200Response))
  /**
   * Code: 200, Message: A list of Minecraft versions with the latest and snapshot releases, DataType: GetMinecraftVersionManifest200Response
   */
  def getMinecraftVersionManifest()
      (implicit toEntityMarshallerGetMinecraftVersionManifest200Response: ToEntityMarshaller[GetMinecraftVersionManifest200Response]): Route

  def v1PackagesPackageIdVersionIdJsonGet200(responseV1PackagesPackageIdVersionIdJsonGet200Response: V1PackagesPackageIdVersionIdJsonGet200Response)(implicit toEntityMarshallerV1PackagesPackageIdVersionIdJsonGet200Response: ToEntityMarshaller[V1PackagesPackageIdVersionIdJsonGet200Response]): Route =
    complete((200, responseV1PackagesPackageIdVersionIdJsonGet200Response))
  /**
   * Code: 200, Message: Get package version details, DataType: V1PackagesPackageIdVersionIdJsonGet200Response
   */
  def v1PackagesPackageIdVersionIdJsonGet(packageId: String, versionId: String)
      (implicit toEntityMarshallerV1PackagesPackageIdVersionIdJsonGet200Response: ToEntityMarshaller[V1PackagesPackageIdVersionIdJsonGet200Response]): Route

}

trait DefaultApiMarshaller {


  implicit def toEntityMarshallerV1PackagesPackageIdVersionIdJsonGet200Response: ToEntityMarshaller[V1PackagesPackageIdVersionIdJsonGet200Response]

  implicit def toEntityMarshallerGetMinecraftVersionManifest200Response: ToEntityMarshaller[GetMinecraftVersionManifest200Response]

}


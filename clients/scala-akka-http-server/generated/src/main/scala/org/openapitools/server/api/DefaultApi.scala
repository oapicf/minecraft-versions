package org.openapitools.server.api

import akka.http.scaladsl.server.Directives._
import akka.http.scaladsl.server.Route
import akka.http.scaladsl.model.StatusCodes
import akka.http.scaladsl.marshalling.ToEntityMarshaller
import akka.http.scaladsl.unmarshalling.FromEntityUnmarshaller
import akka.http.scaladsl.unmarshalling.FromStringUnmarshaller
import org.openapitools.server.AkkaHttpHelper._
import org.openapitools.server.model.VersionManifest
import org.openapitools.server.model.VersionPackageInfo


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
            defaultService.getMinecraftVersionPackageInfo(packageId = packageId, versionId = versionId)
      }
    }
}


trait DefaultApiService {

  def getMinecraftVersionManifest200(responseVersionManifest: VersionManifest)(implicit toEntityMarshallerVersionManifest: ToEntityMarshaller[VersionManifest]): Route =
    complete((200, responseVersionManifest))
  /**
   * Code: 200, Message: A list of Minecraft versions with the latest and snapshot releases, DataType: VersionManifest
   */
  def getMinecraftVersionManifest()
      (implicit toEntityMarshallerVersionManifest: ToEntityMarshaller[VersionManifest]): Route

  def getMinecraftVersionPackageInfo200(responseVersionPackageInfo: VersionPackageInfo)(implicit toEntityMarshallerVersionPackageInfo: ToEntityMarshaller[VersionPackageInfo]): Route =
    complete((200, responseVersionPackageInfo))
  /**
   * Code: 200, Message: Get package version details, DataType: VersionPackageInfo
   */
  def getMinecraftVersionPackageInfo(packageId: String, versionId: String)
      (implicit toEntityMarshallerVersionPackageInfo: ToEntityMarshaller[VersionPackageInfo]): Route

}

trait DefaultApiMarshaller {


  implicit def toEntityMarshallerVersionManifest: ToEntityMarshaller[VersionManifest]

  implicit def toEntityMarshallerVersionPackageInfo: ToEntityMarshaller[VersionPackageInfo]

}


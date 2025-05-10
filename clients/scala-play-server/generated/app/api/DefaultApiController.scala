package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.VersionManifest
import model.VersionPackageInfo

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T01:45:35.288154528Z[Etc/UTC]", comments = "Generator version: 7.12.0")
@Singleton
class DefaultApiController @Inject()(cc: ControllerComponents, api: DefaultApi) extends AbstractController(cc) {
  /**
    * GET /mc/game/version_manifest.json
    */
  def getMinecraftVersionManifest(): Action[AnyContent] = Action { request =>
    def executeApi(): VersionManifest = {
      api.getMinecraftVersionManifest()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/packages/:packageId/:versionId.json
    */
  def getMinecraftVersionPackageInfo(packageId: String, versionId: String): Action[AnyContent] = Action { request =>
    def executeApi(): VersionPackageInfo = {
      api.getMinecraftVersionPackageInfo(packageId, versionId)
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  private def splitCollectionParam(paramValues: String, collectionFormat: String): List[String] = {
    val splitBy =
      collectionFormat match {
        case "csv" => ",+"
        case "tsv" => "\t+"
        case "ssv" => " +"
        case "pipes" => "|+"
      }

    paramValues.split(splitBy).toList
  }
}

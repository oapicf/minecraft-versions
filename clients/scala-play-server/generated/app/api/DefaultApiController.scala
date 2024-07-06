package api

import org.openapitools.OpenApiExceptions
import javax.inject.{Inject, Singleton}
import play.api.libs.json._
import play.api.mvc._
import model.McGameVersionManifestGet200Response
import model.V1PackagesPackageIdVersionIdJsonGet200Response

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-07-06T01:37:06.044701330Z[Etc/UTC]", comments = "Generator version: 7.6.0")
@Singleton
class DefaultApiController @Inject()(cc: ControllerComponents, api: DefaultApi) extends AbstractController(cc) {
  /**
    * GET /mc/game/version_manifest
    */
  def mcGameVersionManifestGet(): Action[AnyContent] = Action { request =>
    def executeApi(): McGameVersionManifestGet200Response = {
      api.mcGameVersionManifestGet()
    }

    val result = executeApi()
    val json = Json.toJson(result)
    Ok(json)
  }

  /**
    * GET /v1/packages/:packageId/:versionId.json
    */
  def v1PackagesPackageIdVersionIdJsonGet(packageId: String, versionId: String): Action[AnyContent] = Action { request =>
    def executeApi(): V1PackagesPackageIdVersionIdJsonGet200Response = {
      api.v1PackagesPackageIdVersionIdJsonGet(packageId, versionId)
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

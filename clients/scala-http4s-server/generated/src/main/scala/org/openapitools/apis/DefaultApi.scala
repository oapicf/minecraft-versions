package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.GetMinecraftVersionManifest200Response
import org.openapitools.models.V1PackagesPackageIdVersionIdJsonGet200Response


import cats.Monad
import cats.syntax.all._

import org.http4s._
import org.http4s.circe._
import org.http4s.server._
import org.http4s.headers._
import org.http4s.dsl.Http4sDsl
import org.http4s.circe.CirceEntityEncoder._

final case class DefaultApiRoutes[
  F[_]: JsonDecoder: Monad
](delegate: DefaultApiDelegate[F]) extends Http4sDsl[F] {
  object getMinecraftVersionManifest {
    import DefaultApiDelegate.getMinecraftVersionManifestResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "mc" / "game" / "version_manifest.json" =>
        delegate.getMinecraftVersionManifest.handle(req, responses)

    }


    val responses: getMinecraftVersionManifestResponses[F] = new getMinecraftVersionManifestResponses[F] {
      def resp200(value: GetMinecraftVersionManifest200Response): F[Response[F]] = Ok(value)
    }
  }
  object v1PackagesPackageIdVersionIdJsonGet {
    import DefaultApiDelegate.v1PackagesPackageIdVersionIdJsonGetResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "v1" / "packages" / packageId / "{versionId}.json" =>
        delegate.v1PackagesPackageIdVersionIdJsonGet.handle(req, packageId, versionId, responses)

    }


    val responses: v1PackagesPackageIdVersionIdJsonGetResponses[F] = new v1PackagesPackageIdVersionIdJsonGetResponses[F] {
      def resp200(value: V1PackagesPackageIdVersionIdJsonGet200Response): F[Response[F]] = Ok(value)
    }
  }

  val routes =
    getMinecraftVersionManifest.route <+>
    v1PackagesPackageIdVersionIdJsonGet.route
}

object DefaultApiDelegate {
  trait getMinecraftVersionManifestResponses[F[_]] {
    def resp200(value: GetMinecraftVersionManifest200Response): F[Response[F]]
  }

  trait v1PackagesPackageIdVersionIdJsonGetResponses[F[_]] {
    def resp200(value: V1PackagesPackageIdVersionIdJsonGet200Response): F[Response[F]]
  }

}

trait DefaultApiDelegate[F[_]] {

  trait getMinecraftVersionManifest {
    import DefaultApiDelegate.getMinecraftVersionManifestResponses

    def handle(
      req: Request[F],
      responses: getMinecraftVersionManifestResponses[F]
    ): F[Response[F]]

  }
  def getMinecraftVersionManifest: getMinecraftVersionManifest


  trait v1PackagesPackageIdVersionIdJsonGet {
    import DefaultApiDelegate.v1PackagesPackageIdVersionIdJsonGetResponses

    def handle(
      req: Request[F],
      packageId: String,
      versionId: ,
      responses: v1PackagesPackageIdVersionIdJsonGetResponses[F]
    ): F[Response[F]]

  }
  def v1PackagesPackageIdVersionIdJsonGet: v1PackagesPackageIdVersionIdJsonGet

}
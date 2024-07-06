package org.openapitools.apis

import org.openapitools.apis.path._
import org.openapitools.apis.query._

import org.openapitools.models.VersionManifest
import org.openapitools.models.VersionPackageInfo


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
      def resp200(value: VersionManifest): F[Response[F]] = Ok(value)
    }
  }
  object getMinecraftVersionPackageInfo {
    import DefaultApiDelegate.getMinecraftVersionPackageInfoResponses


    val route = HttpRoutes.of[F] {
      case req @ GET -> Root / "v1" / "packages" / packageId / "{versionId}.json" =>
        delegate.getMinecraftVersionPackageInfo.handle(req, packageId, versionId, responses)

    }


    val responses: getMinecraftVersionPackageInfoResponses[F] = new getMinecraftVersionPackageInfoResponses[F] {
      def resp200(value: VersionPackageInfo): F[Response[F]] = Ok(value)
    }
  }

  val routes =
    getMinecraftVersionManifest.route <+>
    getMinecraftVersionPackageInfo.route
}

object DefaultApiDelegate {
  trait getMinecraftVersionManifestResponses[F[_]] {
    def resp200(value: VersionManifest): F[Response[F]]
  }

  trait getMinecraftVersionPackageInfoResponses[F[_]] {
    def resp200(value: VersionPackageInfo): F[Response[F]]
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


  trait getMinecraftVersionPackageInfo {
    import DefaultApiDelegate.getMinecraftVersionPackageInfoResponses

    def handle(
      req: Request[F],
      packageId: String,
      versionId: ,
      responses: getMinecraftVersionPackageInfoResponses[F]
    ): F[Response[F]]

  }
  def getMinecraftVersionPackageInfo: getMinecraftVersionPackageInfo

}
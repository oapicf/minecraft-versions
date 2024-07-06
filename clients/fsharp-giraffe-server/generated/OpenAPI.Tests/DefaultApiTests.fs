namespace OpenAPI.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open Newtonsoft
open TestHelper
open DefaultApiHandlerTestsHelper
open OpenAPI.DefaultApiHandler
open OpenAPI.DefaultApiHandlerParams
open OpenAPI.Model.McGameVersionManifestGet200Response
open OpenAPI.Model.V1PackagesPackageIdVersionIdJsonGet200Response

module DefaultApiHandlerTests =

  // ---------------------------------
  // Tests
  // ---------------------------------

  [<Fact>]
  let ``McGameVersionManifestGet - Get Minecraft version manifest returns 200 where A list of Minecraft versions with the latest and snapshot releases`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/mc/game/version_manifest"

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

  [<Fact>]
  let ``V1PackagesPackageIdVersionIdJsonGet - Get Minecraft version package details returns 200 where Get package version details`` () =
    task {
      use server = new TestServer(createHost())
      use client = server.CreateClient()

      // add your setup code here

      let path = "/v1/packages/{packageId}/{versionId}.json".Replace("packageId", "ADDME").Replace("versionId", "ADDME")

      HttpGet client path
        |> isStatus (enum<HttpStatusCode>(200))
        |> readText
        |> shouldEqual "TESTME"
        |> ignore
      }

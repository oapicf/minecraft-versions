using System.IO;
using System.Net;
using System.Threading.Tasks;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Http;
using Microsoft.AspNetCore.Mvc;
using Microsoft.Azure.WebJobs;
using Microsoft.Azure.WebJobs.Extensions.Http;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Attributes;
using Microsoft.Azure.WebJobs.Extensions.OpenApi.Core.Enums;
using Microsoft.Extensions.Logging;
using Microsoft.OpenApi.Models;
using Newtonsoft.Json;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Functions
{ 
    public partial class DefaultApi
    { 
        [FunctionName("DefaultApi_GetMinecraftVersionManifest")]
        public async Task<ActionResult<VersionManifest>> _GetMinecraftVersionManifest([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "mc/game/version_manifest.json")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("GetMinecraftVersionManifest");
            return method != null
                ? (await ((Task<VersionManifest>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("DefaultApi_GetMinecraftVersionPackageInfo")]
        public async Task<ActionResult<VersionPackageInfo>> _GetMinecraftVersionPackageInfo([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1/packages/{packageId}/{versionId}.json")]HttpRequest req, ExecutionContext context, string packageId, string versionId)
        {
            var method = this.GetType().GetMethod("GetMinecraftVersionPackageInfo");
            return method != null
                ? (await ((Task<VersionPackageInfo>)method.Invoke(this, new object[] { req, context, packageId, versionId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}

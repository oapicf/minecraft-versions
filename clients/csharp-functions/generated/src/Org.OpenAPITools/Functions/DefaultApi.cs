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
        [FunctionName("DefaultApi_McGameVersionManifestGet")]
        public async Task<ActionResult<McGameVersionManifestGet200Response>> _McGameVersionManifestGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "mc/game/version_manifest")]HttpRequest req, ExecutionContext context)
        {
            var method = this.GetType().GetMethod("McGameVersionManifestGet");
            return method != null
                ? (await ((Task<McGameVersionManifestGet200Response>)method.Invoke(this, new object[] { req, context })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }

        [FunctionName("DefaultApi_V1PackagesPackageIdVersionIdJsonGet")]
        public async Task<ActionResult<V1PackagesPackageIdVersionIdJsonGet200Response>> _V1PackagesPackageIdVersionIdJsonGet([HttpTrigger(AuthorizationLevel.Anonymous, "Get", Route = "v1/packages/{packageId}/{versionId}.json")]HttpRequest req, ExecutionContext context, string packageId, string versionId)
        {
            var method = this.GetType().GetMethod("V1PackagesPackageIdVersionIdJsonGet");
            return method != null
                ? (await ((Task<V1PackagesPackageIdVersionIdJsonGet200Response>)method.Invoke(this, new object[] { req, context, packageId, versionId })).ConfigureAwait(false))
                : new StatusCodeResult((int)HttpStatusCode.NotImplemented);
        }
    }
}

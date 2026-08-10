
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class GetMinecraftVersionManifestRequest
{
}
public class GetMinecraftVersionPackageInfoRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("packageId")]
    public string PackageId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("versionId")]
    public string VersionId { get; set; }
}



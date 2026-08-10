using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Get Minecraft version manifest
/// </summary>

public class GetMinecraftVersionManifestEndpoint : FastEndpoints.EndpointWithoutRequest<VersionManifest>
{
    public override void Configure()
    {
        Get("/mc/game/version_manifest.json");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("default");
        });

        Summary(s => {
            s.Summary = "Get Minecraft version manifest";
            s.Responses[200] = "A list of Minecraft versions with the latest and snapshot releases";
        });
    }

    public override async Task HandleAsync(CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get Minecraft version package info
/// </summary>

public class GetMinecraftVersionPackageInfoEndpoint : FastEndpoints.Endpoint<GetMinecraftVersionPackageInfoRequest, VersionPackageInfo>
{
    public override void Configure()
    {
        Get("/v1/packages/{packageId}/{versionId}.json");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("default");
        });

        Summary(s => {
            s.Summary = "Get Minecraft version package info";
            s.RequestParam(r => r.PackageId, "");
            s.RequestParam(r => r.VersionId, "");
            s.Responses[200] = "Get package version details";
        });
    }

    public override async Task HandleAsync(GetMinecraftVersionPackageInfoRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


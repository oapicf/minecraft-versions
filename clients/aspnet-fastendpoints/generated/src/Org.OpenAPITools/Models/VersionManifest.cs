namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class VersionManifest 
{
    public VersionManifestLatest Latest { get; set; }
    public List<ModelVersion> Versions { get; set; }
}



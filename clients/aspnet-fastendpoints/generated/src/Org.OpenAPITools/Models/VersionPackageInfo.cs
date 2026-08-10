namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class VersionPackageInfo 
{
    public string VarVersion { get; set; }
    public VersionPackageInfoAssetIndex AssetIndex { get; set; }
    public string Assets { get; set; }
    public int ComplianceLevel { get; set; }
    public VersionPackageInfoDownloads Downloads { get; set; }
    public string Id { get; set; }
    public VersionPackageInfoJavaVersion JavaVersion { get; set; }
    public string MainClass { get; set; }
    public int MinimumLauncherVersion { get; set; }
    public DateTime Time { get; set; }
    public DateTime ReleaseTime { get; set; }
    public string Type { get; set; }
}



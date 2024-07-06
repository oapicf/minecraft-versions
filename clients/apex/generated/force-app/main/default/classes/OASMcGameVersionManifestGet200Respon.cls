/*
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by the OAS code generator program.
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

/**
 * OASMcGameVersionManifestGet200Respon
 */
public class OASMcGameVersionManifestGet200Respon {
    /**
     * Get latest
     * @return latest
     */
    public OASMcGameVersionManifestGet200Respon latest { get; set; }

    /**
     * Get versions
     * @return versions
     */
    public List<OASMcGameVersionManifestGet200Respon> versions { get; set; }

    public OASMcGameVersionManifestGet200Respon() {
        versions = new List<OASMcGameVersionManifestGet200Respon>();
    }

    public static OASMcGameVersionManifestGet200Respon getExample() {
        OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response = new OASMcGameVersionManifestGet200Respon();
          mcGameVersionManifestGet200Response.latest = OASMcGameVersionManifestGet200Respon.getExample();
          mcGameVersionManifestGet200Response.versions = new List<OASMcGameVersionManifestGet200Respon>{OASMcGameVersionManifestGet200Respon.getExample()};
        return mcGameVersionManifestGet200Response;
    }

    public Boolean equals(Object obj) {
        if (obj instanceof OASMcGameVersionManifestGet200Respon) {           
            OASMcGameVersionManifestGet200Respon mcGameVersionManifestGet200Response = (OASMcGameVersionManifestGet200Respon) obj;
            return this.latest == mcGameVersionManifestGet200Response.latest
                && this.versions == mcGameVersionManifestGet200Response.versions;
        }
        return false;
    }

    public Integer hashCode() {
        Integer hashCode = 43;
        hashCode = (17 * hashCode) + (latest == null ? 0 : System.hashCode(latest));
        hashCode = (17 * hashCode) + (versions == null ? 0 : System.hashCode(versions));
        return hashCode;
    }
}

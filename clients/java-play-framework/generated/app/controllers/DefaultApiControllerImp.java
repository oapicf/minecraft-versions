package controllers;

import apimodels.GetMinecraftVersionManifest200Response;
import apimodels.V1PackagesPackageIdVersionIdJsonGet200Response;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-07-06T08:44:44.955840895Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class DefaultApiControllerImp extends DefaultApiControllerImpInterface {
    @Override
    public GetMinecraftVersionManifest200Response getMinecraftVersionManifest(Http.Request request) throws Exception {
        //Do your magic!!!
        return new GetMinecraftVersionManifest200Response();
    }

    @Override
    public V1PackagesPackageIdVersionIdJsonGet200Response v1PackagesPackageIdVersionIdJsonGet(Http.Request request, String packageId, String versionId) throws Exception {
        //Do your magic!!!
        return new V1PackagesPackageIdVersionIdJsonGet200Response();
    }

}

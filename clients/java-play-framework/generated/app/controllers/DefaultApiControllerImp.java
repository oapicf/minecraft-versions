package controllers;

import apimodels.VersionManifest;
import apimodels.VersionPackageInfo;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.io.FileInputStream;
import play.libs.Files.TemporaryFile;
import javax.validation.constraints.*;
import javax.validation.Valid;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-07-06T11:27:26.874139354Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class DefaultApiControllerImp extends DefaultApiControllerImpInterface {
    @Override
    public VersionManifest getMinecraftVersionManifest(Http.Request request) throws Exception {
        //Do your magic!!!
        return new VersionManifest();
    }

    @Override
    public VersionPackageInfo getMinecraftVersionPackageInfo(Http.Request request, String packageId, String versionId) throws Exception {
        //Do your magic!!!
        return new VersionPackageInfo();
    }

}

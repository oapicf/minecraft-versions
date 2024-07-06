package controllers;

import apimodels.VersionManifest;
import apimodels.VersionPackageInfo;

import com.google.inject.Inject;
import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import play.mvc.Result;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import openapitools.OpenAPIUtils;
import openapitools.SecurityAPIUtils;
import static play.mvc.Results.ok;
import static play.mvc.Results.unauthorized;
import play.libs.Files.TemporaryFile;

import javax.validation.constraints.*;
import javax.validation.Valid;

@SuppressWarnings("RedundantThrows")
public abstract class DefaultApiControllerImpInterface {
    @Inject private Config configuration;
    @Inject private SecurityAPIUtils securityAPIUtils;
    private ObjectMapper mapper = new ObjectMapper();

    public Result getMinecraftVersionManifestHttp(Http.Request request) throws Exception {
        VersionManifest obj = getMinecraftVersionManifest(request);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract VersionManifest getMinecraftVersionManifest(Http.Request request) throws Exception;

    public Result getMinecraftVersionPackageInfoHttp(Http.Request request, String packageId, String versionId) throws Exception {
        VersionPackageInfo obj = getMinecraftVersionPackageInfo(request, packageId, versionId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract VersionPackageInfo getMinecraftVersionPackageInfo(Http.Request request, String packageId, String versionId) throws Exception;

}

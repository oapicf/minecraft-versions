package controllers;

import apimodels.McGameVersionManifestGet200Response;
import apimodels.V1PackagesPackageIdVersionIdJsonGet200Response;

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

    public Result mcGameVersionManifestGetHttp(Http.Request request) throws Exception {
        McGameVersionManifestGet200Response obj = mcGameVersionManifestGet(request);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract McGameVersionManifestGet200Response mcGameVersionManifestGet(Http.Request request) throws Exception;

    public Result v1PackagesPackageIdVersionIdJsonGetHttp(Http.Request request, String packageId, String versionId) throws Exception {
        V1PackagesPackageIdVersionIdJsonGet200Response obj = v1PackagesPackageIdVersionIdJsonGet(request, packageId, versionId);

        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }

        JsonNode result = mapper.valueToTree(obj);

        return ok(result);

    }

    public abstract V1PackagesPackageIdVersionIdJsonGet200Response v1PackagesPackageIdVersionIdJsonGet(Http.Request request, String packageId, String versionId) throws Exception;

}

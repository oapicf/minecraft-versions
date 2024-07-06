package controllers;

import apimodels.McGameVersionManifestGet200Response;
import apimodels.V1PackagesPackageIdVersionIdJsonGet200Response;

import com.typesafe.config.Config;
import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import play.libs.Files.TemporaryFile;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import javax.validation.Valid;
import com.typesafe.config.Config;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-07-06T01:32:47.203764015Z[Etc/UTC]", comments = "Generator version: 7.6.0")
public class DefaultApiController extends Controller {
    private final DefaultApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Config configuration;

    @Inject
    private DefaultApiController(Config configuration, DefaultApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }

    @ApiAction
    public Result mcGameVersionManifestGet(Http.Request request) throws Exception {
        return imp.mcGameVersionManifestGetHttp(request);
    }

    @ApiAction
    public Result v1PackagesPackageIdVersionIdJsonGet(Http.Request request, String packageId,String versionId) throws Exception {
        return imp.v1PackagesPackageIdVersionIdJsonGetHttp(request, packageId, versionId);
    }

}

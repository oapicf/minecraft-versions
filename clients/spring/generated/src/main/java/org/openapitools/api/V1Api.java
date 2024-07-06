/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.6.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.V1PackagesPackageIdVersionIdJsonGet200Response;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-07-06T01:37:22.360466048Z[Etc/UTC]", comments = "Generator version: 7.6.0")
@Validated
@Tag(name = "v1", description = "the v1 API")
public interface V1Api {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * GET /v1/packages/{packageId}/{versionId}.json : Get Minecraft version package details
     *
     * @param packageId  (required)
     * @param versionId  (required)
     * @return Get package version details (status code 200)
     */
    @Operation(
        operationId = "v1PackagesPackageIdVersionIdJsonGet",
        summary = "Get Minecraft version package details",
        responses = {
            @ApiResponse(responseCode = "200", description = "Get package version details", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = V1PackagesPackageIdVersionIdJsonGet200Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/v1/packages/{packageId}/{versionId}.json",
        produces = { "application/json" }
    )
    
    default ResponseEntity<V1PackagesPackageIdVersionIdJsonGet200Response> v1PackagesPackageIdVersionIdJsonGet(
        @Parameter(name = "packageId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("packageId") String packageId,
        @Parameter(name = "versionId", description = "", required = true, in = ParameterIn.PATH) @PathVariable("versionId") String versionId
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"assets\" : 1, \"releaseTime\" : \"2024-04-01T11:07:19Z\", \"mainClass\" : \"net.minecraft.client.main.Main\", \"downloads\" : { \"server\" : { \"sha1\" : \"sha1\", \"size\" : 5, \"url\" : \"url\" }, \"server_mappings\" : { \"sha1\" : \"sha1\", \"size\" : 5, \"url\" : \"url\" }, \"client\" : { \"sha1\" : \"sha1\", \"size\" : 5, \"url\" : \"url\" }, \"client_mappings\" : { \"sha1\" : \"sha1\", \"size\" : 5, \"url\" : \"url\" } }, \"javaVersion\" : { \"component\" : \"component\", \"majorVersion\" : 2 }, \"complianceLevel\" : 5, \"minimumLauncherVersion\" : 21, \"assetIndex\" : { \"sha1\" : \"sha1\", \"totalSize\" : 6, \"size\" : 0, \"id\" : \"id\", \"url\" : \"url\" }, \"id\" : \"id\", \"time\" : \"2024-04-01T11:14:41Z\", \"type\" : \"snapshot\", \"version\" : \"version\" }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}

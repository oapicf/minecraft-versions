package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.VersionManifest;
import com.prokarma.pkmst.model.VersionPackageInfo;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-07-06T11:27:23.989034760Z[Etc/UTC]", comments = "Generator version: 7.6.0")
@Controller
public class DefaultApiController implements DefaultApi {
    private final ObjectMapper objectMapper;
@Autowired
    public DefaultApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<VersionManifest> getMinecraftVersionManifest(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<VersionManifest>(objectMapper.readValue("", VersionManifest.class), HttpStatus.OK);
        }

        return new ResponseEntity<VersionManifest>(HttpStatus.OK);
    }

    public ResponseEntity<VersionPackageInfo> getMinecraftVersionPackageInfo(@ApiParam(value = "",required=true ) @PathVariable("packageId") String packageId,
        @ApiParam(value = "",required=true ) @PathVariable("versionId") String versionId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<VersionPackageInfo>(objectMapper.readValue("", VersionPackageInfo.class), HttpStatus.OK);
        }

        return new ResponseEntity<VersionPackageInfo>(HttpStatus.OK);
    }

}

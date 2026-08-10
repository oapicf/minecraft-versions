package org.openapitools.api.consumer;

import org.openapitools.model.VersionPackageInfo;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.V1Service;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

@RestController
@RequestMapping("/v1")
public class V1ServiceController {

    @DubboReference
    private V1Service v1Service;

    @RequestMapping(method = RequestMethod.GET, value = "/packages/{packageId}/{versionId}.json")
    public VersionPackageInfo getMinecraftVersionPackageInfo(
        @RequestParam(name = "packageId") String packageId,
        @RequestParam(name = "versionId") String versionId
    ) {
        return v1Service.getMinecraftVersionPackageInfo(packageId, versionId);
    }
}

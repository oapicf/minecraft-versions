package org.openapitools.api.consumer;

import org.openapitools.model.VersionManifest;
import org.openapitools.model.*;
import org.openapitools.api.interfaces.McService;
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
@RequestMapping("/mc")
public class McServiceController {

    @DubboReference
    private McService mcService;

    @RequestMapping(method = RequestMethod.GET, value = "/game/version_manifest.json")
    public VersionManifest getMinecraftVersionManifest(
    ) {
        return mcService.getMinecraftVersionManifest();
    }
}

package org.openapitools.api.interfaces;

import org.openapitools.model.VersionPackageInfo;
import org.openapitools.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;
import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.annotation.Generated;


@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

public interface V1Service {

    /**
     * Get Minecraft version package info
     * 
     *
     * @param packageId  (required)
     * @param versionId  (required)
     * @return VersionPackageInfo
     */
    VersionPackageInfo getMinecraftVersionPackageInfo(
        String packageId,
        String versionId
    );
}

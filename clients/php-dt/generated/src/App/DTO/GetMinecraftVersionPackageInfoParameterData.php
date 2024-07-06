<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 * Parameters for getMinecraftVersionPackageInfo
 */
class GetMinecraftVersionPackageInfoParameterData
{
    /**
     * @DTA\Data(subset="path", field="versionId")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $version_id = null;

    /**
     * @DTA\Data(subset="path", field="packageId")
     * @DTA\Strategy(subset="path", name="QueryStringScalar", options={"type":"string"})
     * @DTA\Validator(subset="path", name="QueryStringScalar", options={"type":"string"})
     */
    public ?string $package_id = null;

}

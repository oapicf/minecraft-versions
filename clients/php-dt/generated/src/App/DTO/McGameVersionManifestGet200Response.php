<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class McGameVersionManifestGet200Response
{
    /**
     * @DTA\Data(field="latest", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\McGameVersionManifestGet200ResponseLatest::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\McGameVersionManifestGet200ResponseLatest::class})
     */
    public ?\App\DTO\McGameVersionManifestGet200ResponseLatest $latest = null;

    /**
     * @DTA\Data(field="versions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection::class})
     */
    public ?\App\DTO\Collection $versions = null;

}

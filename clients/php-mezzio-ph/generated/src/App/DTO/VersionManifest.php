<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class VersionManifest
{
    /**
     * @DTA\Data(field="latest", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionManifestLatest::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionManifestLatest::class})
     * @var \App\DTO\VersionManifestLatest|null
     */
    public $latest;

    /**
     * @DTA\Data(field="versions", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Collection::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Collection::class})
     * @var \App\DTO\Collection|null
     */
    public $versions;

}

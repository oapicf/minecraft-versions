<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class McGameVersionManifestGet200ResponseLatest
{
    /**
     * @DTA\Data(field="release", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $release = null;

    /**
     * @DTA\Data(field="snapshot", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $snapshot = null;

}

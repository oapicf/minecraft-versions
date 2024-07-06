<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
{
    /**
     * @DTA\Data(field="component", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $component = null;

    /**
     * @DTA\Data(field="majorVersion", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $major_version = null;

}

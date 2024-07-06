<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class VersionPackageInfoDownloads
{
    /**
     * @DTA\Data(field="client", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Download::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Download::class})
     */
    public ?\App\DTO\Download $client = null;

    /**
     * @DTA\Data(field="client_mappings", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Download::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Download::class})
     */
    public ?\App\DTO\Download $client_mappings = null;

    /**
     * @DTA\Data(field="server", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Download::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Download::class})
     */
    public ?\App\DTO\Download $server = null;

    /**
     * @DTA\Data(field="server_mappings", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\Download::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\Download::class})
     */
    public ?\App\DTO\Download $server_mappings = null;

}

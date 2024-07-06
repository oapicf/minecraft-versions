<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
{
    /**
     * @DTA\Data(field="client", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient::class})
     */
    public ?\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient $client = null;

    /**
     * @DTA\Data(field="client_mappings", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient::class})
     */
    public ?\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient $client_mappings = null;

    /**
     * @DTA\Data(field="server", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient::class})
     */
    public ?\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient $server = null;

    /**
     * @DTA\Data(field="server_mappings", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient::class})
     */
    public ?\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient $server_mappings = null;

}

<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

class V1PackagesPackageIdVersionIdJsonGet200Response
{
    /**
     * @DTA\Data(field="version", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $version = null;

    /**
     * @DTA\Data(field="assetIndex", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex::class})
     */
    public ?\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex $asset_index = null;

    /**
     * @DTA\Data(field="assets", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $assets = null;

    /**
     * @DTA\Data(field="complianceLevel", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $compliance_level = null;

    /**
     * @DTA\Data(field="downloads", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads::class})
     */
    public ?\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads $downloads = null;

    /**
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $id = null;

    /**
     * @DTA\Data(field="javaVersion", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion::class})
     */
    public ?\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion $java_version = null;

    /**
     * @DTA\Data(field="mainClass", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $main_class = null;

    /**
     * @DTA\Data(field="minimumLauncherVersion", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     */
    public ?int $minimum_launcher_version = null;

    /**
     * @DTA\Data(field="time", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $time = null;

    /**
     * @DTA\Data(field="releaseTime", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="DateTime")
     */
    public ?\DateTimeInterface $release_time = null;

    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     */
    public ?string $type = null;

}

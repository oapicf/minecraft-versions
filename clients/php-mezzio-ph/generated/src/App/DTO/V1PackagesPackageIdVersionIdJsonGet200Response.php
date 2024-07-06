<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class V1PackagesPackageIdVersionIdJsonGet200Response
{
    /**
     * @DTA\Data(field="version", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $version;

    /**
     * @DTA\Data(field="assetIndex", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex::class})
     * @var \App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex|null
     */
    public $asset_index;

    /**
     * @DTA\Data(field="assets", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $assets;

    /**
     * @DTA\Data(field="complianceLevel", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $compliance_level;

    /**
     * @DTA\Data(field="downloads", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads::class})
     * @var \App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads|null
     */
    public $downloads;

    /**
     * @DTA\Data(field="id", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $id;

    /**
     * @DTA\Data(field="javaVersion", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion::class})
     * @var \App\DTO\V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion|null
     */
    public $java_version;

    /**
     * @DTA\Data(field="mainClass", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $main_class;

    /**
     * @DTA\Data(field="minimumLauncherVersion", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"int"})
     * @var int|null
     */
    public $minimum_launcher_version;

    /**
     * @DTA\Data(field="time", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $time;

    /**
     * @DTA\Data(field="releaseTime", nullable=true)
     * @DTA\Strategy(name="DateTime")
     * @DTA\Validator(name="Date", options={"format": \DateTime::RFC3339})
     * @var \DateTime|null
     */
    public $release_time;

    /**
     * @DTA\Data(field="type", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $type;

}

<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class VersionPackageInfo
{
    /**
     * @DTA\Data(field="version", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
     */
    public $version;

    /**
     * @DTA\Data(field="assetIndex", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionPackageInfoAssetIndex::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionPackageInfoAssetIndex::class})
     * @var \App\DTO\VersionPackageInfoAssetIndex|null
     */
    public $asset_index;

    /**
     * @DTA\Data(field="assets", nullable=true)
     * @DTA\Validator(name="Scalar", options={"type":"string"})
     * @var string|null
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionPackageInfoDownloads::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionPackageInfoDownloads::class})
     * @var \App\DTO\VersionPackageInfoDownloads|null
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
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\VersionPackageInfoJavaVersion::class})
     * @DTA\Validator(name="TypeCompliant", options={"type":\App\DTO\VersionPackageInfoJavaVersion::class})
     * @var \App\DTO\VersionPackageInfoJavaVersion|null
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

<?php
/**
 * VersionManifest
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server\Model
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */

/**
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 1.1.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://github.com/openapitools/openapi-generator.git
 *
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 * Do not edit the class manually.
 */

namespace OpenAPI\Server\Model;

use Symfony\Component\Validator\Constraints as Assert;
use JMS\Serializer\Annotation\Type;
use JMS\Serializer\Annotation\Accessor;
use JMS\Serializer\Annotation\SerializedName;

/**
 * Class representing the VersionManifest model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class VersionManifest 
{
        /**
     * @var VersionManifestLatest|null
     * @SerializedName("latest")
     * @Type("OpenAPI\Server\Model\VersionManifestLatest")
    */
    #[Assert\Type("OpenAPI\Server\Model\VersionManifestLatest")]
    protected ?VersionManifestLatest $latest = null;

    /**
     * @var Version[]|null
     * @SerializedName("versions")
     * @Type("array<OpenAPI\Server\Model\Version>")
    */
    #[Assert\All([
        new Assert\Type("OpenAPI\Server\Model\Version"),
    ])]
    protected ?array $versions = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(?array $data = null)
    {
        if (is_array($data)) {
            $this->latest = array_key_exists('latest', $data) ? $data['latest'] : $this->latest;
            $this->versions = array_key_exists('versions', $data) ? $data['versions'] : $this->versions;
        }
    }

    /**
     * Gets latest.
     *
     * @return VersionManifestLatest|null
     */
    public function getLatest(): ?VersionManifestLatest
    {
        return $this->latest;
    }

    /**
    * Sets latest.
    *
    * @param VersionManifestLatest|null $latest
    *
    * @return $this
    */
    public function setLatest(?VersionManifestLatest $latest = null): self
    {
        $this->latest = $latest;

        return $this;
    }




    /**
     * Gets versions.
     *
     * @return Version[]|null
     */
    public function getVersions(): ?array
    {
        return $this->versions;
    }

    /**
    * Sets versions.
    *
    * @param Version[]|null $versions
    *
    * @return $this
    */
    public function setVersions(?array $versions = null): self
    {
        $this->versions = $versions;

        return $this;
    }



}



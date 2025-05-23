<?php
/**
 * VersionManifestLatest
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
 * Class representing the VersionManifestLatest model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class VersionManifestLatest 
{
        /**
     * @var string|null
     * @SerializedName("release")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $release = null;

    /**
     * @var string|null
     * @SerializedName("snapshot")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $snapshot = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(?array $data = null)
    {
        if (is_array($data)) {
            $this->release = array_key_exists('release', $data) ? $data['release'] : $this->release;
            $this->snapshot = array_key_exists('snapshot', $data) ? $data['snapshot'] : $this->snapshot;
        }
    }

    /**
     * Gets release.
     *
     * @return string|null
     */
    public function getRelease(): ?string
    {
        return $this->release;
    }

    /**
    * Sets release.
    *
    * @param string|null $release
    *
    * @return $this
    */
    public function setRelease(?string $release = null): self
    {
        $this->release = $release;

        return $this;
    }




    /**
     * Gets snapshot.
     *
     * @return string|null
     */
    public function getSnapshot(): ?string
    {
        return $this->snapshot;
    }

    /**
    * Sets snapshot.
    *
    * @param string|null $snapshot
    *
    * @return $this
    */
    public function setSnapshot(?string $snapshot = null): self
    {
        $this->snapshot = $snapshot;

        return $this;
    }



}



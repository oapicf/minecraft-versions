<?php
/**
 * Version
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
 * The version of the OpenAPI document: 0.12.1-pre.0
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
 * Class representing the Version model.
 *
 * @package OpenAPI\Server\Model
 * @author  OpenAPI Generator team
 */

class Version 
{
        /**
     * @var string|null
     * @SerializedName("id")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $id = null;

    /**
     * @var string|null
     * @SerializedName("type")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $type = null;

    /**
     * @var string|null
     * @SerializedName("url")
     * @Type("string")
    */
    #[Assert\Type("string")]
    protected ?string $url = null;

    /**
     * @var \DateTime|null
     * @SerializedName("time")
     * @Type("DateTime")
    */
    #[Assert\Type("\DateTime")]
    protected ?\DateTime $time = null;

    /**
     * @var \DateTime|null
     * @SerializedName("releaseTime")
     * @Type("DateTime")
    */
    #[Assert\Type("\DateTime")]
    protected ?\DateTime $releaseTime = null;

    /**
     * Constructor
     * @param array|null $data Associated array of property values initializing the model
     */
    public function __construct(array $data = null)
    {
        if (is_array($data)) {
            $this->id = array_key_exists('id', $data) ? $data['id'] : $this->id;
            $this->type = array_key_exists('type', $data) ? $data['type'] : $this->type;
            $this->url = array_key_exists('url', $data) ? $data['url'] : $this->url;
            $this->time = array_key_exists('time', $data) ? $data['time'] : $this->time;
            $this->releaseTime = array_key_exists('releaseTime', $data) ? $data['releaseTime'] : $this->releaseTime;
        }
    }

    /**
     * Gets id.
     *
     * @return string|null
     */
    public function getId(): ?string
    {
        return $this->id;
    }

    /**
    * Sets id.
    *
    * @param string|null $id
    *
    * @return $this
    */
    public function setId(?string $id = null): self
    {
        $this->id = $id;

        return $this;
    }




    /**
     * Gets type.
     *
     * @return string|null
     */
    public function getType(): ?string
    {
        return $this->type;
    }

    /**
    * Sets type.
    *
    * @param string|null $type
    *
    * @return $this
    */
    public function setType(?string $type = null): self
    {
        $this->type = $type;

        return $this;
    }




    /**
     * Gets url.
     *
     * @return string|null
     */
    public function getUrl(): ?string
    {
        return $this->url;
    }

    /**
    * Sets url.
    *
    * @param string|null $url
    *
    * @return $this
    */
    public function setUrl(?string $url = null): self
    {
        $this->url = $url;

        return $this;
    }




    /**
     * Gets time.
     *
     * @return \DateTime|null
     */
    public function getTime(): ?\DateTime
    {
        return $this->time;
    }

    /**
    * Sets time.
    *
    * @param \DateTime|null $time
    *
    * @return $this
    */
    public function setTime(?\DateTime $time = null): self
    {
        $this->time = $time;

        return $this;
    }




    /**
     * Gets releaseTime.
     *
     * @return \DateTime|null
     */
    public function getReleaseTime(): ?\DateTime
    {
        return $this->releaseTime;
    }

    /**
    * Sets releaseTime.
    *
    * @param \DateTime|null $releaseTime
    *
    * @return $this
    */
    public function setReleaseTime(?\DateTime $releaseTime = null): self
    {
        $this->releaseTime = $releaseTime;

        return $this;
    }



}



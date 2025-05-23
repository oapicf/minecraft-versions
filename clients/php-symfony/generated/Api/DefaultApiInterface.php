<?php
/**
 * DefaultApiInterface
 *
 * PHP version 8.1.1
 *
 * @category Class
 * @package  OpenAPI\Server
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

namespace OpenAPI\Server\Api;

use Symfony\Component\HttpFoundation\File\UploadedFile;
use OpenAPI\Server\Model\VersionManifest;
use OpenAPI\Server\Model\VersionPackageInfo;

/**
 * DefaultApiInterface Interface Doc Comment
 *
 * @category Interface
 * @package  OpenAPI\Server\Api
 * @author   OpenAPI Generator team
 * @link     https://github.com/openapitools/openapi-generator
 */
interface DefaultApiInterface
{

    /**
     * Operation getMinecraftVersionManifest
     *
     * Get Minecraft version manifest
     *
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function getMinecraftVersionManifest(
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;

    /**
     * Operation getMinecraftVersionPackageInfo
     *
     * Get Minecraft version package info
     *
     * @param  string $packageId   (required)
     * @param  string $versionId   (required)
     * @param  int     &$responseCode    The HTTP Response Code
     * @param  array   $responseHeaders  Additional HTTP headers to return with the response ()
     *
     * @return array|object|null
     */
    public function getMinecraftVersionPackageInfo(
        string $packageId,
        string $versionId,
        int &$responseCode,
        array &$responseHeaders
    ): array|object|null;
}

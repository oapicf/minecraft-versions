<?php
declare(strict_types=1);

namespace App;

use Articus\DataTransfer as DT;
use OpenAPIGenerator\APIClient as OAGAC;
use Psr\Http\Client\ClientExceptionInterface;
use Psr\Http\Message\ResponseInterface;

/**
 * SDK for Minecraft versions info
 * The version of the OpenAPI document: 0.9.0-pre.0
 */
class ApiClient extends OAGAC\AbstractApiClient
{
    //region getMinecraftVersionManifest
    /**
     * Get Minecraft version manifest
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getMinecraftVersionManifestRaw(
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/mc/game/version_manifest.json', [], []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get Minecraft version manifest
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getMinecraftVersionManifest(
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getMinecraftVersionManifestRaw($responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* A list of Minecraft versions with the latest and snapshot releases */
                $responseContent = new \App\DTO\VersionManifest();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get Minecraft version manifest
     * @param string $responseMediaType
     * @return \App\DTO\VersionManifest
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getMinecraftVersionManifestResult(
        string $responseMediaType = 'application/json'
    ): \App\DTO\VersionManifest
    {
        return $this->getSuccessfulContent(...$this->getMinecraftVersionManifest($responseMediaType));
    }
    //endregion

    //region getMinecraftVersionPackageInfo
    /**
     * Get Minecraft version package info
     * @param \App\DTO\GetMinecraftVersionPackageInfoParameterData $parameters
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function getMinecraftVersionPackageInfoRaw(
        \App\DTO\GetMinecraftVersionPackageInfoParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/v1/packages/{packageId}/{versionId}.json', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get Minecraft version package info
     * @param \App\DTO\GetMinecraftVersionPackageInfoParameterData $parameters
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function getMinecraftVersionPackageInfo(
        \App\DTO\GetMinecraftVersionPackageInfoParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->getMinecraftVersionPackageInfoRaw($parameters, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Get package version details */
                $responseContent = new \App\DTO\VersionPackageInfo();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get Minecraft version package info
     * @param \App\DTO\GetMinecraftVersionPackageInfoParameterData $parameters
     * @param string $responseMediaType
     * @return \App\DTO\VersionPackageInfo
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getMinecraftVersionPackageInfoResult(
        \App\DTO\GetMinecraftVersionPackageInfoParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): \App\DTO\VersionPackageInfo
    {
        return $this->getSuccessfulContent(...$this->getMinecraftVersionPackageInfo($parameters, $responseMediaType));
    }
    //endregion
}


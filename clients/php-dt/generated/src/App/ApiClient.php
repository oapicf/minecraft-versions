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
                $responseContent = new \App\DTO\GetMinecraftVersionManifest200Response();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get Minecraft version manifest
     * @param string $responseMediaType
     * @return \App\DTO\GetMinecraftVersionManifest200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function getMinecraftVersionManifestResult(
        string $responseMediaType = 'application/json'
    ): \App\DTO\GetMinecraftVersionManifest200Response
    {
        return $this->getSuccessfulContent(...$this->getMinecraftVersionManifest($responseMediaType));
    }
    //endregion

    //region v1PackagesPackageIdVersionIdJsonGet
    /**
     * Get Minecraft version package details
     * @param \App\DTO\V1PackagesPackageIdVersionIdJsonGETParameterData $parameters
     * @param string $responseMediaType
     * @return ResponseInterface
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     */
    public function v1PackagesPackageIdVersionIdJsonGetRaw(
        \App\DTO\V1PackagesPackageIdVersionIdJsonGETParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): ResponseInterface
    {
        $request = $this->createRequest('GET', '/v1/packages/{packageId}/{versionId}.json', $this->getPathParameters($parameters), []);
        $request = $this->addAcceptHeader($request, $responseMediaType);
        return $this->httpClient->sendRequest($request);
    }

    /**
     * Get Minecraft version package details
     * @param \App\DTO\V1PackagesPackageIdVersionIdJsonGETParameterData $parameters
     * @param string $responseMediaType
     * @return array
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     */
    public function v1PackagesPackageIdVersionIdJsonGet(
        \App\DTO\V1PackagesPackageIdVersionIdJsonGETParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): array
    {
        $response = $this->v1PackagesPackageIdVersionIdJsonGetRaw($parameters, $responseMediaType);
        $responseContent = null;
        $contentStrategy = null;
        $contentValidator = null;
        switch ($response->getStatusCode())
        {
            case 200:
                /* Get package version details */
                $responseContent = new \App\DTO\V1PackagesPackageIdVersionIdJsonGet200Response();
                break;
        }
        $this->parseBody($response, $responseContent, $contentStrategy, $contentValidator);
        return [$responseContent, $response->getHeaders(), $response->getStatusCode(), $response->getReasonPhrase()];
    }

    /**
     * Get Minecraft version package details
     * @param \App\DTO\V1PackagesPackageIdVersionIdJsonGETParameterData $parameters
     * @param string $responseMediaType
     * @return \App\DTO\V1PackagesPackageIdVersionIdJsonGet200Response
     * @throws ClientExceptionInterface
     * @throws DT\Exception\InvalidData
     * @throws OAGAC\Exception\InvalidResponseBodySchema
     * @throws OAGAC\Exception\UnsuccessfulResponse
     */
    public function v1PackagesPackageIdVersionIdJsonGetResult(
        \App\DTO\V1PackagesPackageIdVersionIdJsonGETParameterData $parameters,
        string $responseMediaType = 'application/json'
    ): \App\DTO\V1PackagesPackageIdVersionIdJsonGet200Response
    {
        return $this->getSuccessfulContent(...$this->v1PackagesPackageIdVersionIdJsonGet($parameters, $responseMediaType));
    }
    //endregion
}


// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * SDK for Minecraft versions info
 *
 * API version: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 */

package openapi

import (
	"context"
	"net/http"
	"errors"
)

// DefaultAPIService is a service that implements the logic for the DefaultAPIServicer
// This service should implement the business logic for every endpoint for the DefaultAPI API.
// Include any external packages or services that will be required by this service.
type DefaultAPIService struct {
}

// NewDefaultAPIService creates a default api service
func NewDefaultAPIService() *DefaultAPIService {
	return &DefaultAPIService{}
}

// GetMinecraftVersionManifest - Get Minecraft version manifest
func (s *DefaultAPIService) GetMinecraftVersionManifest(ctx context.Context) (ImplResponse, error) {
	// TODO - update GetMinecraftVersionManifest with the required logic for this service method.
	// Add api_default_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, GetMinecraftVersionManifest200Response{}) or use other options such as http.Ok ...
	// return Response(200, GetMinecraftVersionManifest200Response{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("GetMinecraftVersionManifest method not implemented")
}

// V1PackagesPackageIdVersionIdJsonGet - Get Minecraft version package details
func (s *DefaultAPIService) V1PackagesPackageIdVersionIdJsonGet(ctx context.Context, packageId string, versionId string) (ImplResponse, error) {
	// TODO - update V1PackagesPackageIdVersionIdJsonGet with the required logic for this service method.
	// Add api_default_service.go to the .openapi-generator-ignore to avoid overwriting this service implementation when updating open api generation.

	// TODO: Uncomment the next line to return response Response(200, V1PackagesPackageIdVersionIdJsonGet200Response{}) or use other options such as http.Ok ...
	// return Response(200, V1PackagesPackageIdVersionIdJsonGet200Response{}), nil

	return Response(http.StatusNotImplemented, nil), errors.New("V1PackagesPackageIdVersionIdJsonGet method not implemented")
}

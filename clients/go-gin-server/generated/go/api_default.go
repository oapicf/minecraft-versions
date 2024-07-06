/*
 * SDK for Minecraft versions info
 *
 * API version: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: OpenAPI Generator (https://openapi-generator.tech)
 */

package openapi

import (
	"github.com/gin-gonic/gin"
)

type DefaultAPI struct {
}

// Get /mc/game/version_manifest.json
// Get Minecraft version manifest 
func (api *DefaultAPI) GetMinecraftVersionManifest(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}

// Get /v1/packages/:packageId/:versionId.json
// Get Minecraft version package details 
func (api *DefaultAPI) V1PackagesPackageIdVersionIdJsonGet(c *gin.Context) {
	// Your handler implementation
	c.JSON(200, gin.H{"status": "OK"})
}


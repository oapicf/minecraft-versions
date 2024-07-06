package handlers
import (
	"github.com/oapicf/minecraft-versions/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GetMinecraftVersionManifest - Get Minecraft version manifest
func (c *Container) GetMinecraftVersionManifest(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// V1PackagesPackageIdVersionIdJsonGet - Get Minecraft version package details
func (c *Container) V1PackagesPackageIdVersionIdJsonGet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


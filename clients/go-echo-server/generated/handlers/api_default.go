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


// GetMinecraftVersionPackageInfo - Get Minecraft version package info
func (c *Container) GetMinecraftVersionPackageInfo(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


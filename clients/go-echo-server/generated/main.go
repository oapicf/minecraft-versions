package main

import (
	"github.com/oapicf/minecraft-versions/handlers"
	"github.com/labstack/echo/v4"
	"github.com/labstack/echo/v4/middleware"
)

func main() {
	e := echo.New()

	//todo: handle the error!
	c, _ := handlers.NewContainer()

	// Middleware
	e.Use(middleware.Logger())
	e.Use(middleware.Recover())


	// GetMinecraftVersionManifest - Get Minecraft version manifest
	e.GET("/mc/game/version_manifest.json", c.GetMinecraftVersionManifest)

	// GetMinecraftVersionPackageInfo - Get Minecraft version package info
	e.GET("/v1/packages/:packageId/:versionId.json", c.GetMinecraftVersionPackageInfo)


	// Start server
	e.Logger.Fatal(e.Start(":8080"))
}

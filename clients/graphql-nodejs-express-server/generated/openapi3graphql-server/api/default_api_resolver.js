/**
 * 
 * 
 * SDK for Minecraft versions info
 * 
 * Version: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by OpenAPI Generator: https://openapi-generator.tech
 */

// package openapi3graphql-server

// default_api

export default {
    Query: {

        // @return VersionManifest
        GetMinecraftVersionManifest: () => {
            return {
                
            };
        },

        // @return VersionPackageInfo
        GetMinecraftVersionPackageInfo: ($packageId, $versionId) => {
            return {
                "packageId": "177e49d3233cb6eac42f0495c0a48e719870c2ae",
                "versionId": "1.21"
            };
        },

    },

    Mutation: {

    }
}
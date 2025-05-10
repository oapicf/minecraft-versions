/*
 * 
 *
 * SDK for Minecraft versions info
 *
 * OpenAPI document version: 1.1.1-pre.0
 * Maintained by: blah+oapicf@cliffano.com
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.handler;

import io.undertow.server.*;
import io.undertow.util.*;

import org.openapitools.model.*;

@SuppressWarnings("TooManyFunctions")
public interface PathHandlerInterface {

    /**
     * <p>Get Minecraft version manifest</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/mc/game/version_manifest.json" (<i>privileged: false</i>)</p>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link VersionManifest}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: A list of Minecraft versions with the latest and snapshot releases</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getMinecraftVersionManifest();

    /**
     * <p>Get Minecraft version package info</p>
     *
     * <p><b>Endpoint</b>: {@link Methods#GET GET} "/v1/packages/{packageId}/{versionId}.json" (<i>privileged: false</i>)</p>
     *
     * <p><b>Request parameters</b>:</p>
     * <ul>
     * <li>
     * <p>"<b>packageId</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * <li>
     * <p>"<b>versionId</b>"
     * <p>
     * - Parameter type: <b>{@link String}</b><br/>
     * - Appears in: <b>{@link HttpServerExchange#getPathParameters Path}</b><br/>
     * - Required: <b>true</b>
     * </p>
     * </li>
     * </ul>
     *
     * <p><b>Produces</b>: [{isJson=true, mediaType=application/json}]</p>
     * <p><b>Returns</b>: {@link VersionPackageInfo}</p>
     *
     * <p><b>Responses</b>:</p>
     * <ul>
     * <li><b>200 (success)</b>: Get package version details</li>
     * </ul>
     */
    @javax.annotation.Nonnull
    HttpHandler getMinecraftVersionPackageInfo();
}

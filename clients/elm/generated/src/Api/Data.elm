{-
   
   SDK for Minecraft versions info

   The version of the OpenAPI document: 0.9.0-pre.0
   Contact: blah+oapicf@cliffano.com

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Data exposing
    ( GetMinecraftVersionManifest200Response
    , GetMinecraftVersionManifest200ResponseLatest
    , GetMinecraftVersionManifest200ResponseVersionsInner
    , V1PackagesPackageIdVersionIdJsonGet200Response
    , V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
    , V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
    , V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
    , V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
    , encodeGetMinecraftVersionManifest200Response
    , encodeGetMinecraftVersionManifest200ResponseLatest
    , encodeGetMinecraftVersionManifest200ResponseVersionsInner
    , encodeV1PackagesPackageIdVersionIdJsonGet200Response
    , encodeV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
    , encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
    , encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
    , encodeV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
    , getMinecraftVersionManifest200ResponseDecoder
    , getMinecraftVersionManifest200ResponseLatestDecoder
    , getMinecraftVersionManifest200ResponseVersionsInnerDecoder
    , v1PackagesPackageIdVersionIdJsonGet200ResponseDecoder
    , v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexDecoder
    , v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsDecoder
    , v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientDecoder
    , v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersionDecoder
    )

import Api
import Api.Time exposing (Posix)
import Dict
import Json.Decode
import Json.Encode


-- MODEL


type alias GetMinecraftVersionManifest200Response =
    { latest : Maybe GetMinecraftVersionManifest200ResponseLatest
    , versions : Maybe ( List GetMinecraftVersionManifest200ResponseVersionsInner )
    }


type alias GetMinecraftVersionManifest200ResponseLatest =
    { release : Maybe String
    , snapshot : Maybe String
    }


type alias GetMinecraftVersionManifest200ResponseVersionsInner =
    { id : Maybe String
    , type_ : Maybe String
    , url : Maybe String
    , time : Maybe Posix
    , releaseTime : Maybe Posix
    }


type alias V1PackagesPackageIdVersionIdJsonGet200Response =
    { version : Maybe String
    , assetIndex : Maybe V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
    , assets : Maybe Int
    , complianceLevel : Maybe Int
    , downloads : Maybe V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
    , id : Maybe String
    , javaVersion : Maybe V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
    , mainClass : Maybe String
    , minimumLauncherVersion : Maybe Int
    , time : Maybe Posix
    , releaseTime : Maybe Posix
    , type_ : Maybe String
    }


type alias V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex =
    { id : Maybe String
    , sha1 : Maybe String
    , size : Maybe Int
    , totalSize : Maybe Int
    , url : Maybe String
    }


type alias V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads =
    { client : Maybe V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
    , clientMappings : Maybe V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
    , server : Maybe V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
    , serverMappings : Maybe V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
    }


type alias V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient =
    { sha1 : Maybe String
    , size : Maybe Int
    , url : Maybe String
    }


type alias V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion =
    { component : Maybe String
    , majorVersion : Maybe Int
    }


-- ENCODER


encodeGetMinecraftVersionManifest200Response : GetMinecraftVersionManifest200Response -> Json.Encode.Value
encodeGetMinecraftVersionManifest200Response =
    encodeObject << encodeGetMinecraftVersionManifest200ResponsePairs


encodeGetMinecraftVersionManifest200ResponseWithTag : ( String, String ) -> GetMinecraftVersionManifest200Response -> Json.Encode.Value
encodeGetMinecraftVersionManifest200ResponseWithTag (tagField, tag) model =
    encodeObject (encodeGetMinecraftVersionManifest200ResponsePairs model ++ [ encode tagField Json.Encode.string tag ])


encodeGetMinecraftVersionManifest200ResponsePairs : GetMinecraftVersionManifest200Response -> List EncodedField
encodeGetMinecraftVersionManifest200ResponsePairs model =
    let
        pairs =
            [ maybeEncode "latest" encodeGetMinecraftVersionManifest200ResponseLatest model.latest
            , maybeEncode "versions" (Json.Encode.list encodeGetMinecraftVersionManifest200ResponseVersionsInner) model.versions
            ]
    in
    pairs


encodeGetMinecraftVersionManifest200ResponseLatest : GetMinecraftVersionManifest200ResponseLatest -> Json.Encode.Value
encodeGetMinecraftVersionManifest200ResponseLatest =
    encodeObject << encodeGetMinecraftVersionManifest200ResponseLatestPairs


encodeGetMinecraftVersionManifest200ResponseLatestWithTag : ( String, String ) -> GetMinecraftVersionManifest200ResponseLatest -> Json.Encode.Value
encodeGetMinecraftVersionManifest200ResponseLatestWithTag (tagField, tag) model =
    encodeObject (encodeGetMinecraftVersionManifest200ResponseLatestPairs model ++ [ encode tagField Json.Encode.string tag ])


encodeGetMinecraftVersionManifest200ResponseLatestPairs : GetMinecraftVersionManifest200ResponseLatest -> List EncodedField
encodeGetMinecraftVersionManifest200ResponseLatestPairs model =
    let
        pairs =
            [ maybeEncode "release" Json.Encode.string model.release
            , maybeEncode "snapshot" Json.Encode.string model.snapshot
            ]
    in
    pairs


encodeGetMinecraftVersionManifest200ResponseVersionsInner : GetMinecraftVersionManifest200ResponseVersionsInner -> Json.Encode.Value
encodeGetMinecraftVersionManifest200ResponseVersionsInner =
    encodeObject << encodeGetMinecraftVersionManifest200ResponseVersionsInnerPairs


encodeGetMinecraftVersionManifest200ResponseVersionsInnerWithTag : ( String, String ) -> GetMinecraftVersionManifest200ResponseVersionsInner -> Json.Encode.Value
encodeGetMinecraftVersionManifest200ResponseVersionsInnerWithTag (tagField, tag) model =
    encodeObject (encodeGetMinecraftVersionManifest200ResponseVersionsInnerPairs model ++ [ encode tagField Json.Encode.string tag ])


encodeGetMinecraftVersionManifest200ResponseVersionsInnerPairs : GetMinecraftVersionManifest200ResponseVersionsInner -> List EncodedField
encodeGetMinecraftVersionManifest200ResponseVersionsInnerPairs model =
    let
        pairs =
            [ maybeEncode "id" Json.Encode.string model.id
            , maybeEncode "type" Json.Encode.string model.type_
            , maybeEncode "url" Json.Encode.string model.url
            , maybeEncode "time" Api.Time.encodeDateTime model.time
            , maybeEncode "releaseTime" Api.Time.encodeDateTime model.releaseTime
            ]
    in
    pairs


encodeV1PackagesPackageIdVersionIdJsonGet200Response : V1PackagesPackageIdVersionIdJsonGet200Response -> Json.Encode.Value
encodeV1PackagesPackageIdVersionIdJsonGet200Response =
    encodeObject << encodeV1PackagesPackageIdVersionIdJsonGet200ResponsePairs


encodeV1PackagesPackageIdVersionIdJsonGet200ResponseWithTag : ( String, String ) -> V1PackagesPackageIdVersionIdJsonGet200Response -> Json.Encode.Value
encodeV1PackagesPackageIdVersionIdJsonGet200ResponseWithTag (tagField, tag) model =
    encodeObject (encodeV1PackagesPackageIdVersionIdJsonGet200ResponsePairs model ++ [ encode tagField Json.Encode.string tag ])


encodeV1PackagesPackageIdVersionIdJsonGet200ResponsePairs : V1PackagesPackageIdVersionIdJsonGet200Response -> List EncodedField
encodeV1PackagesPackageIdVersionIdJsonGet200ResponsePairs model =
    let
        pairs =
            [ maybeEncode "version" Json.Encode.string model.version
            , maybeEncode "assetIndex" encodeV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex model.assetIndex
            , maybeEncode "assets" Json.Encode.int model.assets
            , maybeEncode "complianceLevel" Json.Encode.int model.complianceLevel
            , maybeEncode "downloads" encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloads model.downloads
            , maybeEncode "id" Json.Encode.string model.id
            , maybeEncode "javaVersion" encodeV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion model.javaVersion
            , maybeEncode "mainClass" Json.Encode.string model.mainClass
            , maybeEncode "minimumLauncherVersion" Json.Encode.int model.minimumLauncherVersion
            , maybeEncode "time" Api.Time.encodeDateTime model.time
            , maybeEncode "releaseTime" Api.Time.encodeDateTime model.releaseTime
            , maybeEncode "type" Json.Encode.string model.type_
            ]
    in
    pairs


encodeV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex : V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex -> Json.Encode.Value
encodeV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex =
    encodeObject << encodeV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexPairs


encodeV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexWithTag : ( String, String ) -> V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex -> Json.Encode.Value
encodeV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexWithTag (tagField, tag) model =
    encodeObject (encodeV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexPairs model ++ [ encode tagField Json.Encode.string tag ])


encodeV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexPairs : V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex -> List EncodedField
encodeV1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexPairs model =
    let
        pairs =
            [ maybeEncode "id" Json.Encode.string model.id
            , maybeEncode "sha1" Json.Encode.string model.sha1
            , maybeEncode "size" Json.Encode.int model.size
            , maybeEncode "totalSize" Json.Encode.int model.totalSize
            , maybeEncode "url" Json.Encode.string model.url
            ]
    in
    pairs


encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloads : V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads -> Json.Encode.Value
encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloads =
    encodeObject << encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsPairs


encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsWithTag : ( String, String ) -> V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads -> Json.Encode.Value
encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsWithTag (tagField, tag) model =
    encodeObject (encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsPairs model ++ [ encode tagField Json.Encode.string tag ])


encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsPairs : V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads -> List EncodedField
encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsPairs model =
    let
        pairs =
            [ maybeEncode "client" encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient model.client
            , maybeEncode "client_mappings" encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient model.clientMappings
            , maybeEncode "server" encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient model.server
            , maybeEncode "server_mappings" encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient model.serverMappings
            ]
    in
    pairs


encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient : V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient -> Json.Encode.Value
encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient =
    encodeObject << encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientPairs


encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientWithTag : ( String, String ) -> V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient -> Json.Encode.Value
encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientWithTag (tagField, tag) model =
    encodeObject (encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientPairs model ++ [ encode tagField Json.Encode.string tag ])


encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientPairs : V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient -> List EncodedField
encodeV1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientPairs model =
    let
        pairs =
            [ maybeEncode "sha1" Json.Encode.string model.sha1
            , maybeEncode "size" Json.Encode.int model.size
            , maybeEncode "url" Json.Encode.string model.url
            ]
    in
    pairs


encodeV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion : V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion -> Json.Encode.Value
encodeV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion =
    encodeObject << encodeV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersionPairs


encodeV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersionWithTag : ( String, String ) -> V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion -> Json.Encode.Value
encodeV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersionWithTag (tagField, tag) model =
    encodeObject (encodeV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersionPairs model ++ [ encode tagField Json.Encode.string tag ])


encodeV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersionPairs : V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion -> List EncodedField
encodeV1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersionPairs model =
    let
        pairs =
            [ maybeEncode "component" Json.Encode.string model.component
            , maybeEncode "majorVersion" Json.Encode.int model.majorVersion
            ]
    in
    pairs


-- DECODER


getMinecraftVersionManifest200ResponseDecoder : Json.Decode.Decoder GetMinecraftVersionManifest200Response
getMinecraftVersionManifest200ResponseDecoder =
    Json.Decode.succeed GetMinecraftVersionManifest200Response
        |> maybeDecode "latest" getMinecraftVersionManifest200ResponseLatestDecoder Nothing
        |> maybeDecode "versions" (Json.Decode.list getMinecraftVersionManifest200ResponseVersionsInnerDecoder) Nothing


getMinecraftVersionManifest200ResponseLatestDecoder : Json.Decode.Decoder GetMinecraftVersionManifest200ResponseLatest
getMinecraftVersionManifest200ResponseLatestDecoder =
    Json.Decode.succeed GetMinecraftVersionManifest200ResponseLatest
        |> maybeDecode "release" Json.Decode.string Nothing
        |> maybeDecode "snapshot" Json.Decode.string Nothing


getMinecraftVersionManifest200ResponseVersionsInnerDecoder : Json.Decode.Decoder GetMinecraftVersionManifest200ResponseVersionsInner
getMinecraftVersionManifest200ResponseVersionsInnerDecoder =
    Json.Decode.succeed GetMinecraftVersionManifest200ResponseVersionsInner
        |> maybeDecode "id" Json.Decode.string Nothing
        |> maybeDecode "type" Json.Decode.string Nothing
        |> maybeDecode "url" Json.Decode.string Nothing
        |> maybeDecode "time" Api.Time.dateTimeDecoder Nothing
        |> maybeDecode "releaseTime" Api.Time.dateTimeDecoder Nothing


v1PackagesPackageIdVersionIdJsonGet200ResponseDecoder : Json.Decode.Decoder V1PackagesPackageIdVersionIdJsonGet200Response
v1PackagesPackageIdVersionIdJsonGet200ResponseDecoder =
    Json.Decode.succeed V1PackagesPackageIdVersionIdJsonGet200Response
        |> maybeDecode "version" Json.Decode.string Nothing
        |> maybeDecode "assetIndex" v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexDecoder Nothing
        |> maybeDecode "assets" Json.Decode.int Nothing
        |> maybeDecode "complianceLevel" Json.Decode.int Nothing
        |> maybeDecode "downloads" v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsDecoder Nothing
        |> maybeDecode "id" Json.Decode.string Nothing
        |> maybeDecode "javaVersion" v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersionDecoder Nothing
        |> maybeDecode "mainClass" Json.Decode.string Nothing
        |> maybeDecode "minimumLauncherVersion" Json.Decode.int Nothing
        |> maybeDecode "time" Api.Time.dateTimeDecoder Nothing
        |> maybeDecode "releaseTime" Api.Time.dateTimeDecoder Nothing
        |> maybeDecode "type" Json.Decode.string Nothing


v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexDecoder : Json.Decode.Decoder V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
v1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndexDecoder =
    Json.Decode.succeed V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
        |> maybeDecode "id" Json.Decode.string Nothing
        |> maybeDecode "sha1" Json.Decode.string Nothing
        |> maybeDecode "size" Json.Decode.int Nothing
        |> maybeDecode "totalSize" Json.Decode.int Nothing
        |> maybeDecode "url" Json.Decode.string Nothing


v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsDecoder : Json.Decode.Decoder V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsDecoder =
    Json.Decode.succeed V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
        |> maybeDecode "client" v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientDecoder Nothing
        |> maybeDecode "client_mappings" v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientDecoder Nothing
        |> maybeDecode "server" v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientDecoder Nothing
        |> maybeDecode "server_mappings" v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientDecoder Nothing


v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientDecoder : Json.Decode.Decoder V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
v1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClientDecoder =
    Json.Decode.succeed V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient
        |> maybeDecode "sha1" Json.Decode.string Nothing
        |> maybeDecode "size" Json.Decode.int Nothing
        |> maybeDecode "url" Json.Decode.string Nothing


v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersionDecoder : Json.Decode.Decoder V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
v1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersionDecoder =
    Json.Decode.succeed V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
        |> maybeDecode "component" Json.Decode.string Nothing
        |> maybeDecode "majorVersion" Json.Decode.int Nothing




-- HELPER


type alias EncodedField =
    Maybe ( String, Json.Encode.Value )


encodeObject : List EncodedField -> Json.Encode.Value
encodeObject =
    Json.Encode.object << List.filterMap identity


encode : String -> (a -> Json.Encode.Value) -> a -> EncodedField
encode key encoder value =
    Just ( key, encoder value )


encodeNullable : String -> (a -> Json.Encode.Value) -> Maybe a -> EncodedField
encodeNullable key encoder value =
    Just ( key, Maybe.withDefault Json.Encode.null (Maybe.map encoder value) )


maybeEncode : String -> (a -> Json.Encode.Value) -> Maybe a -> EncodedField
maybeEncode key encoder =
    Maybe.map (Tuple.pair key << encoder)


maybeEncodeNullable : String -> (a -> Json.Encode.Value) -> Maybe a -> EncodedField
maybeEncodeNullable =
    encodeNullable


decode : String -> Json.Decode.Decoder a -> Json.Decode.Decoder (a -> b) -> Json.Decode.Decoder b
decode key decoder =
    decodeChain (Json.Decode.field key decoder)


decodeLazy : (a -> c) -> String -> Json.Decode.Decoder a -> Json.Decode.Decoder (c -> b) -> Json.Decode.Decoder b
decodeLazy f key decoder =
    decodeChainLazy f (Json.Decode.field key decoder)


decodeNullable : String -> Json.Decode.Decoder a -> Json.Decode.Decoder (Maybe a -> b) -> Json.Decode.Decoder b
decodeNullable key decoder =
    decodeChain (maybeField key decoder Nothing)


decodeNullableLazy : (Maybe a -> c) -> String -> Json.Decode.Decoder a -> Json.Decode.Decoder (c -> b) -> Json.Decode.Decoder b
decodeNullableLazy f key decoder =
    decodeChainLazy f (maybeField key decoder Nothing)


maybeDecode : String -> Json.Decode.Decoder a -> Maybe a -> Json.Decode.Decoder (Maybe a -> b) -> Json.Decode.Decoder b
maybeDecode key decoder fallback =
    -- let's be kind to null-values as well
    decodeChain (maybeField key decoder fallback)


maybeDecodeLazy : (Maybe a -> c) -> String -> Json.Decode.Decoder a -> Maybe a -> Json.Decode.Decoder (c -> b) -> Json.Decode.Decoder b
maybeDecodeLazy f key decoder fallback =
    -- let's be kind to null-values as well
    decodeChainLazy f (maybeField key decoder fallback)


maybeDecodeNullable : String -> Json.Decode.Decoder a -> Maybe a -> Json.Decode.Decoder (Maybe a -> b) -> Json.Decode.Decoder b
maybeDecodeNullable key decoder fallback =
    decodeChain (maybeField key decoder fallback)


maybeDecodeNullableLazy : (Maybe a -> c) -> String -> Json.Decode.Decoder a -> Maybe a -> Json.Decode.Decoder (c -> b) -> Json.Decode.Decoder b
maybeDecodeNullableLazy f key decoder fallback =
    decodeChainLazy f (maybeField key decoder fallback)


maybeField : String -> Json.Decode.Decoder a -> Maybe a -> Json.Decode.Decoder (Maybe a)
maybeField key decoder fallback =
    let
        fieldDecoder =
            Json.Decode.field key Json.Decode.value

        valueDecoder =
            Json.Decode.oneOf [ Json.Decode.map Just decoder, Json.Decode.null fallback ]

        decodeObject rawObject =
            case Json.Decode.decodeValue fieldDecoder rawObject of
                Ok rawValue ->
                    case Json.Decode.decodeValue valueDecoder rawValue of
                        Ok value ->
                            Json.Decode.succeed value

                        Err error ->
                            Json.Decode.fail (Json.Decode.errorToString error)

                Err _ ->
                    Json.Decode.succeed fallback
    in
    Json.Decode.value
        |> Json.Decode.andThen decodeObject


decodeChain : Json.Decode.Decoder a -> Json.Decode.Decoder (a -> b) -> Json.Decode.Decoder b
decodeChain =
    Json.Decode.map2 (|>)


decodeChainLazy : (a -> c) -> Json.Decode.Decoder a -> Json.Decode.Decoder (c -> b) -> Json.Decode.Decoder b
decodeChainLazy f =
    decodeChain << Json.Decode.map f
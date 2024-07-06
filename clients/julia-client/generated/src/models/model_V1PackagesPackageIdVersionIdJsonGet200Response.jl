# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""_v1_packages__packageId___versionId__json_get_200_response

    V1PackagesPackageIdVersionIdJsonGet200Response(;
        version=nothing,
        assetIndex=nothing,
        assets=nothing,
        complianceLevel=nothing,
        downloads=nothing,
        id=nothing,
        javaVersion=nothing,
        mainClass=nothing,
        minimumLauncherVersion=nothing,
        time=nothing,
        releaseTime=nothing,
        type=nothing,
    )

    - version::String
    - assetIndex::V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
    - assets::Int64
    - complianceLevel::Int64
    - downloads::V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads
    - id::String
    - javaVersion::V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
    - mainClass::String
    - minimumLauncherVersion::Int64
    - time::ZonedDateTime
    - releaseTime::ZonedDateTime
    - type::String
"""
Base.@kwdef mutable struct V1PackagesPackageIdVersionIdJsonGet200Response <: OpenAPI.APIModel
    version::Union{Nothing, String} = nothing
    assetIndex = nothing # spec type: Union{ Nothing, V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex }
    assets::Union{Nothing, Int64} = nothing
    complianceLevel::Union{Nothing, Int64} = nothing
    downloads = nothing # spec type: Union{ Nothing, V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads }
    id::Union{Nothing, String} = nothing
    javaVersion = nothing # spec type: Union{ Nothing, V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion }
    mainClass::Union{Nothing, String} = nothing
    minimumLauncherVersion::Union{Nothing, Int64} = nothing
    time::Union{Nothing, ZonedDateTime} = nothing
    releaseTime::Union{Nothing, ZonedDateTime} = nothing
    type::Union{Nothing, String} = nothing

    function V1PackagesPackageIdVersionIdJsonGet200Response(version, assetIndex, assets, complianceLevel, downloads, id, javaVersion, mainClass, minimumLauncherVersion, time, releaseTime, type, )
        OpenAPI.validate_property(V1PackagesPackageIdVersionIdJsonGet200Response, Symbol("version"), version)
        OpenAPI.validate_property(V1PackagesPackageIdVersionIdJsonGet200Response, Symbol("assetIndex"), assetIndex)
        OpenAPI.validate_property(V1PackagesPackageIdVersionIdJsonGet200Response, Symbol("assets"), assets)
        OpenAPI.validate_property(V1PackagesPackageIdVersionIdJsonGet200Response, Symbol("complianceLevel"), complianceLevel)
        OpenAPI.validate_property(V1PackagesPackageIdVersionIdJsonGet200Response, Symbol("downloads"), downloads)
        OpenAPI.validate_property(V1PackagesPackageIdVersionIdJsonGet200Response, Symbol("id"), id)
        OpenAPI.validate_property(V1PackagesPackageIdVersionIdJsonGet200Response, Symbol("javaVersion"), javaVersion)
        OpenAPI.validate_property(V1PackagesPackageIdVersionIdJsonGet200Response, Symbol("mainClass"), mainClass)
        OpenAPI.validate_property(V1PackagesPackageIdVersionIdJsonGet200Response, Symbol("minimumLauncherVersion"), minimumLauncherVersion)
        OpenAPI.validate_property(V1PackagesPackageIdVersionIdJsonGet200Response, Symbol("time"), time)
        OpenAPI.validate_property(V1PackagesPackageIdVersionIdJsonGet200Response, Symbol("releaseTime"), releaseTime)
        OpenAPI.validate_property(V1PackagesPackageIdVersionIdJsonGet200Response, Symbol("type"), type)
        return new(version, assetIndex, assets, complianceLevel, downloads, id, javaVersion, mainClass, minimumLauncherVersion, time, releaseTime, type, )
    end
end # type V1PackagesPackageIdVersionIdJsonGet200Response

const _property_types_V1PackagesPackageIdVersionIdJsonGet200Response = Dict{Symbol,String}(Symbol("version")=>"String", Symbol("assetIndex")=>"V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex", Symbol("assets")=>"Int64", Symbol("complianceLevel")=>"Int64", Symbol("downloads")=>"V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads", Symbol("id")=>"String", Symbol("javaVersion")=>"V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion", Symbol("mainClass")=>"String", Symbol("minimumLauncherVersion")=>"Int64", Symbol("time")=>"ZonedDateTime", Symbol("releaseTime")=>"ZonedDateTime", Symbol("type")=>"String", )
OpenAPI.property_type(::Type{ V1PackagesPackageIdVersionIdJsonGet200Response }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_V1PackagesPackageIdVersionIdJsonGet200Response[name]))}

function check_required(o::V1PackagesPackageIdVersionIdJsonGet200Response)
    true
end

function OpenAPI.validate_property(::Type{ V1PackagesPackageIdVersionIdJsonGet200Response }, name::Symbol, val)
    if name === Symbol("time")
        OpenAPI.validate_param(name, "V1PackagesPackageIdVersionIdJsonGet200Response", :format, val, "date-time")
    end
    if name === Symbol("releaseTime")
        OpenAPI.validate_param(name, "V1PackagesPackageIdVersionIdJsonGet200Response", :format, val, "date-time")
    end
end
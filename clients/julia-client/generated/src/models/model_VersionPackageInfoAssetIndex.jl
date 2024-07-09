# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""VersionPackageInfo_assetIndex

    VersionPackageInfoAssetIndex(;
        id=nothing,
        sha1=nothing,
        size=nothing,
        totalSize=nothing,
        url=nothing,
    )

    - id::String
    - sha1::String
    - size::Int64
    - totalSize::Int64
    - url::String
"""
Base.@kwdef mutable struct VersionPackageInfoAssetIndex <: OpenAPI.APIModel
    id::Union{Nothing, String} = nothing
    sha1::Union{Nothing, String} = nothing
    size::Union{Nothing, Int64} = nothing
    totalSize::Union{Nothing, Int64} = nothing
    url::Union{Nothing, String} = nothing

    function VersionPackageInfoAssetIndex(id, sha1, size, totalSize, url, )
        OpenAPI.validate_property(VersionPackageInfoAssetIndex, Symbol("id"), id)
        OpenAPI.validate_property(VersionPackageInfoAssetIndex, Symbol("sha1"), sha1)
        OpenAPI.validate_property(VersionPackageInfoAssetIndex, Symbol("size"), size)
        OpenAPI.validate_property(VersionPackageInfoAssetIndex, Symbol("totalSize"), totalSize)
        OpenAPI.validate_property(VersionPackageInfoAssetIndex, Symbol("url"), url)
        return new(id, sha1, size, totalSize, url, )
    end
end # type VersionPackageInfoAssetIndex

const _property_types_VersionPackageInfoAssetIndex = Dict{Symbol,String}(Symbol("id")=>"String", Symbol("sha1")=>"String", Symbol("size")=>"Int64", Symbol("totalSize")=>"Int64", Symbol("url")=>"String", )
OpenAPI.property_type(::Type{ VersionPackageInfoAssetIndex }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_VersionPackageInfoAssetIndex[name]))}

function check_required(o::VersionPackageInfoAssetIndex)
    true
end

function OpenAPI.validate_property(::Type{ VersionPackageInfoAssetIndex }, name::Symbol, val)
end
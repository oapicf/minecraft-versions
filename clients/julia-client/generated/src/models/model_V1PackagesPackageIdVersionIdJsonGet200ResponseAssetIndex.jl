# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""_v1_packages__packageId___versionId__json_get_200_response_assetIndex

    V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex(;
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
Base.@kwdef mutable struct V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex <: OpenAPI.APIModel
    id::Union{Nothing, String} = nothing
    sha1::Union{Nothing, String} = nothing
    size::Union{Nothing, Int64} = nothing
    totalSize::Union{Nothing, Int64} = nothing
    url::Union{Nothing, String} = nothing

    function V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex(id, sha1, size, totalSize, url, )
        OpenAPI.validate_property(V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex, Symbol("id"), id)
        OpenAPI.validate_property(V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex, Symbol("sha1"), sha1)
        OpenAPI.validate_property(V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex, Symbol("size"), size)
        OpenAPI.validate_property(V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex, Symbol("totalSize"), totalSize)
        OpenAPI.validate_property(V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex, Symbol("url"), url)
        return new(id, sha1, size, totalSize, url, )
    end
end # type V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex

const _property_types_V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex = Dict{Symbol,String}(Symbol("id")=>"String", Symbol("sha1")=>"String", Symbol("size")=>"Int64", Symbol("totalSize")=>"Int64", Symbol("url")=>"String", )
OpenAPI.property_type(::Type{ V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex[name]))}

function check_required(o::V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex)
    true
end

function OpenAPI.validate_property(::Type{ V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex }, name::Symbol, val)
end
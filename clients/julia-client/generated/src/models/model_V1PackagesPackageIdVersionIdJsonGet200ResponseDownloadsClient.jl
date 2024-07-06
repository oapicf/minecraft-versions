# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""_v1_packages__packageId___versionId__json_get_200_response_downloads_client

    V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient(;
        sha1=nothing,
        size=nothing,
        url=nothing,
    )

    - sha1::String
    - size::Int64
    - url::String
"""
Base.@kwdef mutable struct V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient <: OpenAPI.APIModel
    sha1::Union{Nothing, String} = nothing
    size::Union{Nothing, Int64} = nothing
    url::Union{Nothing, String} = nothing

    function V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient(sha1, size, url, )
        OpenAPI.validate_property(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient, Symbol("sha1"), sha1)
        OpenAPI.validate_property(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient, Symbol("size"), size)
        OpenAPI.validate_property(V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient, Symbol("url"), url)
        return new(sha1, size, url, )
    end
end # type V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient

const _property_types_V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient = Dict{Symbol,String}(Symbol("sha1")=>"String", Symbol("size")=>"Int64", Symbol("url")=>"String", )
OpenAPI.property_type(::Type{ V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient[name]))}

function check_required(o::V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient)
    true
end

function OpenAPI.validate_property(::Type{ V1PackagesPackageIdVersionIdJsonGet200ResponseDownloadsClient }, name::Symbol, val)
end
# This file was generated by the Julia OpenAPI Code Generator
# Do not modify this file directly. Modify the OpenAPI specification instead.


@doc raw"""VersionManifest

    VersionManifest(;
        latest=nothing,
        versions=nothing,
    )

    - latest::VersionManifestLatest
    - versions::Vector{Version}
"""
Base.@kwdef mutable struct VersionManifest <: OpenAPI.APIModel
    latest = nothing # spec type: Union{ Nothing, VersionManifestLatest }
    versions::Union{Nothing, Vector} = nothing # spec type: Union{ Nothing, Vector{Version} }

    function VersionManifest(latest, versions, )
        OpenAPI.validate_property(VersionManifest, Symbol("latest"), latest)
        OpenAPI.validate_property(VersionManifest, Symbol("versions"), versions)
        return new(latest, versions, )
    end
end # type VersionManifest

const _property_types_VersionManifest = Dict{Symbol,String}(Symbol("latest")=>"VersionManifestLatest", Symbol("versions")=>"Vector{Version}", )
OpenAPI.property_type(::Type{ VersionManifest }, name::Symbol) = Union{Nothing,eval(Base.Meta.parse(_property_types_VersionManifest[name]))}

function check_required(o::VersionManifest)
    true
end

function OpenAPI.validate_property(::Type{ VersionManifest }, name::Symbol, val)
end

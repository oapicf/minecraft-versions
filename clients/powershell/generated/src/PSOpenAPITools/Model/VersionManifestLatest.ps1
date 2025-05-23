#
# SDK for Minecraft versions info
# Version: 1.1.1-pre.0
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.PARAMETER Release
No description available.
.PARAMETER Snapshot
No description available.
.OUTPUTS

VersionManifestLatest<PSCustomObject>
#>

function Initialize-VersionManifestLatest {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Release},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Snapshot}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => VersionManifestLatest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "release" = ${Release}
            "snapshot" = ${Snapshot}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to VersionManifestLatest<PSCustomObject>

.DESCRIPTION

Convert from JSON to VersionManifestLatest<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

VersionManifestLatest<PSCustomObject>
#>
function ConvertFrom-JsonToVersionManifestLatest {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => VersionManifestLatest' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in VersionManifestLatest
        $AllProperties = ("release", "snapshot")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "release"))) { #optional property not found
            $Release = $null
        } else {
            $Release = $JsonParameters.PSobject.Properties["release"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "snapshot"))) { #optional property not found
            $Snapshot = $null
        } else {
            $Snapshot = $JsonParameters.PSobject.Properties["snapshot"].value
        }

        $PSO = [PSCustomObject]@{
            "release" = ${Release}
            "snapshot" = ${Snapshot}
        }

        return $PSO
    }

}


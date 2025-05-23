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

.PARAMETER Component
No description available.
.PARAMETER MajorVersion
No description available.
.OUTPUTS

VersionPackageInfoJavaVersion<PSCustomObject>
#>

function Initialize-VersionPackageInfoJavaVersion {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Component},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${MajorVersion}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => VersionPackageInfoJavaVersion' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "component" = ${Component}
            "majorVersion" = ${MajorVersion}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to VersionPackageInfoJavaVersion<PSCustomObject>

.DESCRIPTION

Convert from JSON to VersionPackageInfoJavaVersion<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

VersionPackageInfoJavaVersion<PSCustomObject>
#>
function ConvertFrom-JsonToVersionPackageInfoJavaVersion {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => VersionPackageInfoJavaVersion' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in VersionPackageInfoJavaVersion
        $AllProperties = ("component", "majorVersion")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "component"))) { #optional property not found
            $Component = $null
        } else {
            $Component = $JsonParameters.PSobject.Properties["component"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "majorVersion"))) { #optional property not found
            $MajorVersion = $null
        } else {
            $MajorVersion = $JsonParameters.PSobject.Properties["majorVersion"].value
        }

        $PSO = [PSCustomObject]@{
            "component" = ${Component}
            "majorVersion" = ${MajorVersion}
        }

        return $PSO
    }

}


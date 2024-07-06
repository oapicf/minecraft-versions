#
# SDK for Minecraft versions info
# Version: 0.9.0-pre.0
# Contact: blah+oapicf@cliffano.com
# Generated by OpenAPI Generator: https://openapi-generator.tech
#

<#
.SYNOPSIS

No summary available.

.DESCRIPTION

No description available.

.PARAMETER Id
No description available.
.PARAMETER Type
No description available.
.PARAMETER Url
No description available.
.PARAMETER Time
No description available.
.PARAMETER ReleaseTime
No description available.
.OUTPUTS

McGameVersionManifestGet200ResponseVersionsInner<PSCustomObject>
#>

function Initialize-McGameVersionManifestGet200ResponseVersionsInner {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Id},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Type},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${Url},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${Time},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[System.DateTime]]
        ${ReleaseTime}
    )

    Process {
        'Creating PSCustomObject: PSOpenAPITools => McGameVersionManifestGet200ResponseVersionsInner' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug


        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "type" = ${Type}
            "url" = ${Url}
            "time" = ${Time}
            "releaseTime" = ${ReleaseTime}
        }


        return $PSO
    }
}

<#
.SYNOPSIS

Convert from JSON to McGameVersionManifestGet200ResponseVersionsInner<PSCustomObject>

.DESCRIPTION

Convert from JSON to McGameVersionManifestGet200ResponseVersionsInner<PSCustomObject>

.PARAMETER Json

Json object

.OUTPUTS

McGameVersionManifestGet200ResponseVersionsInner<PSCustomObject>
#>
function ConvertFrom-JsonToMcGameVersionManifestGet200ResponseVersionsInner {
    Param(
        [AllowEmptyString()]
        [string]$Json
    )

    Process {
        'Converting JSON to PSCustomObject: PSOpenAPITools => McGameVersionManifestGet200ResponseVersionsInner' | Write-Debug
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $JsonParameters = ConvertFrom-Json -InputObject $Json

        # check if Json contains properties not defined in McGameVersionManifestGet200ResponseVersionsInner
        $AllProperties = ("id", "type", "url", "time", "releaseTime")
        foreach ($name in $JsonParameters.PsObject.Properties.Name) {
            if (!($AllProperties.Contains($name))) {
                throw "Error! JSON key '$name' not found in the properties: $($AllProperties)"
            }
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "id"))) { #optional property not found
            $Id = $null
        } else {
            $Id = $JsonParameters.PSobject.Properties["id"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "type"))) { #optional property not found
            $Type = $null
        } else {
            $Type = $JsonParameters.PSobject.Properties["type"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "url"))) { #optional property not found
            $Url = $null
        } else {
            $Url = $JsonParameters.PSobject.Properties["url"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "time"))) { #optional property not found
            $Time = $null
        } else {
            $Time = $JsonParameters.PSobject.Properties["time"].value
        }

        if (!([bool]($JsonParameters.PSobject.Properties.name -match "releaseTime"))) { #optional property not found
            $ReleaseTime = $null
        } else {
            $ReleaseTime = $JsonParameters.PSobject.Properties["releaseTime"].value
        }

        $PSO = [PSCustomObject]@{
            "id" = ${Id}
            "type" = ${Type}
            "url" = ${Url}
            "time" = ${Time}
            "releaseTime" = ${ReleaseTime}
        }

        return $PSO
    }

}


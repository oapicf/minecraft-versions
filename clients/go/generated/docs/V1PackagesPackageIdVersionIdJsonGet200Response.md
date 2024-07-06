# V1PackagesPackageIdVersionIdJsonGet200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Version** | Pointer to **string** |  | [optional] 
**AssetIndex** | Pointer to [**V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex**](V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.md) |  | [optional] 
**Assets** | Pointer to **int32** |  | [optional] 
**ComplianceLevel** | Pointer to **int32** |  | [optional] 
**Downloads** | Pointer to [**V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads**](V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads.md) |  | [optional] 
**Id** | Pointer to **string** |  | [optional] 
**JavaVersion** | Pointer to [**V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion**](V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion.md) |  | [optional] 
**MainClass** | Pointer to **string** |  | [optional] 
**MinimumLauncherVersion** | Pointer to **int32** |  | [optional] 
**Time** | Pointer to **time.Time** |  | [optional] 
**ReleaseTime** | Pointer to **time.Time** |  | [optional] 
**Type** | Pointer to **string** |  | [optional] 

## Methods

### NewV1PackagesPackageIdVersionIdJsonGet200Response

`func NewV1PackagesPackageIdVersionIdJsonGet200Response() *V1PackagesPackageIdVersionIdJsonGet200Response`

NewV1PackagesPackageIdVersionIdJsonGet200Response instantiates a new V1PackagesPackageIdVersionIdJsonGet200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewV1PackagesPackageIdVersionIdJsonGet200ResponseWithDefaults

`func NewV1PackagesPackageIdVersionIdJsonGet200ResponseWithDefaults() *V1PackagesPackageIdVersionIdJsonGet200Response`

NewV1PackagesPackageIdVersionIdJsonGet200ResponseWithDefaults instantiates a new V1PackagesPackageIdVersionIdJsonGet200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetVersion

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetVersion() string`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetVersionOk() (*string, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) SetVersion(v string)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) HasVersion() bool`

HasVersion returns a boolean if a field has been set.

### GetAssetIndex

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetAssetIndex() V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex`

GetAssetIndex returns the AssetIndex field if non-nil, zero value otherwise.

### GetAssetIndexOk

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetAssetIndexOk() (*V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex, bool)`

GetAssetIndexOk returns a tuple with the AssetIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetIndex

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) SetAssetIndex(v V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex)`

SetAssetIndex sets AssetIndex field to given value.

### HasAssetIndex

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) HasAssetIndex() bool`

HasAssetIndex returns a boolean if a field has been set.

### GetAssets

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetAssets() int32`

GetAssets returns the Assets field if non-nil, zero value otherwise.

### GetAssetsOk

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetAssetsOk() (*int32, bool)`

GetAssetsOk returns a tuple with the Assets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssets

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) SetAssets(v int32)`

SetAssets sets Assets field to given value.

### HasAssets

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) HasAssets() bool`

HasAssets returns a boolean if a field has been set.

### GetComplianceLevel

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetComplianceLevel() int32`

GetComplianceLevel returns the ComplianceLevel field if non-nil, zero value otherwise.

### GetComplianceLevelOk

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetComplianceLevelOk() (*int32, bool)`

GetComplianceLevelOk returns a tuple with the ComplianceLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComplianceLevel

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) SetComplianceLevel(v int32)`

SetComplianceLevel sets ComplianceLevel field to given value.

### HasComplianceLevel

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) HasComplianceLevel() bool`

HasComplianceLevel returns a boolean if a field has been set.

### GetDownloads

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetDownloads() V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads`

GetDownloads returns the Downloads field if non-nil, zero value otherwise.

### GetDownloadsOk

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetDownloadsOk() (*V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads, bool)`

GetDownloadsOk returns a tuple with the Downloads field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDownloads

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) SetDownloads(v V1PackagesPackageIdVersionIdJsonGet200ResponseDownloads)`

SetDownloads sets Downloads field to given value.

### HasDownloads

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) HasDownloads() bool`

HasDownloads returns a boolean if a field has been set.

### GetId

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) HasId() bool`

HasId returns a boolean if a field has been set.

### GetJavaVersion

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetJavaVersion() V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion`

GetJavaVersion returns the JavaVersion field if non-nil, zero value otherwise.

### GetJavaVersionOk

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetJavaVersionOk() (*V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion, bool)`

GetJavaVersionOk returns a tuple with the JavaVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJavaVersion

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) SetJavaVersion(v V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion)`

SetJavaVersion sets JavaVersion field to given value.

### HasJavaVersion

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) HasJavaVersion() bool`

HasJavaVersion returns a boolean if a field has been set.

### GetMainClass

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetMainClass() string`

GetMainClass returns the MainClass field if non-nil, zero value otherwise.

### GetMainClassOk

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetMainClassOk() (*string, bool)`

GetMainClassOk returns a tuple with the MainClass field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMainClass

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) SetMainClass(v string)`

SetMainClass sets MainClass field to given value.

### HasMainClass

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) HasMainClass() bool`

HasMainClass returns a boolean if a field has been set.

### GetMinimumLauncherVersion

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetMinimumLauncherVersion() int32`

GetMinimumLauncherVersion returns the MinimumLauncherVersion field if non-nil, zero value otherwise.

### GetMinimumLauncherVersionOk

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetMinimumLauncherVersionOk() (*int32, bool)`

GetMinimumLauncherVersionOk returns a tuple with the MinimumLauncherVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinimumLauncherVersion

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) SetMinimumLauncherVersion(v int32)`

SetMinimumLauncherVersion sets MinimumLauncherVersion field to given value.

### HasMinimumLauncherVersion

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) HasMinimumLauncherVersion() bool`

HasMinimumLauncherVersion returns a boolean if a field has been set.

### GetTime

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetTime() time.Time`

GetTime returns the Time field if non-nil, zero value otherwise.

### GetTimeOk

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetTimeOk() (*time.Time, bool)`

GetTimeOk returns a tuple with the Time field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTime

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) SetTime(v time.Time)`

SetTime sets Time field to given value.

### HasTime

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) HasTime() bool`

HasTime returns a boolean if a field has been set.

### GetReleaseTime

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetReleaseTime() time.Time`

GetReleaseTime returns the ReleaseTime field if non-nil, zero value otherwise.

### GetReleaseTimeOk

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetReleaseTimeOk() (*time.Time, bool)`

GetReleaseTimeOk returns a tuple with the ReleaseTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReleaseTime

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) SetReleaseTime(v time.Time)`

SetReleaseTime sets ReleaseTime field to given value.

### HasReleaseTime

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) HasReleaseTime() bool`

HasReleaseTime returns a boolean if a field has been set.

### GetType

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *V1PackagesPackageIdVersionIdJsonGet200Response) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



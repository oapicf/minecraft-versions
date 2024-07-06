# VersionPackageInfo

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Version** | Pointer to **string** |  | [optional] 
**AssetIndex** | Pointer to [**VersionPackageInfoAssetIndex**](VersionPackageInfoAssetIndex.md) |  | [optional] 
**Assets** | Pointer to **string** |  | [optional] 
**ComplianceLevel** | Pointer to **int32** |  | [optional] 
**Downloads** | Pointer to [**VersionPackageInfoDownloads**](VersionPackageInfoDownloads.md) |  | [optional] 
**Id** | Pointer to **string** |  | [optional] 
**JavaVersion** | Pointer to [**VersionPackageInfoJavaVersion**](VersionPackageInfoJavaVersion.md) |  | [optional] 
**MainClass** | Pointer to **string** |  | [optional] 
**MinimumLauncherVersion** | Pointer to **int32** |  | [optional] 
**Time** | Pointer to **time.Time** |  | [optional] 
**ReleaseTime** | Pointer to **time.Time** |  | [optional] 
**Type** | Pointer to **string** |  | [optional] 

## Methods

### NewVersionPackageInfo

`func NewVersionPackageInfo() *VersionPackageInfo`

NewVersionPackageInfo instantiates a new VersionPackageInfo object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewVersionPackageInfoWithDefaults

`func NewVersionPackageInfoWithDefaults() *VersionPackageInfo`

NewVersionPackageInfoWithDefaults instantiates a new VersionPackageInfo object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetVersion

`func (o *VersionPackageInfo) GetVersion() string`

GetVersion returns the Version field if non-nil, zero value otherwise.

### GetVersionOk

`func (o *VersionPackageInfo) GetVersionOk() (*string, bool)`

GetVersionOk returns a tuple with the Version field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersion

`func (o *VersionPackageInfo) SetVersion(v string)`

SetVersion sets Version field to given value.

### HasVersion

`func (o *VersionPackageInfo) HasVersion() bool`

HasVersion returns a boolean if a field has been set.

### GetAssetIndex

`func (o *VersionPackageInfo) GetAssetIndex() VersionPackageInfoAssetIndex`

GetAssetIndex returns the AssetIndex field if non-nil, zero value otherwise.

### GetAssetIndexOk

`func (o *VersionPackageInfo) GetAssetIndexOk() (*VersionPackageInfoAssetIndex, bool)`

GetAssetIndexOk returns a tuple with the AssetIndex field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssetIndex

`func (o *VersionPackageInfo) SetAssetIndex(v VersionPackageInfoAssetIndex)`

SetAssetIndex sets AssetIndex field to given value.

### HasAssetIndex

`func (o *VersionPackageInfo) HasAssetIndex() bool`

HasAssetIndex returns a boolean if a field has been set.

### GetAssets

`func (o *VersionPackageInfo) GetAssets() string`

GetAssets returns the Assets field if non-nil, zero value otherwise.

### GetAssetsOk

`func (o *VersionPackageInfo) GetAssetsOk() (*string, bool)`

GetAssetsOk returns a tuple with the Assets field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetAssets

`func (o *VersionPackageInfo) SetAssets(v string)`

SetAssets sets Assets field to given value.

### HasAssets

`func (o *VersionPackageInfo) HasAssets() bool`

HasAssets returns a boolean if a field has been set.

### GetComplianceLevel

`func (o *VersionPackageInfo) GetComplianceLevel() int32`

GetComplianceLevel returns the ComplianceLevel field if non-nil, zero value otherwise.

### GetComplianceLevelOk

`func (o *VersionPackageInfo) GetComplianceLevelOk() (*int32, bool)`

GetComplianceLevelOk returns a tuple with the ComplianceLevel field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetComplianceLevel

`func (o *VersionPackageInfo) SetComplianceLevel(v int32)`

SetComplianceLevel sets ComplianceLevel field to given value.

### HasComplianceLevel

`func (o *VersionPackageInfo) HasComplianceLevel() bool`

HasComplianceLevel returns a boolean if a field has been set.

### GetDownloads

`func (o *VersionPackageInfo) GetDownloads() VersionPackageInfoDownloads`

GetDownloads returns the Downloads field if non-nil, zero value otherwise.

### GetDownloadsOk

`func (o *VersionPackageInfo) GetDownloadsOk() (*VersionPackageInfoDownloads, bool)`

GetDownloadsOk returns a tuple with the Downloads field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetDownloads

`func (o *VersionPackageInfo) SetDownloads(v VersionPackageInfoDownloads)`

SetDownloads sets Downloads field to given value.

### HasDownloads

`func (o *VersionPackageInfo) HasDownloads() bool`

HasDownloads returns a boolean if a field has been set.

### GetId

`func (o *VersionPackageInfo) GetId() string`

GetId returns the Id field if non-nil, zero value otherwise.

### GetIdOk

`func (o *VersionPackageInfo) GetIdOk() (*string, bool)`

GetIdOk returns a tuple with the Id field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetId

`func (o *VersionPackageInfo) SetId(v string)`

SetId sets Id field to given value.

### HasId

`func (o *VersionPackageInfo) HasId() bool`

HasId returns a boolean if a field has been set.

### GetJavaVersion

`func (o *VersionPackageInfo) GetJavaVersion() VersionPackageInfoJavaVersion`

GetJavaVersion returns the JavaVersion field if non-nil, zero value otherwise.

### GetJavaVersionOk

`func (o *VersionPackageInfo) GetJavaVersionOk() (*VersionPackageInfoJavaVersion, bool)`

GetJavaVersionOk returns a tuple with the JavaVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetJavaVersion

`func (o *VersionPackageInfo) SetJavaVersion(v VersionPackageInfoJavaVersion)`

SetJavaVersion sets JavaVersion field to given value.

### HasJavaVersion

`func (o *VersionPackageInfo) HasJavaVersion() bool`

HasJavaVersion returns a boolean if a field has been set.

### GetMainClass

`func (o *VersionPackageInfo) GetMainClass() string`

GetMainClass returns the MainClass field if non-nil, zero value otherwise.

### GetMainClassOk

`func (o *VersionPackageInfo) GetMainClassOk() (*string, bool)`

GetMainClassOk returns a tuple with the MainClass field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMainClass

`func (o *VersionPackageInfo) SetMainClass(v string)`

SetMainClass sets MainClass field to given value.

### HasMainClass

`func (o *VersionPackageInfo) HasMainClass() bool`

HasMainClass returns a boolean if a field has been set.

### GetMinimumLauncherVersion

`func (o *VersionPackageInfo) GetMinimumLauncherVersion() int32`

GetMinimumLauncherVersion returns the MinimumLauncherVersion field if non-nil, zero value otherwise.

### GetMinimumLauncherVersionOk

`func (o *VersionPackageInfo) GetMinimumLauncherVersionOk() (*int32, bool)`

GetMinimumLauncherVersionOk returns a tuple with the MinimumLauncherVersion field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetMinimumLauncherVersion

`func (o *VersionPackageInfo) SetMinimumLauncherVersion(v int32)`

SetMinimumLauncherVersion sets MinimumLauncherVersion field to given value.

### HasMinimumLauncherVersion

`func (o *VersionPackageInfo) HasMinimumLauncherVersion() bool`

HasMinimumLauncherVersion returns a boolean if a field has been set.

### GetTime

`func (o *VersionPackageInfo) GetTime() time.Time`

GetTime returns the Time field if non-nil, zero value otherwise.

### GetTimeOk

`func (o *VersionPackageInfo) GetTimeOk() (*time.Time, bool)`

GetTimeOk returns a tuple with the Time field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetTime

`func (o *VersionPackageInfo) SetTime(v time.Time)`

SetTime sets Time field to given value.

### HasTime

`func (o *VersionPackageInfo) HasTime() bool`

HasTime returns a boolean if a field has been set.

### GetReleaseTime

`func (o *VersionPackageInfo) GetReleaseTime() time.Time`

GetReleaseTime returns the ReleaseTime field if non-nil, zero value otherwise.

### GetReleaseTimeOk

`func (o *VersionPackageInfo) GetReleaseTimeOk() (*time.Time, bool)`

GetReleaseTimeOk returns a tuple with the ReleaseTime field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetReleaseTime

`func (o *VersionPackageInfo) SetReleaseTime(v time.Time)`

SetReleaseTime sets ReleaseTime field to given value.

### HasReleaseTime

`func (o *VersionPackageInfo) HasReleaseTime() bool`

HasReleaseTime returns a boolean if a field has been set.

### GetType

`func (o *VersionPackageInfo) GetType() string`

GetType returns the Type field if non-nil, zero value otherwise.

### GetTypeOk

`func (o *VersionPackageInfo) GetTypeOk() (*string, bool)`

GetTypeOk returns a tuple with the Type field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetType

`func (o *VersionPackageInfo) SetType(v string)`

SetType sets Type field to given value.

### HasType

`func (o *VersionPackageInfo) HasType() bool`

HasType returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



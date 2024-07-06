# VersionManifest

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Latest** | Pointer to [**VersionManifestLatest**](VersionManifestLatest.md) |  | [optional] 
**Versions** | Pointer to [**[]Version**](Version.md) |  | [optional] 

## Methods

### NewVersionManifest

`func NewVersionManifest() *VersionManifest`

NewVersionManifest instantiates a new VersionManifest object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewVersionManifestWithDefaults

`func NewVersionManifestWithDefaults() *VersionManifest`

NewVersionManifestWithDefaults instantiates a new VersionManifest object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLatest

`func (o *VersionManifest) GetLatest() VersionManifestLatest`

GetLatest returns the Latest field if non-nil, zero value otherwise.

### GetLatestOk

`func (o *VersionManifest) GetLatestOk() (*VersionManifestLatest, bool)`

GetLatestOk returns a tuple with the Latest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatest

`func (o *VersionManifest) SetLatest(v VersionManifestLatest)`

SetLatest sets Latest field to given value.

### HasLatest

`func (o *VersionManifest) HasLatest() bool`

HasLatest returns a boolean if a field has been set.

### GetVersions

`func (o *VersionManifest) GetVersions() []Version`

GetVersions returns the Versions field if non-nil, zero value otherwise.

### GetVersionsOk

`func (o *VersionManifest) GetVersionsOk() (*[]Version, bool)`

GetVersionsOk returns a tuple with the Versions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersions

`func (o *VersionManifest) SetVersions(v []Version)`

SetVersions sets Versions field to given value.

### HasVersions

`func (o *VersionManifest) HasVersions() bool`

HasVersions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



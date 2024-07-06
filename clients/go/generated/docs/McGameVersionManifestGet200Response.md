# McGameVersionManifestGet200Response

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Latest** | Pointer to [**McGameVersionManifestGet200ResponseLatest**](McGameVersionManifestGet200ResponseLatest.md) |  | [optional] 
**Versions** | Pointer to [**[]McGameVersionManifestGet200ResponseVersionsInner**](McGameVersionManifestGet200ResponseVersionsInner.md) |  | [optional] 

## Methods

### NewMcGameVersionManifestGet200Response

`func NewMcGameVersionManifestGet200Response() *McGameVersionManifestGet200Response`

NewMcGameVersionManifestGet200Response instantiates a new McGameVersionManifestGet200Response object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewMcGameVersionManifestGet200ResponseWithDefaults

`func NewMcGameVersionManifestGet200ResponseWithDefaults() *McGameVersionManifestGet200Response`

NewMcGameVersionManifestGet200ResponseWithDefaults instantiates a new McGameVersionManifestGet200Response object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLatest

`func (o *McGameVersionManifestGet200Response) GetLatest() McGameVersionManifestGet200ResponseLatest`

GetLatest returns the Latest field if non-nil, zero value otherwise.

### GetLatestOk

`func (o *McGameVersionManifestGet200Response) GetLatestOk() (*McGameVersionManifestGet200ResponseLatest, bool)`

GetLatestOk returns a tuple with the Latest field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLatest

`func (o *McGameVersionManifestGet200Response) SetLatest(v McGameVersionManifestGet200ResponseLatest)`

SetLatest sets Latest field to given value.

### HasLatest

`func (o *McGameVersionManifestGet200Response) HasLatest() bool`

HasLatest returns a boolean if a field has been set.

### GetVersions

`func (o *McGameVersionManifestGet200Response) GetVersions() []McGameVersionManifestGet200ResponseVersionsInner`

GetVersions returns the Versions field if non-nil, zero value otherwise.

### GetVersionsOk

`func (o *McGameVersionManifestGet200Response) GetVersionsOk() (*[]McGameVersionManifestGet200ResponseVersionsInner, bool)`

GetVersionsOk returns a tuple with the Versions field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetVersions

`func (o *McGameVersionManifestGet200Response) SetVersions(v []McGameVersionManifestGet200ResponseVersionsInner)`

SetVersions sets Versions field to given value.

### HasVersions

`func (o *McGameVersionManifestGet200Response) HasVersions() bool`

HasVersions returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



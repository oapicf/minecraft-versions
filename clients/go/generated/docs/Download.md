# Download

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Sha1** | Pointer to **string** |  | [optional] 
**Size** | Pointer to **int32** |  | [optional] 
**Url** | Pointer to **string** |  | [optional] 

## Methods

### NewDownload

`func NewDownload() *Download`

NewDownload instantiates a new Download object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewDownloadWithDefaults

`func NewDownloadWithDefaults() *Download`

NewDownloadWithDefaults instantiates a new Download object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetSha1

`func (o *Download) GetSha1() string`

GetSha1 returns the Sha1 field if non-nil, zero value otherwise.

### GetSha1Ok

`func (o *Download) GetSha1Ok() (*string, bool)`

GetSha1Ok returns a tuple with the Sha1 field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSha1

`func (o *Download) SetSha1(v string)`

SetSha1 sets Sha1 field to given value.

### HasSha1

`func (o *Download) HasSha1() bool`

HasSha1 returns a boolean if a field has been set.

### GetSize

`func (o *Download) GetSize() int32`

GetSize returns the Size field if non-nil, zero value otherwise.

### GetSizeOk

`func (o *Download) GetSizeOk() (*int32, bool)`

GetSizeOk returns a tuple with the Size field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetSize

`func (o *Download) SetSize(v int32)`

SetSize sets Size field to given value.

### HasSize

`func (o *Download) HasSize() bool`

HasSize returns a boolean if a field has been set.

### GetUrl

`func (o *Download) GetUrl() string`

GetUrl returns the Url field if non-nil, zero value otherwise.

### GetUrlOk

`func (o *Download) GetUrlOk() (*string, bool)`

GetUrlOk returns a tuple with the Url field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetUrl

`func (o *Download) SetUrl(v string)`

SetUrl sets Url field to given value.

### HasUrl

`func (o *Download) HasUrl() bool`

HasUrl returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)



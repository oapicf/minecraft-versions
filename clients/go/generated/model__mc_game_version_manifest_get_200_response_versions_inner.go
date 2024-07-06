/*
SDK for Minecraft versions info

API version: 0.9.0-pre.0
Contact: blah+oapicf@cliffano.com
*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

package openapi

import (
	"encoding/json"
	"time"
)

// checks if the McGameVersionManifestGet200ResponseVersionsInner type satisfies the MappedNullable interface at compile time
var _ MappedNullable = &McGameVersionManifestGet200ResponseVersionsInner{}

// McGameVersionManifestGet200ResponseVersionsInner struct for McGameVersionManifestGet200ResponseVersionsInner
type McGameVersionManifestGet200ResponseVersionsInner struct {
	Id *string `json:"id,omitempty"`
	Type *string `json:"type,omitempty"`
	Url *string `json:"url,omitempty"`
	Time *time.Time `json:"time,omitempty"`
	ReleaseTime *time.Time `json:"releaseTime,omitempty"`
}

// NewMcGameVersionManifestGet200ResponseVersionsInner instantiates a new McGameVersionManifestGet200ResponseVersionsInner object
// This constructor will assign default values to properties that have it defined,
// and makes sure properties required by API are set, but the set of arguments
// will change when the set of required properties is changed
func NewMcGameVersionManifestGet200ResponseVersionsInner() *McGameVersionManifestGet200ResponseVersionsInner {
	this := McGameVersionManifestGet200ResponseVersionsInner{}
	return &this
}

// NewMcGameVersionManifestGet200ResponseVersionsInnerWithDefaults instantiates a new McGameVersionManifestGet200ResponseVersionsInner object
// This constructor will only assign default values to properties that have it defined,
// but it doesn't guarantee that properties required by API are set
func NewMcGameVersionManifestGet200ResponseVersionsInnerWithDefaults() *McGameVersionManifestGet200ResponseVersionsInner {
	this := McGameVersionManifestGet200ResponseVersionsInner{}
	return &this
}

// GetId returns the Id field value if set, zero value otherwise.
func (o *McGameVersionManifestGet200ResponseVersionsInner) GetId() string {
	if o == nil || IsNil(o.Id) {
		var ret string
		return ret
	}
	return *o.Id
}

// GetIdOk returns a tuple with the Id field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *McGameVersionManifestGet200ResponseVersionsInner) GetIdOk() (*string, bool) {
	if o == nil || IsNil(o.Id) {
		return nil, false
	}
	return o.Id, true
}

// HasId returns a boolean if a field has been set.
func (o *McGameVersionManifestGet200ResponseVersionsInner) HasId() bool {
	if o != nil && !IsNil(o.Id) {
		return true
	}

	return false
}

// SetId gets a reference to the given string and assigns it to the Id field.
func (o *McGameVersionManifestGet200ResponseVersionsInner) SetId(v string) {
	o.Id = &v
}

// GetType returns the Type field value if set, zero value otherwise.
func (o *McGameVersionManifestGet200ResponseVersionsInner) GetType() string {
	if o == nil || IsNil(o.Type) {
		var ret string
		return ret
	}
	return *o.Type
}

// GetTypeOk returns a tuple with the Type field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *McGameVersionManifestGet200ResponseVersionsInner) GetTypeOk() (*string, bool) {
	if o == nil || IsNil(o.Type) {
		return nil, false
	}
	return o.Type, true
}

// HasType returns a boolean if a field has been set.
func (o *McGameVersionManifestGet200ResponseVersionsInner) HasType() bool {
	if o != nil && !IsNil(o.Type) {
		return true
	}

	return false
}

// SetType gets a reference to the given string and assigns it to the Type field.
func (o *McGameVersionManifestGet200ResponseVersionsInner) SetType(v string) {
	o.Type = &v
}

// GetUrl returns the Url field value if set, zero value otherwise.
func (o *McGameVersionManifestGet200ResponseVersionsInner) GetUrl() string {
	if o == nil || IsNil(o.Url) {
		var ret string
		return ret
	}
	return *o.Url
}

// GetUrlOk returns a tuple with the Url field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *McGameVersionManifestGet200ResponseVersionsInner) GetUrlOk() (*string, bool) {
	if o == nil || IsNil(o.Url) {
		return nil, false
	}
	return o.Url, true
}

// HasUrl returns a boolean if a field has been set.
func (o *McGameVersionManifestGet200ResponseVersionsInner) HasUrl() bool {
	if o != nil && !IsNil(o.Url) {
		return true
	}

	return false
}

// SetUrl gets a reference to the given string and assigns it to the Url field.
func (o *McGameVersionManifestGet200ResponseVersionsInner) SetUrl(v string) {
	o.Url = &v
}

// GetTime returns the Time field value if set, zero value otherwise.
func (o *McGameVersionManifestGet200ResponseVersionsInner) GetTime() time.Time {
	if o == nil || IsNil(o.Time) {
		var ret time.Time
		return ret
	}
	return *o.Time
}

// GetTimeOk returns a tuple with the Time field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *McGameVersionManifestGet200ResponseVersionsInner) GetTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.Time) {
		return nil, false
	}
	return o.Time, true
}

// HasTime returns a boolean if a field has been set.
func (o *McGameVersionManifestGet200ResponseVersionsInner) HasTime() bool {
	if o != nil && !IsNil(o.Time) {
		return true
	}

	return false
}

// SetTime gets a reference to the given time.Time and assigns it to the Time field.
func (o *McGameVersionManifestGet200ResponseVersionsInner) SetTime(v time.Time) {
	o.Time = &v
}

// GetReleaseTime returns the ReleaseTime field value if set, zero value otherwise.
func (o *McGameVersionManifestGet200ResponseVersionsInner) GetReleaseTime() time.Time {
	if o == nil || IsNil(o.ReleaseTime) {
		var ret time.Time
		return ret
	}
	return *o.ReleaseTime
}

// GetReleaseTimeOk returns a tuple with the ReleaseTime field value if set, nil otherwise
// and a boolean to check if the value has been set.
func (o *McGameVersionManifestGet200ResponseVersionsInner) GetReleaseTimeOk() (*time.Time, bool) {
	if o == nil || IsNil(o.ReleaseTime) {
		return nil, false
	}
	return o.ReleaseTime, true
}

// HasReleaseTime returns a boolean if a field has been set.
func (o *McGameVersionManifestGet200ResponseVersionsInner) HasReleaseTime() bool {
	if o != nil && !IsNil(o.ReleaseTime) {
		return true
	}

	return false
}

// SetReleaseTime gets a reference to the given time.Time and assigns it to the ReleaseTime field.
func (o *McGameVersionManifestGet200ResponseVersionsInner) SetReleaseTime(v time.Time) {
	o.ReleaseTime = &v
}

func (o McGameVersionManifestGet200ResponseVersionsInner) MarshalJSON() ([]byte, error) {
	toSerialize,err := o.ToMap()
	if err != nil {
		return []byte{}, err
	}
	return json.Marshal(toSerialize)
}

func (o McGameVersionManifestGet200ResponseVersionsInner) ToMap() (map[string]interface{}, error) {
	toSerialize := map[string]interface{}{}
	if !IsNil(o.Id) {
		toSerialize["id"] = o.Id
	}
	if !IsNil(o.Type) {
		toSerialize["type"] = o.Type
	}
	if !IsNil(o.Url) {
		toSerialize["url"] = o.Url
	}
	if !IsNil(o.Time) {
		toSerialize["time"] = o.Time
	}
	if !IsNil(o.ReleaseTime) {
		toSerialize["releaseTime"] = o.ReleaseTime
	}
	return toSerialize, nil
}

type NullableMcGameVersionManifestGet200ResponseVersionsInner struct {
	value *McGameVersionManifestGet200ResponseVersionsInner
	isSet bool
}

func (v NullableMcGameVersionManifestGet200ResponseVersionsInner) Get() *McGameVersionManifestGet200ResponseVersionsInner {
	return v.value
}

func (v *NullableMcGameVersionManifestGet200ResponseVersionsInner) Set(val *McGameVersionManifestGet200ResponseVersionsInner) {
	v.value = val
	v.isSet = true
}

func (v NullableMcGameVersionManifestGet200ResponseVersionsInner) IsSet() bool {
	return v.isSet
}

func (v *NullableMcGameVersionManifestGet200ResponseVersionsInner) Unset() {
	v.value = nil
	v.isSet = false
}

func NewNullableMcGameVersionManifestGet200ResponseVersionsInner(val *McGameVersionManifestGet200ResponseVersionsInner) *NullableMcGameVersionManifestGet200ResponseVersionsInner {
	return &NullableMcGameVersionManifestGet200ResponseVersionsInner{value: val, isSet: true}
}

func (v NullableMcGameVersionManifestGet200ResponseVersionsInner) MarshalJSON() ([]byte, error) {
	return json.Marshal(v.value)
}

func (v *NullableMcGameVersionManifestGet200ResponseVersionsInner) UnmarshalJSON(src []byte) error {
	v.isSet = true
	return json.Unmarshal(src, &v.value)
}



/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.9.0-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex model module.
 * @module model/V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
 * @version 0.9.0-pre.0
 */
class V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex {
    /**
     * Constructs a new <code>V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex</code>.
     * @alias module:model/V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex
     */
    constructor() { 
        
        V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex} obj Optional instance to populate.
     * @return {module:model/V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex} The populated <code>V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('sha1')) {
                obj['sha1'] = ApiClient.convertToType(data['sha1'], 'String');
            }
            if (data.hasOwnProperty('size')) {
                obj['size'] = ApiClient.convertToType(data['size'], 'Number');
            }
            if (data.hasOwnProperty('totalSize')) {
                obj['totalSize'] = ApiClient.convertToType(data['totalSize'], 'Number');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['id'] && !(typeof data['id'] === 'string' || data['id'] instanceof String)) {
            throw new Error("Expected the field `id` to be a primitive type in the JSON string but got " + data['id']);
        }
        // ensure the json data is a string
        if (data['sha1'] && !(typeof data['sha1'] === 'string' || data['sha1'] instanceof String)) {
            throw new Error("Expected the field `sha1` to be a primitive type in the JSON string but got " + data['sha1']);
        }
        // ensure the json data is a string
        if (data['url'] && !(typeof data['url'] === 'string' || data['url'] instanceof String)) {
            throw new Error("Expected the field `url` to be a primitive type in the JSON string but got " + data['url']);
        }

        return true;
    }


}



/**
 * @member {String} id
 */
V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.prototype['id'] = undefined;

/**
 * @member {String} sha1
 */
V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.prototype['sha1'] = undefined;

/**
 * @member {Number} size
 */
V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.prototype['size'] = undefined;

/**
 * @member {Number} totalSize
 */
V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.prototype['totalSize'] = undefined;

/**
 * @member {String} url
 */
V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex.prototype['url'] = undefined;






export default V1PackagesPackageIdVersionIdJsonGet200ResponseAssetIndex;


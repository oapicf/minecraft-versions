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
 * The Download model module.
 * @module model/Download
 * @version 0.9.0-pre.0
 */
class Download {
    /**
     * Constructs a new <code>Download</code>.
     * @alias module:model/Download
     */
    constructor() { 
        
        Download.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Download</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Download} obj Optional instance to populate.
     * @return {module:model/Download} The populated <code>Download</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Download();

            if (data.hasOwnProperty('sha1')) {
                obj['sha1'] = ApiClient.convertToType(data['sha1'], 'String');
            }
            if (data.hasOwnProperty('size')) {
                obj['size'] = ApiClient.convertToType(data['size'], 'Number');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>Download</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>Download</code>.
     */
    static validateJSON(data) {
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
 * @member {String} sha1
 */
Download.prototype['sha1'] = undefined;

/**
 * @member {Number} size
 */
Download.prototype['size'] = undefined;

/**
 * @member {String} url
 */
Download.prototype['url'] = undefined;






export default Download;


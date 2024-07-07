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
     * @member {String} sha1
     * @type {String}
     */
    sha1;
    /**
     * @member {Number} size
     * @type {Number}
     */
    size;
    /**
     * @member {String} url
     * @type {String}
     */
    url;

    

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
}



export default Download;

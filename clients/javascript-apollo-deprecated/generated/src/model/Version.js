/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 0.12.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The Version model module.
 * @module model/Version
 * @version 0.12.1-pre.0
 */
class Version {
    /**
     * @member {String} id
     * @type {String}
     */
    id;
    /**
     * @member {String} type
     * @type {String}
     */
    type;
    /**
     * @member {String} url
     * @type {String}
     */
    url;
    /**
     * @member {Date} time
     * @type {Date}
     */
    time;
    /**
     * @member {Date} releaseTime
     * @type {Date}
     */
    releaseTime;

    

    /**
     * Constructs a new <code>Version</code>.
     * @alias module:model/Version
     */
    constructor() { 
        
        Version.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>Version</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Version} obj Optional instance to populate.
     * @return {module:model/Version} The populated <code>Version</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Version();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('type')) {
                obj['type'] = ApiClient.convertToType(data['type'], 'String');
            }
            if (data.hasOwnProperty('url')) {
                obj['url'] = ApiClient.convertToType(data['url'], 'String');
            }
            if (data.hasOwnProperty('time')) {
                obj['time'] = ApiClient.convertToType(data['time'], 'Date');
            }
            if (data.hasOwnProperty('releaseTime')) {
                obj['releaseTime'] = ApiClient.convertToType(data['releaseTime'], 'Date');
            }
        }
        return obj;
    }
}



export default Version;


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
 * The McGameVersionManifestGet200ResponseLatest model module.
 * @module model/McGameVersionManifestGet200ResponseLatest
 * @version 0.9.0-pre.0
 */
class McGameVersionManifestGet200ResponseLatest {
    /**
     * @member {String} release
     * @type {String}
     */
    release;
    /**
     * @member {String} snapshot
     * @type {String}
     */
    snapshot;

    

    /**
     * Constructs a new <code>McGameVersionManifestGet200ResponseLatest</code>.
     * @alias module:model/McGameVersionManifestGet200ResponseLatest
     */
    constructor() { 
        
        McGameVersionManifestGet200ResponseLatest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>McGameVersionManifestGet200ResponseLatest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/McGameVersionManifestGet200ResponseLatest} obj Optional instance to populate.
     * @return {module:model/McGameVersionManifestGet200ResponseLatest} The populated <code>McGameVersionManifestGet200ResponseLatest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new McGameVersionManifestGet200ResponseLatest();

            if (data.hasOwnProperty('release')) {
                obj['release'] = ApiClient.convertToType(data['release'], 'String');
            }
            if (data.hasOwnProperty('snapshot')) {
                obj['snapshot'] = ApiClient.convertToType(data['snapshot'], 'String');
            }
        }
        return obj;
    }
}



export default McGameVersionManifestGet200ResponseLatest;


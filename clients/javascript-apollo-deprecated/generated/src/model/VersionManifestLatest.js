/**
 * 
 * SDK for Minecraft versions info
 *
 * The version of the OpenAPI document: 1.1.1-pre.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */

import ApiClient from '../ApiClient';

/**
 * The VersionManifestLatest model module.
 * @module model/VersionManifestLatest
 * @version 1.1.1-pre.0
 */
class VersionManifestLatest {
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
     * Constructs a new <code>VersionManifestLatest</code>.
     * @alias module:model/VersionManifestLatest
     */
    constructor() { 
        
        VersionManifestLatest.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>VersionManifestLatest</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/VersionManifestLatest} obj Optional instance to populate.
     * @return {module:model/VersionManifestLatest} The populated <code>VersionManifestLatest</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new VersionManifestLatest();

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



export default VersionManifestLatest;


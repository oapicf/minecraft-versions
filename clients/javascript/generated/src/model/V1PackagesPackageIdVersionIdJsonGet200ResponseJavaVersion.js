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
 * The V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion model module.
 * @module model/V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
 * @version 0.9.0-pre.0
 */
class V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion {
    /**
     * Constructs a new <code>V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion</code>.
     * @alias module:model/V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion
     */
    constructor() { 
        
        V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion.initialize(this);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj) { 
    }

    /**
     * Constructs a <code>V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion} obj Optional instance to populate.
     * @return {module:model/V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion} The populated <code>V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion();

            if (data.hasOwnProperty('component')) {
                obj['component'] = ApiClient.convertToType(data['component'], 'String');
            }
            if (data.hasOwnProperty('majorVersion')) {
                obj['majorVersion'] = ApiClient.convertToType(data['majorVersion'], 'Number');
            }
        }
        return obj;
    }

    /**
     * Validates the JSON data with respect to <code>V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion</code>.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @return {boolean} to indicate whether the JSON data is valid with respect to <code>V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion</code>.
     */
    static validateJSON(data) {
        // ensure the json data is a string
        if (data['component'] && !(typeof data['component'] === 'string' || data['component'] instanceof String)) {
            throw new Error("Expected the field `component` to be a primitive type in the JSON string but got " + data['component']);
        }

        return true;
    }


}



/**
 * @member {String} component
 */
V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion.prototype['component'] = undefined;

/**
 * @member {Number} majorVersion
 */
V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion.prototype['majorVersion'] = undefined;






export default V1PackagesPackageIdVersionIdJsonGet200ResponseJavaVersion;


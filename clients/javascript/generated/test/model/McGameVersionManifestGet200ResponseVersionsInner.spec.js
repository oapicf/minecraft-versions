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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.OpenapiJsClient);
  }
}(this, function(expect, OpenapiJsClient) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new OpenapiJsClient.McGameVersionManifestGet200ResponseVersionsInner();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('McGameVersionManifestGet200ResponseVersionsInner', function() {
    it('should create an instance of McGameVersionManifestGet200ResponseVersionsInner', function() {
      // uncomment below and update the code to test McGameVersionManifestGet200ResponseVersionsInner
      //var instance = new OpenapiJsClient.McGameVersionManifestGet200ResponseVersionsInner();
      //expect(instance).to.be.a(OpenapiJsClient.McGameVersionManifestGet200ResponseVersionsInner);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new OpenapiJsClient.McGameVersionManifestGet200ResponseVersionsInner();
      //expect(instance).to.be();
    });

    it('should have the property type (base name: "type")', function() {
      // uncomment below and update the code to test the property type
      //var instance = new OpenapiJsClient.McGameVersionManifestGet200ResponseVersionsInner();
      //expect(instance).to.be();
    });

    it('should have the property url (base name: "url")', function() {
      // uncomment below and update the code to test the property url
      //var instance = new OpenapiJsClient.McGameVersionManifestGet200ResponseVersionsInner();
      //expect(instance).to.be();
    });

    it('should have the property time (base name: "time")', function() {
      // uncomment below and update the code to test the property time
      //var instance = new OpenapiJsClient.McGameVersionManifestGet200ResponseVersionsInner();
      //expect(instance).to.be();
    });

    it('should have the property releaseTime (base name: "releaseTime")', function() {
      // uncomment below and update the code to test the property releaseTime
      //var instance = new OpenapiJsClient.McGameVersionManifestGet200ResponseVersionsInner();
      //expect(instance).to.be();
    });

  });

}));

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
    instance = new OpenapiJsClient.McGameVersionManifestGet200ResponseLatest();
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

  describe('McGameVersionManifestGet200ResponseLatest', function() {
    it('should create an instance of McGameVersionManifestGet200ResponseLatest', function() {
      // uncomment below and update the code to test McGameVersionManifestGet200ResponseLatest
      //var instance = new OpenapiJsClient.McGameVersionManifestGet200ResponseLatest();
      //expect(instance).to.be.a(OpenapiJsClient.McGameVersionManifestGet200ResponseLatest);
    });

    it('should have the property release (base name: "release")', function() {
      // uncomment below and update the code to test the property release
      //var instance = new OpenapiJsClient.McGameVersionManifestGet200ResponseLatest();
      //expect(instance).to.be();
    });

    it('should have the property snapshot (base name: "snapshot")', function() {
      // uncomment below and update the code to test the property snapshot
      //var instance = new OpenapiJsClient.McGameVersionManifestGet200ResponseLatest();
      //expect(instance).to.be();
    });

  });

}));

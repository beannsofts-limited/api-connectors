/**
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
 *
 * OpenAPI spec version: 0.2.10
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.8
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/LinearListOrderResult'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./LinearListOrderResult'));
  } else {
    // Browser globals (root is window)
    if (!root.BybitApi) {
      root.BybitApi = {};
    }
    root.BybitApi.LinearOrderRecordsResponse = factory(root.BybitApi.ApiClient, root.BybitApi.LinearListOrderResult);
  }
}(this, function(ApiClient, LinearListOrderResult) {
  'use strict';




  /**
   * The LinearOrderRecordsResponse model module.
   * @module model/LinearOrderRecordsResponse
   * @version 0.2.10
   */

  /**
   * Constructs a new <code>LinearOrderRecordsResponse</code>.
   * @alias module:model/LinearOrderRecordsResponse
   * @class
   */
  var exports = function() {
    var _this = this;



  };

  /**
   * Constructs a <code>LinearOrderRecordsResponse</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/LinearOrderRecordsResponse} obj Optional instance to populate.
   * @return {module:model/LinearOrderRecordsResponse} The populated <code>LinearOrderRecordsResponse</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('current_page')) {
        obj['current_page'] = ApiClient.convertToType(data['current_page'], 'Number');
      }
      if (data.hasOwnProperty('data')) {
        obj['data'] = ApiClient.convertToType(data['data'], [LinearListOrderResult]);
      }
    }
    return obj;
  }

  /**
   * @member {Number} current_page
   */
  exports.prototype['current_page'] = undefined;
  /**
   * @member {Array.<module:model/LinearListOrderResult>} data
   */
  exports.prototype['data'] = undefined;



  return exports;
}));



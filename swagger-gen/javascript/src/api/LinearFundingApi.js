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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.BybitApi) {
      root.BybitApi = {};
    }
    root.BybitApi.LinearFundingApi = factory(root.BybitApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';

  /**
   * LinearFunding service.
   * @module api/LinearFundingApi
   * @version 0.2.10
   */

  /**
   * Constructs a new LinearFundingApi. 
   * @alias module:api/LinearFundingApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the linearFundingMyLastFee operation.
     * @callback module:api/LinearFundingApi~linearFundingMyLastFeeCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get prev funding
     * This will get prev funding
     * @param {Object} opts Optional parameters
     * @param {String} opts.symbol 
     * @param {module:api/LinearFundingApi~linearFundingMyLastFeeCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.linearFundingMyLastFee = function(opts, callback) {
      opts = opts || {};
      var postBody = null;


      var pathParams = {
      };
      var queryParams = {
        'symbol': opts['symbol'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['apiKey', 'apiSignature', 'timestamp'];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json'];
      var returnType = Object;

      return this.apiClient.callApi(
        '/private/linear/funding/prev-funding', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the linearFundingPredicted operation.
     * @callback module:api/LinearFundingApi~linearFundingPredictedCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get predicted funding rate and funding fee.
     * @param {String} symbol Contract type.
     * @param {module:api/LinearFundingApi~linearFundingPredictedCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.linearFundingPredicted = function(symbol, callback) {
      var postBody = null;

      // verify the required parameter 'symbol' is set
      if (symbol === undefined || symbol === null) {
        throw new Error("Missing the required parameter 'symbol' when calling linearFundingPredicted");
      }


      var pathParams = {
      };
      var queryParams = {
        'symbol': symbol,
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['apiKey', 'apiSignature', 'timestamp'];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json'];
      var returnType = Object;

      return this.apiClient.callApi(
        '/private/linear/funding/predicted-funding', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the linearFundingPrevRate operation.
     * @callback module:api/LinearFundingApi~linearFundingPrevRateCallback
     * @param {String} error Error message, if any.
     * @param {Object} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get prev funding
     * This will get prev funding rate
     * @param {String} symbol 
     * @param {module:api/LinearFundingApi~linearFundingPrevRateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Object}
     */
    this.linearFundingPrevRate = function(symbol, callback) {
      var postBody = null;

      // verify the required parameter 'symbol' is set
      if (symbol === undefined || symbol === null) {
        throw new Error("Missing the required parameter 'symbol' when calling linearFundingPrevRate");
      }


      var pathParams = {
      };
      var queryParams = {
        'symbol': symbol,
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['apiKey', 'apiSignature', 'timestamp'];
      var contentTypes = ['application/json', 'application/x-www-form-urlencoded'];
      var accepts = ['application/json'];
      var returnType = Object;

      return this.apiClient.callApi(
        '/public/linear/funding/prev-funding-rate', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));

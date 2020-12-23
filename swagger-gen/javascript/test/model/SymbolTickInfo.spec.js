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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.BybitApi);
  }
}(this, function(expect, BybitApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new BybitApi.SymbolTickInfo();
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

  describe('SymbolTickInfo', function() {
    it('should create an instance of SymbolTickInfo', function() {
      // uncomment below and update the code to test SymbolTickInfo
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be.a(BybitApi.SymbolTickInfo);
    });

    it('should have the property symbol (base name: "symbol")', function() {
      // uncomment below and update the code to test the property symbol
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property bidPrice (base name: "bid_price")', function() {
      // uncomment below and update the code to test the property bidPrice
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property askPrice (base name: "ask_price")', function() {
      // uncomment below and update the code to test the property askPrice
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property lastPrice (base name: "last_price")', function() {
      // uncomment below and update the code to test the property lastPrice
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property lastTickDirection (base name: "last_tick_direction")', function() {
      // uncomment below and update the code to test the property lastTickDirection
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property prevPrice24h (base name: "prev_price_24h")', function() {
      // uncomment below and update the code to test the property prevPrice24h
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property price24hPcnt (base name: "price_24h_pcnt")', function() {
      // uncomment below and update the code to test the property price24hPcnt
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property highPrice24h (base name: "high_price_24h")', function() {
      // uncomment below and update the code to test the property highPrice24h
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property lowPrice24h (base name: "low_price_24h")', function() {
      // uncomment below and update the code to test the property lowPrice24h
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property prevPrice1h (base name: "prev_price_1h")', function() {
      // uncomment below and update the code to test the property prevPrice1h
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property price1hPcnt (base name: "price_1h_pcnt")', function() {
      // uncomment below and update the code to test the property price1hPcnt
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property markPrice (base name: "mark_price")', function() {
      // uncomment below and update the code to test the property markPrice
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property indexPrice (base name: "index_price")', function() {
      // uncomment below and update the code to test the property indexPrice
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property openInterest (base name: "open_interest")', function() {
      // uncomment below and update the code to test the property openInterest
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property openValue (base name: "open_value")', function() {
      // uncomment below and update the code to test the property openValue
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property totalTurnover (base name: "total_turnover")', function() {
      // uncomment below and update the code to test the property totalTurnover
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property turnover24h (base name: "turnover_24h")', function() {
      // uncomment below and update the code to test the property turnover24h
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property totalVolume (base name: "total_volume")', function() {
      // uncomment below and update the code to test the property totalVolume
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property volume24h (base name: "volume_24h")', function() {
      // uncomment below and update the code to test the property volume24h
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property fundingRate (base name: "funding_rate")', function() {
      // uncomment below and update the code to test the property fundingRate
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property predictedFundingRate (base name: "predicted_funding_rate")', function() {
      // uncomment below and update the code to test the property predictedFundingRate
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property nextFundingTime (base name: "next_funding_time")', function() {
      // uncomment below and update the code to test the property nextFundingTime
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

    it('should have the property countdownHour (base name: "countdown_hour")', function() {
      // uncomment below and update the code to test the property countdownHour
      //var instance = new BybitApi.SymbolTickInfo();
      //expect(instance).to.be();
    });

  });

}));

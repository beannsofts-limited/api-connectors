/**
 * Bybit API
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
 *
 * OpenAPI spec version: 0.2.10
 * Contact: support@bybit.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model


case class SymbolTickInfo (
  symbol: Option[String] = None,
  bidPrice: Option[String] = None,
  askPrice: Option[String] = None,
  lastPrice: Option[String] = None,
  lastTickDirection: Option[String] = None,
  prevPrice24h: Option[String] = None,
  price24hPcnt: Option[String] = None,
  highPrice24h: Option[String] = None,
  lowPrice24h: Option[String] = None,
  prevPrice1h: Option[String] = None,
  price1hPcnt: Option[String] = None,
  markPrice: Option[String] = None,
  indexPrice: Option[String] = None,
  openInterest: Option[Number] = None,
  openValue: Option[String] = None,
  totalTurnover: Option[String] = None,
  turnover24h: Option[String] = None,
  totalVolume: Option[Number] = None,
  volume24h: Option[Number] = None,
  fundingRate: Option[String] = None,
  predictedFundingRate: Option[String] = None,
  nextFundingTime: Option[String] = None,
  countdownHour: Option[Number] = None
)


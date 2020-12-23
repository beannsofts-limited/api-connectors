/*
 * Bybit API
 *
 * ## REST API for the Bybit Exchange. Base URI: [https://api.bybit.com]  
 *
 * API version: 0.2.10
 * Contact: support@bybit.com
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */

package swagger

type LinearFundingPredicted struct {
	PredictedFundingRate float64 `json:"predicted_funding_rate,omitempty"`
	PredictedFundingFee float64 `json:"predicted_funding_fee,omitempty"`
}

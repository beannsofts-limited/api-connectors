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

// Get open_interest information.
type OpenInterest struct {
	RetCode float32 `json:"ret_code,omitempty"`
	RetMsg string `json:"ret_msg,omitempty"`
	ExtCode string `json:"ext_code,omitempty"`
	ExtInfo string `json:"ext_info,omitempty"`
	Result []OpenInterestInfo `json:"result,omitempty"`
	TimeNow string `json:"time_now,omitempty"`
}

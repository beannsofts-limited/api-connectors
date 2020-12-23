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

// Get the orderbook response
type OderBookRes struct {
	Symbol string `json:"symbol,omitempty"`
	Price string `json:"price,omitempty"`
	Size float32 `json:"size,omitempty"`
	Side string `json:"side,omitempty"`
}

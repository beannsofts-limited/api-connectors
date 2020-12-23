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

// Get wallet balance response
type WalletBalance struct {
	Equity float64 `json:"equity,omitempty"`
	AvailableBalance float64 `json:"available_balance,omitempty"`
	UsedMargin float64 `json:"used_margin,omitempty"`
	OrderMargin float64 `json:"order_margin,omitempty"`
	PositionMargin float64 `json:"position_margin,omitempty"`
	OccClosingFee float64 `json:"occ_closing_fee,omitempty"`
	OccFundingFee float64 `json:"occ_funding_fee,omitempty"`
	WalletBalance float64 `json:"wallet_balance,omitempty"`
	RealisedPnl float64 `json:"realised_pnl,omitempty"`
	UnrealisedPnl float64 `json:"unrealised_pnl,omitempty"`
	CumRealisedPnl float64 `json:"cum_realised_pnl,omitempty"`
	GivenCash float64 `json:"given_cash,omitempty"`
	ServiceCash float64 `json:"service_cash,omitempty"`
}

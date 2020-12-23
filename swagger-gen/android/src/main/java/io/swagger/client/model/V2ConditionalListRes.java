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

package io.swagger.client.model;

import java.math.BigDecimal;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * conditional order list response
 **/
@ApiModel(description = "conditional order list response")
public class V2ConditionalListRes {
  
  @SerializedName("user_id")
  private BigDecimal userId = null;
  @SerializedName("stop_order_status")
  private String stopOrderStatus = null;
  @SerializedName("symbol")
  private String symbol = null;
  @SerializedName("side")
  private String side = null;
  @SerializedName("order_type")
  private String orderType = null;
  @SerializedName("price")
  private String price = null;
  @SerializedName("qty")
  private String qty = null;
  @SerializedName("time_in_force")
  private String timeInForce = null;
  @SerializedName("stop_order_type")
  private String stopOrderType = null;
  @SerializedName("trigger_by")
  private String triggerBy = null;
  @SerializedName("base_price")
  private String basePrice = null;
  @SerializedName("order_link_id")
  private String orderLinkId = null;
  @SerializedName("stop_px")
  private String stopPx = null;
  @SerializedName("stop_order_id")
  private String stopOrderId = null;
  @SerializedName("created_at")
  private String createdAt = null;
  @SerializedName("updated_at")
  private String updatedAt = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getUserId() {
    return userId;
  }
  public void setUserId(BigDecimal userId) {
    this.userId = userId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStopOrderStatus() {
    return stopOrderStatus;
  }
  public void setStopOrderStatus(String stopOrderStatus) {
    this.stopOrderStatus = stopOrderStatus;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSymbol() {
    return symbol;
  }
  public void setSymbol(String symbol) {
    this.symbol = symbol;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getSide() {
    return side;
  }
  public void setSide(String side) {
    this.side = side;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrderType() {
    return orderType;
  }
  public void setOrderType(String orderType) {
    this.orderType = orderType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getPrice() {
    return price;
  }
  public void setPrice(String price) {
    this.price = price;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getQty() {
    return qty;
  }
  public void setQty(String qty) {
    this.qty = qty;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTimeInForce() {
    return timeInForce;
  }
  public void setTimeInForce(String timeInForce) {
    this.timeInForce = timeInForce;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStopOrderType() {
    return stopOrderType;
  }
  public void setStopOrderType(String stopOrderType) {
    this.stopOrderType = stopOrderType;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getTriggerBy() {
    return triggerBy;
  }
  public void setTriggerBy(String triggerBy) {
    this.triggerBy = triggerBy;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getBasePrice() {
    return basePrice;
  }
  public void setBasePrice(String basePrice) {
    this.basePrice = basePrice;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getOrderLinkId() {
    return orderLinkId;
  }
  public void setOrderLinkId(String orderLinkId) {
    this.orderLinkId = orderLinkId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStopPx() {
    return stopPx;
  }
  public void setStopPx(String stopPx) {
    this.stopPx = stopPx;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getStopOrderId() {
    return stopOrderId;
  }
  public void setStopOrderId(String stopOrderId) {
    this.stopOrderId = stopOrderId;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V2ConditionalListRes v2ConditionalListRes = (V2ConditionalListRes) o;
    return (this.userId == null ? v2ConditionalListRes.userId == null : this.userId.equals(v2ConditionalListRes.userId)) &&
        (this.stopOrderStatus == null ? v2ConditionalListRes.stopOrderStatus == null : this.stopOrderStatus.equals(v2ConditionalListRes.stopOrderStatus)) &&
        (this.symbol == null ? v2ConditionalListRes.symbol == null : this.symbol.equals(v2ConditionalListRes.symbol)) &&
        (this.side == null ? v2ConditionalListRes.side == null : this.side.equals(v2ConditionalListRes.side)) &&
        (this.orderType == null ? v2ConditionalListRes.orderType == null : this.orderType.equals(v2ConditionalListRes.orderType)) &&
        (this.price == null ? v2ConditionalListRes.price == null : this.price.equals(v2ConditionalListRes.price)) &&
        (this.qty == null ? v2ConditionalListRes.qty == null : this.qty.equals(v2ConditionalListRes.qty)) &&
        (this.timeInForce == null ? v2ConditionalListRes.timeInForce == null : this.timeInForce.equals(v2ConditionalListRes.timeInForce)) &&
        (this.stopOrderType == null ? v2ConditionalListRes.stopOrderType == null : this.stopOrderType.equals(v2ConditionalListRes.stopOrderType)) &&
        (this.triggerBy == null ? v2ConditionalListRes.triggerBy == null : this.triggerBy.equals(v2ConditionalListRes.triggerBy)) &&
        (this.basePrice == null ? v2ConditionalListRes.basePrice == null : this.basePrice.equals(v2ConditionalListRes.basePrice)) &&
        (this.orderLinkId == null ? v2ConditionalListRes.orderLinkId == null : this.orderLinkId.equals(v2ConditionalListRes.orderLinkId)) &&
        (this.stopPx == null ? v2ConditionalListRes.stopPx == null : this.stopPx.equals(v2ConditionalListRes.stopPx)) &&
        (this.stopOrderId == null ? v2ConditionalListRes.stopOrderId == null : this.stopOrderId.equals(v2ConditionalListRes.stopOrderId)) &&
        (this.createdAt == null ? v2ConditionalListRes.createdAt == null : this.createdAt.equals(v2ConditionalListRes.createdAt)) &&
        (this.updatedAt == null ? v2ConditionalListRes.updatedAt == null : this.updatedAt.equals(v2ConditionalListRes.updatedAt));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.userId == null ? 0: this.userId.hashCode());
    result = 31 * result + (this.stopOrderStatus == null ? 0: this.stopOrderStatus.hashCode());
    result = 31 * result + (this.symbol == null ? 0: this.symbol.hashCode());
    result = 31 * result + (this.side == null ? 0: this.side.hashCode());
    result = 31 * result + (this.orderType == null ? 0: this.orderType.hashCode());
    result = 31 * result + (this.price == null ? 0: this.price.hashCode());
    result = 31 * result + (this.qty == null ? 0: this.qty.hashCode());
    result = 31 * result + (this.timeInForce == null ? 0: this.timeInForce.hashCode());
    result = 31 * result + (this.stopOrderType == null ? 0: this.stopOrderType.hashCode());
    result = 31 * result + (this.triggerBy == null ? 0: this.triggerBy.hashCode());
    result = 31 * result + (this.basePrice == null ? 0: this.basePrice.hashCode());
    result = 31 * result + (this.orderLinkId == null ? 0: this.orderLinkId.hashCode());
    result = 31 * result + (this.stopPx == null ? 0: this.stopPx.hashCode());
    result = 31 * result + (this.stopOrderId == null ? 0: this.stopOrderId.hashCode());
    result = 31 * result + (this.createdAt == null ? 0: this.createdAt.hashCode());
    result = 31 * result + (this.updatedAt == null ? 0: this.updatedAt.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2ConditionalListRes {\n");
    
    sb.append("  userId: ").append(userId).append("\n");
    sb.append("  stopOrderStatus: ").append(stopOrderStatus).append("\n");
    sb.append("  symbol: ").append(symbol).append("\n");
    sb.append("  side: ").append(side).append("\n");
    sb.append("  orderType: ").append(orderType).append("\n");
    sb.append("  price: ").append(price).append("\n");
    sb.append("  qty: ").append(qty).append("\n");
    sb.append("  timeInForce: ").append(timeInForce).append("\n");
    sb.append("  stopOrderType: ").append(stopOrderType).append("\n");
    sb.append("  triggerBy: ").append(triggerBy).append("\n");
    sb.append("  basePrice: ").append(basePrice).append("\n");
    sb.append("  orderLinkId: ").append(orderLinkId).append("\n");
    sb.append("  stopPx: ").append(stopPx).append("\n");
    sb.append("  stopOrderId: ").append(stopOrderId).append("\n");
    sb.append("  createdAt: ").append(createdAt).append("\n");
    sb.append("  updatedAt: ").append(updatedAt).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

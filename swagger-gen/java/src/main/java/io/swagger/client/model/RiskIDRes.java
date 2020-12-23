/*
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

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * Set risk limit.
 */
@ApiModel(description = "Set risk limit.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-11-12T14:39:31.513+08:00")
public class RiskIDRes {
  @SerializedName("id")
  private BigDecimal id = null;

  @SerializedName("coin")
  private String coin = null;

  @SerializedName("limit")
  private BigDecimal limit = null;

  @SerializedName("maintain_margin")
  private String maintainMargin = null;

  @SerializedName("starting_margin")
  private String startingMargin = null;

  @SerializedName("section")
  private String section = null;

  @SerializedName("is_lowest_risk")
  private BigDecimal isLowestRisk = null;

  @SerializedName("created_at")
  private String createdAt = null;

  @SerializedName("updated_at")
  private String updatedAt = null;

  public RiskIDRes id(BigDecimal id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getId() {
    return id;
  }

  public void setId(BigDecimal id) {
    this.id = id;
  }

  public RiskIDRes coin(String coin) {
    this.coin = coin;
    return this;
  }

   /**
   * Get coin
   * @return coin
  **/
  @ApiModelProperty(value = "")
  public String getCoin() {
    return coin;
  }

  public void setCoin(String coin) {
    this.coin = coin;
  }

  public RiskIDRes limit(BigDecimal limit) {
    this.limit = limit;
    return this;
  }

   /**
   * Get limit
   * @return limit
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getLimit() {
    return limit;
  }

  public void setLimit(BigDecimal limit) {
    this.limit = limit;
  }

  public RiskIDRes maintainMargin(String maintainMargin) {
    this.maintainMargin = maintainMargin;
    return this;
  }

   /**
   * Get maintainMargin
   * @return maintainMargin
  **/
  @ApiModelProperty(value = "")
  public String getMaintainMargin() {
    return maintainMargin;
  }

  public void setMaintainMargin(String maintainMargin) {
    this.maintainMargin = maintainMargin;
  }

  public RiskIDRes startingMargin(String startingMargin) {
    this.startingMargin = startingMargin;
    return this;
  }

   /**
   * Get startingMargin
   * @return startingMargin
  **/
  @ApiModelProperty(value = "")
  public String getStartingMargin() {
    return startingMargin;
  }

  public void setStartingMargin(String startingMargin) {
    this.startingMargin = startingMargin;
  }

  public RiskIDRes section(String section) {
    this.section = section;
    return this;
  }

   /**
   * Get section
   * @return section
  **/
  @ApiModelProperty(value = "")
  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }

  public RiskIDRes isLowestRisk(BigDecimal isLowestRisk) {
    this.isLowestRisk = isLowestRisk;
    return this;
  }

   /**
   * Get isLowestRisk
   * @return isLowestRisk
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getIsLowestRisk() {
    return isLowestRisk;
  }

  public void setIsLowestRisk(BigDecimal isLowestRisk) {
    this.isLowestRisk = isLowestRisk;
  }

  public RiskIDRes createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @ApiModelProperty(value = "")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public RiskIDRes updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @ApiModelProperty(value = "")
  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskIDRes riskIDRes = (RiskIDRes) o;
    return Objects.equals(this.id, riskIDRes.id) &&
        Objects.equals(this.coin, riskIDRes.coin) &&
        Objects.equals(this.limit, riskIDRes.limit) &&
        Objects.equals(this.maintainMargin, riskIDRes.maintainMargin) &&
        Objects.equals(this.startingMargin, riskIDRes.startingMargin) &&
        Objects.equals(this.section, riskIDRes.section) &&
        Objects.equals(this.isLowestRisk, riskIDRes.isLowestRisk) &&
        Objects.equals(this.createdAt, riskIDRes.createdAt) &&
        Objects.equals(this.updatedAt, riskIDRes.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, coin, limit, maintainMargin, startingMargin, section, isLowestRisk, createdAt, updatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskIDRes {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    coin: ").append(toIndentedString(coin)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
    sb.append("    maintainMargin: ").append(toIndentedString(maintainMargin)).append("\n");
    sb.append("    startingMargin: ").append(toIndentedString(startingMargin)).append("\n");
    sb.append("    section: ").append(toIndentedString(section)).append("\n");
    sb.append("    isLowestRisk: ").append(toIndentedString(isLowestRisk)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}


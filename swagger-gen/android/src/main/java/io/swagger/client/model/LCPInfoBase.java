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
 * Query LCP info.
 **/
@ApiModel(description = "Query LCP info.")
public class LCPInfoBase {
  
  @SerializedName("date")
  private String date = null;
  @SerializedName("self_ratio")
  private BigDecimal selfRatio = null;
  @SerializedName("platform_ratio")
  private BigDecimal platformRatio = null;
  @SerializedName("score")
  private BigDecimal score = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public String getDate() {
    return date;
  }
  public void setDate(String date) {
    this.date = date;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getSelfRatio() {
    return selfRatio;
  }
  public void setSelfRatio(BigDecimal selfRatio) {
    this.selfRatio = selfRatio;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getPlatformRatio() {
    return platformRatio;
  }
  public void setPlatformRatio(BigDecimal platformRatio) {
    this.platformRatio = platformRatio;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public BigDecimal getScore() {
    return score;
  }
  public void setScore(BigDecimal score) {
    this.score = score;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LCPInfoBase lCPInfoBase = (LCPInfoBase) o;
    return (this.date == null ? lCPInfoBase.date == null : this.date.equals(lCPInfoBase.date)) &&
        (this.selfRatio == null ? lCPInfoBase.selfRatio == null : this.selfRatio.equals(lCPInfoBase.selfRatio)) &&
        (this.platformRatio == null ? lCPInfoBase.platformRatio == null : this.platformRatio.equals(lCPInfoBase.platformRatio)) &&
        (this.score == null ? lCPInfoBase.score == null : this.score.equals(lCPInfoBase.score));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.date == null ? 0: this.date.hashCode());
    result = 31 * result + (this.selfRatio == null ? 0: this.selfRatio.hashCode());
    result = 31 * result + (this.platformRatio == null ? 0: this.platformRatio.hashCode());
    result = 31 * result + (this.score == null ? 0: this.score.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class LCPInfoBase {\n");
    
    sb.append("  date: ").append(date).append("\n");
    sb.append("  selfRatio: ").append(selfRatio).append("\n");
    sb.append("  platformRatio: ").append(platformRatio).append("\n");
    sb.append("  score: ").append(score).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

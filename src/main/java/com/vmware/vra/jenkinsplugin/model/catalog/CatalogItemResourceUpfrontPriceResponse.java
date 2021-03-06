/*
 * Copyright (c) 2020 VMware, Inc
 *
 *  SPDX-License-Identifier: MIT
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

/*
 * VMware Service Broker API
 * A multi-cloud API for Cloud Automation Services
 *
 * OpenAPI spec version: 2020-08-25
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.vra.jenkinsplugin.model.catalog;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;

/** A response with upfront price for a resource in given catalog item */
@Schema(description = "A response with upfront price for a resource in given catalog item")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:27:41.063635-04:00[America/New_York]")
public class CatalogItemResourceUpfrontPriceResponse {
  @SerializedName("dailyAdditionalPrice")
  private BigDecimal dailyAdditionalPrice = null;

  @SerializedName("dailyComputePrice")
  private BigDecimal dailyComputePrice = null;

  @SerializedName("dailyNetworkPrice")
  private BigDecimal dailyNetworkPrice = null;

  @SerializedName("dailyStoragePrice")
  private BigDecimal dailyStoragePrice = null;

  @SerializedName("dailyTotalPrice")
  private BigDecimal dailyTotalPrice = null;

  @SerializedName("resourceName")
  private String resourceName = null;

  @SerializedName("resourceType")
  private String resourceType = null;

  @SerializedName("resourceUpfrontPriceId")
  private String resourceUpfrontPriceId = null;

  @SerializedName("status")
  private StatusEnum status = null;

  @SerializedName("statusDetails")
  private String statusDetails = null;

  @SerializedName("unit")
  private String unit = null;

  /**
   * Additional Price incurred for the catalog.
   *
   * @return dailyAdditionalPrice
   */
  @Schema(description = "Additional Price incurred for the catalog.")
  public BigDecimal getDailyAdditionalPrice() {
    return dailyAdditionalPrice;
  }

  /**
   * Compute Price of the catalog resource.
   *
   * @return dailyComputePrice
   */
  @Schema(description = "Compute Price of the catalog resource.")
  public BigDecimal getDailyComputePrice() {
    return dailyComputePrice;
  }

  /**
   * Network Price of the catalog resource.
   *
   * @return dailyNetworkPrice
   */
  @Schema(description = "Network Price of the catalog resource.")
  public BigDecimal getDailyNetworkPrice() {
    return dailyNetworkPrice;
  }

  /**
   * Storage Price of the catalog resource.
   *
   * @return dailyStoragePrice
   */
  @Schema(description = "Storage Price of the catalog resource.")
  public BigDecimal getDailyStoragePrice() {
    return dailyStoragePrice;
  }

  /**
   * Total Price of the catalog resource.
   *
   * @return dailyTotalPrice
   */
  @Schema(description = "Total Price of the catalog resource.")
  public BigDecimal getDailyTotalPrice() {
    return dailyTotalPrice;
  }

  public CatalogItemResourceUpfrontPriceResponse resourceName(String resourceName) {
    this.resourceName = resourceName;
    return this;
  }

  /**
   * Get resourceName
   *
   * @return resourceName
   */
  @Schema(description = "")
  public String getResourceName() {
    return resourceName;
  }

  public void setResourceName(String resourceName) {
    this.resourceName = resourceName;
  }

  public CatalogItemResourceUpfrontPriceResponse resourceType(String resourceType) {
    this.resourceType = resourceType;
    return this;
  }

  /**
   * Get resourceType
   *
   * @return resourceType
   */
  @Schema(description = "")
  public String getResourceType() {
    return resourceType;
  }

  public void setResourceType(String resourceType) {
    this.resourceType = resourceType;
  }

  /**
   * Id
   *
   * @return resourceUpfrontPriceId
   */
  @Schema(description = "Id")
  public String getResourceUpfrontPriceId() {
    return resourceUpfrontPriceId;
  }

  /**
   * Upfront price sync status
   *
   * @return status
   */
  @Schema(description = "Upfront price sync status")
  public StatusEnum getStatus() {
    return status;
  }

  /**
   * Upfront price status detail.
   *
   * @return statusDetails
   */
  @Schema(description = "Upfront price status detail.")
  public String getStatusDetails() {
    return statusDetails;
  }

  /**
   * Monetary unit.
   *
   * @return unit
   */
  @Schema(description = "Monetary unit.")
  public String getUnit() {
    return unit;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CatalogItemResourceUpfrontPriceResponse catalogItemResourceUpfrontPriceResponse =
        (CatalogItemResourceUpfrontPriceResponse) o;
    return Objects.equals(
            this.dailyAdditionalPrice, catalogItemResourceUpfrontPriceResponse.dailyAdditionalPrice)
        && Objects.equals(
            this.dailyComputePrice, catalogItemResourceUpfrontPriceResponse.dailyComputePrice)
        && Objects.equals(
            this.dailyNetworkPrice, catalogItemResourceUpfrontPriceResponse.dailyNetworkPrice)
        && Objects.equals(
            this.dailyStoragePrice, catalogItemResourceUpfrontPriceResponse.dailyStoragePrice)
        && Objects.equals(
            this.dailyTotalPrice, catalogItemResourceUpfrontPriceResponse.dailyTotalPrice)
        && Objects.equals(this.resourceName, catalogItemResourceUpfrontPriceResponse.resourceName)
        && Objects.equals(this.resourceType, catalogItemResourceUpfrontPriceResponse.resourceType)
        && Objects.equals(
            this.resourceUpfrontPriceId,
            catalogItemResourceUpfrontPriceResponse.resourceUpfrontPriceId)
        && Objects.equals(this.status, catalogItemResourceUpfrontPriceResponse.status)
        && Objects.equals(this.statusDetails, catalogItemResourceUpfrontPriceResponse.statusDetails)
        && Objects.equals(this.unit, catalogItemResourceUpfrontPriceResponse.unit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        dailyAdditionalPrice,
        dailyComputePrice,
        dailyNetworkPrice,
        dailyStoragePrice,
        dailyTotalPrice,
        resourceName,
        resourceType,
        resourceUpfrontPriceId,
        status,
        statusDetails,
        unit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CatalogItemResourceUpfrontPriceResponse {\n");

    sb.append("    dailyAdditionalPrice: ")
        .append(toIndentedString(dailyAdditionalPrice))
        .append("\n");
    sb.append("    dailyComputePrice: ").append(toIndentedString(dailyComputePrice)).append("\n");
    sb.append("    dailyNetworkPrice: ").append(toIndentedString(dailyNetworkPrice)).append("\n");
    sb.append("    dailyStoragePrice: ").append(toIndentedString(dailyStoragePrice)).append("\n");
    sb.append("    dailyTotalPrice: ").append(toIndentedString(dailyTotalPrice)).append("\n");
    sb.append("    resourceName: ").append(toIndentedString(resourceName)).append("\n");
    sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
    sb.append("    resourceUpfrontPriceId: ")
        .append(toIndentedString(resourceUpfrontPriceId))
        .append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusDetails: ").append(toIndentedString(statusDetails)).append("\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

  /** Upfront price sync status */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    SUCCESS("SUCCESS"),
    ERROR("ERROR"),
    DATA_NOT_AVAILABLE("DATA_NOT_AVAILABLE"),
    CURRENCY_NOT_SET("CURRENCY_NOT_SET");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration)
          throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }
}

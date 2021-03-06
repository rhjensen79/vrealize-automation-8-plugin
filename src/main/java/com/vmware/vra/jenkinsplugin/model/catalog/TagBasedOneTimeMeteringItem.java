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

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/** TagBasedOneTimeMeteringItem */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:27:41.063635-04:00[America/New_York]")
public class TagBasedOneTimeMeteringItem {
  @SerializedName("itemName")
  private String itemName = null;

  @SerializedName("oneTimeMeterings")
  private List<TagBasedOneTimeMetering> oneTimeMeterings = null;

  public TagBasedOneTimeMeteringItem itemName(String itemName) {
    this.itemName = itemName;
    return this;
  }

  /**
   * Get itemName
   *
   * @return itemName
   */
  @Schema(description = "")
  public String getItemName() {
    return itemName;
  }

  public void setItemName(String itemName) {
    this.itemName = itemName;
  }

  public TagBasedOneTimeMeteringItem oneTimeMeterings(
      List<TagBasedOneTimeMetering> oneTimeMeterings) {
    this.oneTimeMeterings = oneTimeMeterings;
    return this;
  }

  public TagBasedOneTimeMeteringItem addOneTimeMeteringsItem(
      TagBasedOneTimeMetering oneTimeMeteringsItem) {
    if (this.oneTimeMeterings == null) {
      this.oneTimeMeterings = new ArrayList<TagBasedOneTimeMetering>();
    }
    this.oneTimeMeterings.add(oneTimeMeteringsItem);
    return this;
  }

  /**
   * Get oneTimeMeterings
   *
   * @return oneTimeMeterings
   */
  @Schema(description = "")
  public List<TagBasedOneTimeMetering> getOneTimeMeterings() {
    return oneTimeMeterings;
  }

  public void setOneTimeMeterings(List<TagBasedOneTimeMetering> oneTimeMeterings) {
    this.oneTimeMeterings = oneTimeMeterings;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TagBasedOneTimeMeteringItem tagBasedOneTimeMeteringItem = (TagBasedOneTimeMeteringItem) o;
    return Objects.equals(this.itemName, tagBasedOneTimeMeteringItem.itemName)
        && Objects.equals(this.oneTimeMeterings, tagBasedOneTimeMeteringItem.oneTimeMeterings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemName, oneTimeMeterings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TagBasedOneTimeMeteringItem {\n");

    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    oneTimeMeterings: ").append(toIndentedString(oneTimeMeterings)).append("\n");
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
}

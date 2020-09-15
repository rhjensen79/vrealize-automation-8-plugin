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
 * VMware Cloud Assembly IaaS API
 * A multi-cloud IaaS API for Cloud Automation Services
 *
 * OpenAPI spec version: 2019-01-15
 *
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.vmware.vra.jenkinsplugin.model.iaas;

import com.google.gson.annotations.SerializedName;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.Objects;

/** Represents a fabric flavor from the corresponding cloud end-point */
@Schema(description = "Represents a fabric flavor from the corresponding cloud end-point")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class FabricFlavor {
  @SerializedName("bootDiskSizeInMB")
  private Integer bootDiskSizeInMB = null;

  @SerializedName("memoryInMB")
  private Long memoryInMB = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("storageType")
  private String storageType = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("dataDiskSizeInMB")
  private Integer dataDiskSizeInMB = null;

  @SerializedName("dataDiskMaxCount")
  private Integer dataDiskMaxCount = null;

  @SerializedName("networkType")
  private String networkType = null;

  @SerializedName("cpuCount")
  private Integer cpuCount = null;

  public FabricFlavor bootDiskSizeInMB(Integer bootDiskSizeInMB) {
    this.bootDiskSizeInMB = bootDiskSizeInMB;
    return this;
  }

  /**
   * Size of the boot disk (in megabytes). Not populated when inapplicable.
   *
   * @return bootDiskSizeInMB
   */
  @Schema(
      example = "486400",
      description = "Size of the boot disk (in megabytes). Not populated when inapplicable.")
  public Integer getBootDiskSizeInMB() {
    return bootDiskSizeInMB;
  }

  public void setBootDiskSizeInMB(Integer bootDiskSizeInMB) {
    this.bootDiskSizeInMB = bootDiskSizeInMB;
  }

  public FabricFlavor memoryInMB(Long memoryInMB) {
    this.memoryInMB = memoryInMB;
    return this;
  }

  /**
   * Total amount of memory (in megabytes). Not populated when inapplicable.
   *
   * @return memoryInMB
   */
  @Schema(
      example = "15616",
      description = "Total amount of memory (in megabytes). Not populated when inapplicable.")
  public Long getMemoryInMB() {
    return memoryInMB;
  }

  public void setMemoryInMB(Long memoryInMB) {
    this.memoryInMB = memoryInMB;
  }

  public FabricFlavor name(String name) {
    this.name = name;
    return this;
  }

  /**
   * The value of the instance type in the corresponding cloud.
   *
   * @return name
   */
  @Schema(
      example = "i3.large",
      required = true,
      description = "The value of the instance type in the corresponding cloud.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FabricFlavor storageType(String storageType) {
    this.storageType = storageType;
    return this;
  }

  /**
   * The type of storage supported by this instance type. Not populated when inapplicable.
   *
   * @return storageType
   */
  @Schema(
      example = "NVMe_SSD",
      description =
          "The type of storage supported by this instance type. Not populated when inapplicable.")
  public String getStorageType() {
    return storageType;
  }

  public void setStorageType(String storageType) {
    this.storageType = storageType;
  }

  public FabricFlavor id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The internal identification used by the corresponding cloud end-point
   *
   * @return id
   */
  @Schema(
      example = "i3.large",
      description = "The internal identification used by the corresponding cloud end-point")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FabricFlavor dataDiskSizeInMB(Integer dataDiskSizeInMB) {
    this.dataDiskSizeInMB = dataDiskSizeInMB;
    return this;
  }

  /**
   * Size of the data disks (in megabytes). Not populated when inapplicable.
   *
   * @return dataDiskSizeInMB
   */
  @Schema(
      example = "486400",
      description = "Size of the data disks (in megabytes). Not populated when inapplicable.")
  public Integer getDataDiskSizeInMB() {
    return dataDiskSizeInMB;
  }

  public void setDataDiskSizeInMB(Integer dataDiskSizeInMB) {
    this.dataDiskSizeInMB = dataDiskSizeInMB;
  }

  public FabricFlavor dataDiskMaxCount(Integer dataDiskMaxCount) {
    this.dataDiskMaxCount = dataDiskMaxCount;
    return this;
  }

  /**
   * Number of data disks. Not populated when inapplicable.
   *
   * @return dataDiskMaxCount
   */
  @Schema(example = "1", description = "Number of data disks. Not populated when inapplicable.")
  public Integer getDataDiskMaxCount() {
    return dataDiskMaxCount;
  }

  public void setDataDiskMaxCount(Integer dataDiskMaxCount) {
    this.dataDiskMaxCount = dataDiskMaxCount;
  }

  public FabricFlavor networkType(String networkType) {
    this.networkType = networkType;
    return this;
  }

  /**
   * The type of network supported by this instance type. Not populated when inapplicable.
   *
   * @return networkType
   */
  @Schema(
      example = "Up to 10 Gigabit",
      description =
          "The type of network supported by this instance type. Not populated when inapplicable.")
  public String getNetworkType() {
    return networkType;
  }

  public void setNetworkType(String networkType) {
    this.networkType = networkType;
  }

  public FabricFlavor cpuCount(Integer cpuCount) {
    this.cpuCount = cpuCount;
    return this;
  }

  /**
   * Number of CPU cores. Not populated when inapplicable.
   *
   * @return cpuCount
   */
  @Schema(example = "2", description = "Number of CPU cores. Not populated when inapplicable.")
  public Integer getCpuCount() {
    return cpuCount;
  }

  public void setCpuCount(Integer cpuCount) {
    this.cpuCount = cpuCount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FabricFlavor fabricFlavor = (FabricFlavor) o;
    return Objects.equals(this.bootDiskSizeInMB, fabricFlavor.bootDiskSizeInMB)
        && Objects.equals(this.memoryInMB, fabricFlavor.memoryInMB)
        && Objects.equals(this.name, fabricFlavor.name)
        && Objects.equals(this.storageType, fabricFlavor.storageType)
        && Objects.equals(this.id, fabricFlavor.id)
        && Objects.equals(this.dataDiskSizeInMB, fabricFlavor.dataDiskSizeInMB)
        && Objects.equals(this.dataDiskMaxCount, fabricFlavor.dataDiskMaxCount)
        && Objects.equals(this.networkType, fabricFlavor.networkType)
        && Objects.equals(this.cpuCount, fabricFlavor.cpuCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        bootDiskSizeInMB,
        memoryInMB,
        name,
        storageType,
        id,
        dataDiskSizeInMB,
        dataDiskMaxCount,
        networkType,
        cpuCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FabricFlavor {\n");

    sb.append("    bootDiskSizeInMB: ").append(toIndentedString(bootDiskSizeInMB)).append("\n");
    sb.append("    memoryInMB: ").append(toIndentedString(memoryInMB)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    storageType: ").append(toIndentedString(storageType)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    dataDiskSizeInMB: ").append(toIndentedString(dataDiskSizeInMB)).append("\n");
    sb.append("    dataDiskMaxCount: ").append(toIndentedString(dataDiskMaxCount)).append("\n");
    sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
    sb.append("    cpuCount: ").append(toIndentedString(cpuCount)).append("\n");
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

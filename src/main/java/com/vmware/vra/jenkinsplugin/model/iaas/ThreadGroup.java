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

/** ThreadGroup */
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class ThreadGroup {
  @SerializedName("parent")
  private ThreadGroup parent = null;

  @SerializedName("maxPriority")
  private Integer maxPriority = null;

  @SerializedName("destroyed")
  private Boolean destroyed = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("daemon")
  private Boolean daemon = null;

  public ThreadGroup parent(ThreadGroup parent) {
    this.parent = parent;
    return this;
  }

  /**
   * Get parent
   *
   * @return parent
   */
  @Schema(description = "")
  public ThreadGroup getParent() {
    return parent;
  }

  public void setParent(ThreadGroup parent) {
    this.parent = parent;
  }

  public ThreadGroup maxPriority(Integer maxPriority) {
    this.maxPriority = maxPriority;
    return this;
  }

  /**
   * Get maxPriority
   *
   * @return maxPriority
   */
  @Schema(description = "")
  public Integer getMaxPriority() {
    return maxPriority;
  }

  public void setMaxPriority(Integer maxPriority) {
    this.maxPriority = maxPriority;
  }

  public ThreadGroup destroyed(Boolean destroyed) {
    this.destroyed = destroyed;
    return this;
  }

  /**
   * Get destroyed
   *
   * @return destroyed
   */
  @Schema(description = "")
  public Boolean isDestroyed() {
    return destroyed;
  }

  public void setDestroyed(Boolean destroyed) {
    this.destroyed = destroyed;
  }

  public ThreadGroup name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   *
   * @return name
   */
  @Schema(description = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ThreadGroup daemon(Boolean daemon) {
    this.daemon = daemon;
    return this;
  }

  /**
   * Get daemon
   *
   * @return daemon
   */
  @Schema(description = "")
  public Boolean isDaemon() {
    return daemon;
  }

  public void setDaemon(Boolean daemon) {
    this.daemon = daemon;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThreadGroup threadGroup = (ThreadGroup) o;
    return Objects.equals(this.parent, threadGroup.parent)
        && Objects.equals(this.maxPriority, threadGroup.maxPriority)
        && Objects.equals(this.destroyed, threadGroup.destroyed)
        && Objects.equals(this.name, threadGroup.name)
        && Objects.equals(this.daemon, threadGroup.daemon);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, maxPriority, destroyed, name, daemon);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThreadGroup {\n");

    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    maxPriority: ").append(toIndentedString(maxPriority)).append("\n");
    sb.append("    destroyed: ").append(toIndentedString(destroyed)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    daemon: ").append(toIndentedString(daemon)).append("\n");
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

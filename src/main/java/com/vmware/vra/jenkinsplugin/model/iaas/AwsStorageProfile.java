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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * Defines a structure that holds list of storage policies defined for AWS for a specific
 * region.**HATEOAS** links:&lt;br&gt;**region** - Region - Region for the
 * profile.&lt;br&gt;**self** - AwsStorageProfile - Self link to this aws Storage Profile
 */
@Schema(
    description =
        "Defines a structure that holds list of storage policies defined for AWS for a specific region.**HATEOAS** links:<br>**region** - Region - Region for the profile.<br>**self** - AwsStorageProfile - Self link to this aws Storage Profile")
@javax.annotation.Generated(
    value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen",
    date = "2020-09-09T18:26:35.661905-04:00[America/New_York]")
public class AwsStorageProfile {
  @SerializedName("owner")
  private String owner = null;

  @SerializedName("deviceType")
  private String deviceType = null;

  @SerializedName("volumeType")
  private String volumeType = null;

  @SerializedName("_links")
  private Map<String, Href> _links = new HashMap<String, Href>();

  @SerializedName("supportsEncryption")
  private Boolean supportsEncryption = null;

  @SerializedName("externalRegionId")
  private String externalRegionId = null;

  @SerializedName("cloudAccountId")
  private String cloudAccountId = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("orgId")
  private String orgId = null;

  @SerializedName("tags")
  private List<Tag> tags = null;

  @SerializedName("organizationId")
  private String organizationId = null;

  @SerializedName("createdAt")
  private String createdAt = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("iops")
  private String iops = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("defaultItem")
  private Boolean defaultItem = null;

  @SerializedName("updatedAt")
  private String updatedAt = null;

  public AwsStorageProfile owner(String owner) {
    this.owner = owner;
    return this;
  }

  /**
   * Email of the user that owns the entity.
   *
   * @return owner
   */
  @Schema(example = "csp@vmware.com", description = "Email of the user that owns the entity.")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public AwsStorageProfile deviceType(String deviceType) {
    this.deviceType = deviceType;
    return this;
  }

  /**
   * Indicates the type of storage device.
   *
   * @return deviceType
   */
  @Schema(example = "ebs / instance-store", description = "Indicates the type of storage device.")
  public String getDeviceType() {
    return deviceType;
  }

  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }

  public AwsStorageProfile volumeType(String volumeType) {
    this.volumeType = volumeType;
    return this;
  }

  /**
   * Indicates the type of volume associated with type of storage device.
   *
   * @return volumeType
   */
  @Schema(
      example = "gp2 / io1 / sc1 / st1 / standard",
      description = "Indicates the type of volume associated with type of storage device.")
  public String getVolumeType() {
    return volumeType;
  }

  public void setVolumeType(String volumeType) {
    this.volumeType = volumeType;
  }

  public AwsStorageProfile _links(Map<String, Href> _links) {
    this._links = _links;
    return this;
  }

  public AwsStorageProfile putLinksItem(String key, Href _linksItem) {
    this._links.put(key, _linksItem);
    return this;
  }

  /**
   * HATEOAS of the entity
   *
   * @return _links
   */
  @Schema(required = true, description = "HATEOAS of the entity")
  public Map<String, Href> getLinks() {
    return _links;
  }

  public void setLinks(Map<String, Href> _links) {
    this._links = _links;
  }

  public AwsStorageProfile supportsEncryption(Boolean supportsEncryption) {
    this.supportsEncryption = supportsEncryption;
    return this;
  }

  /**
   * Indicates whether this storage profile supports encryption or not.
   *
   * @return supportsEncryption
   */
  @Schema(
      example = "false",
      description = "Indicates whether this storage profile supports encryption or not.")
  public Boolean isSupportsEncryption() {
    return supportsEncryption;
  }

  public void setSupportsEncryption(Boolean supportsEncryption) {
    this.supportsEncryption = supportsEncryption;
  }

  public AwsStorageProfile externalRegionId(String externalRegionId) {
    this.externalRegionId = externalRegionId;
    return this;
  }

  /**
   * The id of the region for which this profile is defined
   *
   * @return externalRegionId
   */
  @Schema(
      example = "us-east-1",
      description = "The id of the region for which this profile is defined")
  public String getExternalRegionId() {
    return externalRegionId;
  }

  public void setExternalRegionId(String externalRegionId) {
    this.externalRegionId = externalRegionId;
  }

  public AwsStorageProfile cloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
    return this;
  }

  /**
   * Id of the cloud account this storage profile belongs to.
   *
   * @return cloudAccountId
   */
  @Schema(
      example = "[9e49]",
      description = "Id of the cloud account this storage profile belongs to.")
  public String getCloudAccountId() {
    return cloudAccountId;
  }

  public void setCloudAccountId(String cloudAccountId) {
    this.cloudAccountId = cloudAccountId;
  }

  public AwsStorageProfile description(String description) {
    this.description = description;
    return this;
  }

  /**
   * A human-friendly description.
   *
   * @return description
   */
  @Schema(example = "my-description", description = "A human-friendly description.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AwsStorageProfile orgId(String orgId) {
    this.orgId = orgId;
    return this;
  }

  /**
   * The id of the organization this entity belongs to.
   *
   * @return orgId
   */
  @Schema(example = "9.0E+49", description = "The id of the organization this entity belongs to.")
  public String getOrgId() {
    return orgId;
  }

  public void setOrgId(String orgId) {
    this.orgId = orgId;
  }

  public AwsStorageProfile tags(List<Tag> tags) {
    this.tags = tags;
    return this;
  }

  public AwsStorageProfile addTagsItem(Tag tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<Tag>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * A list of tags that represent the capabilities of this storage profile
   *
   * @return tags
   */
  @Schema(
      example = "[ { \"key\" : \"tier\", \"value\": \"silver\" } ]",
      description = "A list of tags that represent the capabilities of this storage profile")
  public List<Tag> getTags() {
    return tags;
  }

  public void setTags(List<Tag> tags) {
    this.tags = tags;
  }

  public AwsStorageProfile organizationId(String organizationId) {
    this.organizationId = organizationId;
    return this;
  }

  /**
   * This field is deprecated. Use orgId instead. The id of the organization this entity belongs to.
   *
   * @return organizationId
   */
  @Schema(
      example = "deprecated",
      description =
          "This field is deprecated. Use orgId instead. The id of the organization this entity belongs to.")
  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public AwsStorageProfile createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date when the entity was created. The date is in ISO 8601 and UTC.
   *
   * @return createdAt
   */
  @Schema(
      example = "2012-09-27",
      description = "Date when the entity was created. The date is in ISO 8601 and UTC.")
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public AwsStorageProfile name(String name) {
    this.name = name;
    return this;
  }

  /**
   * A human-friendly name used as an identifier in APIs that support this option.
   *
   * @return name
   */
  @Schema(
      example = "my-name",
      description = "A human-friendly name used as an identifier in APIs that support this option.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public AwsStorageProfile iops(String iops) {
    this.iops = iops;
    return this;
  }

  /**
   * Indicates maximum I/O operations per second in range(1-20,000).
   *
   * @return iops
   */
  @Schema(
      example = "2000",
      description = "Indicates maximum I/O operations per second in range(1-20,000).")
  public String getIops() {
    return iops;
  }

  public void setIops(String iops) {
    this.iops = iops;
  }

  public AwsStorageProfile id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The id of this resource instance
   *
   * @return id
   */
  @Schema(example = "9.0E+49", required = true, description = "The id of this resource instance")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AwsStorageProfile defaultItem(Boolean defaultItem) {
    this.defaultItem = defaultItem;
    return this;
  }

  /**
   * Indicates whether this storage profile is default or not..
   *
   * @return defaultItem
   */
  @Schema(
      example = "false",
      required = true,
      description = "Indicates whether this storage profile is default or not..")
  public Boolean isDefaultItem() {
    return defaultItem;
  }

  public void setDefaultItem(Boolean defaultItem) {
    this.defaultItem = defaultItem;
  }

  public AwsStorageProfile updatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
    return this;
  }

  /**
   * Date when the entity was last updated. The date is ISO 8601 and UTC.
   *
   * @return updatedAt
   */
  @Schema(
      example = "2012-09-27",
      description = "Date when the entity was last updated. The date is ISO 8601 and UTC.")
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
    AwsStorageProfile awsStorageProfile = (AwsStorageProfile) o;
    return Objects.equals(this.owner, awsStorageProfile.owner)
        && Objects.equals(this.deviceType, awsStorageProfile.deviceType)
        && Objects.equals(this.volumeType, awsStorageProfile.volumeType)
        && Objects.equals(this._links, awsStorageProfile._links)
        && Objects.equals(this.supportsEncryption, awsStorageProfile.supportsEncryption)
        && Objects.equals(this.externalRegionId, awsStorageProfile.externalRegionId)
        && Objects.equals(this.cloudAccountId, awsStorageProfile.cloudAccountId)
        && Objects.equals(this.description, awsStorageProfile.description)
        && Objects.equals(this.orgId, awsStorageProfile.orgId)
        && Objects.equals(this.tags, awsStorageProfile.tags)
        && Objects.equals(this.organizationId, awsStorageProfile.organizationId)
        && Objects.equals(this.createdAt, awsStorageProfile.createdAt)
        && Objects.equals(this.name, awsStorageProfile.name)
        && Objects.equals(this.iops, awsStorageProfile.iops)
        && Objects.equals(this.id, awsStorageProfile.id)
        && Objects.equals(this.defaultItem, awsStorageProfile.defaultItem)
        && Objects.equals(this.updatedAt, awsStorageProfile.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(
        owner,
        deviceType,
        volumeType,
        _links,
        supportsEncryption,
        externalRegionId,
        cloudAccountId,
        description,
        orgId,
        tags,
        organizationId,
        createdAt,
        name,
        iops,
        id,
        defaultItem,
        updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AwsStorageProfile {\n");

    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    volumeType: ").append(toIndentedString(volumeType)).append("\n");
    sb.append("    _links: ").append(toIndentedString(_links)).append("\n");
    sb.append("    supportsEncryption: ").append(toIndentedString(supportsEncryption)).append("\n");
    sb.append("    externalRegionId: ").append(toIndentedString(externalRegionId)).append("\n");
    sb.append("    cloudAccountId: ").append(toIndentedString(cloudAccountId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    orgId: ").append(toIndentedString(orgId)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("    organizationId: ").append(toIndentedString(organizationId)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    iops: ").append(toIndentedString(iops)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    defaultItem: ").append(toIndentedString(defaultItem)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

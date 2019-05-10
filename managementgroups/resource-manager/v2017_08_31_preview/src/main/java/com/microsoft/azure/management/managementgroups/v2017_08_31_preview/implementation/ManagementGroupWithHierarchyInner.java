/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2017_08_31_preview.implementation;

import java.util.UUID;
import com.microsoft.azure.management.managementgroups.v2017_08_31_preview.ManagementGroupDetailsProperties;
import java.util.List;
import com.microsoft.azure.management.managementgroups.v2017_08_31_preview.ManagementGroupRecursiveChildInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The management group details.
 */
@JsonFlatten
public class ManagementGroupWithHierarchyInner {
    /**
     * The ID of the management group. E.g.
     * /providers/Microsoft.Management/managementGroups/20000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The type of the resource. E.g.
     * /providers/Microsoft.Management/managementGroups.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * The name of the management group. E.g.
     * 20000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private UUID name;

    /**
     * The AAD Tenant ID associated with the management group. E.g.
     * 10000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "properties.tenantId")
    private UUID tenantId;

    /**
     * The friendly name of the management group.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Details.
     */
    @JsonProperty(value = "properties.details")
    private ManagementGroupDetailsProperties details;

    /**
     * The list of children.
     */
    @JsonProperty(value = "properties.children")
    private List<ManagementGroupRecursiveChildInfo> children;

    /**
     * Get the ID of the management group. E.g. /providers/Microsoft.Management/managementGroups/20000000-0000-0000-0000-000000000000.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the type of the resource. E.g. /providers/Microsoft.Management/managementGroups.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the name of the management group. E.g. 20000000-0000-0000-0000-000000000000.
     *
     * @return the name value
     */
    public UUID name() {
        return this.name;
    }

    /**
     * Get the AAD Tenant ID associated with the management group. E.g. 10000000-0000-0000-0000-000000000000.
     *
     * @return the tenantId value
     */
    public UUID tenantId() {
        return this.tenantId;
    }

    /**
     * Set the AAD Tenant ID associated with the management group. E.g. 10000000-0000-0000-0000-000000000000.
     *
     * @param tenantId the tenantId value to set
     * @return the ManagementGroupWithHierarchyInner object itself.
     */
    public ManagementGroupWithHierarchyInner withTenantId(UUID tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Get the friendly name of the management group.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the friendly name of the management group.
     *
     * @param displayName the displayName value to set
     * @return the ManagementGroupWithHierarchyInner object itself.
     */
    public ManagementGroupWithHierarchyInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the details value.
     *
     * @return the details value
     */
    public ManagementGroupDetailsProperties details() {
        return this.details;
    }

    /**
     * Set the details value.
     *
     * @param details the details value to set
     * @return the ManagementGroupWithHierarchyInner object itself.
     */
    public ManagementGroupWithHierarchyInner withDetails(ManagementGroupDetailsProperties details) {
        this.details = details;
        return this;
    }

    /**
     * Get the list of children.
     *
     * @return the children value
     */
    public List<ManagementGroupRecursiveChildInfo> children() {
        return this.children;
    }

    /**
     * Set the list of children.
     *
     * @param children the children value to set
     * @return the ManagementGroupWithHierarchyInner object itself.
     */
    public ManagementGroupWithHierarchyInner withChildren(List<ManagementGroupRecursiveChildInfo> children) {
        this.children = children;
        return this;
    }

}
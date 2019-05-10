/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2017_11_01_preview;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The child information of a management group.
 */
public class ManagementGroupChildInfo {
    /**
     * The type of child resource.
     * Possible values include: 'ManagementGroup', 'Subscription'.
     */
    @JsonProperty(value = "childType")
    private String childType;

    /**
     * The fully qualified ID for the child resource (management group or
     * subscription).  For example,
     * /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "childId")
    private String childId;

    /**
     * The friendly name of the child resource.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * The list of children.
     */
    @JsonProperty(value = "children")
    private List<ManagementGroupChildInfo> children;

    /**
     * Get possible values include: 'ManagementGroup', 'Subscription'.
     *
     * @return the childType value
     */
    public String childType() {
        return this.childType;
    }

    /**
     * Set possible values include: 'ManagementGroup', 'Subscription'.
     *
     * @param childType the childType value to set
     * @return the ManagementGroupChildInfo object itself.
     */
    public ManagementGroupChildInfo withChildType(String childType) {
        this.childType = childType;
        return this;
    }

    /**
     * Get the fully qualified ID for the child resource (management group or subscription).  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     *
     * @return the childId value
     */
    public String childId() {
        return this.childId;
    }

    /**
     * Set the fully qualified ID for the child resource (management group or subscription).  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000.
     *
     * @param childId the childId value to set
     * @return the ManagementGroupChildInfo object itself.
     */
    public ManagementGroupChildInfo withChildId(String childId) {
        this.childId = childId;
        return this;
    }

    /**
     * Get the friendly name of the child resource.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set the friendly name of the child resource.
     *
     * @param displayName the displayName value to set
     * @return the ManagementGroupChildInfo object itself.
     */
    public ManagementGroupChildInfo withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the list of children.
     *
     * @return the children value
     */
    public List<ManagementGroupChildInfo> children() {
        return this.children;
    }

    /**
     * Set the list of children.
     *
     * @param children the children value to set
     * @return the ManagementGroupChildInfo object itself.
     */
    public ManagementGroupChildInfo withChildren(List<ManagementGroupChildInfo> children) {
        this.children = children;
        return this;
    }

}
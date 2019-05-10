/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.managementgroups.v2018_03_01_preview.implementation;

import com.microsoft.azure.management.managementgroups.v2018_03_01_preview.DescendantParentGroupInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;

/**
 * The descendant.
 */
@JsonFlatten
public class DescendantInfoInner {
    /**
     * The fully qualified ID for the descendant.  For example,
     * /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000
     * or /subscriptions/0000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /**
     * The type of the resource. For example,
     * /providers/Microsoft.Management/managementGroups or /subscriptions.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * The name of the descendant. For example,
     * 00000000-0000-0000-0000-000000000000.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * The friendly name of the management group.
     */
    @JsonProperty(value = "properties.displayName")
    private String displayName;

    /**
     * Parent.
     */
    @JsonProperty(value = "properties.parent")
    private DescendantParentGroupInfo parent;

    /**
     * Get the fully qualified ID for the descendant.  For example, /providers/Microsoft.Management/managementGroups/0000000-0000-0000-0000-000000000000 or /subscriptions/0000000-0000-0000-0000-000000000000.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the type of the resource. For example, /providers/Microsoft.Management/managementGroups or /subscriptions.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the name of the descendant. For example, 00000000-0000-0000-0000-000000000000.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
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
     * @return the DescendantInfoInner object itself.
     */
    public DescendantInfoInner withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get the parent value.
     *
     * @return the parent value
     */
    public DescendantParentGroupInfo parent() {
        return this.parent;
    }

    /**
     * Set the parent value.
     *
     * @param parent the parent value to set
     * @return the DescendantInfoInner object itself.
     */
    public DescendantInfoInner withParent(DescendantParentGroupInfo parent) {
        this.parent = parent;
        return this;
    }

}
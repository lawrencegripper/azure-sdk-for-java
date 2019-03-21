/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01.implementation;

import com.microsoft.azure.management.containerregistry.v2018_09_01.RunStatus;
import org.joda.time.DateTime;
import com.microsoft.azure.management.containerregistry.v2018_09_01.RunType;
import java.util.List;
import com.microsoft.azure.management.containerregistry.v2018_09_01.ImageDescriptor;
import com.microsoft.azure.management.containerregistry.v2018_09_01.ImageUpdateTrigger;
import com.microsoft.azure.management.containerregistry.v2018_09_01.SourceTriggerDescriptor;
import com.microsoft.azure.management.containerregistry.v2018_09_01.PlatformProperties;
import com.microsoft.azure.management.containerregistry.v2018_09_01.AgentProperties;
import com.microsoft.azure.management.containerregistry.v2018_09_01.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.ProxyResource;

/**
 * Run resource properties.
 */
@JsonFlatten
public class RunInner extends ProxyResource {
    /**
     * The unique identifier for the run.
     */
    @JsonProperty(value = "properties.runId")
    private String runId;

    /**
     * The current status of the run. Possible values include: 'Queued',
     * 'Started', 'Running', 'Succeeded', 'Failed', 'Canceled', 'Error',
     * 'Timeout'.
     */
    @JsonProperty(value = "properties.status")
    private RunStatus status;

    /**
     * The last updated time for the run.
     */
    @JsonProperty(value = "properties.lastUpdatedTime")
    private DateTime lastUpdatedTime;

    /**
     * The type of run. Possible values include: 'QuickBuild', 'QuickRun',
     * 'AutoBuild', 'AutoRun'.
     */
    @JsonProperty(value = "properties.runType")
    private RunType runType;

    /**
     * The time the run was scheduled.
     */
    @JsonProperty(value = "properties.createTime")
    private DateTime createTime;

    /**
     * The time the run started.
     */
    @JsonProperty(value = "properties.startTime")
    private DateTime startTime;

    /**
     * The time the run finished.
     */
    @JsonProperty(value = "properties.finishTime")
    private DateTime finishTime;

    /**
     * The list of all images that were generated from the run. This is
     * applicable if the run generates base image dependencies.
     */
    @JsonProperty(value = "properties.outputImages")
    private List<ImageDescriptor> outputImages;

    /**
     * The task against which run was scheduled.
     */
    @JsonProperty(value = "properties.task")
    private String task;

    /**
     * The image update trigger that caused the run. This is applicable if the
     * task has base image trigger configured.
     */
    @JsonProperty(value = "properties.imageUpdateTrigger")
    private ImageUpdateTrigger imageUpdateTrigger;

    /**
     * The source trigger that caused the run.
     */
    @JsonProperty(value = "properties.sourceTrigger")
    private SourceTriggerDescriptor sourceTrigger;

    /**
     * The platform properties against which the run will happen.
     */
    @JsonProperty(value = "properties.platform")
    private PlatformProperties platform;

    /**
     * The machine configuration of the run agent.
     */
    @JsonProperty(value = "properties.agentConfiguration")
    private AgentProperties agentConfiguration;

    /**
     * The scope of the credentials that were used to login to the source
     * registry during this run.
     */
    @JsonProperty(value = "properties.sourceRegistryAuth")
    private String sourceRegistryAuth;

    /**
     * The list of custom registries that were logged in during this run.
     */
    @JsonProperty(value = "properties.customRegistries")
    private List<String> customRegistries;

    /**
     * The provisioning state of a run. Possible values include: 'Creating',
     * 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * The value that indicates whether archiving is enabled or not.
     */
    @JsonProperty(value = "properties.isArchiveEnabled")
    private Boolean isArchiveEnabled;

    /**
     * Get the unique identifier for the run.
     *
     * @return the runId value
     */
    public String runId() {
        return this.runId;
    }

    /**
     * Set the unique identifier for the run.
     *
     * @param runId the runId value to set
     * @return the RunInner object itself.
     */
    public RunInner withRunId(String runId) {
        this.runId = runId;
        return this;
    }

    /**
     * Get the current status of the run. Possible values include: 'Queued', 'Started', 'Running', 'Succeeded', 'Failed', 'Canceled', 'Error', 'Timeout'.
     *
     * @return the status value
     */
    public RunStatus status() {
        return this.status;
    }

    /**
     * Set the current status of the run. Possible values include: 'Queued', 'Started', 'Running', 'Succeeded', 'Failed', 'Canceled', 'Error', 'Timeout'.
     *
     * @param status the status value to set
     * @return the RunInner object itself.
     */
    public RunInner withStatus(RunStatus status) {
        this.status = status;
        return this;
    }

    /**
     * Get the last updated time for the run.
     *
     * @return the lastUpdatedTime value
     */
    public DateTime lastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * Set the last updated time for the run.
     *
     * @param lastUpdatedTime the lastUpdatedTime value to set
     * @return the RunInner object itself.
     */
    public RunInner withLastUpdatedTime(DateTime lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
        return this;
    }

    /**
     * Get the type of run. Possible values include: 'QuickBuild', 'QuickRun', 'AutoBuild', 'AutoRun'.
     *
     * @return the runType value
     */
    public RunType runType() {
        return this.runType;
    }

    /**
     * Set the type of run. Possible values include: 'QuickBuild', 'QuickRun', 'AutoBuild', 'AutoRun'.
     *
     * @param runType the runType value to set
     * @return the RunInner object itself.
     */
    public RunInner withRunType(RunType runType) {
        this.runType = runType;
        return this;
    }

    /**
     * Get the time the run was scheduled.
     *
     * @return the createTime value
     */
    public DateTime createTime() {
        return this.createTime;
    }

    /**
     * Set the time the run was scheduled.
     *
     * @param createTime the createTime value to set
     * @return the RunInner object itself.
     */
    public RunInner withCreateTime(DateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * Get the time the run started.
     *
     * @return the startTime value
     */
    public DateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the time the run started.
     *
     * @param startTime the startTime value to set
     * @return the RunInner object itself.
     */
    public RunInner withStartTime(DateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the time the run finished.
     *
     * @return the finishTime value
     */
    public DateTime finishTime() {
        return this.finishTime;
    }

    /**
     * Set the time the run finished.
     *
     * @param finishTime the finishTime value to set
     * @return the RunInner object itself.
     */
    public RunInner withFinishTime(DateTime finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * Get the list of all images that were generated from the run. This is applicable if the run generates base image dependencies.
     *
     * @return the outputImages value
     */
    public List<ImageDescriptor> outputImages() {
        return this.outputImages;
    }

    /**
     * Set the list of all images that were generated from the run. This is applicable if the run generates base image dependencies.
     *
     * @param outputImages the outputImages value to set
     * @return the RunInner object itself.
     */
    public RunInner withOutputImages(List<ImageDescriptor> outputImages) {
        this.outputImages = outputImages;
        return this;
    }

    /**
     * Get the task against which run was scheduled.
     *
     * @return the task value
     */
    public String task() {
        return this.task;
    }

    /**
     * Set the task against which run was scheduled.
     *
     * @param task the task value to set
     * @return the RunInner object itself.
     */
    public RunInner withTask(String task) {
        this.task = task;
        return this;
    }

    /**
     * Get the image update trigger that caused the run. This is applicable if the task has base image trigger configured.
     *
     * @return the imageUpdateTrigger value
     */
    public ImageUpdateTrigger imageUpdateTrigger() {
        return this.imageUpdateTrigger;
    }

    /**
     * Set the image update trigger that caused the run. This is applicable if the task has base image trigger configured.
     *
     * @param imageUpdateTrigger the imageUpdateTrigger value to set
     * @return the RunInner object itself.
     */
    public RunInner withImageUpdateTrigger(ImageUpdateTrigger imageUpdateTrigger) {
        this.imageUpdateTrigger = imageUpdateTrigger;
        return this;
    }

    /**
     * Get the source trigger that caused the run.
     *
     * @return the sourceTrigger value
     */
    public SourceTriggerDescriptor sourceTrigger() {
        return this.sourceTrigger;
    }

    /**
     * Set the source trigger that caused the run.
     *
     * @param sourceTrigger the sourceTrigger value to set
     * @return the RunInner object itself.
     */
    public RunInner withSourceTrigger(SourceTriggerDescriptor sourceTrigger) {
        this.sourceTrigger = sourceTrigger;
        return this;
    }

    /**
     * Get the platform properties against which the run will happen.
     *
     * @return the platform value
     */
    public PlatformProperties platform() {
        return this.platform;
    }

    /**
     * Set the platform properties against which the run will happen.
     *
     * @param platform the platform value to set
     * @return the RunInner object itself.
     */
    public RunInner withPlatform(PlatformProperties platform) {
        this.platform = platform;
        return this;
    }

    /**
     * Get the machine configuration of the run agent.
     *
     * @return the agentConfiguration value
     */
    public AgentProperties agentConfiguration() {
        return this.agentConfiguration;
    }

    /**
     * Set the machine configuration of the run agent.
     *
     * @param agentConfiguration the agentConfiguration value to set
     * @return the RunInner object itself.
     */
    public RunInner withAgentConfiguration(AgentProperties agentConfiguration) {
        this.agentConfiguration = agentConfiguration;
        return this;
    }

    /**
     * Get the scope of the credentials that were used to login to the source registry during this run.
     *
     * @return the sourceRegistryAuth value
     */
    public String sourceRegistryAuth() {
        return this.sourceRegistryAuth;
    }

    /**
     * Set the scope of the credentials that were used to login to the source registry during this run.
     *
     * @param sourceRegistryAuth the sourceRegistryAuth value to set
     * @return the RunInner object itself.
     */
    public RunInner withSourceRegistryAuth(String sourceRegistryAuth) {
        this.sourceRegistryAuth = sourceRegistryAuth;
        return this;
    }

    /**
     * Get the list of custom registries that were logged in during this run.
     *
     * @return the customRegistries value
     */
    public List<String> customRegistries() {
        return this.customRegistries;
    }

    /**
     * Set the list of custom registries that were logged in during this run.
     *
     * @param customRegistries the customRegistries value to set
     * @return the RunInner object itself.
     */
    public RunInner withCustomRegistries(List<String> customRegistries) {
        this.customRegistries = customRegistries;
        return this;
    }

    /**
     * Get the provisioning state of a run. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @return the provisioningState value
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioning state of a run. Possible values include: 'Creating', 'Updating', 'Deleting', 'Succeeded', 'Failed', 'Canceled'.
     *
     * @param provisioningState the provisioningState value to set
     * @return the RunInner object itself.
     */
    public RunInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the value that indicates whether archiving is enabled or not.
     *
     * @return the isArchiveEnabled value
     */
    public Boolean isArchiveEnabled() {
        return this.isArchiveEnabled;
    }

    /**
     * Set the value that indicates whether archiving is enabled or not.
     *
     * @param isArchiveEnabled the isArchiveEnabled value to set
     * @return the RunInner object itself.
     */
    public RunInner withIsArchiveEnabled(Boolean isArchiveEnabled) {
        this.isArchiveEnabled = isArchiveEnabled;
        return this;
    }

}

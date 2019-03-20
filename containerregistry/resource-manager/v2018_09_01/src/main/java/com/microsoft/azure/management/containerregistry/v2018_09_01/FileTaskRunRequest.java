/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerregistry.v2018_09_01;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The request parameters for a scheduling run against a task file.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("FileTaskRunRequest")
public class FileTaskRunRequest extends RunRequest {
    /**
     * The template/definition file path relative to the source.
     */
    @JsonProperty(value = "taskFilePath", required = true)
    private String taskFilePath;

    /**
     * The values/parameters file path relative to the source.
     */
    @JsonProperty(value = "valuesFilePath")
    private String valuesFilePath;

    /**
     * The collection of overridable values that can be passed when running a
     * task.
     */
    @JsonProperty(value = "values")
    private List<SetValue> values;

    /**
     * Run timeout in seconds.
     */
    @JsonProperty(value = "timeout")
    private Integer timeout;

    /**
     * The platform properties against which the run has to happen.
     */
    @JsonProperty(value = "platform", required = true)
    private PlatformProperties platform;

    /**
     * The machine configuration of the run agent.
     */
    @JsonProperty(value = "agentConfiguration")
    private AgentProperties agentConfiguration;

    /**
     * The URL(absolute or relative) of the source context. It can be an URL to
     * a tar or git repository.
     * If it is relative URL, the relative path should be obtained from calling
     * listBuildSourceUploadUrl API.
     */
    @JsonProperty(value = "sourceLocation")
    private String sourceLocation;

    /**
     * The properties that describes a set of credentials that will be used
     * when this run is invoked.
     */
    @JsonProperty(value = "credentials")
    private Credentials credentials;

    /**
     * Get the template/definition file path relative to the source.
     *
     * @return the taskFilePath value
     */
    public String taskFilePath() {
        return this.taskFilePath;
    }

    /**
     * Set the template/definition file path relative to the source.
     *
     * @param taskFilePath the taskFilePath value to set
     * @return the FileTaskRunRequest object itself.
     */
    public FileTaskRunRequest withTaskFilePath(String taskFilePath) {
        this.taskFilePath = taskFilePath;
        return this;
    }

    /**
     * Get the values/parameters file path relative to the source.
     *
     * @return the valuesFilePath value
     */
    public String valuesFilePath() {
        return this.valuesFilePath;
    }

    /**
     * Set the values/parameters file path relative to the source.
     *
     * @param valuesFilePath the valuesFilePath value to set
     * @return the FileTaskRunRequest object itself.
     */
    public FileTaskRunRequest withValuesFilePath(String valuesFilePath) {
        this.valuesFilePath = valuesFilePath;
        return this;
    }

    /**
     * Get the collection of overridable values that can be passed when running a task.
     *
     * @return the values value
     */
    public List<SetValue> values() {
        return this.values;
    }

    /**
     * Set the collection of overridable values that can be passed when running a task.
     *
     * @param values the values value to set
     * @return the FileTaskRunRequest object itself.
     */
    public FileTaskRunRequest withValues(List<SetValue> values) {
        this.values = values;
        return this;
    }

    /**
     * Get run timeout in seconds.
     *
     * @return the timeout value
     */
    public Integer timeout() {
        return this.timeout;
    }

    /**
     * Set run timeout in seconds.
     *
     * @param timeout the timeout value to set
     * @return the FileTaskRunRequest object itself.
     */
    public FileTaskRunRequest withTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * Get the platform properties against which the run has to happen.
     *
     * @return the platform value
     */
    public PlatformProperties platform() {
        return this.platform;
    }

    /**
     * Set the platform properties against which the run has to happen.
     *
     * @param platform the platform value to set
     * @return the FileTaskRunRequest object itself.
     */
    public FileTaskRunRequest withPlatform(PlatformProperties platform) {
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
     * @return the FileTaskRunRequest object itself.
     */
    public FileTaskRunRequest withAgentConfiguration(AgentProperties agentConfiguration) {
        this.agentConfiguration = agentConfiguration;
        return this;
    }

    /**
     * Get the URL(absolute or relative) of the source context. It can be an URL to a tar or git repository.
     If it is relative URL, the relative path should be obtained from calling listBuildSourceUploadUrl API.
     *
     * @return the sourceLocation value
     */
    public String sourceLocation() {
        return this.sourceLocation;
    }

    /**
     * Set the URL(absolute or relative) of the source context. It can be an URL to a tar or git repository.
     If it is relative URL, the relative path should be obtained from calling listBuildSourceUploadUrl API.
     *
     * @param sourceLocation the sourceLocation value to set
     * @return the FileTaskRunRequest object itself.
     */
    public FileTaskRunRequest withSourceLocation(String sourceLocation) {
        this.sourceLocation = sourceLocation;
        return this;
    }

    /**
     * Get the properties that describes a set of credentials that will be used when this run is invoked.
     *
     * @return the credentials value
     */
    public Credentials credentials() {
        return this.credentials;
    }

    /**
     * Set the properties that describes a set of credentials that will be used when this run is invoked.
     *
     * @param credentials the credentials value to set
     * @return the FileTaskRunRequest object itself.
     */
    public FileTaskRunRequest withCredentials(Credentials credentials) {
        this.credentials = credentials;
        return this;
    }

}
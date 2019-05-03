/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The properties of a stateful service resource.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "serviceKind")
@JsonTypeName("Stateful")
public class StatefulServiceProperties extends ServiceProperties {
    /**
     * A flag indicating whether this is a persistent service which stores
     * states on the local disk. If it is then the value of this property is
     * true, if not it is false.
     */
    @JsonProperty(value = "hasPersistedState")
    private Boolean hasPersistedState;

    /**
     * The target replica set size as a number.
     */
    @JsonProperty(value = "targetReplicaSetSize")
    private Integer targetReplicaSetSize;

    /**
     * The minimum replica set size as a number.
     */
    @JsonProperty(value = "minReplicaSetSize")
    private Integer minReplicaSetSize;

    /**
     * The duration between when a replica goes down and when a new replica is
     * created, represented in ISO 8601 format (hh:mm:ss.s).
     */
    @JsonProperty(value = "replicaRestartWaitDuration")
    private DateTime replicaRestartWaitDuration;

    /**
     * The maximum duration for which a partition is allowed to be in a state
     * of quorum loss, represented in ISO 8601 format (hh:mm:ss.s).
     */
    @JsonProperty(value = "quorumLossWaitDuration")
    private DateTime quorumLossWaitDuration;

    /**
     * The definition on how long StandBy replicas should be maintained before
     * being removed, represented in ISO 8601 format (hh:mm:ss.s).
     */
    @JsonProperty(value = "standByReplicaKeepDuration")
    private DateTime standByReplicaKeepDuration;

    /**
     * Get a flag indicating whether this is a persistent service which stores states on the local disk. If it is then the value of this property is true, if not it is false.
     *
     * @return the hasPersistedState value
     */
    public Boolean hasPersistedState() {
        return this.hasPersistedState;
    }

    /**
     * Set a flag indicating whether this is a persistent service which stores states on the local disk. If it is then the value of this property is true, if not it is false.
     *
     * @param hasPersistedState the hasPersistedState value to set
     * @return the StatefulServiceProperties object itself.
     */
    public StatefulServiceProperties withHasPersistedState(Boolean hasPersistedState) {
        this.hasPersistedState = hasPersistedState;
        return this;
    }

    /**
     * Get the target replica set size as a number.
     *
     * @return the targetReplicaSetSize value
     */
    public Integer targetReplicaSetSize() {
        return this.targetReplicaSetSize;
    }

    /**
     * Set the target replica set size as a number.
     *
     * @param targetReplicaSetSize the targetReplicaSetSize value to set
     * @return the StatefulServiceProperties object itself.
     */
    public StatefulServiceProperties withTargetReplicaSetSize(Integer targetReplicaSetSize) {
        this.targetReplicaSetSize = targetReplicaSetSize;
        return this;
    }

    /**
     * Get the minimum replica set size as a number.
     *
     * @return the minReplicaSetSize value
     */
    public Integer minReplicaSetSize() {
        return this.minReplicaSetSize;
    }

    /**
     * Set the minimum replica set size as a number.
     *
     * @param minReplicaSetSize the minReplicaSetSize value to set
     * @return the StatefulServiceProperties object itself.
     */
    public StatefulServiceProperties withMinReplicaSetSize(Integer minReplicaSetSize) {
        this.minReplicaSetSize = minReplicaSetSize;
        return this;
    }

    /**
     * Get the duration between when a replica goes down and when a new replica is created, represented in ISO 8601 format (hh:mm:ss.s).
     *
     * @return the replicaRestartWaitDuration value
     */
    public DateTime replicaRestartWaitDuration() {
        return this.replicaRestartWaitDuration;
    }

    /**
     * Set the duration between when a replica goes down and when a new replica is created, represented in ISO 8601 format (hh:mm:ss.s).
     *
     * @param replicaRestartWaitDuration the replicaRestartWaitDuration value to set
     * @return the StatefulServiceProperties object itself.
     */
    public StatefulServiceProperties withReplicaRestartWaitDuration(DateTime replicaRestartWaitDuration) {
        this.replicaRestartWaitDuration = replicaRestartWaitDuration;
        return this;
    }

    /**
     * Get the maximum duration for which a partition is allowed to be in a state of quorum loss, represented in ISO 8601 format (hh:mm:ss.s).
     *
     * @return the quorumLossWaitDuration value
     */
    public DateTime quorumLossWaitDuration() {
        return this.quorumLossWaitDuration;
    }

    /**
     * Set the maximum duration for which a partition is allowed to be in a state of quorum loss, represented in ISO 8601 format (hh:mm:ss.s).
     *
     * @param quorumLossWaitDuration the quorumLossWaitDuration value to set
     * @return the StatefulServiceProperties object itself.
     */
    public StatefulServiceProperties withQuorumLossWaitDuration(DateTime quorumLossWaitDuration) {
        this.quorumLossWaitDuration = quorumLossWaitDuration;
        return this;
    }

    /**
     * Get the definition on how long StandBy replicas should be maintained before being removed, represented in ISO 8601 format (hh:mm:ss.s).
     *
     * @return the standByReplicaKeepDuration value
     */
    public DateTime standByReplicaKeepDuration() {
        return this.standByReplicaKeepDuration;
    }

    /**
     * Set the definition on how long StandBy replicas should be maintained before being removed, represented in ISO 8601 format (hh:mm:ss.s).
     *
     * @param standByReplicaKeepDuration the standByReplicaKeepDuration value to set
     * @return the StatefulServiceProperties object itself.
     */
    public StatefulServiceProperties withStandByReplicaKeepDuration(DateTime standByReplicaKeepDuration) {
        this.standByReplicaKeepDuration = standByReplicaKeepDuration;
        return this;
    }

}
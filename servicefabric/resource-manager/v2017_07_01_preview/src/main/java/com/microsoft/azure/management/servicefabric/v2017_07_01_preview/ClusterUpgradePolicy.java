/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Describes the policy used when upgrading the cluster.
 */
public class ClusterUpgradePolicy {
    /**
     * If true, then processes are forcefully restarted during upgrade even
     * when the code version has not changed (the upgrade only changes
     * configuration or data).
     */
    @JsonProperty(value = "forceRestart")
    private Boolean forceRestart;

    /**
     * The maximum amount of time to block processing of an upgrade domain and
     * revent loss of availability when there are unexpected issues. When this
     * timeout expires, processing of the upgrade domain will proceed
     * regardless of availability loss issues. The timeout is reset at the
     * start of each upgrade domain. The timeout can be in either hh:mm:ss or
     * in d.hh:mm:ss.ms format.
     */
    @JsonProperty(value = "upgradeReplicaSetCheckTimeout", required = true)
    private String upgradeReplicaSetCheckTimeout;

    /**
     * The length of time to wait after completing an upgrade domain before
     * performing health checks. The duration can be in either hh:mm:ss or in
     * d.hh:mm:ss.ms format.
     */
    @JsonProperty(value = "healthCheckWaitDuration", required = true)
    private String healthCheckWaitDuration;

    /**
     * The amount of time that the application or cluster must remain healthy
     * before the upgrade proceeds to the next upgrade domain. The duration can
     * be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     */
    @JsonProperty(value = "healthCheckStableDuration", required = true)
    private String healthCheckStableDuration;

    /**
     * The amount of time to retry health evaluation when the application or
     * cluster is unhealthy before the upgrade rolls back. The timeout can be
     * in either hh:mm:ss or in d.hh:mm:ss.ms format.
     */
    @JsonProperty(value = "healthCheckRetryTimeout", required = true)
    private String healthCheckRetryTimeout;

    /**
     * The amount of time the overall upgrade has to complete before the
     * upgrade rolls back. The timeout can be in either hh:mm:ss or in
     * d.hh:mm:ss.ms format.
     */
    @JsonProperty(value = "upgradeTimeout", required = true)
    private String upgradeTimeout;

    /**
     * The amount of time each upgrade domain has to complete before the
     * upgrade rolls back. The timeout can be in either hh:mm:ss or in
     * d.hh:mm:ss.ms format.
     */
    @JsonProperty(value = "upgradeDomainTimeout", required = true)
    private String upgradeDomainTimeout;

    /**
     * The cluster health policy used when upgrading the cluster.
     */
    @JsonProperty(value = "healthPolicy", required = true)
    private ClusterHealthPolicy healthPolicy;

    /**
     * The delta health policy used when upgrading the cluster.
     */
    @JsonProperty(value = "deltaHealthPolicy")
    private ClusterUpgradeDeltaHealthPolicy deltaHealthPolicy;

    /**
     * Get if true, then processes are forcefully restarted during upgrade even when the code version has not changed (the upgrade only changes configuration or data).
     *
     * @return the forceRestart value
     */
    public Boolean forceRestart() {
        return this.forceRestart;
    }

    /**
     * Set if true, then processes are forcefully restarted during upgrade even when the code version has not changed (the upgrade only changes configuration or data).
     *
     * @param forceRestart the forceRestart value to set
     * @return the ClusterUpgradePolicy object itself.
     */
    public ClusterUpgradePolicy withForceRestart(Boolean forceRestart) {
        this.forceRestart = forceRestart;
        return this;
    }

    /**
     * Get the maximum amount of time to block processing of an upgrade domain and revent loss of availability when there are unexpected issues. When this timeout expires, processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the start of each upgrade domain. The timeout can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     *
     * @return the upgradeReplicaSetCheckTimeout value
     */
    public String upgradeReplicaSetCheckTimeout() {
        return this.upgradeReplicaSetCheckTimeout;
    }

    /**
     * Set the maximum amount of time to block processing of an upgrade domain and revent loss of availability when there are unexpected issues. When this timeout expires, processing of the upgrade domain will proceed regardless of availability loss issues. The timeout is reset at the start of each upgrade domain. The timeout can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     *
     * @param upgradeReplicaSetCheckTimeout the upgradeReplicaSetCheckTimeout value to set
     * @return the ClusterUpgradePolicy object itself.
     */
    public ClusterUpgradePolicy withUpgradeReplicaSetCheckTimeout(String upgradeReplicaSetCheckTimeout) {
        this.upgradeReplicaSetCheckTimeout = upgradeReplicaSetCheckTimeout;
        return this;
    }

    /**
     * Get the length of time to wait after completing an upgrade domain before performing health checks. The duration can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     *
     * @return the healthCheckWaitDuration value
     */
    public String healthCheckWaitDuration() {
        return this.healthCheckWaitDuration;
    }

    /**
     * Set the length of time to wait after completing an upgrade domain before performing health checks. The duration can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     *
     * @param healthCheckWaitDuration the healthCheckWaitDuration value to set
     * @return the ClusterUpgradePolicy object itself.
     */
    public ClusterUpgradePolicy withHealthCheckWaitDuration(String healthCheckWaitDuration) {
        this.healthCheckWaitDuration = healthCheckWaitDuration;
        return this;
    }

    /**
     * Get the amount of time that the application or cluster must remain healthy before the upgrade proceeds to the next upgrade domain. The duration can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     *
     * @return the healthCheckStableDuration value
     */
    public String healthCheckStableDuration() {
        return this.healthCheckStableDuration;
    }

    /**
     * Set the amount of time that the application or cluster must remain healthy before the upgrade proceeds to the next upgrade domain. The duration can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     *
     * @param healthCheckStableDuration the healthCheckStableDuration value to set
     * @return the ClusterUpgradePolicy object itself.
     */
    public ClusterUpgradePolicy withHealthCheckStableDuration(String healthCheckStableDuration) {
        this.healthCheckStableDuration = healthCheckStableDuration;
        return this;
    }

    /**
     * Get the amount of time to retry health evaluation when the application or cluster is unhealthy before the upgrade rolls back. The timeout can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     *
     * @return the healthCheckRetryTimeout value
     */
    public String healthCheckRetryTimeout() {
        return this.healthCheckRetryTimeout;
    }

    /**
     * Set the amount of time to retry health evaluation when the application or cluster is unhealthy before the upgrade rolls back. The timeout can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     *
     * @param healthCheckRetryTimeout the healthCheckRetryTimeout value to set
     * @return the ClusterUpgradePolicy object itself.
     */
    public ClusterUpgradePolicy withHealthCheckRetryTimeout(String healthCheckRetryTimeout) {
        this.healthCheckRetryTimeout = healthCheckRetryTimeout;
        return this;
    }

    /**
     * Get the amount of time the overall upgrade has to complete before the upgrade rolls back. The timeout can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     *
     * @return the upgradeTimeout value
     */
    public String upgradeTimeout() {
        return this.upgradeTimeout;
    }

    /**
     * Set the amount of time the overall upgrade has to complete before the upgrade rolls back. The timeout can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     *
     * @param upgradeTimeout the upgradeTimeout value to set
     * @return the ClusterUpgradePolicy object itself.
     */
    public ClusterUpgradePolicy withUpgradeTimeout(String upgradeTimeout) {
        this.upgradeTimeout = upgradeTimeout;
        return this;
    }

    /**
     * Get the amount of time each upgrade domain has to complete before the upgrade rolls back. The timeout can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     *
     * @return the upgradeDomainTimeout value
     */
    public String upgradeDomainTimeout() {
        return this.upgradeDomainTimeout;
    }

    /**
     * Set the amount of time each upgrade domain has to complete before the upgrade rolls back. The timeout can be in either hh:mm:ss or in d.hh:mm:ss.ms format.
     *
     * @param upgradeDomainTimeout the upgradeDomainTimeout value to set
     * @return the ClusterUpgradePolicy object itself.
     */
    public ClusterUpgradePolicy withUpgradeDomainTimeout(String upgradeDomainTimeout) {
        this.upgradeDomainTimeout = upgradeDomainTimeout;
        return this;
    }

    /**
     * Get the cluster health policy used when upgrading the cluster.
     *
     * @return the healthPolicy value
     */
    public ClusterHealthPolicy healthPolicy() {
        return this.healthPolicy;
    }

    /**
     * Set the cluster health policy used when upgrading the cluster.
     *
     * @param healthPolicy the healthPolicy value to set
     * @return the ClusterUpgradePolicy object itself.
     */
    public ClusterUpgradePolicy withHealthPolicy(ClusterHealthPolicy healthPolicy) {
        this.healthPolicy = healthPolicy;
        return this;
    }

    /**
     * Get the delta health policy used when upgrading the cluster.
     *
     * @return the deltaHealthPolicy value
     */
    public ClusterUpgradeDeltaHealthPolicy deltaHealthPolicy() {
        return this.deltaHealthPolicy;
    }

    /**
     * Set the delta health policy used when upgrading the cluster.
     *
     * @param deltaHealthPolicy the deltaHealthPolicy value to set
     * @return the ClusterUpgradePolicy object itself.
     */
    public ClusterUpgradePolicy withDeltaHealthPolicy(ClusterUpgradeDeltaHealthPolicy deltaHealthPolicy) {
        this.deltaHealthPolicy = deltaHealthPolicy;
        return this;
    }

}
/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_10_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.consumption.v2018_10_01.implementation.ConsumptionManager;
import com.microsoft.azure.management.consumption.v2018_10_01.implementation.ManagementGroupAggregatedCostResultInner;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import org.joda.time.DateTime;

/**
 * Type representing ManagementGroupAggregatedCostResult.
 */
public interface ManagementGroupAggregatedCostResult extends HasInner<ManagementGroupAggregatedCostResultInner>, HasManager<ConsumptionManager> {
    /**
     * @return the azureCharges value.
     */
    BigDecimal azureCharges();

    /**
     * @return the billingPeriodId value.
     */
    String billingPeriodId();

    /**
     * @return the chargesBilledSeparately value.
     */
    BigDecimal chargesBilledSeparately();

    /**
     * @return the children value.
     */
    List<ManagementGroupAggregatedCostResultInner> children();

    /**
     * @return the currency value.
     */
    String currency();

    /**
     * @return the excludedSubscriptions value.
     */
    List<String> excludedSubscriptions();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the includedSubscriptions value.
     */
    List<String> includedSubscriptions();

    /**
     * @return the marketplaceCharges value.
     */
    BigDecimal marketplaceCharges();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the tags value.
     */
    Map<String, String> tags();

    /**
     * @return the type value.
     */
    String type();

    /**
     * @return the usageEnd value.
     */
    DateTime usageEnd();

    /**
     * @return the usageStart value.
     */
    DateTime usageStart();

}
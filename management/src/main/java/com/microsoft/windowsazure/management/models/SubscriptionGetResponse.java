/**
 * 
 * Copyright (c) Microsoft and contributors.  All rights reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 */

// Warning: This code was generated by a tool.
// 
// Changes to this file may cause incorrect behavior and will be lost if the
// code is regenerated.

package com.microsoft.windowsazure.management.models;

import com.microsoft.windowsazure.core.OperationResponse;

/**
* The Get Subscription operation response.
*/
public class SubscriptionGetResponse extends OperationResponse {
    private String accountAdminLiveEmailId;
    
    /**
    * Optional. The live ID of the account administrator.
    * @return The AccountAdminLiveEmailId value.
    */
    public String getAccountAdminLiveEmailId() {
        return this.accountAdminLiveEmailId;
    }
    
    /**
    * Optional. The live ID of the account administrator.
    * @param accountAdminLiveEmailIdValue The AccountAdminLiveEmailId value.
    */
    public void setAccountAdminLiveEmailId(final String accountAdminLiveEmailIdValue) {
        this.accountAdminLiveEmailId = accountAdminLiveEmailIdValue;
    }
    
    private int currentCoreCount;
    
    /**
    * Optional. The number of currently allocated cores.
    * @return The CurrentCoreCount value.
    */
    public int getCurrentCoreCount() {
        return this.currentCoreCount;
    }
    
    /**
    * Optional. The number of currently allocated cores.
    * @param currentCoreCountValue The CurrentCoreCount value.
    */
    public void setCurrentCoreCount(final int currentCoreCountValue) {
        this.currentCoreCount = currentCoreCountValue;
    }
    
    private int currentDnsServers;
    
    /**
    * Optional. The current number of DNS servers allocated on this
    * subscription.
    * @return The CurrentDnsServers value.
    */
    public int getCurrentDnsServers() {
        return this.currentDnsServers;
    }
    
    /**
    * Optional. The current number of DNS servers allocated on this
    * subscription.
    * @param currentDnsServersValue The CurrentDnsServers value.
    */
    public void setCurrentDnsServers(final int currentDnsServersValue) {
        this.currentDnsServers = currentDnsServersValue;
    }
    
    private int currentHostedServices;
    
    /**
    * Optional. The number of currently allocated cloud services.
    * @return The CurrentHostedServices value.
    */
    public int getCurrentHostedServices() {
        return this.currentHostedServices;
    }
    
    /**
    * Optional. The number of currently allocated cloud services.
    * @param currentHostedServicesValue The CurrentHostedServices value.
    */
    public void setCurrentHostedServices(final int currentHostedServicesValue) {
        this.currentHostedServices = currentHostedServicesValue;
    }
    
    private int currentLocalNetworkSites;
    
    /**
    * Optional. The current number of local virtual network sites that are
    * allocated on this subscription.
    * @return The CurrentLocalNetworkSites value.
    */
    public int getCurrentLocalNetworkSites() {
        return this.currentLocalNetworkSites;
    }
    
    /**
    * Optional. The current number of local virtual network sites that are
    * allocated on this subscription.
    * @param currentLocalNetworkSitesValue The CurrentLocalNetworkSites value.
    */
    public void setCurrentLocalNetworkSites(final int currentLocalNetworkSitesValue) {
        this.currentLocalNetworkSites = currentLocalNetworkSitesValue;
    }
    
    private int currentStorageAccounts;
    
    /**
    * Optional. The number of currently allocated storage accounts.
    * @return The CurrentStorageAccounts value.
    */
    public int getCurrentStorageAccounts() {
        return this.currentStorageAccounts;
    }
    
    /**
    * Optional. The number of currently allocated storage accounts.
    * @param currentStorageAccountsValue The CurrentStorageAccounts value.
    */
    public void setCurrentStorageAccounts(final int currentStorageAccountsValue) {
        this.currentStorageAccounts = currentStorageAccountsValue;
    }
    
    private int currentVirtualNetworkSites;
    
    /**
    * Optional. The number of currently allocated virtual network sites.
    * @return The CurrentVirtualNetworkSites value.
    */
    public int getCurrentVirtualNetworkSites() {
        return this.currentVirtualNetworkSites;
    }
    
    /**
    * Optional. The number of currently allocated virtual network sites.
    * @param currentVirtualNetworkSitesValue The CurrentVirtualNetworkSites
    * value.
    */
    public void setCurrentVirtualNetworkSites(final int currentVirtualNetworkSitesValue) {
        this.currentVirtualNetworkSites = currentVirtualNetworkSitesValue;
    }
    
    private int maximumCoreCount;
    
    /**
    * Optional. The maximum number of cores that can be allocated on this
    * subscription.
    * @return The MaximumCoreCount value.
    */
    public int getMaximumCoreCount() {
        return this.maximumCoreCount;
    }
    
    /**
    * Optional. The maximum number of cores that can be allocated on this
    * subscription.
    * @param maximumCoreCountValue The MaximumCoreCount value.
    */
    public void setMaximumCoreCount(final int maximumCoreCountValue) {
        this.maximumCoreCount = maximumCoreCountValue;
    }
    
    private int maximumDnsServers;
    
    /**
    * Optional. The maximum number of DNS servers that can be allocated on this
    * subscription.
    * @return The MaximumDnsServers value.
    */
    public int getMaximumDnsServers() {
        return this.maximumDnsServers;
    }
    
    /**
    * Optional. The maximum number of DNS servers that can be allocated on this
    * subscription.
    * @param maximumDnsServersValue The MaximumDnsServers value.
    */
    public void setMaximumDnsServers(final int maximumDnsServersValue) {
        this.maximumDnsServers = maximumDnsServersValue;
    }
    
    private int maximumHostedServices;
    
    /**
    * Optional. The maximum number of cloud services that can be allocated on
    * this subscription.
    * @return The MaximumHostedServices value.
    */
    public int getMaximumHostedServices() {
        return this.maximumHostedServices;
    }
    
    /**
    * Optional. The maximum number of cloud services that can be allocated on
    * this subscription.
    * @param maximumHostedServicesValue The MaximumHostedServices value.
    */
    public void setMaximumHostedServices(final int maximumHostedServicesValue) {
        this.maximumHostedServices = maximumHostedServicesValue;
    }
    
    private int maximumLocalNetworkSites;
    
    /**
    * Optional. The maximum number of local virtual network sites that can be
    * allocated on this subscription.
    * @return The MaximumLocalNetworkSites value.
    */
    public int getMaximumLocalNetworkSites() {
        return this.maximumLocalNetworkSites;
    }
    
    /**
    * Optional. The maximum number of local virtual network sites that can be
    * allocated on this subscription.
    * @param maximumLocalNetworkSitesValue The MaximumLocalNetworkSites value.
    */
    public void setMaximumLocalNetworkSites(final int maximumLocalNetworkSitesValue) {
        this.maximumLocalNetworkSites = maximumLocalNetworkSitesValue;
    }
    
    private int maximumStorageAccounts;
    
    /**
    * Optional. The maximum number of storage accounts that can be allocated on
    * this subscription.
    * @return The MaximumStorageAccounts value.
    */
    public int getMaximumStorageAccounts() {
        return this.maximumStorageAccounts;
    }
    
    /**
    * Optional. The maximum number of storage accounts that can be allocated on
    * this subscription.
    * @param maximumStorageAccountsValue The MaximumStorageAccounts value.
    */
    public void setMaximumStorageAccounts(final int maximumStorageAccountsValue) {
        this.maximumStorageAccounts = maximumStorageAccountsValue;
    }
    
    private int maximumVirtualNetworkSites;
    
    /**
    * Optional. The maximum number of virtual network sites that can be
    * allocated on this subscription.
    * @return The MaximumVirtualNetworkSites value.
    */
    public int getMaximumVirtualNetworkSites() {
        return this.maximumVirtualNetworkSites;
    }
    
    /**
    * Optional. The maximum number of virtual network sites that can be
    * allocated on this subscription.
    * @param maximumVirtualNetworkSitesValue The MaximumVirtualNetworkSites
    * value.
    */
    public void setMaximumVirtualNetworkSites(final int maximumVirtualNetworkSitesValue) {
        this.maximumVirtualNetworkSites = maximumVirtualNetworkSitesValue;
    }
    
    private String serviceAdminLiveEmailId;
    
    /**
    * Optional. The live ID of the subscription administrator.
    * @return The ServiceAdminLiveEmailId value.
    */
    public String getServiceAdminLiveEmailId() {
        return this.serviceAdminLiveEmailId;
    }
    
    /**
    * Optional. The live ID of the subscription administrator.
    * @param serviceAdminLiveEmailIdValue The ServiceAdminLiveEmailId value.
    */
    public void setServiceAdminLiveEmailId(final String serviceAdminLiveEmailIdValue) {
        this.serviceAdminLiveEmailId = serviceAdminLiveEmailIdValue;
    }
    
    private String subscriptionID;
    
    /**
    * Optional. The subscription ID that the operation was called on.
    * @return The SubscriptionID value.
    */
    public String getSubscriptionID() {
        return this.subscriptionID;
    }
    
    /**
    * Optional. The subscription ID that the operation was called on.
    * @param subscriptionIDValue The SubscriptionID value.
    */
    public void setSubscriptionID(final String subscriptionIDValue) {
        this.subscriptionID = subscriptionIDValue;
    }
    
    private String subscriptionName;
    
    /**
    * Optional. The user-supplied name of the subscription.
    * @return The SubscriptionName value.
    */
    public String getSubscriptionName() {
        return this.subscriptionName;
    }
    
    /**
    * Optional. The user-supplied name of the subscription.
    * @param subscriptionNameValue The SubscriptionName value.
    */
    public void setSubscriptionName(final String subscriptionNameValue) {
        this.subscriptionName = subscriptionNameValue;
    }
    
    private SubscriptionStatus subscriptionStatus;
    
    /**
    * Optional. The subscription status.
    * @return The SubscriptionStatus value.
    */
    public SubscriptionStatus getSubscriptionStatus() {
        return this.subscriptionStatus;
    }
    
    /**
    * Optional. The subscription status.
    * @param subscriptionStatusValue The SubscriptionStatus value.
    */
    public void setSubscriptionStatus(final SubscriptionStatus subscriptionStatusValue) {
        this.subscriptionStatus = subscriptionStatusValue;
    }
}
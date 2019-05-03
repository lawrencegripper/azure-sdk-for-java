/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.ApplicationTypes;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.ApplicationTypeResourceList;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.ApplicationTypeResource;

class ApplicationTypesImpl extends WrapperImpl<ApplicationTypesInner> implements ApplicationTypes {
    private final ServiceFabricManager manager;

    ApplicationTypesImpl(ServiceFabricManager manager) {
        super(manager.inner().applicationTypes());
        this.manager = manager;
    }

    public ServiceFabricManager manager() {
        return this.manager;
    }

    @Override
    public ApplicationTypeResourceImpl define(String name) {
        return wrapModel(name);
    }

    private ApplicationTypeResourceImpl wrapModel(ApplicationTypeResourceInner inner) {
        return  new ApplicationTypeResourceImpl(inner, manager());
    }

    private ApplicationTypeResourceImpl wrapModel(String name) {
        return new ApplicationTypeResourceImpl(name, this.manager());
    }

    @Override
    public Observable<ApplicationTypeResourceList> listAsync(String subscriptionId, String resourceGroupName, String clusterName, String apiVersion) {
        ApplicationTypesInner client = this.inner();
        return client.listAsync(subscriptionId, resourceGroupName, clusterName, apiVersion)
        .map(new Func1<ApplicationTypeResourceListInner, ApplicationTypeResourceList>() {
            @Override
            public ApplicationTypeResourceList call(ApplicationTypeResourceListInner inner) {
                return new ApplicationTypeResourceListImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ApplicationTypeResource> getAsync(String subscriptionId, String resourceGroupName, String clusterName, String applicationTypeName, String apiVersion) {
        ApplicationTypesInner client = this.inner();
        return client.getAsync(subscriptionId, resourceGroupName, clusterName, applicationTypeName, apiVersion)
        .map(new Func1<ApplicationTypeResourceInner, ApplicationTypeResource>() {
            @Override
            public ApplicationTypeResource call(ApplicationTypeResourceInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String subscriptionId, String resourceGroupName, String clusterName, String applicationTypeName, String apiVersion) {
        ApplicationTypesInner client = this.inner();
        return client.deleteAsync(subscriptionId, resourceGroupName, clusterName, applicationTypeName, apiVersion).toCompletable();
    }

}
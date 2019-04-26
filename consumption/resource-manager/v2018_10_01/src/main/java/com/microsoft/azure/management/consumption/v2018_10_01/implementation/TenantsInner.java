/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.consumption.v2018_10_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.consumption.v2018_10_01.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Tenants.
 */
public class TenantsInner {
    /** The Retrofit service to perform REST calls. */
    private TenantsService service;
    /** The service client containing this operation class. */
    private ConsumptionManagementClientImpl client;

    /**
     * Initializes an instance of TenantsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public TenantsInner(Retrofit retrofit, ConsumptionManagementClientImpl client) {
        this.service = retrofit.create(TenantsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Tenants to be
     * used by Retrofit to perform actually REST calls.
     */
    interface TenantsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.consumption.v2018_10_01.Tenants get" })
        @GET("providers/Microsoft.Billing/billingAccounts/{billingAccountId}/billingProfiles/{billingProfileId}/providers/Microsoft.Consumption/tenants")
        Observable<Response<ResponseBody>> get(@Path("billingAccountId") String billingAccountId, @Path("billingProfileId") String billingProfileId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets a Tenant Properties.
     *
     * @param billingAccountId Billing Account Id.
     * @param billingProfileId Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the TenantListResultInner object if successful.
     */
    public TenantListResultInner get(String billingAccountId, String billingProfileId) {
        return getWithServiceResponseAsync(billingAccountId, billingProfileId).toBlocking().single().body();
    }

    /**
     * Gets a Tenant Properties.
     *
     * @param billingAccountId Billing Account Id.
     * @param billingProfileId Billing Profile Id.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<TenantListResultInner> getAsync(String billingAccountId, String billingProfileId, final ServiceCallback<TenantListResultInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(billingAccountId, billingProfileId), serviceCallback);
    }

    /**
     * Gets a Tenant Properties.
     *
     * @param billingAccountId Billing Account Id.
     * @param billingProfileId Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TenantListResultInner object
     */
    public Observable<TenantListResultInner> getAsync(String billingAccountId, String billingProfileId) {
        return getWithServiceResponseAsync(billingAccountId, billingProfileId).map(new Func1<ServiceResponse<TenantListResultInner>, TenantListResultInner>() {
            @Override
            public TenantListResultInner call(ServiceResponse<TenantListResultInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets a Tenant Properties.
     *
     * @param billingAccountId Billing Account Id.
     * @param billingProfileId Billing Profile Id.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the TenantListResultInner object
     */
    public Observable<ServiceResponse<TenantListResultInner>> getWithServiceResponseAsync(String billingAccountId, String billingProfileId) {
        if (billingAccountId == null) {
            throw new IllegalArgumentException("Parameter billingAccountId is required and cannot be null.");
        }
        if (billingProfileId == null) {
            throw new IllegalArgumentException("Parameter billingProfileId is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(billingAccountId, billingProfileId, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<TenantListResultInner>>>() {
                @Override
                public Observable<ServiceResponse<TenantListResultInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<TenantListResultInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<TenantListResultInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<TenantListResultInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<TenantListResultInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
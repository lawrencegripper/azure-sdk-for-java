/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.AzureResponseBuilder;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Beta.SinceVersion;
import com.microsoft.azure.arm.resources.AzureConfigurable;
import com.microsoft.azure.serializer.AzureJacksonAdapter;
import com.microsoft.rest.RestClient;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingAccounts;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingAccountsWithCreateInvoiceSectionPermissions;
import com.microsoft.azure.management.billing.v2018_11_01_preview.AvailableBalanceByBillingProfiles;
import com.microsoft.azure.management.billing.v2018_11_01_preview.PaymentMethodsByBillingProfiles;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfilesByBillingAccountNames;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfiles;
import com.microsoft.azure.management.billing.v2018_11_01_preview.InvoiceSectionsByBillingAccountNames;
import com.microsoft.azure.management.billing.v2018_11_01_preview.InvoiceSections;
import com.microsoft.azure.management.billing.v2018_11_01_preview.InvoiceSectionsWithCreateSubscriptionPermissions;
import com.microsoft.azure.management.billing.v2018_11_01_preview.DepartmentsByBillingAccountNames;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Departments;
import com.microsoft.azure.management.billing.v2018_11_01_preview.EnrollmentAccountsByBillingAccountNames;
import com.microsoft.azure.management.billing.v2018_11_01_preview.EnrollmentAccounts;
import com.microsoft.azure.management.billing.v2018_11_01_preview.InvoicesByBillingAccounts;
import com.microsoft.azure.management.billing.v2018_11_01_preview.InvoicePricesheets;
import com.microsoft.azure.management.billing.v2018_11_01_preview.InvoicesByBillingProfiles;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Invoices;
import com.microsoft.azure.management.billing.v2018_11_01_preview.ProductsByBillingSubscriptions;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingSubscriptionsByBillingProfiles;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingSubscriptionsByInvoiceSections;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingSubscriptions;
import com.microsoft.azure.management.billing.v2018_11_01_preview.ProductsByBillingAccounts;
import com.microsoft.azure.management.billing.v2018_11_01_preview.ProductsByInvoiceSections;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Products;
import com.microsoft.azure.management.billing.v2018_11_01_preview.TransactionsByBillingAccounts;
import com.microsoft.azure.management.billing.v2018_11_01_preview.TransactionsByBillingProfiles;
import com.microsoft.azure.management.billing.v2018_11_01_preview.TransactionsByInvoiceSections;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Policys;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingPropertys;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Transfers;
import com.microsoft.azure.management.billing.v2018_11_01_preview.RecipientTransfers;
import com.microsoft.azure.management.billing.v2018_11_01_preview.Operations;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingAccountBillingPermissions;
import com.microsoft.azure.management.billing.v2018_11_01_preview.InvoiceSectionsBillingPermissions;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfileBillingPermissions;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingAccountBillingRoleDefinitions;
import com.microsoft.azure.management.billing.v2018_11_01_preview.InvoiceSectionBillingRoleDefinitions;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfileBillingRoleDefinitions;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingAccountBillingRoleAssignments;
import com.microsoft.azure.management.billing.v2018_11_01_preview.InvoiceSectionBillingRoleAssignments;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingProfileBillingRoleAssignments;
import com.microsoft.azure.arm.resources.implementation.AzureConfigurableCoreImpl;
import com.microsoft.azure.arm.resources.implementation.ManagerCore;

/**
 * Entry point to Azure Billing resource management.
 */
public final class BillingManager extends ManagerCore<BillingManager, BillingManagementClientImpl> {
    private BillingAccounts billingAccounts;
    private BillingAccountsWithCreateInvoiceSectionPermissions billingAccountsWithCreateInvoiceSectionPermissions;
    private AvailableBalanceByBillingProfiles availableBalanceByBillingProfiles;
    private PaymentMethodsByBillingProfiles paymentMethodsByBillingProfiles;
    private BillingProfilesByBillingAccountNames billingProfilesByBillingAccountNames;
    private BillingProfiles billingProfiles;
    private InvoiceSectionsByBillingAccountNames invoiceSectionsByBillingAccountNames;
    private InvoiceSections invoiceSections;
    private InvoiceSectionsWithCreateSubscriptionPermissions invoiceSectionsWithCreateSubscriptionPermissions;
    private DepartmentsByBillingAccountNames departmentsByBillingAccountNames;
    private Departments departments;
    private EnrollmentAccountsByBillingAccountNames enrollmentAccountsByBillingAccountNames;
    private EnrollmentAccounts enrollmentAccounts;
    private InvoicesByBillingAccounts invoicesByBillingAccounts;
    private InvoicePricesheets invoicePricesheets;
    private InvoicesByBillingProfiles invoicesByBillingProfiles;
    private Invoices invoices;
    private ProductsByBillingSubscriptions productsByBillingSubscriptions;
    private BillingSubscriptionsByBillingProfiles billingSubscriptionsByBillingProfiles;
    private BillingSubscriptionsByInvoiceSections billingSubscriptionsByInvoiceSections;
    private BillingSubscriptions billingSubscriptions;
    private ProductsByBillingAccounts productsByBillingAccounts;
    private ProductsByInvoiceSections productsByInvoiceSections;
    private Products products;
    private TransactionsByBillingAccounts transactionsByBillingAccounts;
    private TransactionsByBillingProfiles transactionsByBillingProfiles;
    private TransactionsByInvoiceSections transactionsByInvoiceSections;
    private Policys policys;
    private BillingPropertys billingPropertys;
    private Transfers transfers;
    private RecipientTransfers recipientTransfers;
    private Operations operations;
    private BillingAccountBillingPermissions billingAccountBillingPermissions;
    private InvoiceSectionsBillingPermissions invoiceSectionsBillingPermissions;
    private BillingProfileBillingPermissions billingProfileBillingPermissions;
    private BillingAccountBillingRoleDefinitions billingAccountBillingRoleDefinitions;
    private InvoiceSectionBillingRoleDefinitions invoiceSectionBillingRoleDefinitions;
    private BillingProfileBillingRoleDefinitions billingProfileBillingRoleDefinitions;
    private BillingAccountBillingRoleAssignments billingAccountBillingRoleAssignments;
    private InvoiceSectionBillingRoleAssignments invoiceSectionBillingRoleAssignments;
    private BillingProfileBillingRoleAssignments billingProfileBillingRoleAssignments;
    /**
    * Get a Configurable instance that can be used to create BillingManager with optional configuration.
    *
    * @return the instance allowing configurations
    */
    public static Configurable configure() {
        return new BillingManager.ConfigurableImpl();
    }
    /**
    * Creates an instance of BillingManager that exposes Billing resource management API entry points.
    *
    * @param credentials the credentials to use
    * @param subscriptionId the subscription UUID
    * @return the BillingManager
    */
    public static BillingManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
        return new BillingManager(new RestClient.Builder()
            .withBaseUrl(credentials.environment(), AzureEnvironment.Endpoint.RESOURCE_MANAGER)
            .withCredentials(credentials)
            .withSerializerAdapter(new AzureJacksonAdapter())
            .withResponseBuilderFactory(new AzureResponseBuilder.Factory())
            .build(), subscriptionId);
    }
    /**
    * Creates an instance of BillingManager that exposes Billing resource management API entry points.
    *
    * @param restClient the RestClient to be used for API calls.
    * @param subscriptionId the subscription UUID
    * @return the BillingManager
    */
    public static BillingManager authenticate(RestClient restClient, String subscriptionId) {
        return new BillingManager(restClient, subscriptionId);
    }
    /**
    * The interface allowing configurations to be set.
    */
    public interface Configurable extends AzureConfigurable<Configurable> {
        /**
        * Creates an instance of BillingManager that exposes Billing management API entry points.
        *
        * @param credentials the credentials to use
        * @param subscriptionId the subscription UUID
        * @return the interface exposing Billing management API entry points that work across subscriptions
        */
        BillingManager authenticate(AzureTokenCredentials credentials, String subscriptionId);
    }

    /**
     * @return Entry point to manage BillingAccounts.
     */
    public BillingAccounts billingAccounts() {
        if (this.billingAccounts == null) {
            this.billingAccounts = new BillingAccountsImpl(this);
        }
        return this.billingAccounts;
    }

    /**
     * @return Entry point to manage BillingAccountsWithCreateInvoiceSectionPermissions.
     */
    public BillingAccountsWithCreateInvoiceSectionPermissions billingAccountsWithCreateInvoiceSectionPermissions() {
        if (this.billingAccountsWithCreateInvoiceSectionPermissions == null) {
            this.billingAccountsWithCreateInvoiceSectionPermissions = new BillingAccountsWithCreateInvoiceSectionPermissionsImpl(this);
        }
        return this.billingAccountsWithCreateInvoiceSectionPermissions;
    }

    /**
     * @return Entry point to manage AvailableBalanceByBillingProfiles.
     */
    public AvailableBalanceByBillingProfiles availableBalanceByBillingProfiles() {
        if (this.availableBalanceByBillingProfiles == null) {
            this.availableBalanceByBillingProfiles = new AvailableBalanceByBillingProfilesImpl(this);
        }
        return this.availableBalanceByBillingProfiles;
    }

    /**
     * @return Entry point to manage PaymentMethodsByBillingProfiles.
     */
    public PaymentMethodsByBillingProfiles paymentMethodsByBillingProfiles() {
        if (this.paymentMethodsByBillingProfiles == null) {
            this.paymentMethodsByBillingProfiles = new PaymentMethodsByBillingProfilesImpl(this);
        }
        return this.paymentMethodsByBillingProfiles;
    }

    /**
     * @return Entry point to manage BillingProfilesByBillingAccountNames.
     */
    public BillingProfilesByBillingAccountNames billingProfilesByBillingAccountNames() {
        if (this.billingProfilesByBillingAccountNames == null) {
            this.billingProfilesByBillingAccountNames = new BillingProfilesByBillingAccountNamesImpl(this);
        }
        return this.billingProfilesByBillingAccountNames;
    }

    /**
     * @return Entry point to manage BillingProfiles.
     */
    public BillingProfiles billingProfiles() {
        if (this.billingProfiles == null) {
            this.billingProfiles = new BillingProfilesImpl(this);
        }
        return this.billingProfiles;
    }

    /**
     * @return Entry point to manage InvoiceSectionsByBillingAccountNames.
     */
    public InvoiceSectionsByBillingAccountNames invoiceSectionsByBillingAccountNames() {
        if (this.invoiceSectionsByBillingAccountNames == null) {
            this.invoiceSectionsByBillingAccountNames = new InvoiceSectionsByBillingAccountNamesImpl(this);
        }
        return this.invoiceSectionsByBillingAccountNames;
    }

    /**
     * @return Entry point to manage InvoiceSections.
     */
    public InvoiceSections invoiceSections() {
        if (this.invoiceSections == null) {
            this.invoiceSections = new InvoiceSectionsImpl(this);
        }
        return this.invoiceSections;
    }

    /**
     * @return Entry point to manage InvoiceSectionsWithCreateSubscriptionPermissions.
     */
    public InvoiceSectionsWithCreateSubscriptionPermissions invoiceSectionsWithCreateSubscriptionPermissions() {
        if (this.invoiceSectionsWithCreateSubscriptionPermissions == null) {
            this.invoiceSectionsWithCreateSubscriptionPermissions = new InvoiceSectionsWithCreateSubscriptionPermissionsImpl(this);
        }
        return this.invoiceSectionsWithCreateSubscriptionPermissions;
    }

    /**
     * @return Entry point to manage DepartmentsByBillingAccountNames.
     */
    public DepartmentsByBillingAccountNames departmentsByBillingAccountNames() {
        if (this.departmentsByBillingAccountNames == null) {
            this.departmentsByBillingAccountNames = new DepartmentsByBillingAccountNamesImpl(this);
        }
        return this.departmentsByBillingAccountNames;
    }

    /**
     * @return Entry point to manage Departments.
     */
    public Departments departments() {
        if (this.departments == null) {
            this.departments = new DepartmentsImpl(this);
        }
        return this.departments;
    }

    /**
     * @return Entry point to manage EnrollmentAccountsByBillingAccountNames.
     */
    public EnrollmentAccountsByBillingAccountNames enrollmentAccountsByBillingAccountNames() {
        if (this.enrollmentAccountsByBillingAccountNames == null) {
            this.enrollmentAccountsByBillingAccountNames = new EnrollmentAccountsByBillingAccountNamesImpl(this);
        }
        return this.enrollmentAccountsByBillingAccountNames;
    }

    /**
     * @return Entry point to manage EnrollmentAccounts.
     */
    public EnrollmentAccounts enrollmentAccounts() {
        if (this.enrollmentAccounts == null) {
            this.enrollmentAccounts = new EnrollmentAccountsImpl(this);
        }
        return this.enrollmentAccounts;
    }

    /**
     * @return Entry point to manage InvoicesByBillingAccounts.
     */
    public InvoicesByBillingAccounts invoicesByBillingAccounts() {
        if (this.invoicesByBillingAccounts == null) {
            this.invoicesByBillingAccounts = new InvoicesByBillingAccountsImpl(this);
        }
        return this.invoicesByBillingAccounts;
    }

    /**
     * @return Entry point to manage InvoicePricesheets.
     */
    public InvoicePricesheets invoicePricesheets() {
        if (this.invoicePricesheets == null) {
            this.invoicePricesheets = new InvoicePricesheetsImpl(this);
        }
        return this.invoicePricesheets;
    }

    /**
     * @return Entry point to manage InvoicesByBillingProfiles.
     */
    public InvoicesByBillingProfiles invoicesByBillingProfiles() {
        if (this.invoicesByBillingProfiles == null) {
            this.invoicesByBillingProfiles = new InvoicesByBillingProfilesImpl(this);
        }
        return this.invoicesByBillingProfiles;
    }

    /**
     * @return Entry point to manage Invoices.
     */
    public Invoices invoices() {
        if (this.invoices == null) {
            this.invoices = new InvoicesImpl(this);
        }
        return this.invoices;
    }

    /**
     * @return Entry point to manage ProductsByBillingSubscriptions.
     */
    public ProductsByBillingSubscriptions productsByBillingSubscriptions() {
        if (this.productsByBillingSubscriptions == null) {
            this.productsByBillingSubscriptions = new ProductsByBillingSubscriptionsImpl(this);
        }
        return this.productsByBillingSubscriptions;
    }

    /**
     * @return Entry point to manage BillingSubscriptionsByBillingProfiles.
     */
    public BillingSubscriptionsByBillingProfiles billingSubscriptionsByBillingProfiles() {
        if (this.billingSubscriptionsByBillingProfiles == null) {
            this.billingSubscriptionsByBillingProfiles = new BillingSubscriptionsByBillingProfilesImpl(this);
        }
        return this.billingSubscriptionsByBillingProfiles;
    }

    /**
     * @return Entry point to manage BillingSubscriptionsByInvoiceSections.
     */
    public BillingSubscriptionsByInvoiceSections billingSubscriptionsByInvoiceSections() {
        if (this.billingSubscriptionsByInvoiceSections == null) {
            this.billingSubscriptionsByInvoiceSections = new BillingSubscriptionsByInvoiceSectionsImpl(this);
        }
        return this.billingSubscriptionsByInvoiceSections;
    }

    /**
     * @return Entry point to manage BillingSubscriptions.
     */
    public BillingSubscriptions billingSubscriptions() {
        if (this.billingSubscriptions == null) {
            this.billingSubscriptions = new BillingSubscriptionsImpl(this);
        }
        return this.billingSubscriptions;
    }

    /**
     * @return Entry point to manage ProductsByBillingAccounts.
     */
    public ProductsByBillingAccounts productsByBillingAccounts() {
        if (this.productsByBillingAccounts == null) {
            this.productsByBillingAccounts = new ProductsByBillingAccountsImpl(this);
        }
        return this.productsByBillingAccounts;
    }

    /**
     * @return Entry point to manage ProductsByInvoiceSections.
     */
    public ProductsByInvoiceSections productsByInvoiceSections() {
        if (this.productsByInvoiceSections == null) {
            this.productsByInvoiceSections = new ProductsByInvoiceSectionsImpl(this);
        }
        return this.productsByInvoiceSections;
    }

    /**
     * @return Entry point to manage Products.
     */
    public Products products() {
        if (this.products == null) {
            this.products = new ProductsImpl(this);
        }
        return this.products;
    }

    /**
     * @return Entry point to manage TransactionsByBillingAccounts.
     */
    public TransactionsByBillingAccounts transactionsByBillingAccounts() {
        if (this.transactionsByBillingAccounts == null) {
            this.transactionsByBillingAccounts = new TransactionsByBillingAccountsImpl(this);
        }
        return this.transactionsByBillingAccounts;
    }

    /**
     * @return Entry point to manage TransactionsByBillingProfiles.
     */
    public TransactionsByBillingProfiles transactionsByBillingProfiles() {
        if (this.transactionsByBillingProfiles == null) {
            this.transactionsByBillingProfiles = new TransactionsByBillingProfilesImpl(this);
        }
        return this.transactionsByBillingProfiles;
    }

    /**
     * @return Entry point to manage TransactionsByInvoiceSections.
     */
    public TransactionsByInvoiceSections transactionsByInvoiceSections() {
        if (this.transactionsByInvoiceSections == null) {
            this.transactionsByInvoiceSections = new TransactionsByInvoiceSectionsImpl(this);
        }
        return this.transactionsByInvoiceSections;
    }

    /**
     * @return Entry point to manage Policys.
     */
    public Policys policys() {
        if (this.policys == null) {
            this.policys = new PolicysImpl(this);
        }
        return this.policys;
    }

    /**
     * @return Entry point to manage BillingPropertys.
     */
    public BillingPropertys billingPropertys() {
        if (this.billingPropertys == null) {
            this.billingPropertys = new BillingPropertysImpl(this);
        }
        return this.billingPropertys;
    }

    /**
     * @return Entry point to manage Transfers.
     */
    public Transfers transfers() {
        if (this.transfers == null) {
            this.transfers = new TransfersImpl(this);
        }
        return this.transfers;
    }

    /**
     * @return Entry point to manage RecipientTransfers.
     */
    public RecipientTransfers recipientTransfers() {
        if (this.recipientTransfers == null) {
            this.recipientTransfers = new RecipientTransfersImpl(this);
        }
        return this.recipientTransfers;
    }

    /**
     * @return Entry point to manage Operations.
     */
    public Operations operations() {
        if (this.operations == null) {
            this.operations = new OperationsImpl(this);
        }
        return this.operations;
    }

    /**
     * @return Entry point to manage BillingAccountBillingPermissions.
     */
    public BillingAccountBillingPermissions billingAccountBillingPermissions() {
        if (this.billingAccountBillingPermissions == null) {
            this.billingAccountBillingPermissions = new BillingAccountBillingPermissionsImpl(this);
        }
        return this.billingAccountBillingPermissions;
    }

    /**
     * @return Entry point to manage InvoiceSectionsBillingPermissions.
     */
    public InvoiceSectionsBillingPermissions invoiceSectionsBillingPermissions() {
        if (this.invoiceSectionsBillingPermissions == null) {
            this.invoiceSectionsBillingPermissions = new InvoiceSectionsBillingPermissionsImpl(this);
        }
        return this.invoiceSectionsBillingPermissions;
    }

    /**
     * @return Entry point to manage BillingProfileBillingPermissions.
     */
    public BillingProfileBillingPermissions billingProfileBillingPermissions() {
        if (this.billingProfileBillingPermissions == null) {
            this.billingProfileBillingPermissions = new BillingProfileBillingPermissionsImpl(this);
        }
        return this.billingProfileBillingPermissions;
    }

    /**
     * @return Entry point to manage BillingAccountBillingRoleDefinitions.
     */
    public BillingAccountBillingRoleDefinitions billingAccountBillingRoleDefinitions() {
        if (this.billingAccountBillingRoleDefinitions == null) {
            this.billingAccountBillingRoleDefinitions = new BillingAccountBillingRoleDefinitionsImpl(this);
        }
        return this.billingAccountBillingRoleDefinitions;
    }

    /**
     * @return Entry point to manage InvoiceSectionBillingRoleDefinitions.
     */
    public InvoiceSectionBillingRoleDefinitions invoiceSectionBillingRoleDefinitions() {
        if (this.invoiceSectionBillingRoleDefinitions == null) {
            this.invoiceSectionBillingRoleDefinitions = new InvoiceSectionBillingRoleDefinitionsImpl(this);
        }
        return this.invoiceSectionBillingRoleDefinitions;
    }

    /**
     * @return Entry point to manage BillingProfileBillingRoleDefinitions.
     */
    public BillingProfileBillingRoleDefinitions billingProfileBillingRoleDefinitions() {
        if (this.billingProfileBillingRoleDefinitions == null) {
            this.billingProfileBillingRoleDefinitions = new BillingProfileBillingRoleDefinitionsImpl(this);
        }
        return this.billingProfileBillingRoleDefinitions;
    }

    /**
     * @return Entry point to manage BillingAccountBillingRoleAssignments.
     */
    public BillingAccountBillingRoleAssignments billingAccountBillingRoleAssignments() {
        if (this.billingAccountBillingRoleAssignments == null) {
            this.billingAccountBillingRoleAssignments = new BillingAccountBillingRoleAssignmentsImpl(this);
        }
        return this.billingAccountBillingRoleAssignments;
    }

    /**
     * @return Entry point to manage InvoiceSectionBillingRoleAssignments.
     */
    public InvoiceSectionBillingRoleAssignments invoiceSectionBillingRoleAssignments() {
        if (this.invoiceSectionBillingRoleAssignments == null) {
            this.invoiceSectionBillingRoleAssignments = new InvoiceSectionBillingRoleAssignmentsImpl(this);
        }
        return this.invoiceSectionBillingRoleAssignments;
    }

    /**
     * @return Entry point to manage BillingProfileBillingRoleAssignments.
     */
    public BillingProfileBillingRoleAssignments billingProfileBillingRoleAssignments() {
        if (this.billingProfileBillingRoleAssignments == null) {
            this.billingProfileBillingRoleAssignments = new BillingProfileBillingRoleAssignmentsImpl(this);
        }
        return this.billingProfileBillingRoleAssignments;
    }

    /**
    * The implementation for Configurable interface.
    */
    private static final class ConfigurableImpl extends AzureConfigurableCoreImpl<Configurable> implements Configurable {
        public BillingManager authenticate(AzureTokenCredentials credentials, String subscriptionId) {
           return BillingManager.authenticate(buildRestClient(credentials), subscriptionId);
        }
     }
    private BillingManager(RestClient restClient, String subscriptionId) {
        super(
            restClient,
            subscriptionId,
            new BillingManagementClientImpl(restClient).withSubscriptionId(subscriptionId));
    }
}
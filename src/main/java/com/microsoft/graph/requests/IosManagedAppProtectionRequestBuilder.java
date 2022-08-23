// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IosManagedAppProtection;
import com.microsoft.graph.models.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.models.ManagedMobileApp;
import com.microsoft.graph.models.TargetedManagedAppGroupType;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.TargetedManagedAppProtectionAssignParameterSet;
import com.microsoft.graph.models.TargetedManagedAppProtectionTargetAppsParameterSet;
import com.microsoft.graph.models.ManagedAppProtectionTargetAppsParameterSet;
import com.microsoft.graph.models.ManagedAppPolicyTargetAppsParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Managed App Protection Request Builder.
 */
public class IosManagedAppProtectionRequestBuilder extends BaseRequestBuilder<IosManagedAppProtection> {

    /**
     * The request builder for the IosManagedAppProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosManagedAppProtectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IosManagedAppProtectionRequest instance
     */
    @Nonnull
    public IosManagedAppProtectionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IosManagedAppProtectionRequest instance
     */
    @Nonnull
    public IosManagedAppProtectionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.IosManagedAppProtectionRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the TargetedManagedAppPolicyAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.TargetedManagedAppPolicyAssignmentCollectionRequestBuilder assignments() {
        return new com.microsoft.graph.requests.TargetedManagedAppPolicyAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the TargetedManagedAppPolicyAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.TargetedManagedAppPolicyAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new com.microsoft.graph.requests.TargetedManagedAppPolicyAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedMobileApp collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ManagedMobileAppCollectionRequestBuilder apps() {
        return new com.microsoft.graph.requests.ManagedMobileAppCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("apps"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedMobileApp item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ManagedMobileAppRequestBuilder apps(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ManagedMobileAppRequestBuilder(getRequestUrlWithAdditionalSegment("apps") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ManagedAppPolicyDeploymentSummary
     *
     * @return the ManagedAppPolicyDeploymentSummaryRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.ManagedAppPolicyDeploymentSummaryRequestBuilder deploymentSummary() {
        return new com.microsoft.graph.requests.ManagedAppPolicyDeploymentSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deploymentSummary"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public TargetedManagedAppProtectionAssignRequestBuilder assign(@Nonnull final TargetedManagedAppProtectionAssignParameterSet parameters) {
        return new TargetedManagedAppProtectionAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public TargetedManagedAppProtectionTargetAppsRequestBuilder targetApps(@Nonnull final TargetedManagedAppProtectionTargetAppsParameterSet parameters) {
        return new TargetedManagedAppProtectionTargetAppsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.targetApps"), getClient(), null, parameters);
    }
}

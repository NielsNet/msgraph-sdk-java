// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessPackage;
import com.microsoft.graph.models.AccessPackageAssignmentRequestRequirements;
import com.microsoft.graph.models.AccessPackageFilterByCurrentUserOptions;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Request Builder.
 */
public class AccessPackageRequestBuilder extends BaseRequestBuilder<AccessPackage> {

    /**
     * The request builder for the AccessPackage
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AccessPackageRequest instance
     */
    @Nonnull
    public AccessPackageRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AccessPackageRequest instance
     */
    @Nonnull
    public AccessPackageRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.AccessPackageRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the AccessPackageAssignmentPolicy collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.AccessPackageAssignmentPolicyCollectionRequestBuilder assignmentPolicies() {
        return new com.microsoft.graph.requests.AccessPackageAssignmentPolicyCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignmentPolicies"), getClient(), null);
    }

    /**
     * Gets a request builder for the AccessPackageAssignmentPolicy item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.AccessPackageAssignmentPolicyRequestBuilder assignmentPolicies(@Nonnull final String id) {
        return new com.microsoft.graph.requests.AccessPackageAssignmentPolicyRequestBuilder(getRequestUrlWithAdditionalSegment("assignmentPolicies") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for AccessPackageCatalog
     *
     * @return the AccessPackageCatalogWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.AccessPackageCatalogWithReferenceRequestBuilder catalog() {
        return new com.microsoft.graph.requests.AccessPackageCatalogWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("catalog"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public AccessPackageGetApplicablePolicyRequirementsCollectionRequestBuilder getApplicablePolicyRequirements() {
        return new AccessPackageGetApplicablePolicyRequirementsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getApplicablePolicyRequirements"), getClient(), null);
    }
}

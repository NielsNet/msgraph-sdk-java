// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagedAndroidStoreApp;
import com.microsoft.graph.models.MobileAppAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.MobileAppAssignParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Android Store App Request Builder.
 */
public class ManagedAndroidStoreAppRequestBuilder extends BaseRequestBuilder<ManagedAndroidStoreApp> {

    /**
     * The request builder for the ManagedAndroidStoreApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAndroidStoreAppRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ManagedAndroidStoreAppRequest instance
     */
    @Nonnull
    public ManagedAndroidStoreAppRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ManagedAndroidStoreAppRequest instance
     */
    @Nonnull
    public ManagedAndroidStoreAppRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.ManagedAndroidStoreAppRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the MobileAppAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.MobileAppAssignmentCollectionRequestBuilder assignments() {
        return new com.microsoft.graph.requests.MobileAppAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the MobileAppAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.MobileAppAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new com.microsoft.graph.requests.MobileAppAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the MobileAppCategory collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.MobileAppCategoryCollectionWithReferencesRequestBuilder categories() {
        return new com.microsoft.graph.requests.MobileAppCategoryCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("categories"), getClient(), null);
    }

    /**
     * Gets a request builder for the MobileAppCategory item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.MobileAppCategoryWithReferenceRequestBuilder categories(@Nonnull final String id) {
        return new com.microsoft.graph.requests.MobileAppCategoryWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("categories") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public MobileAppAssignRequestBuilder assign(@Nonnull final MobileAppAssignParameterSet parameters) {
        return new MobileAppAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, parameters);
    }
}

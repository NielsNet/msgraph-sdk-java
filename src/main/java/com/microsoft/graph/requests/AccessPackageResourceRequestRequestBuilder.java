// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessPackageResourceRequest;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Resource Request Request Builder.
 */
public class AccessPackageResourceRequestRequestBuilder extends BaseRequestBuilder<AccessPackageResourceRequest> {

    /**
     * The request builder for the AccessPackageResourceRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AccessPackageResourceRequestRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the AccessPackageResourceRequestRequest instance
     */
    @Nonnull
    public AccessPackageResourceRequestRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the AccessPackageResourceRequestRequest instance
     */
    @Nonnull
    public AccessPackageResourceRequestRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.AccessPackageResourceRequestRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for AccessPackageCatalog
     *
     * @return the AccessPackageCatalogRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.AccessPackageCatalogRequestBuilder catalog() {
        return new com.microsoft.graph.requests.AccessPackageCatalogRequestBuilder(getRequestUrlWithAdditionalSegment("catalog"), getClient(), null);
    }

    /**
     * Gets the request builder for AccessPackageResource
     *
     * @return the AccessPackageResourceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.AccessPackageResourceRequestBuilder resource() {
        return new com.microsoft.graph.requests.AccessPackageResourceRequestBuilder(getRequestUrlWithAdditionalSegment("resource"), getClient(), null);
    }
}

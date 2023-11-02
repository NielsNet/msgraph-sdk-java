// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.EdiscoveryCustodian;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Custodian Request Builder.
 */
public class EdiscoveryCustodianRequestBuilder extends BaseRequestBuilder<EdiscoveryCustodian> {

    /**
     * The request builder for the EdiscoveryCustodian
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryCustodianRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the EdiscoveryCustodianRequest instance
     */
    @Nonnull
    public EdiscoveryCustodianRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the EdiscoveryCustodianRequest instance
     */
    @Nonnull
    public EdiscoveryCustodianRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.security.requests.EdiscoveryCustodianRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for EdiscoveryIndexOperation
     *
     * @return the EdiscoveryIndexOperationWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.security.requests.EdiscoveryIndexOperationWithReferenceRequestBuilder lastIndexOperation() {
        return new com.microsoft.graph.security.requests.EdiscoveryIndexOperationWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("lastIndexOperation"), getClient(), null);
    }
    /**
     *  Gets a request builder for the SiteSource collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.security.requests.SiteSourceCollectionRequestBuilder siteSources() {
        return new com.microsoft.graph.security.requests.SiteSourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("siteSources"), getClient(), null);
    }

    /**
     * Gets a request builder for the SiteSource item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.security.requests.SiteSourceRequestBuilder siteSources(@Nonnull final String id) {
        return new com.microsoft.graph.security.requests.SiteSourceRequestBuilder(getRequestUrlWithAdditionalSegment("siteSources") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UnifiedGroupSource collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.security.requests.UnifiedGroupSourceCollectionRequestBuilder unifiedGroupSources() {
        return new com.microsoft.graph.security.requests.UnifiedGroupSourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("unifiedGroupSources"), getClient(), null);
    }

    /**
     * Gets a request builder for the UnifiedGroupSource item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.security.requests.UnifiedGroupSourceRequestBuilder unifiedGroupSources(@Nonnull final String id) {
        return new com.microsoft.graph.security.requests.UnifiedGroupSourceRequestBuilder(getRequestUrlWithAdditionalSegment("unifiedGroupSources") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the UserSource collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.security.requests.UserSourceCollectionRequestBuilder userSources() {
        return new com.microsoft.graph.security.requests.UserSourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userSources"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserSource item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.security.requests.UserSourceRequestBuilder userSources(@Nonnull final String id) {
        return new com.microsoft.graph.security.requests.UserSourceRequestBuilder(getRequestUrlWithAdditionalSegment("userSources") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public EdiscoveryCustodianActivateRequestBuilder activate() {
        return new EdiscoveryCustodianActivateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.security.activate"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public EdiscoveryCustodianApplyHoldRequestBuilder applyHold() {
        return new EdiscoveryCustodianApplyHoldRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.security.applyHold"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public EdiscoveryCustodianReleaseRequestBuilder release() {
        return new EdiscoveryCustodianReleaseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.security.release"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public EdiscoveryCustodianRemoveHoldRequestBuilder removeHold() {
        return new EdiscoveryCustodianRemoveHoldRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.security.removeHold"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public EdiscoveryCustodianUpdateIndexRequestBuilder updateIndex() {
        return new EdiscoveryCustodianUpdateIndexRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.security.updateIndex"), getClient(), null);
    }
}
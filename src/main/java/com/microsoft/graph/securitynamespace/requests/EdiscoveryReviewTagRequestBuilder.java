// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.EdiscoveryReviewTag;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Review Tag Request Builder.
 */
public class EdiscoveryReviewTagRequestBuilder extends BaseRequestBuilder<EdiscoveryReviewTag> {

    /**
     * The request builder for the EdiscoveryReviewTag
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryReviewTagRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the EdiscoveryReviewTagRequest instance
     */
    @Nonnull
    public EdiscoveryReviewTagRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the EdiscoveryReviewTagRequest instance
     */
    @Nonnull
    public EdiscoveryReviewTagRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.security.requests.EdiscoveryReviewTagRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the EdiscoveryReviewTag collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.security.requests.EdiscoveryReviewTagCollectionWithReferencesRequestBuilder childTags() {
        return new com.microsoft.graph.security.requests.EdiscoveryReviewTagCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("childTags"), getClient(), null);
    }

    /**
     * Gets a request builder for the EdiscoveryReviewTag item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.security.requests.EdiscoveryReviewTagWithReferenceRequestBuilder childTags(@Nonnull final String id) {
        return new com.microsoft.graph.security.requests.EdiscoveryReviewTagWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("childTags") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for EdiscoveryReviewTag
     *
     * @return the EdiscoveryReviewTagWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.security.requests.EdiscoveryReviewTagWithReferenceRequestBuilder parent() {
        return new com.microsoft.graph.security.requests.EdiscoveryReviewTagWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("parent"), getClient(), null);
    }
}
// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.WhoisRecord;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Whois Record Request Builder.
 */
public class WhoisRecordRequestBuilder extends BaseRequestBuilder<WhoisRecord> {

    /**
     * The request builder for the WhoisRecord
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WhoisRecordRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WhoisRecordRequest instance
     */
    @Nonnull
    public WhoisRecordRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WhoisRecordRequest instance
     */
    @Nonnull
    public WhoisRecordRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.security.requests.WhoisRecordRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for Host
     *
     * @return the HostWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.security.requests.HostWithReferenceRequestBuilder host() {
        return new com.microsoft.graph.security.requests.HostWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("host"), getClient(), null);
    }
    /**
     *  Gets a request builder for the WhoisHistoryRecord collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.security.requests.WhoisHistoryRecordCollectionWithReferencesRequestBuilder history() {
        return new com.microsoft.graph.security.requests.WhoisHistoryRecordCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("history"), getClient(), null);
    }

    /**
     * Gets a request builder for the WhoisHistoryRecord item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.security.requests.WhoisHistoryRecordWithReferenceRequestBuilder history(@Nonnull final String id) {
        return new com.microsoft.graph.security.requests.WhoisHistoryRecordWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("history") + "/" + id, getClient(), null);
    }
}

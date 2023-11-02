// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.EdiscoveryCase;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Case Request Builder.
 */
public class EdiscoveryCaseRequestBuilder extends BaseRequestBuilder<EdiscoveryCase> {

    /**
     * The request builder for the EdiscoveryCase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryCaseRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the EdiscoveryCaseRequest instance
     */
    @Nonnull
    public EdiscoveryCaseRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the EdiscoveryCaseRequest instance
     */
    @Nonnull
    public EdiscoveryCaseRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.security.requests.EdiscoveryCaseRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the EdiscoveryCustodian collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.security.requests.EdiscoveryCustodianCollectionRequestBuilder custodians() {
        return new com.microsoft.graph.security.requests.EdiscoveryCustodianCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("custodians"), getClient(), null);
    }

    /**
     * Gets a request builder for the EdiscoveryCustodian item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.security.requests.EdiscoveryCustodianRequestBuilder custodians(@Nonnull final String id) {
        return new com.microsoft.graph.security.requests.EdiscoveryCustodianRequestBuilder(getRequestUrlWithAdditionalSegment("custodians") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the EdiscoveryNoncustodialDataSource collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.security.requests.EdiscoveryNoncustodialDataSourceCollectionRequestBuilder noncustodialDataSources() {
        return new com.microsoft.graph.security.requests.EdiscoveryNoncustodialDataSourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("noncustodialDataSources"), getClient(), null);
    }

    /**
     * Gets a request builder for the EdiscoveryNoncustodialDataSource item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.security.requests.EdiscoveryNoncustodialDataSourceRequestBuilder noncustodialDataSources(@Nonnull final String id) {
        return new com.microsoft.graph.security.requests.EdiscoveryNoncustodialDataSourceRequestBuilder(getRequestUrlWithAdditionalSegment("noncustodialDataSources") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the CaseOperation collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.security.requests.CaseOperationCollectionRequestBuilder operations() {
        return new com.microsoft.graph.security.requests.CaseOperationCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("operations"), getClient(), null);
    }

    /**
     * Gets a request builder for the CaseOperation item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.security.requests.CaseOperationRequestBuilder operations(@Nonnull final String id) {
        return new com.microsoft.graph.security.requests.CaseOperationRequestBuilder(getRequestUrlWithAdditionalSegment("operations") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the EdiscoveryReviewSet collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.security.requests.EdiscoveryReviewSetCollectionRequestBuilder reviewSets() {
        return new com.microsoft.graph.security.requests.EdiscoveryReviewSetCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("reviewSets"), getClient(), null);
    }

    /**
     * Gets a request builder for the EdiscoveryReviewSet item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.security.requests.EdiscoveryReviewSetRequestBuilder reviewSets(@Nonnull final String id) {
        return new com.microsoft.graph.security.requests.EdiscoveryReviewSetRequestBuilder(getRequestUrlWithAdditionalSegment("reviewSets") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the EdiscoverySearch collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.security.requests.EdiscoverySearchCollectionRequestBuilder searches() {
        return new com.microsoft.graph.security.requests.EdiscoverySearchCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("searches"), getClient(), null);
    }

    /**
     * Gets a request builder for the EdiscoverySearch item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.security.requests.EdiscoverySearchRequestBuilder searches(@Nonnull final String id) {
        return new com.microsoft.graph.security.requests.EdiscoverySearchRequestBuilder(getRequestUrlWithAdditionalSegment("searches") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for EdiscoveryCaseSettings
     *
     * @return the EdiscoveryCaseSettingsRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.security.requests.EdiscoveryCaseSettingsRequestBuilder settings() {
        return new com.microsoft.graph.security.requests.EdiscoveryCaseSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("settings"), getClient(), null);
    }
    /**
     *  Gets a request builder for the EdiscoveryReviewTag collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.security.requests.EdiscoveryReviewTagCollectionRequestBuilder tags() {
        return new com.microsoft.graph.security.requests.EdiscoveryReviewTagCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tags"), getClient(), null);
    }

    /**
     * Gets a request builder for the EdiscoveryReviewTag item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.security.requests.EdiscoveryReviewTagRequestBuilder tags(@Nonnull final String id) {
        return new com.microsoft.graph.security.requests.EdiscoveryReviewTagRequestBuilder(getRequestUrlWithAdditionalSegment("tags") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public EdiscoveryCaseCloseRequestBuilder close() {
        return new EdiscoveryCaseCloseRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.security.close"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     */
    @Nonnull
    public EdiscoveryCaseReopenRequestBuilder reopen() {
        return new EdiscoveryCaseReopenRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.security.reopen"), getClient(), null);
    }
}
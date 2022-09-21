// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Drive;
import com.microsoft.graph.models.DriveItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.DriveSearchParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Request Builder.
 */
public class DriveRequestBuilder extends BaseRequestBuilder<Drive> {

    /**
     * The request builder for the Drive
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DriveRequest instance
     */
    @Nonnull
    public DriveRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the DriveRequest instance
     */
    @Nonnull
    public DriveRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.DriveRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for User
     *
     * @return the UserWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.UserWithReferenceRequestBuilder createdByUser() {
        return new com.microsoft.graph.requests.UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("createdByUser"), getClient(), null);
    }

    /**
     * Gets the request builder for User
     *
     * @return the UserWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.UserWithReferenceRequestBuilder lastModifiedByUser() {
        return new com.microsoft.graph.requests.UserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("lastModifiedByUser"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DriveItem collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DriveItemCollectionRequestBuilder bundles() {
        return new com.microsoft.graph.requests.DriveItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("bundles"), getClient(), null);
    }

    /**
     * Gets a request builder for the DriveItem item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DriveItemRequestBuilder bundles(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("bundles") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DriveItem collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DriveItemCollectionRequestBuilder following() {
        return new com.microsoft.graph.requests.DriveItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("following"), getClient(), null);
    }

    /**
     * Gets a request builder for the DriveItem item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DriveItemRequestBuilder following(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("following") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DriveItem collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DriveItemCollectionRequestBuilder items() {
        return new com.microsoft.graph.requests.DriveItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("items"), getClient(), null);
    }

    /**
     * Gets a request builder for the DriveItem item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DriveItemRequestBuilder items(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("items") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for List
     *
     * @return the ListRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.ListRequestBuilder list() {
        return new com.microsoft.graph.requests.ListRequestBuilder(getRequestUrlWithAdditionalSegment("list"), getClient(), null);
    }

    /**
     * Gets the request builder for DriveItem
     *
     * @return the DriveItemRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.DriveItemRequestBuilder root() {
        return new com.microsoft.graph.requests.DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("root"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DriveItem collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DriveItemCollectionRequestBuilder special() {
        return new com.microsoft.graph.requests.DriveItemCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("special"), getClient(), null);
    }

    /**
     * Gets a request builder for the DriveItem item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DriveItemRequestBuilder special(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DriveItemRequestBuilder(getRequestUrlWithAdditionalSegment("special") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DriveSearchCollectionRequestBuilder search(@Nonnull final DriveSearchParameterSet parameters) {
        return new DriveSearchCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.search"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public DriveRecentCollectionRequestBuilder recent() {
        return new DriveRecentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.recent"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     */
    @Nonnull
    public DriveSharedWithMeCollectionRequestBuilder sharedWithMe() {
        return new DriveSharedWithMeCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.sharedWithMe"), getClient(), null);
    }
}
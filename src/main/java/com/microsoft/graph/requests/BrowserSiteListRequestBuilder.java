// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.BrowserSiteList;
import com.microsoft.graph.models.BrowserSite;
import com.microsoft.graph.models.BrowserSharedCookie;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.BrowserSiteListPublishParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Browser Site List Request Builder.
 */
public class BrowserSiteListRequestBuilder extends BaseRequestBuilder<BrowserSiteList> {

    /**
     * The request builder for the BrowserSiteList
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BrowserSiteListRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the BrowserSiteListRequest instance
     */
    @Nonnull
    public BrowserSiteListRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the BrowserSiteListRequest instance
     */
    @Nonnull
    public BrowserSiteListRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.BrowserSiteListRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the BrowserSharedCookie collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.BrowserSharedCookieCollectionRequestBuilder sharedCookies() {
        return new com.microsoft.graph.requests.BrowserSharedCookieCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sharedCookies"), getClient(), null);
    }

    /**
     * Gets a request builder for the BrowserSharedCookie item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.BrowserSharedCookieRequestBuilder sharedCookies(@Nonnull final String id) {
        return new com.microsoft.graph.requests.BrowserSharedCookieRequestBuilder(getRequestUrlWithAdditionalSegment("sharedCookies") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the BrowserSite collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.BrowserSiteCollectionRequestBuilder sites() {
        return new com.microsoft.graph.requests.BrowserSiteCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sites"), getClient(), null);
    }

    /**
     * Gets a request builder for the BrowserSite item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.BrowserSiteRequestBuilder sites(@Nonnull final String id) {
        return new com.microsoft.graph.requests.BrowserSiteRequestBuilder(getRequestUrlWithAdditionalSegment("sites") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public BrowserSiteListPublishRequestBuilder publish(@Nonnull final BrowserSiteListPublishParameterSet parameters) {
        return new BrowserSiteListPublishRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.publish"), getClient(), null, parameters);
    }
}
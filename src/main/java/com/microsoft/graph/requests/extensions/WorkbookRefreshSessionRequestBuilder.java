// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookRefreshSessionRequest;
import com.microsoft.graph.models.extensions.Workbook;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Refresh Session Request Builder.
 */
public class WorkbookRefreshSessionRequestBuilder extends BaseActionRequestBuilder<Workbook> {

    /**
     * The request builder for this WorkbookRefreshSession
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookRefreshSessionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the WorkbookRefreshSessionRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookRefreshSessionRequest instance
     */
    @Nonnull
    public WorkbookRefreshSessionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookRefreshSessionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookRefreshSessionRequest instance
     */
    @Nonnull
    public WorkbookRefreshSessionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookRefreshSessionRequest request = new WorkbookRefreshSessionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}

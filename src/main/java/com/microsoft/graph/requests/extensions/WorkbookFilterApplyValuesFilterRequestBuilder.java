// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyValuesFilterRequest;
import com.microsoft.graph.models.extensions.WorkbookFilter;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Filter Apply Values Filter Request Builder.
 */
public class WorkbookFilterApplyValuesFilterRequestBuilder extends BaseActionRequestBuilder<WorkbookFilter> {

    /**
     * The request builder for this WorkbookFilterApplyValuesFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param values the values
     */
    public WorkbookFilterApplyValuesFilterRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final com.google.gson.JsonElement values) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("values", values);
    }

    /**
     * Creates the WorkbookFilterApplyValuesFilterRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFilterApplyValuesFilterRequest instance
     */
    @Nonnull
    public WorkbookFilterApplyValuesFilterRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFilterApplyValuesFilterRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFilterApplyValuesFilterRequest instance
     */
    @Nonnull
    public WorkbookFilterApplyValuesFilterRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFilterApplyValuesFilterRequest request = new WorkbookFilterApplyValuesFilterRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("values")) {
            request.body.values = getParameter("values");
        }

        return request;
    }
}

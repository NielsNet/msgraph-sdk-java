// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookFilterApplyCustomFilterRequest;
import com.microsoft.graph.models.extensions.WorkbookFilter;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Filter Apply Custom Filter Request Builder.
 */
public class WorkbookFilterApplyCustomFilterRequestBuilder extends BaseActionRequestBuilder<WorkbookFilter> {

    /**
     * The request builder for this WorkbookFilterApplyCustomFilter
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param criteria1 the criteria1
     * @param criteria2 the criteria2
     * @param oper the oper
     */
    public WorkbookFilterApplyCustomFilterRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final String criteria1, @Nullable final String criteria2, @Nullable final String oper) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("criteria1", criteria1);
        bodyParams.put("criteria2", criteria2);
        bodyParams.put("oper", oper);
    }

    /**
     * Creates the WorkbookFilterApplyCustomFilterRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFilterApplyCustomFilterRequest instance
     */
    @Nonnull
    public WorkbookFilterApplyCustomFilterRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookFilterApplyCustomFilterRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookFilterApplyCustomFilterRequest instance
     */
    @Nonnull
    public WorkbookFilterApplyCustomFilterRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFilterApplyCustomFilterRequest request = new WorkbookFilterApplyCustomFilterRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("criteria1")) {
            request.body.criteria1 = getParameter("criteria1");
        }

        if (hasParameter("criteria2")) {
            request.body.criteria2 = getParameter("criteria2");
        }

        if (hasParameter("oper")) {
            request.body.oper = getParameter("oper");
        }

        return request;
    }
}

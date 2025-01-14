// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.ReportRootGetOffice365GroupsActivityGroupCountsRequest;
import com.microsoft.graph.models.ReportRoot;

import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.models.ReportRootGetOffice365GroupsActivityGroupCountsParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Groups Activity Group Counts Request Builder.
 */
public class ReportRootGetOffice365GroupsActivityGroupCountsRequestBuilder extends BaseFunctionRequestBuilder<java.io.InputStream> {

    /**
     * The request builder for this ReportRootGetOffice365GroupsActivityGroupCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ReportRootGetOffice365GroupsActivityGroupCountsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this ReportRootGetOffice365GroupsActivityGroupCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public ReportRootGetOffice365GroupsActivityGroupCountsRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final ReportRootGetOffice365GroupsActivityGroupCountsParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }

    /**
     * Creates the ReportRootGetOffice365GroupsActivityGroupCountsRequest
     *
     * @param requestOptions the options for the request
     * @return the ReportRootGetOffice365GroupsActivityGroupCountsRequest instance
     */
    @Nonnull
    public ReportRootGetOffice365GroupsActivityGroupCountsRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ReportRootGetOffice365GroupsActivityGroupCountsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ReportRootGetOffice365GroupsActivityGroupCountsRequest instance
     */
    @Nonnull
    public ReportRootGetOffice365GroupsActivityGroupCountsRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final ReportRootGetOffice365GroupsActivityGroupCountsRequest request = new ReportRootGetOffice365GroupsActivityGroupCountsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
        }
        return request;
    }
}

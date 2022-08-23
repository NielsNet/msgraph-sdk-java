// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WorkbookChartGridlines;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Gridlines Request Builder.
 */
public class WorkbookChartGridlinesRequestBuilder extends BaseRequestBuilder<WorkbookChartGridlines> {

    /**
     * The request builder for the WorkbookChartGridlines
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartGridlinesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WorkbookChartGridlinesRequest instance
     */
    @Nonnull
    public WorkbookChartGridlinesRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WorkbookChartGridlinesRequest instance
     */
    @Nonnull
    public WorkbookChartGridlinesRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.WorkbookChartGridlinesRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for WorkbookChartGridlinesFormat
     *
     * @return the WorkbookChartGridlinesFormatRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.WorkbookChartGridlinesFormatRequestBuilder format() {
        return new com.microsoft.graph.requests.WorkbookChartGridlinesFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }
}

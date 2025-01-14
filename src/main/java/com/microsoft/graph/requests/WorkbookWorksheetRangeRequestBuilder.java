// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.WorkbookWorksheetRangeRequest;
import com.microsoft.graph.models.WorkbookWorksheet;
import com.microsoft.graph.models.WorkbookRange;
import com.microsoft.graph.models.WorkbookRange;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.models.WorkbookWorksheetRangeParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Worksheet Range Request Builder.
 */
public class WorkbookWorksheetRangeRequestBuilder extends BaseFunctionRequestBuilder<WorkbookRange> {

    /**
     * The request builder for this WorkbookWorksheetRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookWorksheetRangeRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this WorkbookWorksheetRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public WorkbookWorksheetRangeRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final WorkbookWorksheetRangeParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }

    /**
     * Creates the WorkbookWorksheetRangeRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookWorksheetRangeRequest instance
     */
    @Nonnull
    public WorkbookWorksheetRangeRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookWorksheetRangeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookWorksheetRangeRequest instance
     */
    @Nonnull
    public WorkbookWorksheetRangeRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final WorkbookWorksheetRangeRequest request = new WorkbookWorksheetRangeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
        }
        return request;
    }

    /**
     * Gets the request builder for WorkbookRangeFormat
     *
     * @return the WorkbookRangeFormatRequestBuilder instance
     */
    @Nonnull
    public WorkbookRangeFormatRequestBuilder format() {
        return new WorkbookRangeFormatRequestBuilder(getRequestUrlWithAdditionalSegment("format"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookRangeSort
     *
     * @return the WorkbookRangeSortRequestBuilder instance
     */
    @Nonnull
    public WorkbookRangeSortRequestBuilder sort() {
        return new WorkbookRangeSortRequestBuilder(getRequestUrlWithAdditionalSegment("sort"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookWorksheet
     *
     * @return the WorkbookWorksheetRequestBuilder instance
     */
    @Nonnull
    public WorkbookWorksheetRequestBuilder worksheet() {
        return new WorkbookWorksheetRequestBuilder(getRequestUrlWithAdditionalSegment("worksheet"), getClient(), null);
    }
}

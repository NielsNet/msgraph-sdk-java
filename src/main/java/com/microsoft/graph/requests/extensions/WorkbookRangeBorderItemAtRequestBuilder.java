// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookRangeBorderItemAtRequest;
import com.microsoft.graph.models.extensions.WorkbookRangeBorder;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Range Border Item At Request Builder.
 */
public class WorkbookRangeBorderItemAtRequestBuilder extends BaseFunctionRequestBuilder<WorkbookRangeBorder> {

    /**
     * The request builder for this WorkbookRangeBorderItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param index the index
     */
    public WorkbookRangeBorderItemAtRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final Integer index) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("index", index));
    }

    /**
     * Creates the WorkbookRangeBorderItemAtRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookRangeBorderItemAtRequest instance
     */
    @Nonnull
    public WorkbookRangeBorderItemAtRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookRangeBorderItemAtRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookRangeBorderItemAtRequest instance
     */
    @Nonnull
    public WorkbookRangeBorderItemAtRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookRangeBorderItemAtRequest request = new WorkbookRangeBorderItemAtRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}

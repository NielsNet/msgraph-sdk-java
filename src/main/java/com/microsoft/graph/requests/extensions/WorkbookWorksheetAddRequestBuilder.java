// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.WorkbookWorksheetAddRequest;
import com.microsoft.graph.models.extensions.WorkbookWorksheet;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Worksheet Add Request Builder.
 */
public class WorkbookWorksheetAddRequestBuilder extends BaseActionRequestBuilder<WorkbookWorksheet> {

    /**
     * The request builder for this WorkbookWorksheetAdd
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param name the name
     */
    public WorkbookWorksheetAddRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final String name) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("name", name);
    }

    /**
     * Creates the WorkbookWorksheetAddRequest
     *
     * @param requestOptions the options for the request
     * @return the WorkbookWorksheetAddRequest instance
     */
    @Nonnull
    public WorkbookWorksheetAddRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the WorkbookWorksheetAddRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the WorkbookWorksheetAddRequest instance
     */
    @Nonnull
    public WorkbookWorksheetAddRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookWorksheetAddRequest request = new WorkbookWorksheetAddRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("name")) {
            request.body.name = getParameter("name");
        }

        return request;
    }
}

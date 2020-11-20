// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookTableSort;
import com.microsoft.graph.models.extensions.WorkbookSortField;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Sort Request Builder.
 */
public class WorkbookTableSortRequestBuilder extends BaseRequestBuilder<WorkbookTableSort> {

    /**
     * The request builder for the WorkbookTableSort
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableSortRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WorkbookTableSortRequest instance
     */
    @Nonnull
    public WorkbookTableSortRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WorkbookTableSortRequest instance
     */
    @Nonnull
    public WorkbookTableSortRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WorkbookTableSortRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder 
     * @param fields the fields
     * @param matchCase the matchCase
     * @param method the method
     */
    @Nonnull
    public WorkbookTableSortApplyRequestBuilder apply(@Nullable final java.util.List<WorkbookSortField> fields, @Nullable final Boolean matchCase, @Nullable final String method) {
        return new WorkbookTableSortApplyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.apply"), getClient(), null, fields, matchCase, method);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     */
    @Nonnull
    public WorkbookTableSortClearRequestBuilder clear() {
        return new WorkbookTableSortClearRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.clear"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     */
    @Nonnull
    public WorkbookTableSortReapplyRequestBuilder reapply() {
        return new WorkbookTableSortReapplyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.reapply"), getClient(), null);
    }
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Chart Title Format Request Builder.
 */
public class BaseWorkbookChartTitleFormatRequestBuilder extends BaseRequestBuilder implements IBaseWorkbookChartTitleFormatRequestBuilder {

    /**
     * The request builder for the WorkbookChartTitleFormat
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookChartTitleFormatRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     */
    public IWorkbookChartTitleFormatRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     */
    public IWorkbookChartTitleFormatRequest buildRequest(final java.util.List<Option> requestOptions) {
        return new WorkbookChartTitleFormatRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     * Gets the request builder for WorkbookChartFill.
     */
    public IWorkbookChartFillRequestBuilder getFill() {
        return new WorkbookChartFillRequestBuilder(getRequestUrlWithAdditionalSegment("fill"), getClient(), null);
    }

    /**
     * Gets the request builder for WorkbookChartFont.
     */
    public IWorkbookChartFontRequestBuilder getFont() {
        return new WorkbookChartFontRequestBuilder(getRequestUrlWithAdditionalSegment("font"), getClient(), null);
    }
}

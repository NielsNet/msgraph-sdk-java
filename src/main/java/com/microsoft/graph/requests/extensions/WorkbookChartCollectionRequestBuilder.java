// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookWorksheet;
import com.microsoft.graph.models.extensions.WorkbookChart;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.WorkbookChartCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartCollectionRequest;
import com.microsoft.graph.requests.extensions.WorkbookChartAddRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartCountRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartItemRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartItemAtRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Collection Request Builder.
 */
public class WorkbookChartCollectionRequestBuilder extends BaseCollectionRequestBuilder<WorkbookChart, WorkbookChartRequestBuilder, WorkbookChartCollectionResponse, WorkbookChartCollectionPage, WorkbookChartCollectionRequest> {

    /**
     * The request builder for this collection of WorkbookWorksheet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartRequestBuilder.class, WorkbookChartCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder 
     * @param type the type
     * @param sourceData the sourceData
     * @param seriesBy the seriesBy
     */
    @Nonnull
    public WorkbookChartAddRequestBuilder add(@Nullable final String type, @Nullable final com.google.gson.JsonElement sourceData, @Nullable final String seriesBy) {
        return new WorkbookChartAddRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.add"), getClient(), null, type, sourceData, seriesBy);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     */
    @Nonnull
    public WorkbookChartCountRequestBuilder count() {
        return new WorkbookChartCountRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.count"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     * @param name the name
     */
    @Nonnull
    public WorkbookChartItemRequestBuilder item(@Nullable final String name) {
        return new WorkbookChartItemRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.item"), getClient(), null, name);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     * @param index the index
     */
    @Nonnull
    public WorkbookChartItemAtRequestBuilder itemAt(@Nullable final Integer index) {
        return new WorkbookChartItemAtRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.itemAt"), getClient(), null, index);
    }
}

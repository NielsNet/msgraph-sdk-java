// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.WorkbookChartPoint;
import com.microsoft.graph.requests.WorkbookChartPointCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.WorkbookChartPointCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Point Collection Page.
 */
public class WorkbookChartPointCollectionPage extends BaseCollectionPage<WorkbookChartPoint, WorkbookChartPointCollectionRequestBuilder> {

    /**
     * A collection page for WorkbookChartPoint
     *
     * @param response the serialized WorkbookChartPointCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkbookChartPointCollectionPage(@Nonnull final WorkbookChartPointCollectionResponse response, @Nonnull final WorkbookChartPointCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for WorkbookChartPoint
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public WorkbookChartPointCollectionPage(@Nonnull final java.util.List<WorkbookChartPoint> pageContents, @Nullable final WorkbookChartPointCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookTableColumn;
import com.microsoft.graph.requests.extensions.WorkbookTableColumnCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.WorkbookTableColumnCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Column Collection Page.
 */
public class WorkbookTableColumnCollectionPage extends BaseCollectionPage<WorkbookTableColumn, WorkbookTableColumnCollectionRequestBuilder> {

    /**
     * A collection page for WorkbookTableColumn
     *
     * @param response the serialized WorkbookTableColumnCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WorkbookTableColumnCollectionPage(@Nonnull final WorkbookTableColumnCollectionResponse response, @Nonnull final WorkbookTableColumnCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for WorkbookTableColumn
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public WorkbookTableColumnCollectionPage(@Nonnull final java.util.List<WorkbookTableColumn> pageContents, @Nullable final WorkbookTableColumnCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

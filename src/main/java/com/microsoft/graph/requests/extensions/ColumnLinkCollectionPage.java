// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ColumnLink;
import com.microsoft.graph.requests.extensions.ColumnLinkCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.ColumnLinkCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Column Link Collection Page.
 */
public class ColumnLinkCollectionPage extends BaseCollectionPage<ColumnLink, ColumnLinkCollectionRequestBuilder> {

    /**
     * A collection page for ColumnLink
     *
     * @param response the serialized ColumnLinkCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ColumnLinkCollectionPage(@Nonnull final ColumnLinkCollectionResponse response, @Nonnull final ColumnLinkCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ColumnLink
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ColumnLinkCollectionPage(@Nonnull final java.util.List<ColumnLink> pageContents, @Nullable final ColumnLinkCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

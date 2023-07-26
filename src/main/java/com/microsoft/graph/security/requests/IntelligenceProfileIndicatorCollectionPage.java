// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;
import com.microsoft.graph.security.models.IntelligenceProfileIndicator;
import com.microsoft.graph.security.requests.IntelligenceProfileIndicatorCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.security.requests.IntelligenceProfileIndicatorCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Intelligence Profile Indicator Collection Page.
 */
public class IntelligenceProfileIndicatorCollectionPage extends BaseCollectionPage<IntelligenceProfileIndicator, IntelligenceProfileIndicatorCollectionRequestBuilder> {

    /**
     * A collection page for IntelligenceProfileIndicator
     *
     * @param response the serialized IntelligenceProfileIndicatorCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public IntelligenceProfileIndicatorCollectionPage(@Nonnull final IntelligenceProfileIndicatorCollectionResponse response, @Nonnull final IntelligenceProfileIndicatorCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for IntelligenceProfileIndicator
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public IntelligenceProfileIndicatorCollectionPage(@Nonnull final java.util.List<IntelligenceProfileIndicator> pageContents, @Nullable final IntelligenceProfileIndicatorCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
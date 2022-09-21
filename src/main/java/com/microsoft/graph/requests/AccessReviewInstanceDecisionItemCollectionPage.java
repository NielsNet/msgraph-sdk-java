// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.AccessReviewInstanceDecisionItem;
import com.microsoft.graph.requests.AccessReviewInstanceDecisionItemCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.AccessReviewInstanceDecisionItemCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Review Instance Decision Item Collection Page.
 */
public class AccessReviewInstanceDecisionItemCollectionPage extends BaseCollectionPage<AccessReviewInstanceDecisionItem, AccessReviewInstanceDecisionItemCollectionRequestBuilder> {

    /**
     * A collection page for AccessReviewInstanceDecisionItem
     *
     * @param response the serialized AccessReviewInstanceDecisionItemCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AccessReviewInstanceDecisionItemCollectionPage(@Nonnull final AccessReviewInstanceDecisionItemCollectionResponse response, @Nonnull final AccessReviewInstanceDecisionItemCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for AccessReviewInstanceDecisionItem
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AccessReviewInstanceDecisionItemCollectionPage(@Nonnull final java.util.List<AccessReviewInstanceDecisionItem> pageContents, @Nullable final AccessReviewInstanceDecisionItemCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
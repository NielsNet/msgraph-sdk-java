// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TermsAndConditions;
import com.microsoft.graph.requests.extensions.TermsAndConditionsCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.TermsAndConditionsCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms And Conditions Collection Page.
 */
public class TermsAndConditionsCollectionPage extends BaseCollectionPage<TermsAndConditions, TermsAndConditionsCollectionRequestBuilder> {

    /**
     * A collection page for TermsAndConditions
     *
     * @param response the serialized TermsAndConditionsCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TermsAndConditionsCollectionPage(@Nonnull final TermsAndConditionsCollectionResponse response, @Nonnull final TermsAndConditionsCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for TermsAndConditions
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public TermsAndConditionsCollectionPage(@Nonnull final java.util.List<TermsAndConditions> pageContents, @Nullable final TermsAndConditionsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

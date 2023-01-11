// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;
import com.microsoft.graph.security.models.Alert;
import com.microsoft.graph.security.requests.AlertCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.security.requests.AlertCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Alert Collection Page.
 */
public class AlertCollectionPage extends BaseCollectionPage<Alert, AlertCollectionRequestBuilder> {

    /**
     * A collection page for Alert
     *
     * @param response the serialized AlertCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public AlertCollectionPage(@Nonnull final AlertCollectionResponse response, @Nonnull final AlertCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Alert
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public AlertCollectionPage(@Nonnull final java.util.List<Alert> pageContents, @Nullable final AlertCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedMobileLobApp;
import com.microsoft.graph.requests.extensions.ManagedMobileLobAppCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.ManagedMobileLobAppCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Mobile Lob App Collection Page.
 */
public class ManagedMobileLobAppCollectionPage extends BaseCollectionPage<ManagedMobileLobApp, ManagedMobileLobAppCollectionRequestBuilder> {

    /**
     * A collection page for ManagedMobileLobApp
     *
     * @param response the serialized ManagedMobileLobAppCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagedMobileLobAppCollectionPage(@Nonnull final ManagedMobileLobAppCollectionResponse response, @Nonnull final ManagedMobileLobAppCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ManagedMobileLobApp
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ManagedMobileLobAppCollectionPage(@Nonnull final java.util.List<ManagedMobileLobApp> pageContents, @Nullable final ManagedMobileLobAppCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;
import com.microsoft.graph.security.models.HostPair;
import com.microsoft.graph.security.requests.HostPairCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.security.requests.HostPairCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Host Pair Collection Page.
 */
public class HostPairCollectionPage extends BaseCollectionPage<HostPair, HostPairCollectionRequestBuilder> {

    /**
     * A collection page for HostPair
     *
     * @param response the serialized HostPairCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public HostPairCollectionPage(@Nonnull final HostPairCollectionResponse response, @Nonnull final HostPairCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for HostPair
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public HostPairCollectionPage(@Nonnull final java.util.List<HostPair> pageContents, @Nullable final HostPairCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
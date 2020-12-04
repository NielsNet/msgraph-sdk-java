// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Place;
import com.microsoft.graph.requests.extensions.PlaceCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.PlaceCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Place Collection Page.
 */
public class PlaceCollectionPage extends BaseCollectionPage<Place, PlaceCollectionRequestBuilder> {

    /**
     * A collection page for Place
     *
     * @param response the serialized PlaceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PlaceCollectionPage(@Nonnull final PlaceCollectionResponse response, @Nonnull final PlaceCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for Place
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PlaceCollectionPage(@Nonnull final java.util.List<Place> pageContents, @Nullable final PlaceCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

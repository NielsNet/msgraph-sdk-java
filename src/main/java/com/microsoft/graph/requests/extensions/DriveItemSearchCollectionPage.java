// Template Source: Templates\Java\requests_extensions\BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DriveItem;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.DriveItemSearchCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DriveItemSearchCollectionPage;
import com.microsoft.graph.requests.extensions.DriveItemSearchCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Search Collection Page.
 */
public class DriveItemSearchCollectionPage extends BaseCollectionPage<DriveItem, DriveItemSearchCollectionRequestBuilder> {

    /**
     * A collection page for DriveItem.
     *
     * @param response The serialized DriveItemSearchCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public DriveItemSearchCollectionPage(@Nonnull final DriveItemSearchCollectionResponse response, @Nonnull final DriveItemSearchCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for DriveItemSearch
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DriveItemSearchCollectionPage(@Nonnull final java.util.List<DriveItem> pageContents, @Nullable final DriveItemSearchCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

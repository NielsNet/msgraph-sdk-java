// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileAppContentFile;
import com.microsoft.graph.requests.extensions.MobileAppContentFileCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.MobileAppContentFileCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Content File Collection Page.
 */
public class MobileAppContentFileCollectionPage extends BaseCollectionPage<MobileAppContentFile, MobileAppContentFileCollectionRequestBuilder> {

    /**
     * A collection page for MobileAppContentFile
     *
     * @param response the serialized MobileAppContentFileCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public MobileAppContentFileCollectionPage(@Nonnull final MobileAppContentFileCollectionResponse response, @Nonnull final MobileAppContentFileCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for MobileAppContentFile
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public MobileAppContentFileCollectionPage(@Nonnull final java.util.List<MobileAppContentFile> pageContents, @Nullable final MobileAppContentFileCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PermissionGrantConditionSet;
import com.microsoft.graph.requests.extensions.PermissionGrantConditionSetCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.PermissionGrantConditionSetCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Permission Grant Condition Set Collection Page.
 */
public class PermissionGrantConditionSetCollectionPage extends BaseCollectionPage<PermissionGrantConditionSet, PermissionGrantConditionSetCollectionRequestBuilder> {

    /**
     * A collection page for PermissionGrantConditionSet
     *
     * @param response the serialized PermissionGrantConditionSetCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PermissionGrantConditionSetCollectionPage(@Nonnull final PermissionGrantConditionSetCollectionResponse response, @Nonnull final PermissionGrantConditionSetCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for PermissionGrantConditionSet
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PermissionGrantConditionSetCollectionPage(@Nonnull final java.util.List<PermissionGrantConditionSet> pageContents, @Nullable final PermissionGrantConditionSetCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

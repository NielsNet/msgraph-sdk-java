// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Group;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.DeltaCollectionPage;
import com.microsoft.graph.requests.extensions.GroupDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupDeltaCollectionPage;
import com.microsoft.graph.requests.extensions.GroupDeltaCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Delta Collection Page.
 */
public class GroupDeltaCollectionPage extends DeltaCollectionPage<Group, GroupDeltaCollectionRequestBuilder> {

    /**
     * A collection page for Group.
     *
     * @param response The serialized GroupDeltaCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public GroupDeltaCollectionPage(@Nonnull final GroupDeltaCollectionResponse response, @Nonnull final GroupDeltaCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for GroupDelta
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public GroupDeltaCollectionPage(@Nonnull final java.util.List<Group> pageContents, @Nullable final GroupDeltaCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

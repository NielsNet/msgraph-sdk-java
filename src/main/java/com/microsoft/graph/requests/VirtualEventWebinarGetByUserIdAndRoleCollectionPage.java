// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.VirtualEventWebinar;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.VirtualEventWebinarGetByUserIdAndRoleCollectionRequestBuilder;
import com.microsoft.graph.requests.VirtualEventWebinarGetByUserIdAndRoleCollectionPage;
import com.microsoft.graph.requests.VirtualEventWebinarGetByUserIdAndRoleCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Virtual Event Webinar Get By User Id And Role Collection Page.
 */
public class VirtualEventWebinarGetByUserIdAndRoleCollectionPage extends BaseCollectionPage<VirtualEventWebinar, VirtualEventWebinarGetByUserIdAndRoleCollectionRequestBuilder> {

    /**
     * A collection page for VirtualEventWebinar.
     *
     * @param response The serialized VirtualEventWebinarGetByUserIdAndRoleCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public VirtualEventWebinarGetByUserIdAndRoleCollectionPage(@Nonnull final VirtualEventWebinarGetByUserIdAndRoleCollectionResponse response, @Nonnull final VirtualEventWebinarGetByUserIdAndRoleCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for VirtualEventWebinarGetByUserIdAndRole
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public VirtualEventWebinarGetByUserIdAndRoleCollectionPage(@Nonnull final java.util.List<VirtualEventWebinar> pageContents, @Nullable final VirtualEventWebinarGetByUserIdAndRoleCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

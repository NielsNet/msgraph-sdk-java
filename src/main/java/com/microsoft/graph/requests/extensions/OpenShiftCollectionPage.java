// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.OpenShift;
import com.microsoft.graph.requests.extensions.OpenShiftCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.OpenShiftCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Open Shift Collection Page.
 */
public class OpenShiftCollectionPage extends BaseCollectionPage<OpenShift, OpenShiftCollectionRequestBuilder> {

    /**
     * A collection page for OpenShift
     *
     * @param response the serialized OpenShiftCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public OpenShiftCollectionPage(@Nonnull final OpenShiftCollectionResponse response, @Nonnull final OpenShiftCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for OpenShift
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public OpenShiftCollectionPage(@Nonnull final java.util.List<OpenShift> pageContents, @Nullable final OpenShiftCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

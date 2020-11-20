// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PlannerTask;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.PlannerTaskCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Planner Task Collection Page.
 */
public class PlannerTaskCollectionPage extends BaseCollectionPage<PlannerTask, PlannerTaskCollectionRequestBuilder> {

    /**
     * A collection page for PlannerTask
     *
     * @param response the serialized PlannerTaskCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PlannerTaskCollectionPage(@Nonnull final PlannerTaskCollectionResponse response, @Nonnull final PlannerTaskCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for PlannerTask
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PlannerTaskCollectionPage(@Nonnull final java.util.List<PlannerTask> pageContents, @Nullable final PlannerTaskCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

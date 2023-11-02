// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.PrivilegedAccessGroupAssignmentScheduleRequest;
import com.microsoft.graph.requests.PrivilegedAccessGroupAssignmentScheduleRequestCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.PrivilegedAccessGroupAssignmentScheduleRequestCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Access Group Assignment Schedule Request Collection Page.
 */
public class PrivilegedAccessGroupAssignmentScheduleRequestCollectionPage extends BaseCollectionPage<PrivilegedAccessGroupAssignmentScheduleRequest, PrivilegedAccessGroupAssignmentScheduleRequestCollectionRequestBuilder> {

    /**
     * A collection page for PrivilegedAccessGroupAssignmentScheduleRequest
     *
     * @param response the serialized PrivilegedAccessGroupAssignmentScheduleRequestCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PrivilegedAccessGroupAssignmentScheduleRequestCollectionPage(@Nonnull final PrivilegedAccessGroupAssignmentScheduleRequestCollectionResponse response, @Nonnull final PrivilegedAccessGroupAssignmentScheduleRequestCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for PrivilegedAccessGroupAssignmentScheduleRequest
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PrivilegedAccessGroupAssignmentScheduleRequestCollectionPage(@Nonnull final java.util.List<PrivilegedAccessGroupAssignmentScheduleRequest> pageContents, @Nullable final PrivilegedAccessGroupAssignmentScheduleRequestCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
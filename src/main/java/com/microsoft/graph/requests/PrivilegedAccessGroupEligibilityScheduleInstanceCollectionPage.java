// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.PrivilegedAccessGroupEligibilityScheduleInstance;
import com.microsoft.graph.requests.PrivilegedAccessGroupEligibilityScheduleInstanceCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.PrivilegedAccessGroupEligibilityScheduleInstanceCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Access Group Eligibility Schedule Instance Collection Page.
 */
public class PrivilegedAccessGroupEligibilityScheduleInstanceCollectionPage extends BaseCollectionPage<PrivilegedAccessGroupEligibilityScheduleInstance, PrivilegedAccessGroupEligibilityScheduleInstanceCollectionRequestBuilder> {

    /**
     * A collection page for PrivilegedAccessGroupEligibilityScheduleInstance
     *
     * @param response the serialized PrivilegedAccessGroupEligibilityScheduleInstanceCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public PrivilegedAccessGroupEligibilityScheduleInstanceCollectionPage(@Nonnull final PrivilegedAccessGroupEligibilityScheduleInstanceCollectionResponse response, @Nonnull final PrivilegedAccessGroupEligibilityScheduleInstanceCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for PrivilegedAccessGroupEligibilityScheduleInstance
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public PrivilegedAccessGroupEligibilityScheduleInstanceCollectionPage(@Nonnull final java.util.List<PrivilegedAccessGroupEligibilityScheduleInstance> pageContents, @Nullable final PrivilegedAccessGroupEligibilityScheduleInstanceCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ActivityBasedTimeoutPolicy;
import com.microsoft.graph.requests.extensions.ActivityBasedTimeoutPolicyCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.ActivityBasedTimeoutPolicyCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Activity Based Timeout Policy Collection Page.
 */
public class ActivityBasedTimeoutPolicyCollectionPage extends BaseCollectionPage<ActivityBasedTimeoutPolicy, ActivityBasedTimeoutPolicyCollectionRequestBuilder> {

    /**
     * A collection page for ActivityBasedTimeoutPolicy
     *
     * @param response the serialized ActivityBasedTimeoutPolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ActivityBasedTimeoutPolicyCollectionPage(@Nonnull final ActivityBasedTimeoutPolicyCollectionResponse response, @Nonnull final ActivityBasedTimeoutPolicyCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ActivityBasedTimeoutPolicy
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ActivityBasedTimeoutPolicyCollectionPage(@Nonnull final java.util.List<ActivityBasedTimeoutPolicy> pageContents, @Nullable final ActivityBasedTimeoutPolicyCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

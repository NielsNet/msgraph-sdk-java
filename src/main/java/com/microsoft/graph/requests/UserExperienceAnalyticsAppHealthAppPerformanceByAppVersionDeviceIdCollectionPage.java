// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics App Health App Performance By App Version Device Id Collection Page.
 */
public class UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdCollectionPage extends BaseCollectionPage<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId, UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdCollectionRequestBuilder> {

    /**
     * A collection page for UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId
     *
     * @param response the serialized UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdCollectionPage(@Nonnull final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdCollectionResponse response, @Nonnull final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdCollectionPage(@Nonnull final java.util.List<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceId> pageContents, @Nullable final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionDeviceIdCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
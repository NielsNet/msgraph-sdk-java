// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.DeviceComplianceScheduledActionForRule;
import com.microsoft.graph.requests.DeviceComplianceScheduledActionForRuleCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.DeviceComplianceScheduledActionForRuleCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Scheduled Action For Rule Collection Page.
 */
public class DeviceComplianceScheduledActionForRuleCollectionPage extends BaseCollectionPage<DeviceComplianceScheduledActionForRule, DeviceComplianceScheduledActionForRuleCollectionRequestBuilder> {

    /**
     * A collection page for DeviceComplianceScheduledActionForRule
     *
     * @param response the serialized DeviceComplianceScheduledActionForRuleCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceComplianceScheduledActionForRuleCollectionPage(@Nonnull final DeviceComplianceScheduledActionForRuleCollectionResponse response, @Nonnull final DeviceComplianceScheduledActionForRuleCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceComplianceScheduledActionForRule
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceComplianceScheduledActionForRuleCollectionPage(@Nonnull final java.util.List<DeviceComplianceScheduledActionForRule> pageContents, @Nullable final DeviceComplianceScheduledActionForRuleCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

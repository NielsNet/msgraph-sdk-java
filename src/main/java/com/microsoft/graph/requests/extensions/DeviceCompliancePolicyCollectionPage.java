// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Collection Page.
 */
public class DeviceCompliancePolicyCollectionPage extends BaseCollectionPage<DeviceCompliancePolicy, DeviceCompliancePolicyCollectionRequestBuilder> {

    /**
     * A collection page for DeviceCompliancePolicy
     *
     * @param response the serialized DeviceCompliancePolicyCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceCompliancePolicyCollectionPage(@Nonnull final DeviceCompliancePolicyCollectionResponse response, @Nonnull final DeviceCompliancePolicyCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceCompliancePolicy
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceCompliancePolicyCollectionPage(@Nonnull final java.util.List<DeviceCompliancePolicy> pageContents, @Nullable final DeviceCompliancePolicyCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

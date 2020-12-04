// Template Source: Templates\Java\requests_extensions\BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceComplianceUserStatus;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserStatusCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserStatusCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance User Status Collection Page.
 */
public class DeviceComplianceUserStatusCollectionPage extends BaseCollectionPage<DeviceComplianceUserStatus, DeviceComplianceUserStatusCollectionRequestBuilder> {

    /**
     * A collection page for DeviceComplianceUserStatus
     *
     * @param response the serialized DeviceComplianceUserStatusCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceComplianceUserStatusCollectionPage(@Nonnull final DeviceComplianceUserStatusCollectionResponse response, @Nonnull final DeviceComplianceUserStatusCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceComplianceUserStatus
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceComplianceUserStatusCollectionPage(@Nonnull final java.util.List<DeviceComplianceUserStatus> pageContents, @Nullable final DeviceComplianceUserStatusCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.DeviceLocalCredentialInfo;
import com.microsoft.graph.requests.DeviceLocalCredentialInfoCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.DeviceLocalCredentialInfoCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Local Credential Info Collection Page.
 */
public class DeviceLocalCredentialInfoCollectionPage extends BaseCollectionPage<DeviceLocalCredentialInfo, DeviceLocalCredentialInfoCollectionRequestBuilder> {

    /**
     * A collection page for DeviceLocalCredentialInfo
     *
     * @param response the serialized DeviceLocalCredentialInfoCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public DeviceLocalCredentialInfoCollectionPage(@Nonnull final DeviceLocalCredentialInfoCollectionResponse response, @Nonnull final DeviceLocalCredentialInfoCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for DeviceLocalCredentialInfo
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public DeviceLocalCredentialInfoCollectionPage(@Nonnull final java.util.List<DeviceLocalCredentialInfo> pageContents, @Nullable final DeviceLocalCredentialInfoCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ManagedDeviceMobileAppConfiguration;
import com.microsoft.graph.models.ManagedDeviceMobileAppConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.ManagedDeviceMobileAppConfigurationAssignParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Mobile App Configuration Request Builder.
 */
public class ManagedDeviceMobileAppConfigurationRequestBuilder extends BaseRequestBuilder<ManagedDeviceMobileAppConfiguration> {

    /**
     * The request builder for the ManagedDeviceMobileAppConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceMobileAppConfigurationRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ManagedDeviceMobileAppConfigurationRequest instance
     */
    @Nonnull
    public ManagedDeviceMobileAppConfigurationRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ManagedDeviceMobileAppConfigurationRequest instance
     */
    @Nonnull
    public ManagedDeviceMobileAppConfigurationRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the ManagedDeviceMobileAppConfigurationAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationAssignmentCollectionRequestBuilder assignments() {
        return new com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedDeviceMobileAppConfigurationAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedDeviceMobileAppConfigurationDeviceStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder deviceStatuses() {
        return new com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedDeviceMobileAppConfigurationDeviceStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder deviceStatuses(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ManagedDeviceMobileAppConfigurationDeviceSummary
     *
     * @return the ManagedDeviceMobileAppConfigurationDeviceSummaryRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationDeviceSummaryRequestBuilder deviceStatusSummary() {
        return new com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationDeviceSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatusSummary"), getClient(), null);
    }
    /**
     *  Gets a request builder for the ManagedDeviceMobileAppConfigurationUserStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder userStatuses() {
        return new com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedDeviceMobileAppConfigurationUserStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationUserStatusRequestBuilder userStatuses(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationUserStatusRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for ManagedDeviceMobileAppConfigurationUserSummary
     *
     * @return the ManagedDeviceMobileAppConfigurationUserSummaryRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationUserSummaryRequestBuilder userStatusSummary() {
        return new com.microsoft.graph.requests.ManagedDeviceMobileAppConfigurationUserSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("userStatusSummary"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedDeviceMobileAppConfigurationAssignRequestBuilder assign(@Nonnull final ManagedDeviceMobileAppConfigurationAssignParameterSet parameters) {
        return new ManagedDeviceMobileAppConfigurationAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, parameters);
    }
}

// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Windows10SecureAssessmentConfiguration;
import com.microsoft.graph.models.DeviceConfigurationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.DeviceConfigurationAssignParameterSet;
import com.microsoft.graph.models.DeviceConfigurationGetOmaSettingPlainTextValueParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows10Secure Assessment Configuration Request Builder.
 */
public class Windows10SecureAssessmentConfigurationRequestBuilder extends BaseRequestBuilder<Windows10SecureAssessmentConfiguration> {

    /**
     * The request builder for the Windows10SecureAssessmentConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Windows10SecureAssessmentConfigurationRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the Windows10SecureAssessmentConfigurationRequest instance
     */
    @Nonnull
    public Windows10SecureAssessmentConfigurationRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the Windows10SecureAssessmentConfigurationRequest instance
     */
    @Nonnull
    public Windows10SecureAssessmentConfigurationRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.Windows10SecureAssessmentConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the DeviceConfigurationAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DeviceConfigurationAssignmentCollectionRequestBuilder assignments() {
        return new com.microsoft.graph.requests.DeviceConfigurationAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceConfigurationAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DeviceConfigurationAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DeviceConfigurationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the SettingStateDeviceSummary collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.SettingStateDeviceSummaryCollectionRequestBuilder deviceSettingStateSummaries() {
        return new com.microsoft.graph.requests.SettingStateDeviceSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries"), getClient(), null);
    }

    /**
     * Gets a request builder for the SettingStateDeviceSummary item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.SettingStateDeviceSummaryRequestBuilder deviceSettingStateSummaries(@Nonnull final String id) {
        return new com.microsoft.graph.requests.SettingStateDeviceSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceConfigurationDeviceStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DeviceConfigurationDeviceStatusCollectionRequestBuilder deviceStatuses() {
        return new com.microsoft.graph.requests.DeviceConfigurationDeviceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceConfigurationDeviceStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DeviceConfigurationDeviceStatusRequestBuilder deviceStatuses(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DeviceConfigurationDeviceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceConfigurationDeviceOverview
     *
     * @return the DeviceConfigurationDeviceOverviewRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.DeviceConfigurationDeviceOverviewRequestBuilder deviceStatusOverview() {
        return new com.microsoft.graph.requests.DeviceConfigurationDeviceOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatusOverview"), getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceConfigurationUserStatus collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DeviceConfigurationUserStatusCollectionRequestBuilder userStatuses() {
        return new com.microsoft.graph.requests.DeviceConfigurationUserStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceConfigurationUserStatus item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DeviceConfigurationUserStatusRequestBuilder userStatuses(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DeviceConfigurationUserStatusRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceConfigurationUserOverview
     *
     * @return the DeviceConfigurationUserOverviewRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.DeviceConfigurationUserOverviewRequestBuilder userStatusOverview() {
        return new com.microsoft.graph.requests.DeviceConfigurationUserOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("userStatusOverview"), getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder collection
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceConfigurationAssignCollectionRequestBuilder assign(@Nonnull final DeviceConfigurationAssignParameterSet parameters) {
        return new DeviceConfigurationAssignCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, parameters);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public DeviceConfigurationGetOmaSettingPlainTextValueRequestBuilder getOmaSettingPlainTextValue(@Nonnull final DeviceConfigurationGetOmaSettingPlainTextValueParameterSet parameters) {
        return new DeviceConfigurationGetOmaSettingPlainTextValueRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getOmaSettingPlainTextValue"), getClient(), null, parameters);
    }
}

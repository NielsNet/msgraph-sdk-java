// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosDeviceFeaturesConfiguration;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Ios Device Features Configuration Request Builder.
 */
public interface IIosDeviceFeaturesConfigurationRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IIosDeviceFeaturesConfigurationRequest instance
     */
    IIosDeviceFeaturesConfigurationRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IIosDeviceFeaturesConfigurationRequest instance
     */
    IIosDeviceFeaturesConfigurationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IDeviceConfigurationAssignmentCollectionRequestBuilder assignments();

    IDeviceConfigurationAssignmentRequestBuilder assignments(final String id);

    ISettingStateDeviceSummaryCollectionRequestBuilder deviceSettingStateSummaries();

    ISettingStateDeviceSummaryRequestBuilder deviceSettingStateSummaries(final String id);

    IDeviceConfigurationDeviceStatusCollectionRequestBuilder deviceStatuses();

    IDeviceConfigurationDeviceStatusRequestBuilder deviceStatuses(final String id);

    /**
     * Gets the request builder for DeviceConfigurationDeviceOverview
     *
     * @return the IDeviceConfigurationDeviceOverviewRequestBuilder instance
     */
    IDeviceConfigurationDeviceOverviewRequestBuilder deviceStatusOverview();

    IDeviceConfigurationUserStatusCollectionRequestBuilder userStatuses();

    IDeviceConfigurationUserStatusRequestBuilder userStatuses(final String id);

    /**
     * Gets the request builder for DeviceConfigurationUserOverview
     *
     * @return the IDeviceConfigurationUserOverviewRequestBuilder instance
     */
    IDeviceConfigurationUserOverviewRequestBuilder userStatusOverview();

}
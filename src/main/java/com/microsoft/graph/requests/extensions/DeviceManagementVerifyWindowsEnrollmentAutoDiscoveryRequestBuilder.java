// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest;
import com.microsoft.graph.models.extensions.DeviceManagement;

import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Verify Windows Enrollment Auto Discovery Request Builder.
 */
public class DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequestBuilder extends BaseFunctionRequestBuilder<Boolean> {

    /**
     * The request builder for this DeviceManagementVerifyWindowsEnrollmentAutoDiscovery
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param domainName the domainName
     */
    public DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final String domainName) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("domainName", domainName));
    }

    /**
     * Creates the DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest instance
     */
    @Nonnull
    public DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest instance
     */
    @Nonnull
    public DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest request = new DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}

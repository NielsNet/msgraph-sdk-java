// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.requests.extensions.DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest;

import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Verify Windows Enrollment Auto Discovery Request.
 */
public class DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest extends BaseRequest<Boolean> {

    /**
     * The request for this DeviceManagementVerifyWindowsEnrollmentAutoDiscovery
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Boolean.class);
    }

    /**
     * Gets the Boolean
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super Boolean> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Boolean
     *
     * @return the Boolean
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public Boolean get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public DeviceManagementVerifyWindowsEnrollmentAutoDiscoveryRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

}

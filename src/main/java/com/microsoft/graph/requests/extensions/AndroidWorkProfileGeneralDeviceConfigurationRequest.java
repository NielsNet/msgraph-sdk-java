// Template Source: Templates\Java\requests_extensions\BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AndroidWorkProfileGeneralDeviceConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Work Profile General Device Configuration Request.
 */
public class AndroidWorkProfileGeneralDeviceConfigurationRequest extends BaseRequest<AndroidWorkProfileGeneralDeviceConfiguration> {
	
    /**
     * The request for the AndroidWorkProfileGeneralDeviceConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidWorkProfileGeneralDeviceConfigurationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidWorkProfileGeneralDeviceConfiguration.class);
    }

    /**
     * Gets the AndroidWorkProfileGeneralDeviceConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super AndroidWorkProfileGeneralDeviceConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AndroidWorkProfileGeneralDeviceConfiguration from the service
     *
     * @return the AndroidWorkProfileGeneralDeviceConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileGeneralDeviceConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super AndroidWorkProfileGeneralDeviceConfiguration> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this AndroidWorkProfileGeneralDeviceConfiguration with a source
     *
     * @param sourceAndroidWorkProfileGeneralDeviceConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final AndroidWorkProfileGeneralDeviceConfiguration sourceAndroidWorkProfileGeneralDeviceConfiguration, @Nonnull final ICallback<? super AndroidWorkProfileGeneralDeviceConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceAndroidWorkProfileGeneralDeviceConfiguration);
    }

    /**
     * Patches this AndroidWorkProfileGeneralDeviceConfiguration with a source
     *
     * @param sourceAndroidWorkProfileGeneralDeviceConfiguration the source object with updates
     * @return the updated AndroidWorkProfileGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileGeneralDeviceConfiguration patch(@Nonnull final AndroidWorkProfileGeneralDeviceConfiguration sourceAndroidWorkProfileGeneralDeviceConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceAndroidWorkProfileGeneralDeviceConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidWorkProfileGeneralDeviceConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final AndroidWorkProfileGeneralDeviceConfiguration newAndroidWorkProfileGeneralDeviceConfiguration, @Nonnull final ICallback<? super AndroidWorkProfileGeneralDeviceConfiguration> callback) {
        send(HttpMethod.POST, callback, newAndroidWorkProfileGeneralDeviceConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidWorkProfileGeneralDeviceConfiguration the new object to create
     * @return the created AndroidWorkProfileGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileGeneralDeviceConfiguration post(@Nonnull final AndroidWorkProfileGeneralDeviceConfiguration newAndroidWorkProfileGeneralDeviceConfiguration) throws ClientException {
        return send(HttpMethod.POST, newAndroidWorkProfileGeneralDeviceConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidWorkProfileGeneralDeviceConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final AndroidWorkProfileGeneralDeviceConfiguration newAndroidWorkProfileGeneralDeviceConfiguration, @Nonnull final ICallback<? super AndroidWorkProfileGeneralDeviceConfiguration> callback) {
        send(HttpMethod.PUT, callback, newAndroidWorkProfileGeneralDeviceConfiguration);
    }

    /**
     * Creates a AndroidWorkProfileGeneralDeviceConfiguration with a new object
     *
     * @param newAndroidWorkProfileGeneralDeviceConfiguration the object to create/update
     * @return the created AndroidWorkProfileGeneralDeviceConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public AndroidWorkProfileGeneralDeviceConfiguration put(@Nonnull final AndroidWorkProfileGeneralDeviceConfiguration newAndroidWorkProfileGeneralDeviceConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newAndroidWorkProfileGeneralDeviceConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public AndroidWorkProfileGeneralDeviceConfigurationRequest select(@Nonnull final String value) {
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
     public AndroidWorkProfileGeneralDeviceConfigurationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


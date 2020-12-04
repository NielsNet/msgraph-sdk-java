// Template Source: Templates\Java\requests_extensions\BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSOfficeSuiteApp;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSOffice Suite App Request.
 */
public class MacOSOfficeSuiteAppRequest extends BaseRequest<MacOSOfficeSuiteApp> {
	
    /**
     * The request for the MacOSOfficeSuiteApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSOfficeSuiteAppRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MacOSOfficeSuiteApp.class);
    }

    /**
     * Gets the MacOSOfficeSuiteApp from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super MacOSOfficeSuiteApp> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MacOSOfficeSuiteApp from the service
     *
     * @return the MacOSOfficeSuiteApp from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSOfficeSuiteApp get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super MacOSOfficeSuiteApp> callback) {
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
     * Patches this MacOSOfficeSuiteApp with a source
     *
     * @param sourceMacOSOfficeSuiteApp the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final MacOSOfficeSuiteApp sourceMacOSOfficeSuiteApp, @Nonnull final ICallback<? super MacOSOfficeSuiteApp> callback) {
        send(HttpMethod.PATCH, callback, sourceMacOSOfficeSuiteApp);
    }

    /**
     * Patches this MacOSOfficeSuiteApp with a source
     *
     * @param sourceMacOSOfficeSuiteApp the source object with updates
     * @return the updated MacOSOfficeSuiteApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSOfficeSuiteApp patch(@Nonnull final MacOSOfficeSuiteApp sourceMacOSOfficeSuiteApp) throws ClientException {
        return send(HttpMethod.PATCH, sourceMacOSOfficeSuiteApp);
    }

    /**
     * Creates a MacOSOfficeSuiteApp with a new object
     *
     * @param newMacOSOfficeSuiteApp the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final MacOSOfficeSuiteApp newMacOSOfficeSuiteApp, @Nonnull final ICallback<? super MacOSOfficeSuiteApp> callback) {
        send(HttpMethod.POST, callback, newMacOSOfficeSuiteApp);
    }

    /**
     * Creates a MacOSOfficeSuiteApp with a new object
     *
     * @param newMacOSOfficeSuiteApp the new object to create
     * @return the created MacOSOfficeSuiteApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSOfficeSuiteApp post(@Nonnull final MacOSOfficeSuiteApp newMacOSOfficeSuiteApp) throws ClientException {
        return send(HttpMethod.POST, newMacOSOfficeSuiteApp);
    }

    /**
     * Creates a MacOSOfficeSuiteApp with a new object
     *
     * @param newMacOSOfficeSuiteApp the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final MacOSOfficeSuiteApp newMacOSOfficeSuiteApp, @Nonnull final ICallback<? super MacOSOfficeSuiteApp> callback) {
        send(HttpMethod.PUT, callback, newMacOSOfficeSuiteApp);
    }

    /**
     * Creates a MacOSOfficeSuiteApp with a new object
     *
     * @param newMacOSOfficeSuiteApp the object to create/update
     * @return the created MacOSOfficeSuiteApp
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MacOSOfficeSuiteApp put(@Nonnull final MacOSOfficeSuiteApp newMacOSOfficeSuiteApp) throws ClientException {
        return send(HttpMethod.PUT, newMacOSOfficeSuiteApp);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MacOSOfficeSuiteAppRequest select(@Nonnull final String value) {
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
     public MacOSOfficeSuiteAppRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MultiValueLegacyExtendedProperty;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Multi Value Legacy Extended Property Request.
 */
public class MultiValueLegacyExtendedPropertyRequest extends BaseRequest<MultiValueLegacyExtendedProperty> {
	
    /**
     * The request for the MultiValueLegacyExtendedProperty
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MultiValueLegacyExtendedPropertyRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MultiValueLegacyExtendedProperty.class);
    }

    /**
     * Gets the MultiValueLegacyExtendedProperty from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super MultiValueLegacyExtendedProperty> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MultiValueLegacyExtendedProperty from the service
     *
     * @return the MultiValueLegacyExtendedProperty from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MultiValueLegacyExtendedProperty get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super MultiValueLegacyExtendedProperty> callback) {
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
     * Patches this MultiValueLegacyExtendedProperty with a source
     *
     * @param sourceMultiValueLegacyExtendedProperty the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final MultiValueLegacyExtendedProperty sourceMultiValueLegacyExtendedProperty, @Nonnull final ICallback<? super MultiValueLegacyExtendedProperty> callback) {
        send(HttpMethod.PATCH, callback, sourceMultiValueLegacyExtendedProperty);
    }

    /**
     * Patches this MultiValueLegacyExtendedProperty with a source
     *
     * @param sourceMultiValueLegacyExtendedProperty the source object with updates
     * @return the updated MultiValueLegacyExtendedProperty
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MultiValueLegacyExtendedProperty patch(@Nonnull final MultiValueLegacyExtendedProperty sourceMultiValueLegacyExtendedProperty) throws ClientException {
        return send(HttpMethod.PATCH, sourceMultiValueLegacyExtendedProperty);
    }

    /**
     * Creates a MultiValueLegacyExtendedProperty with a new object
     *
     * @param newMultiValueLegacyExtendedProperty the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final MultiValueLegacyExtendedProperty newMultiValueLegacyExtendedProperty, @Nonnull final ICallback<? super MultiValueLegacyExtendedProperty> callback) {
        send(HttpMethod.POST, callback, newMultiValueLegacyExtendedProperty);
    }

    /**
     * Creates a MultiValueLegacyExtendedProperty with a new object
     *
     * @param newMultiValueLegacyExtendedProperty the new object to create
     * @return the created MultiValueLegacyExtendedProperty
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MultiValueLegacyExtendedProperty post(@Nonnull final MultiValueLegacyExtendedProperty newMultiValueLegacyExtendedProperty) throws ClientException {
        return send(HttpMethod.POST, newMultiValueLegacyExtendedProperty);
    }

    /**
     * Creates a MultiValueLegacyExtendedProperty with a new object
     *
     * @param newMultiValueLegacyExtendedProperty the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final MultiValueLegacyExtendedProperty newMultiValueLegacyExtendedProperty, @Nonnull final ICallback<? super MultiValueLegacyExtendedProperty> callback) {
        send(HttpMethod.PUT, callback, newMultiValueLegacyExtendedProperty);
    }

    /**
     * Creates a MultiValueLegacyExtendedProperty with a new object
     *
     * @param newMultiValueLegacyExtendedProperty the object to create/update
     * @return the created MultiValueLegacyExtendedProperty
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MultiValueLegacyExtendedProperty put(@Nonnull final MultiValueLegacyExtendedProperty newMultiValueLegacyExtendedProperty) throws ClientException {
        return send(HttpMethod.PUT, newMultiValueLegacyExtendedProperty);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MultiValueLegacyExtendedPropertyRequest select(@Nonnull final String value) {
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
     public MultiValueLegacyExtendedPropertyRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


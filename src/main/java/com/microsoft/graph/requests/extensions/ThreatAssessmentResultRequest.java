// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ThreatAssessmentResult;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Threat Assessment Result Request.
 */
public class ThreatAssessmentResultRequest extends BaseRequest<ThreatAssessmentResult> {
	
    /**
     * The request for the ThreatAssessmentResult
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ThreatAssessmentResultRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ThreatAssessmentResult.class);
    }

    /**
     * Gets the ThreatAssessmentResult from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super ThreatAssessmentResult> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ThreatAssessmentResult from the service
     *
     * @return the ThreatAssessmentResult from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ThreatAssessmentResult get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super ThreatAssessmentResult> callback) {
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
     * Patches this ThreatAssessmentResult with a source
     *
     * @param sourceThreatAssessmentResult the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final ThreatAssessmentResult sourceThreatAssessmentResult, @Nonnull final ICallback<? super ThreatAssessmentResult> callback) {
        send(HttpMethod.PATCH, callback, sourceThreatAssessmentResult);
    }

    /**
     * Patches this ThreatAssessmentResult with a source
     *
     * @param sourceThreatAssessmentResult the source object with updates
     * @return the updated ThreatAssessmentResult
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ThreatAssessmentResult patch(@Nonnull final ThreatAssessmentResult sourceThreatAssessmentResult) throws ClientException {
        return send(HttpMethod.PATCH, sourceThreatAssessmentResult);
    }

    /**
     * Creates a ThreatAssessmentResult with a new object
     *
     * @param newThreatAssessmentResult the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final ThreatAssessmentResult newThreatAssessmentResult, @Nonnull final ICallback<? super ThreatAssessmentResult> callback) {
        send(HttpMethod.POST, callback, newThreatAssessmentResult);
    }

    /**
     * Creates a ThreatAssessmentResult with a new object
     *
     * @param newThreatAssessmentResult the new object to create
     * @return the created ThreatAssessmentResult
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ThreatAssessmentResult post(@Nonnull final ThreatAssessmentResult newThreatAssessmentResult) throws ClientException {
        return send(HttpMethod.POST, newThreatAssessmentResult);
    }

    /**
     * Creates a ThreatAssessmentResult with a new object
     *
     * @param newThreatAssessmentResult the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final ThreatAssessmentResult newThreatAssessmentResult, @Nonnull final ICallback<? super ThreatAssessmentResult> callback) {
        send(HttpMethod.PUT, callback, newThreatAssessmentResult);
    }

    /**
     * Creates a ThreatAssessmentResult with a new object
     *
     * @param newThreatAssessmentResult the object to create/update
     * @return the created ThreatAssessmentResult
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public ThreatAssessmentResult put(@Nonnull final ThreatAssessmentResult newThreatAssessmentResult) throws ClientException {
        return send(HttpMethod.PUT, newThreatAssessmentResult);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ThreatAssessmentResultRequest select(@Nonnull final String value) {
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
     public ThreatAssessmentResultRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


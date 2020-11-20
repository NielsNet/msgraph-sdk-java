// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Schedule;
import com.microsoft.graph.requests.extensions.OfferShiftRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OfferShiftRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.OpenShiftChangeRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OpenShiftChangeRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.OpenShiftCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OpenShiftRequestBuilder;
import com.microsoft.graph.requests.extensions.SchedulingGroupCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SchedulingGroupRequestBuilder;
import com.microsoft.graph.requests.extensions.ShiftCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ShiftRequestBuilder;
import com.microsoft.graph.requests.extensions.SwapShiftsChangeRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SwapShiftsChangeRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffReasonCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffReasonRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TimeOffRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Schedule Request.
 */
public class ScheduleRequest extends BaseRequest<Schedule> {
	
    /**
     * The request for the Schedule
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ScheduleRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Schedule.class);
    }

    /**
     * Gets the Schedule from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super Schedule> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Schedule from the service
     *
     * @return the Schedule from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Schedule get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super Schedule> callback) {
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
     * Patches this Schedule with a source
     *
     * @param sourceSchedule the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final Schedule sourceSchedule, @Nonnull final ICallback<? super Schedule> callback) {
        send(HttpMethod.PATCH, callback, sourceSchedule);
    }

    /**
     * Patches this Schedule with a source
     *
     * @param sourceSchedule the source object with updates
     * @return the updated Schedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Schedule patch(@Nonnull final Schedule sourceSchedule) throws ClientException {
        return send(HttpMethod.PATCH, sourceSchedule);
    }

    /**
     * Creates a Schedule with a new object
     *
     * @param newSchedule the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final Schedule newSchedule, @Nonnull final ICallback<? super Schedule> callback) {
        send(HttpMethod.POST, callback, newSchedule);
    }

    /**
     * Creates a Schedule with a new object
     *
     * @param newSchedule the new object to create
     * @return the created Schedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Schedule post(@Nonnull final Schedule newSchedule) throws ClientException {
        return send(HttpMethod.POST, newSchedule);
    }

    /**
     * Creates a Schedule with a new object
     *
     * @param newSchedule the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final Schedule newSchedule, @Nonnull final ICallback<? super Schedule> callback) {
        send(HttpMethod.PUT, callback, newSchedule);
    }

    /**
     * Creates a Schedule with a new object
     *
     * @param newSchedule the object to create/update
     * @return the created Schedule
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Schedule put(@Nonnull final Schedule newSchedule) throws ClientException {
        return send(HttpMethod.PUT, newSchedule);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public ScheduleRequest select(@Nonnull final String value) {
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
     public ScheduleRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


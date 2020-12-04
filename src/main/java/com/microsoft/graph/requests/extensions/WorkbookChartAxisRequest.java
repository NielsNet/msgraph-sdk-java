// Template Source: Templates\Java\requests_extensions\BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartAxis;
import com.microsoft.graph.requests.extensions.WorkbookChartAxisFormatRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartGridlinesRequestBuilder;
import com.microsoft.graph.requests.extensions.WorkbookChartAxisTitleRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Chart Axis Request.
 */
public class WorkbookChartAxisRequest extends BaseRequest<WorkbookChartAxis> {
	
    /**
     * The request for the WorkbookChartAxis
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookChartAxisRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookChartAxis.class);
    }

    /**
     * Gets the WorkbookChartAxis from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super WorkbookChartAxis> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookChartAxis from the service
     *
     * @return the WorkbookChartAxis from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartAxis get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super WorkbookChartAxis> callback) {
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
     * Patches this WorkbookChartAxis with a source
     *
     * @param sourceWorkbookChartAxis the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final WorkbookChartAxis sourceWorkbookChartAxis, @Nonnull final ICallback<? super WorkbookChartAxis> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookChartAxis);
    }

    /**
     * Patches this WorkbookChartAxis with a source
     *
     * @param sourceWorkbookChartAxis the source object with updates
     * @return the updated WorkbookChartAxis
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartAxis patch(@Nonnull final WorkbookChartAxis sourceWorkbookChartAxis) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookChartAxis);
    }

    /**
     * Creates a WorkbookChartAxis with a new object
     *
     * @param newWorkbookChartAxis the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final WorkbookChartAxis newWorkbookChartAxis, @Nonnull final ICallback<? super WorkbookChartAxis> callback) {
        send(HttpMethod.POST, callback, newWorkbookChartAxis);
    }

    /**
     * Creates a WorkbookChartAxis with a new object
     *
     * @param newWorkbookChartAxis the new object to create
     * @return the created WorkbookChartAxis
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartAxis post(@Nonnull final WorkbookChartAxis newWorkbookChartAxis) throws ClientException {
        return send(HttpMethod.POST, newWorkbookChartAxis);
    }

    /**
     * Creates a WorkbookChartAxis with a new object
     *
     * @param newWorkbookChartAxis the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final WorkbookChartAxis newWorkbookChartAxis, @Nonnull final ICallback<? super WorkbookChartAxis> callback) {
        send(HttpMethod.PUT, callback, newWorkbookChartAxis);
    }

    /**
     * Creates a WorkbookChartAxis with a new object
     *
     * @param newWorkbookChartAxis the object to create/update
     * @return the created WorkbookChartAxis
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookChartAxis put(@Nonnull final WorkbookChartAxis newWorkbookChartAxis) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookChartAxis);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookChartAxisRequest select(@Nonnull final String value) {
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
     public WorkbookChartAxisRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


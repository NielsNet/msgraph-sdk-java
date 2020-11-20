// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookTableSort;
import com.microsoft.graph.models.extensions.WorkbookSortField;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Sort Request.
 */
public class WorkbookTableSortRequest extends BaseRequest<WorkbookTableSort> {
	
    /**
     * The request for the WorkbookTableSort
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableSortRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookTableSort.class);
    }

    /**
     * Gets the WorkbookTableSort from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super WorkbookTableSort> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookTableSort from the service
     *
     * @return the WorkbookTableSort from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookTableSort get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super WorkbookTableSort> callback) {
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
     * Patches this WorkbookTableSort with a source
     *
     * @param sourceWorkbookTableSort the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final WorkbookTableSort sourceWorkbookTableSort, @Nonnull final ICallback<? super WorkbookTableSort> callback) {
        send(HttpMethod.PATCH, callback, sourceWorkbookTableSort);
    }

    /**
     * Patches this WorkbookTableSort with a source
     *
     * @param sourceWorkbookTableSort the source object with updates
     * @return the updated WorkbookTableSort
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookTableSort patch(@Nonnull final WorkbookTableSort sourceWorkbookTableSort) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookTableSort);
    }

    /**
     * Creates a WorkbookTableSort with a new object
     *
     * @param newWorkbookTableSort the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final WorkbookTableSort newWorkbookTableSort, @Nonnull final ICallback<? super WorkbookTableSort> callback) {
        send(HttpMethod.POST, callback, newWorkbookTableSort);
    }

    /**
     * Creates a WorkbookTableSort with a new object
     *
     * @param newWorkbookTableSort the new object to create
     * @return the created WorkbookTableSort
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookTableSort post(@Nonnull final WorkbookTableSort newWorkbookTableSort) throws ClientException {
        return send(HttpMethod.POST, newWorkbookTableSort);
    }

    /**
     * Creates a WorkbookTableSort with a new object
     *
     * @param newWorkbookTableSort the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final WorkbookTableSort newWorkbookTableSort, @Nonnull final ICallback<? super WorkbookTableSort> callback) {
        send(HttpMethod.PUT, callback, newWorkbookTableSort);
    }

    /**
     * Creates a WorkbookTableSort with a new object
     *
     * @param newWorkbookTableSort the object to create/update
     * @return the created WorkbookTableSort
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookTableSort put(@Nonnull final WorkbookTableSort newWorkbookTableSort) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookTableSort);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookTableSortRequest select(@Nonnull final String value) {
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
     public WorkbookTableSortRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


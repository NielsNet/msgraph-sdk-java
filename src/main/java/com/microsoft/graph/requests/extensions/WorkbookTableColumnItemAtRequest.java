// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookTableColumn;
import com.microsoft.graph.requests.extensions.WorkbookTableColumnItemAtRequest;

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
 * The class for the Workbook Table Column Item At Request.
 */
public class WorkbookTableColumnItemAtRequest extends BaseRequest<WorkbookTableColumn> {

    /**
     * The request for this WorkbookTableColumnItemAt
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableColumnItemAtRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookTableColumn.class);
    }

    /**
     * Patches the WorkbookTableColumnItemAt
     * @param srcWorkbookTableColumn the WorkbookTableColumn with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull WorkbookTableColumn srcWorkbookTableColumn, @Nonnull final ICallback<? super WorkbookTableColumn> callback) {
        send(HttpMethod.PATCH, callback, srcWorkbookTableColumn);
    }

    /**
     * Patches the WorkbookTableColumnItemAt
     *
     * @param srcWorkbookTableColumn the WorkbookTableColumn with which to PATCH
     * @return the WorkbookTableColumn
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     @Nullable
     public WorkbookTableColumn patch(@Nonnull final WorkbookTableColumn srcWorkbookTableColumn) throws ClientException {
        return this.send(HttpMethod.PATCH, srcWorkbookTableColumn);
    }

    /**
     * Puts the WorkbookTableColumnItemAt
     *
     * @param srcWorkbookTableColumn the WorkbookTableColumn to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final WorkbookTableColumn srcWorkbookTableColumn, @Nonnull final ICallback<? super WorkbookTableColumn> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookTableColumn);
    }

    /**
     * Puts the WorkbookTableColumnItemAt
     *
     * @param srcWorkbookTableColumn the WorkbookTableColumn to PUT
     * @return the WorkbookTableColumn
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     @Nullable
     public WorkbookTableColumn put(@Nonnull final WorkbookTableColumn srcWorkbookTableColumn) throws ClientException {
        return this.send(HttpMethod.PUT, srcWorkbookTableColumn);
    }
    /**
     * Gets the WorkbookTableColumn
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super WorkbookTableColumn> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookTableColumn
     *
     * @return the WorkbookTableColumn
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public WorkbookTableColumn get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public WorkbookTableColumnItemAtRequest select(@Nonnull final String value) {
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
    public WorkbookTableColumnItemAtRequest expand(@Nonnull final String value) {
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
    public WorkbookTableColumnItemAtRequest filter(@Nonnull final String value) {
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
    public WorkbookTableColumnItemAtRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

}

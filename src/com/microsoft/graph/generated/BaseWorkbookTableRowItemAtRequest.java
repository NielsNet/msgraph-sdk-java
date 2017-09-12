// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.generated;

import com.microsoft.graph.concurrency.*;
import com.microsoft.graph.core.*;
import com.microsoft.graph.extensions.*;
import com.microsoft.graph.http.*;
import com.microsoft.graph.generated.*;
import com.microsoft.graph.options.*;
import com.microsoft.graph.serializer.*;

import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Base Workbook Table Row Item At Request.
 */
public class BaseWorkbookTableRowItemAtRequest extends BaseRequest implements IBaseWorkbookTableRowItemAtRequest {

    /**
     * The request for this WorkbookTableRowItemAt
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookTableRowItemAtRequest(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookTableRow.class);
    }

    /**
     * Patches the WorkbookTableRowItemAt
     * @param srcWorkbookTableRow The WorkbookTableRow with which to PATCH
     * @param callback The callback to be called after success or failure
     */
    public void patch(WorkbookTableRow srcWorkbookTableRow, final ICallback<WorkbookTableRow> callback) {
        send(HttpMethod.PATCH, callback, srcWorkbookTableRow);
    }

    /**
     * Patches the WorkbookTableRowItemAt
     *
     * @param srcWorkbookTableRow The WorkbookTableRow with which to PATCH
     * @return The WorkbookTableRow
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     public WorkbookTableRow patch(WorkbookTableRow srcWorkbookTableRow) throws ClientException {
        return this.send(HttpMethod.PATCH, srcWorkbookTableRow);
    }

    /**
     * Puts the WorkbookTableRowItemAt
     *
     * @param srcWorkbookTableRow The WorkbookTableRow to PUT
     * @param callback The callback to be called after success or failure
     */
    public void put(WorkbookTableRow srcWorkbookTableRow, final ICallback<WorkbookTableRow> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookTableRow);
    }

    /**
     * Puts the WorkbookTableRowItemAt
     *
     * @param srcWorkbookTableRow The WorkbookTableRow to PUT
     * @return The WorkbookTableRow
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     public WorkbookTableRow put(WorkbookTableRow srcWorkbookTableRow) throws ClientException {
        return this.send(HttpMethod.PUT, srcWorkbookTableRow);
    }
    /**
     * Gets the WorkbookTableRow
     *
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookTableRow> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookTableRow
     *
     * @return The WorkbookTableRow
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    public WorkbookTableRow get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IWorkbookTableRowItemAtRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (WorkbookTableRowItemAtRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IWorkbookTableRowItemAtRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (WorkbookTableRowItemAtRequest)this;
    }

}

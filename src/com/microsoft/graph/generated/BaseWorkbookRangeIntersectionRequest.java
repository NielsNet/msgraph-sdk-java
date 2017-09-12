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
 * The class for the Base Workbook Range Intersection Request.
 */
public class BaseWorkbookRangeIntersectionRequest extends BaseRequest implements IBaseWorkbookRangeIntersectionRequest {

    /**
     * The request for this WorkbookRangeIntersection
     *
     * @param requestUrl The request url
     * @param client The service client
     * @param requestOptions The options for this request
     */
    public BaseWorkbookRangeIntersectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookRange.class);
    }

    /**
     * Patches the WorkbookRangeIntersection
     * @param srcWorkbookRange The WorkbookRange with which to PATCH
     * @param callback The callback to be called after success or failure
     */
    public void patch(WorkbookRange srcWorkbookRange, final ICallback<WorkbookRange> callback) {
        send(HttpMethod.PATCH, callback, srcWorkbookRange);
    }

    /**
     * Patches the WorkbookRangeIntersection
     *
     * @param srcWorkbookRange The WorkbookRange with which to PATCH
     * @return The WorkbookRange
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     public WorkbookRange patch(WorkbookRange srcWorkbookRange) throws ClientException {
        return this.send(HttpMethod.PATCH, srcWorkbookRange);
    }

    /**
     * Puts the WorkbookRangeIntersection
     *
     * @param srcWorkbookRange The WorkbookRange to PUT
     * @param callback The callback to be called after success or failure
     */
    public void put(WorkbookRange srcWorkbookRange, final ICallback<WorkbookRange> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookRange);
    }

    /**
     * Puts the WorkbookRangeIntersection
     *
     * @param srcWorkbookRange The WorkbookRange to PUT
     * @return The WorkbookRange
     * @throws ClientException An exception occurs if there was an error while the request was sent
     */
     public WorkbookRange put(WorkbookRange srcWorkbookRange) throws ClientException {
        return this.send(HttpMethod.PUT, srcWorkbookRange);
    }
    /**
     * Gets the WorkbookRange
     *
     * @param callback The callback to be called after success or failure.
     */
    public void get(final ICallback<WorkbookRange> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookRange
     *
     * @return The WorkbookRange
     * @throws ClientException An exception occurs if there was an error while the request was sent.
     */
    public WorkbookRange get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    public IWorkbookRangeIntersectionRequest select(final String value) {
        getQueryOptions().add(new QueryOption("$select", value));
        return (WorkbookRangeIntersectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    public IWorkbookRangeIntersectionRequest expand(final String value) {
        getQueryOptions().add(new QueryOption("$expand", value));
        return (WorkbookRangeIntersectionRequest)this;
    }

}

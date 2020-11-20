// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.WorkbookRange;
import com.microsoft.graph.models.extensions.WorkbookTable;
import com.microsoft.graph.requests.extensions.WorkbookTableRangeRequest;

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
 * The class for the Workbook Table Range Request.
 */
public class WorkbookTableRangeRequest extends BaseRequest<WorkbookRange> {

    /**
     * The request for this WorkbookTableRange
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookTableRangeRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookRange.class);
    }

    /**
     * Patches the WorkbookTableRange
     * @param srcWorkbookRange the WorkbookRange with which to PATCH
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull WorkbookRange srcWorkbookRange, @Nonnull final ICallback<? super WorkbookRange> callback) {
        send(HttpMethod.PATCH, callback, srcWorkbookRange);
    }

    /**
     * Patches the WorkbookTableRange
     *
     * @param srcWorkbookRange the WorkbookRange with which to PATCH
     * @return the WorkbookRange
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     @Nullable
     public WorkbookRange patch(@Nonnull final WorkbookRange srcWorkbookRange) throws ClientException {
        return this.send(HttpMethod.PATCH, srcWorkbookRange);
    }

    /**
     * Puts the WorkbookTableRange
     *
     * @param srcWorkbookRange the WorkbookRange to PUT
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final WorkbookRange srcWorkbookRange, @Nonnull final ICallback<? super WorkbookRange> callback) {
        send(HttpMethod.PUT, callback, srcWorkbookRange);
    }

    /**
     * Puts the WorkbookTableRange
     *
     * @param srcWorkbookRange the WorkbookRange to PUT
     * @return the WorkbookRange
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
     @Nullable
     public WorkbookRange put(@Nonnull final WorkbookRange srcWorkbookRange) throws ClientException {
        return this.send(HttpMethod.PUT, srcWorkbookRange);
    }
    /**
     * Gets the WorkbookRange
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super WorkbookRange> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WorkbookRange
     *
     * @return the WorkbookRange
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    @Nullable
    public WorkbookRange get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public WorkbookTableRangeRequest select(@Nonnull final String value) {
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
    public WorkbookTableRangeRequest expand(@Nonnull final String value) {
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
    public WorkbookTableRangeRequest filter(@Nonnull final String value) {
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
    public WorkbookTableRangeRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

}

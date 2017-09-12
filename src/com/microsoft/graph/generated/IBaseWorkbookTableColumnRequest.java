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
 * The interface for the Base Workbook Table Column Request.
 */
public interface IBaseWorkbookTableColumnRequest extends IHttpRequest {

    /**
     * Gets the WorkbookTableColumn from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<WorkbookTableColumn> callback);

    /**
     * Gets the WorkbookTableColumn from the service
     * @return The WorkbookTableColumn from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookTableColumn get() throws ClientException;

    /**
     * Delete this item from the service.
     * @param callback The callback when the deletion action has completed
     */
    void delete(final ICallback<Void> callback);

    /**
     * Delete this item from the service.
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this WorkbookTableColumn with a source
     * @param sourceWorkbookTableColumn The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final WorkbookTableColumn sourceWorkbookTableColumn, final ICallback<WorkbookTableColumn> callback);

    /**
     * Patches this WorkbookTableColumn with a source
     * @param sourceWorkbookTableColumn The source object with updates
     * @return The updated WorkbookTableColumn
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookTableColumn patch(final WorkbookTableColumn sourceWorkbookTableColumn) throws ClientException;

    /**
     * Posts a WorkbookTableColumn with a new object
     * @param newWorkbookTableColumn The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final WorkbookTableColumn newWorkbookTableColumn, final ICallback<WorkbookTableColumn> callback);

    /**
     * Posts a WorkbookTableColumn with a new object
     * @param newWorkbookTableColumn The new object to create
     * @return The created WorkbookTableColumn
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    WorkbookTableColumn post(final WorkbookTableColumn newWorkbookTableColumn) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseWorkbookTableColumnRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseWorkbookTableColumnRequest expand(final String value);

}

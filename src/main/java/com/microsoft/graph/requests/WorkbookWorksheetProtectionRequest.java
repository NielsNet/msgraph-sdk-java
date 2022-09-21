// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.WorkbookWorksheetProtection;
import com.microsoft.graph.models.WorkbookWorksheetProtectionOptions;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Worksheet Protection Request.
 */
public class WorkbookWorksheetProtectionRequest extends BaseRequest<WorkbookWorksheetProtection> {
	
    /**
     * The request for the WorkbookWorksheetProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookWorksheetProtectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkbookWorksheetProtection.class);
    }

    /**
     * Gets the WorkbookWorksheetProtection from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookWorksheetProtection> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the WorkbookWorksheetProtection from the service
     *
     * @return the WorkbookWorksheetProtection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookWorksheetProtection get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookWorksheetProtection> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public WorkbookWorksheetProtection delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WorkbookWorksheetProtection with a source
     *
     * @param sourceWorkbookWorksheetProtection the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookWorksheetProtection> patchAsync(@Nonnull final WorkbookWorksheetProtection sourceWorkbookWorksheetProtection) {
        return sendAsync(HttpMethod.PATCH, sourceWorkbookWorksheetProtection);
    }

    /**
     * Patches this WorkbookWorksheetProtection with a source
     *
     * @param sourceWorkbookWorksheetProtection the source object with updates
     * @return the updated WorkbookWorksheetProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookWorksheetProtection patch(@Nonnull final WorkbookWorksheetProtection sourceWorkbookWorksheetProtection) throws ClientException {
        return send(HttpMethod.PATCH, sourceWorkbookWorksheetProtection);
    }

    /**
     * Creates a WorkbookWorksheetProtection with a new object
     *
     * @param newWorkbookWorksheetProtection the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookWorksheetProtection> postAsync(@Nonnull final WorkbookWorksheetProtection newWorkbookWorksheetProtection) {
        return sendAsync(HttpMethod.POST, newWorkbookWorksheetProtection);
    }

    /**
     * Creates a WorkbookWorksheetProtection with a new object
     *
     * @param newWorkbookWorksheetProtection the new object to create
     * @return the created WorkbookWorksheetProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookWorksheetProtection post(@Nonnull final WorkbookWorksheetProtection newWorkbookWorksheetProtection) throws ClientException {
        return send(HttpMethod.POST, newWorkbookWorksheetProtection);
    }

    /**
     * Creates a WorkbookWorksheetProtection with a new object
     *
     * @param newWorkbookWorksheetProtection the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<WorkbookWorksheetProtection> putAsync(@Nonnull final WorkbookWorksheetProtection newWorkbookWorksheetProtection) {
        return sendAsync(HttpMethod.PUT, newWorkbookWorksheetProtection);
    }

    /**
     * Creates a WorkbookWorksheetProtection with a new object
     *
     * @param newWorkbookWorksheetProtection the object to create/update
     * @return the created WorkbookWorksheetProtection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public WorkbookWorksheetProtection put(@Nonnull final WorkbookWorksheetProtection newWorkbookWorksheetProtection) throws ClientException {
        return send(HttpMethod.PUT, newWorkbookWorksheetProtection);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public WorkbookWorksheetProtectionRequest select(@Nonnull final String value) {
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
     public WorkbookWorksheetProtectionRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

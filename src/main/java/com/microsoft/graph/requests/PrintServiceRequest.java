// Template Source: BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.PrintService;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Service Request.
 */
public class PrintServiceRequest extends BaseRequest<PrintService> {
	
    /**
     * The request for the PrintService
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintServiceRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrintService.class);
    }

    /**
     * Gets the PrintService from the service
     *
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrintService> getAsync() {
        return sendAsync(HttpMethod.GET, null);
    }

    /**
     * Gets the PrintService from the service
     *
     * @return the PrintService from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrintService get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @return a future with the deletion result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrintService> deleteAsync() {
        return sendAsync(HttpMethod.DELETE, null);
    }

    /**
     * Delete this item from the service
     * @return the resulting response if the service returns anything on deletion
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    @Nullable
    public PrintService delete() throws ClientException {
        return send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PrintService with a source
     *
     * @param sourcePrintService the source object with updates
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrintService> patchAsync(@Nonnull final PrintService sourcePrintService) {
        return sendAsync(HttpMethod.PATCH, sourcePrintService);
    }

    /**
     * Patches this PrintService with a source
     *
     * @param sourcePrintService the source object with updates
     * @return the updated PrintService
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrintService patch(@Nonnull final PrintService sourcePrintService) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrintService);
    }

    /**
     * Creates a PrintService with a new object
     *
     * @param newPrintService the new object to create
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrintService> postAsync(@Nonnull final PrintService newPrintService) {
        return sendAsync(HttpMethod.POST, newPrintService);
    }

    /**
     * Creates a PrintService with a new object
     *
     * @param newPrintService the new object to create
     * @return the created PrintService
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrintService post(@Nonnull final PrintService newPrintService) throws ClientException {
        return send(HttpMethod.POST, newPrintService);
    }

    /**
     * Creates a PrintService with a new object
     *
     * @param newPrintService the object to create/update
     * @return a future with the result
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<PrintService> putAsync(@Nonnull final PrintService newPrintService) {
        return sendAsync(HttpMethod.PUT, newPrintService);
    }

    /**
     * Creates a PrintService with a new object
     *
     * @param newPrintService the object to create/update
     * @return the created PrintService
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public PrintService put(@Nonnull final PrintService newPrintService) throws ClientException {
        return send(HttpMethod.PUT, newPrintService);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public PrintServiceRequest select(@Nonnull final String value) {
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
     public PrintServiceRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}

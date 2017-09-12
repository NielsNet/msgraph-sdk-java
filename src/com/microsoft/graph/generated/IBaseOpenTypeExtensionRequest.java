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
 * The interface for the Base Open Type Extension Request.
 */
public interface IBaseOpenTypeExtensionRequest extends IHttpRequest {

    /**
     * Gets the OpenTypeExtension from the service
     * @param callback The callback to be called after success or failure.
     */
    void get(final ICallback<OpenTypeExtension> callback);

    /**
     * Gets the OpenTypeExtension from the service
     * @return The OpenTypeExtension from the request.
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    OpenTypeExtension get() throws ClientException;

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
     * Patches this OpenTypeExtension with a source
     * @param sourceOpenTypeExtension The source object with updates
     * @param callback The callback to be called after success or failure.
     */
    void patch(final OpenTypeExtension sourceOpenTypeExtension, final ICallback<OpenTypeExtension> callback);

    /**
     * Patches this OpenTypeExtension with a source
     * @param sourceOpenTypeExtension The source object with updates
     * @return The updated OpenTypeExtension
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    OpenTypeExtension patch(final OpenTypeExtension sourceOpenTypeExtension) throws ClientException;

    /**
     * Posts a OpenTypeExtension with a new object
     * @param newOpenTypeExtension The new object to create
     * @param callback The callback to be called after success or failure.
     */
    void post(final OpenTypeExtension newOpenTypeExtension, final ICallback<OpenTypeExtension> callback);

    /**
     * Posts a OpenTypeExtension with a new object
     * @param newOpenTypeExtension The new object to create
     * @return The created OpenTypeExtension
     * @throws ClientException This exception occurs if the request was unable to complete for any reason.
     */
    OpenTypeExtension post(final OpenTypeExtension newOpenTypeExtension) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value The select clause
     * @return The updated request
     */
    IBaseOpenTypeExtensionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value The expand clause
     * @return The updated request
     */
    IBaseOpenTypeExtensionRequest expand(final String value);

}

// Template Source: Templates\Java\requests_extensions\BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MailSearchFolder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mail Search Folder Request.
 */
public class MailSearchFolderRequest extends BaseRequest<MailSearchFolder> {
	
    /**
     * The request for the MailSearchFolder
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MailSearchFolderRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MailSearchFolder.class);
    }

    /**
     * Gets the MailSearchFolder from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super MailSearchFolder> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MailSearchFolder from the service
     *
     * @return the MailSearchFolder from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MailSearchFolder get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super MailSearchFolder> callback) {
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
     * Patches this MailSearchFolder with a source
     *
     * @param sourceMailSearchFolder the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final MailSearchFolder sourceMailSearchFolder, @Nonnull final ICallback<? super MailSearchFolder> callback) {
        send(HttpMethod.PATCH, callback, sourceMailSearchFolder);
    }

    /**
     * Patches this MailSearchFolder with a source
     *
     * @param sourceMailSearchFolder the source object with updates
     * @return the updated MailSearchFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MailSearchFolder patch(@Nonnull final MailSearchFolder sourceMailSearchFolder) throws ClientException {
        return send(HttpMethod.PATCH, sourceMailSearchFolder);
    }

    /**
     * Creates a MailSearchFolder with a new object
     *
     * @param newMailSearchFolder the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final MailSearchFolder newMailSearchFolder, @Nonnull final ICallback<? super MailSearchFolder> callback) {
        send(HttpMethod.POST, callback, newMailSearchFolder);
    }

    /**
     * Creates a MailSearchFolder with a new object
     *
     * @param newMailSearchFolder the new object to create
     * @return the created MailSearchFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MailSearchFolder post(@Nonnull final MailSearchFolder newMailSearchFolder) throws ClientException {
        return send(HttpMethod.POST, newMailSearchFolder);
    }

    /**
     * Creates a MailSearchFolder with a new object
     *
     * @param newMailSearchFolder the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final MailSearchFolder newMailSearchFolder, @Nonnull final ICallback<? super MailSearchFolder> callback) {
        send(HttpMethod.PUT, callback, newMailSearchFolder);
    }

    /**
     * Creates a MailSearchFolder with a new object
     *
     * @param newMailSearchFolder the object to create/update
     * @return the created MailSearchFolder
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public MailSearchFolder put(@Nonnull final MailSearchFolder newMailSearchFolder) throws ClientException {
        return send(HttpMethod.PUT, newMailSearchFolder);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public MailSearchFolderRequest select(@Nonnull final String value) {
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
     public MailSearchFolderRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


// Template Source: Templates\Java\requests_extensions\BaseEntityRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.InviteParticipantsOperation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Invite Participants Operation Request.
 */
public class InviteParticipantsOperationRequest extends BaseRequest<InviteParticipantsOperation> {
	
    /**
     * The request for the InviteParticipantsOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public InviteParticipantsOperationRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, InviteParticipantsOperation.class);
    }

    /**
     * Gets the InviteParticipantsOperation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super InviteParticipantsOperation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the InviteParticipantsOperation from the service
     *
     * @return the InviteParticipantsOperation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public InviteParticipantsOperation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super InviteParticipantsOperation> callback) {
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
     * Patches this InviteParticipantsOperation with a source
     *
     * @param sourceInviteParticipantsOperation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final InviteParticipantsOperation sourceInviteParticipantsOperation, @Nonnull final ICallback<? super InviteParticipantsOperation> callback) {
        send(HttpMethod.PATCH, callback, sourceInviteParticipantsOperation);
    }

    /**
     * Patches this InviteParticipantsOperation with a source
     *
     * @param sourceInviteParticipantsOperation the source object with updates
     * @return the updated InviteParticipantsOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public InviteParticipantsOperation patch(@Nonnull final InviteParticipantsOperation sourceInviteParticipantsOperation) throws ClientException {
        return send(HttpMethod.PATCH, sourceInviteParticipantsOperation);
    }

    /**
     * Creates a InviteParticipantsOperation with a new object
     *
     * @param newInviteParticipantsOperation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final InviteParticipantsOperation newInviteParticipantsOperation, @Nonnull final ICallback<? super InviteParticipantsOperation> callback) {
        send(HttpMethod.POST, callback, newInviteParticipantsOperation);
    }

    /**
     * Creates a InviteParticipantsOperation with a new object
     *
     * @param newInviteParticipantsOperation the new object to create
     * @return the created InviteParticipantsOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public InviteParticipantsOperation post(@Nonnull final InviteParticipantsOperation newInviteParticipantsOperation) throws ClientException {
        return send(HttpMethod.POST, newInviteParticipantsOperation);
    }

    /**
     * Creates a InviteParticipantsOperation with a new object
     *
     * @param newInviteParticipantsOperation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final InviteParticipantsOperation newInviteParticipantsOperation, @Nonnull final ICallback<? super InviteParticipantsOperation> callback) {
        send(HttpMethod.PUT, callback, newInviteParticipantsOperation);
    }

    /**
     * Creates a InviteParticipantsOperation with a new object
     *
     * @param newInviteParticipantsOperation the object to create/update
     * @return the created InviteParticipantsOperation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public InviteParticipantsOperation put(@Nonnull final InviteParticipantsOperation newInviteParticipantsOperation) throws ClientException {
        return send(HttpMethod.PUT, newInviteParticipantsOperation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public InviteParticipantsOperationRequest select(@Nonnull final String value) {
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
     public InviteParticipantsOperationRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


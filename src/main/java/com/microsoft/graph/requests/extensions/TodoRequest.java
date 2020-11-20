// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Todo;
import com.microsoft.graph.requests.extensions.TodoTaskListCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TodoTaskListRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Todo Request.
 */
public class TodoRequest extends BaseRequest<Todo> {
	
    /**
     * The request for the Todo
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TodoRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Todo.class);
    }

    /**
     * Gets the Todo from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(@Nonnull final ICallback<? super Todo> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Todo from the service
     *
     * @return the Todo from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Todo get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(@Nonnull final ICallback<? super Todo> callback) {
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
     * Patches this Todo with a source
     *
     * @param sourceTodo the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(@Nonnull final Todo sourceTodo, @Nonnull final ICallback<? super Todo> callback) {
        send(HttpMethod.PATCH, callback, sourceTodo);
    }

    /**
     * Patches this Todo with a source
     *
     * @param sourceTodo the source object with updates
     * @return the updated Todo
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Todo patch(@Nonnull final Todo sourceTodo) throws ClientException {
        return send(HttpMethod.PATCH, sourceTodo);
    }

    /**
     * Creates a Todo with a new object
     *
     * @param newTodo the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(@Nonnull final Todo newTodo, @Nonnull final ICallback<? super Todo> callback) {
        send(HttpMethod.POST, callback, newTodo);
    }

    /**
     * Creates a Todo with a new object
     *
     * @param newTodo the new object to create
     * @return the created Todo
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Todo post(@Nonnull final Todo newTodo) throws ClientException {
        return send(HttpMethod.POST, newTodo);
    }

    /**
     * Creates a Todo with a new object
     *
     * @param newTodo the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(@Nonnull final Todo newTodo, @Nonnull final ICallback<? super Todo> callback) {
        send(HttpMethod.PUT, callback, newTodo);
    }

    /**
     * Creates a Todo with a new object
     *
     * @param newTodo the object to create/update
     * @return the created Todo
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    @Nullable
    public Todo put(@Nonnull final Todo newTodo) throws ClientException {
        return send(HttpMethod.PUT, newTodo);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     @Nonnull
     public TodoRequest select(@Nonnull final String value) {
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
     public TodoRequest expand(@Nonnull final String value) {
         addExpandOption(value);
         return this;
     }

}


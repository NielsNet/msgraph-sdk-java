// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TodoTask;
import com.microsoft.graph.requests.extensions.TodoTaskCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.TodoTaskCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Todo Task Collection Page.
 */
public class TodoTaskCollectionPage extends BaseCollectionPage<TodoTask, TodoTaskCollectionRequestBuilder> {

    /**
     * A collection page for TodoTask
     *
     * @param response the serialized TodoTaskCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public TodoTaskCollectionPage(@Nonnull final TodoTaskCollectionResponse response, @Nonnull final TodoTaskCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for TodoTask
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public TodoTaskCollectionPage(@Nonnull final java.util.List<TodoTask> pageContents, @Nullable final TodoTaskCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

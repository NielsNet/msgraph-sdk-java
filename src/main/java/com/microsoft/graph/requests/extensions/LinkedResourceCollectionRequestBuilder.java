// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TodoTask;
import com.microsoft.graph.models.extensions.LinkedResource;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.LinkedResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.LinkedResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.LinkedResourceCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Linked Resource Collection Request Builder.
 */
public class LinkedResourceCollectionRequestBuilder extends BaseCollectionRequestBuilder<LinkedResource, LinkedResourceRequestBuilder, LinkedResourceCollectionResponse, LinkedResourceCollectionPage, LinkedResourceCollectionRequest> {

    /**
     * The request builder for this collection of TodoTask
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public LinkedResourceCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, LinkedResourceRequestBuilder.class, LinkedResourceCollectionRequest.class);
    }


}

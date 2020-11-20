// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RoomList;
import com.microsoft.graph.models.extensions.Room;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.RoomCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.RoomRequestBuilder;
import com.microsoft.graph.requests.extensions.RoomCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Room Collection Request Builder.
 */
public class RoomCollectionRequestBuilder extends BaseCollectionRequestBuilder<Room, RoomRequestBuilder, RoomCollectionResponse, RoomCollectionPage, RoomCollectionRequest> {

    /**
     * The request builder for this collection of RoomList
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RoomCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RoomRequestBuilder.class, RoomCollectionRequest.class);
    }


}

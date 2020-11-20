// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantDeltaCollectionRequest;
import com.microsoft.graph.requests.extensions.OAuth2PermissionGrantDeltaCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the OAuth2Permission Grant Delta Collection Request Builder.
 */
public class OAuth2PermissionGrantDeltaCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<OAuth2PermissionGrant, OAuth2PermissionGrantDeltaCollectionRequestBuilder, OAuth2PermissionGrantDeltaCollectionResponse, OAuth2PermissionGrantDeltaCollectionPage, OAuth2PermissionGrantDeltaCollectionRequest> {

    /**
     * The request builder for this collection of OAuth2PermissionGrant
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OAuth2PermissionGrantDeltaCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OAuth2PermissionGrantDeltaCollectionRequestBuilder.class, OAuth2PermissionGrantDeltaCollectionRequest.class);
    }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the OAuth2PermissionGrantDeltaCollectionRequest instance
     */
    @Override
    @Nonnull
    public OAuth2PermissionGrantDeltaCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final OAuth2PermissionGrantDeltaCollectionRequest request = super.buildRequest(requestOptions);

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}

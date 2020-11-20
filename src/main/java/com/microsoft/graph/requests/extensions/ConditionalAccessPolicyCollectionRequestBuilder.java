// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PolicyRoot;
import com.microsoft.graph.models.extensions.ConditionalAccessPolicy;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ConditionalAccessPolicyCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conditional Access Policy Collection Request Builder.
 */
public class ConditionalAccessPolicyCollectionRequestBuilder extends BaseCollectionRequestBuilder<ConditionalAccessPolicy, ConditionalAccessPolicyRequestBuilder, ConditionalAccessPolicyCollectionResponse, ConditionalAccessPolicyCollectionPage, ConditionalAccessPolicyCollectionRequest> {

    /**
     * The request builder for this collection of PolicyRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConditionalAccessPolicyCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ConditionalAccessPolicyRequestBuilder.class, ConditionalAccessPolicyCollectionRequest.class);
    }


}

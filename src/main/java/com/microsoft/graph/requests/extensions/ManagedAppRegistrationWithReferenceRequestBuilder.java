// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedAppRegistration;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ManagedAppOperationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseWithReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Registration With Reference Request Builder.
 */
public class ManagedAppRegistrationWithReferenceRequestBuilder extends BaseWithReferenceRequestBuilder<ManagedAppRegistration, ManagedAppRegistrationWithReferenceRequest, ManagedAppRegistrationReferenceRequestBuilder> {

    /**
     * The request builder for the ManagedAppRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedAppRegistrationWithReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ManagedAppRegistrationWithReferenceRequest.class, ManagedAppRegistrationReferenceRequestBuilder.class);
    }
}

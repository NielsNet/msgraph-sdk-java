// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ServicePrincipal;
import com.microsoft.graph.models.extensions.OAuth2PermissionGrant;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the OAuth2Permission Grant Collection With References Request Builder.
 */
public class OAuth2PermissionGrantCollectionWithReferencesRequestBuilder extends BaseCollectionWithReferencesRequestBuilder<OAuth2PermissionGrant, OAuth2PermissionGrantWithReferenceRequest, OAuth2PermissionGrantReferenceRequestBuilder, OAuth2PermissionGrantWithReferenceRequestBuilder, OAuth2PermissionGrantCollectionResponse, OAuth2PermissionGrantCollectionWithReferencesPage, OAuth2PermissionGrantCollectionReferenceRequest, OAuth2PermissionGrantCollectionReferenceRequestBuilder> {

    /**
     * The request builder for this collection of ServicePrincipal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OAuth2PermissionGrantCollectionWithReferencesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OAuth2PermissionGrantReferenceRequestBuilder.class, OAuth2PermissionGrantCollectionReferenceRequest.class, OAuth2PermissionGrantCollectionReferenceRequestBuilder.class);
    }
}

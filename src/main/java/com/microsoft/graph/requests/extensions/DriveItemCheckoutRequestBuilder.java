// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.DriveItemCheckoutRequest;
import com.microsoft.graph.models.extensions.DriveItem;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Checkout Request Builder.
 */
public class DriveItemCheckoutRequestBuilder extends BaseActionRequestBuilder<DriveItem> {

    /**
     * The request builder for this DriveItemCheckout
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemCheckoutRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the DriveItemCheckoutRequest
     *
     * @param requestOptions the options for the request
     * @return the DriveItemCheckoutRequest instance
     */
    @Nonnull
    public DriveItemCheckoutRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DriveItemCheckoutRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DriveItemCheckoutRequest instance
     */
    @Nonnull
    public DriveItemCheckoutRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DriveItemCheckoutRequest request = new DriveItemCheckoutRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}

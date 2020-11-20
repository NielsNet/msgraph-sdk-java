// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.DriveItemValidatePermissionRequest;
import com.microsoft.graph.models.extensions.DriveItem;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Validate Permission Request Builder.
 */
public class DriveItemValidatePermissionRequestBuilder extends BaseActionRequestBuilder<DriveItem> {

    /**
     * The request builder for this DriveItemValidatePermission
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param challengeToken the challengeToken
     * @param password the password
     */
    public DriveItemValidatePermissionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final String challengeToken, @Nullable final String password) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("challengeToken", challengeToken);
        bodyParams.put("password", password);
    }

    /**
     * Creates the DriveItemValidatePermissionRequest
     *
     * @param requestOptions the options for the request
     * @return the DriveItemValidatePermissionRequest instance
     */
    @Nonnull
    public DriveItemValidatePermissionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DriveItemValidatePermissionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DriveItemValidatePermissionRequest instance
     */
    @Nonnull
    public DriveItemValidatePermissionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DriveItemValidatePermissionRequest request = new DriveItemValidatePermissionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("challengeToken")) {
            request.body.challengeToken = getParameter("challengeToken");
        }

        if (hasParameter("password")) {
            request.body.password = getParameter("password");
        }

        return request;
    }
}

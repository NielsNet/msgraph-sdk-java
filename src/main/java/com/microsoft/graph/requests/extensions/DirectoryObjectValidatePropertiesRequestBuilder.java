// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.DirectoryObjectValidatePropertiesRequest;
import com.microsoft.graph.models.extensions.DirectoryObject;

import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Object Validate Properties Request Builder.
 */
public class DirectoryObjectValidatePropertiesRequestBuilder extends BaseActionRequestBuilder<DirectoryObject> {

    /**
     * The request builder for this DirectoryObjectValidateProperties
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param entityType the entityType
     * @param displayName the displayName
     * @param mailNickname the mailNickname
     * @param onBehalfOfUserId the onBehalfOfUserId
     */
    public DirectoryObjectValidatePropertiesRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final String entityType, @Nullable final String displayName, @Nullable final String mailNickname, @Nullable final java.util.UUID onBehalfOfUserId) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("entityType", entityType);
        bodyParams.put("displayName", displayName);
        bodyParams.put("mailNickname", mailNickname);
        bodyParams.put("onBehalfOfUserId", onBehalfOfUserId);
    }

    /**
     * Creates the DirectoryObjectValidatePropertiesRequest
     *
     * @param requestOptions the options for the request
     * @return the DirectoryObjectValidatePropertiesRequest instance
     */
    @Nonnull
    public DirectoryObjectValidatePropertiesRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the DirectoryObjectValidatePropertiesRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the DirectoryObjectValidatePropertiesRequest instance
     */
    @Nonnull
    public DirectoryObjectValidatePropertiesRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DirectoryObjectValidatePropertiesRequest request = new DirectoryObjectValidatePropertiesRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("entityType")) {
            request.body.entityType = getParameter("entityType");
        }

        if (hasParameter("displayName")) {
            request.body.displayName = getParameter("displayName");
        }

        if (hasParameter("mailNickname")) {
            request.body.mailNickname = getParameter("mailNickname");
        }

        if (hasParameter("onBehalfOfUserId")) {
            request.body.onBehalfOfUserId = getParameter("onBehalfOfUserId");
        }

        return request;
    }
}

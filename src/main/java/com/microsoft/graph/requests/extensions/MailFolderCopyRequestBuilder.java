// Template Source: Templates\Java\requests_extensions\BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.MailFolderCopyRequest;
import com.microsoft.graph.models.extensions.MailFolder;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mail Folder Copy Request Builder.
 */
public class MailFolderCopyRequestBuilder extends BaseActionRequestBuilder<MailFolder> {

    /**
     * The request builder for this MailFolderCopy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param destinationId the destinationId
     */
    public MailFolderCopyRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final String destinationId) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("destinationId", destinationId);
    }

    /**
     * Creates the MailFolderCopyRequest
     *
     * @param requestOptions the options for the request
     * @return the MailFolderCopyRequest instance
     */
    @Nonnull
    public MailFolderCopyRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the MailFolderCopyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the MailFolderCopyRequest instance
     */
    @Nonnull
    public MailFolderCopyRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        MailFolderCopyRequest request = new MailFolderCopyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("destinationId")) {
            request.body.destinationId = getParameter("destinationId");
        }

        return request;
    }
}

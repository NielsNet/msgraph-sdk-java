// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ManagedEBookAssignRequest;
import com.microsoft.graph.models.extensions.ManagedEBook;
import com.microsoft.graph.models.extensions.ManagedEBookAssignment;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed EBook Assign Request Builder.
 */
public class ManagedEBookAssignRequestBuilder extends BaseActionRequestBuilder<ManagedEBook> {

    /**
     * The request builder for this ManagedEBookAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param managedEBookAssignments the managedEBookAssignments
     */
    public ManagedEBookAssignRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final java.util.List<ManagedEBookAssignment> managedEBookAssignments) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("managedEBookAssignments", managedEBookAssignments);
    }

    /**
     * Creates the ManagedEBookAssignRequest
     *
     * @param requestOptions the options for the request
     * @return the ManagedEBookAssignRequest instance
     */
    @Nonnull
    public ManagedEBookAssignRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ManagedEBookAssignRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ManagedEBookAssignRequest instance
     */
    @Nonnull
    public ManagedEBookAssignRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ManagedEBookAssignRequest request = new ManagedEBookAssignRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("managedEBookAssignments")) {
            request.body.managedEBookAssignments = getParameter("managedEBookAssignments");
        }

        return request;
    }
}

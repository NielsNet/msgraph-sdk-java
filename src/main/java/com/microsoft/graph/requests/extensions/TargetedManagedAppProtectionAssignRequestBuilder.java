// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.TargetedManagedAppProtectionAssignRequest;
import com.microsoft.graph.models.extensions.TargetedManagedAppProtection;
import com.microsoft.graph.models.extensions.TargetedManagedAppPolicyAssignment;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Protection Assign Request Builder.
 */
public class TargetedManagedAppProtectionAssignRequestBuilder extends BaseActionRequestBuilder<TargetedManagedAppProtection> {

    /**
     * The request builder for this TargetedManagedAppProtectionAssign
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param assignments the assignments
     */
    public TargetedManagedAppProtectionAssignRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nullable final java.util.List<TargetedManagedAppPolicyAssignment> assignments) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("assignments", assignments);
    }

    /**
     * Creates the TargetedManagedAppProtectionAssignRequest
     *
     * @param requestOptions the options for the request
     * @return the TargetedManagedAppProtectionAssignRequest instance
     */
    @Nonnull
    public TargetedManagedAppProtectionAssignRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the TargetedManagedAppProtectionAssignRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the TargetedManagedAppProtectionAssignRequest instance
     */
    @Nonnull
    public TargetedManagedAppProtectionAssignRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        TargetedManagedAppProtectionAssignRequest request = new TargetedManagedAppProtectionAssignRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("assignments")) {
            request.body.assignments = getParameter("assignments");
        }

        return request;
    }
}

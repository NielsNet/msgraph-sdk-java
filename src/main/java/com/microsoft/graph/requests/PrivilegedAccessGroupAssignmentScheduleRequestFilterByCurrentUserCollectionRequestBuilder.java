// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AssignmentScheduleRequestFilterByCurrentUserOptions;
import com.microsoft.graph.models.PrivilegedAccessGroupAssignmentScheduleRequest;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.PrivilegedAccessGroupAssignmentScheduleRequestFilterByCurrentUserCollectionRequestBuilder;
import com.microsoft.graph.requests.PrivilegedAccessGroupAssignmentScheduleRequestFilterByCurrentUserCollectionRequest;
import com.microsoft.graph.requests.PrivilegedAccessGroupAssignmentScheduleRequestFilterByCurrentUserCollectionResponse;
import com.microsoft.graph.models.PrivilegedAccessGroupAssignmentScheduleRequestFilterByCurrentUserParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Access Group Assignment Schedule Request Filter By Current User Collection Request Builder.
 */
public class PrivilegedAccessGroupAssignmentScheduleRequestFilterByCurrentUserCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<PrivilegedAccessGroupAssignmentScheduleRequest, PrivilegedAccessGroupAssignmentScheduleRequestFilterByCurrentUserCollectionRequestBuilder, PrivilegedAccessGroupAssignmentScheduleRequestFilterByCurrentUserCollectionResponse, PrivilegedAccessGroupAssignmentScheduleRequestFilterByCurrentUserCollectionPage, PrivilegedAccessGroupAssignmentScheduleRequestFilterByCurrentUserCollectionRequest> {

    /**
     * The request builder for this collection of PrivilegedAccessGroupAssignmentScheduleRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedAccessGroupAssignmentScheduleRequestFilterByCurrentUserCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrivilegedAccessGroupAssignmentScheduleRequestFilterByCurrentUserCollectionRequestBuilder.class, PrivilegedAccessGroupAssignmentScheduleRequestFilterByCurrentUserCollectionRequest.class);
    }
    /**
     * The request builder for this collection of PrivilegedAccessGroupAssignmentScheduleRequest
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public PrivilegedAccessGroupAssignmentScheduleRequestFilterByCurrentUserCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final PrivilegedAccessGroupAssignmentScheduleRequestFilterByCurrentUserParameterSet parameters) {
        super(requestUrl, client, requestOptions, PrivilegedAccessGroupAssignmentScheduleRequestFilterByCurrentUserCollectionRequestBuilder.class, PrivilegedAccessGroupAssignmentScheduleRequestFilterByCurrentUserCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the PrivilegedAccessGroupAssignmentScheduleRequestFilterByCurrentUserCollectionRequest instance
     */
    @Override
    @Nonnull
    public PrivilegedAccessGroupAssignmentScheduleRequestFilterByCurrentUserCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final PrivilegedAccessGroupAssignmentScheduleRequestFilterByCurrentUserCollectionRequest request = super.buildRequest(requestOptions);
        if(functionOptions != null) {    
            for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
                request.addFunctionOption(option);
            }
        }
        return request;
    }
}

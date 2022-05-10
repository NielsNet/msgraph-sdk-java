// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EducationAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.EducationAssignmentDeltaCollectionRequestBuilder;
import com.microsoft.graph.requests.EducationAssignmentDeltaCollectionRequest;
import com.microsoft.graph.requests.EducationAssignmentDeltaCollectionResponse;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Assignment Delta Collection Request Builder.
 */
public class EducationAssignmentDeltaCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<EducationAssignment, EducationAssignmentDeltaCollectionRequestBuilder, EducationAssignmentDeltaCollectionResponse, EducationAssignmentDeltaCollectionPage, EducationAssignmentDeltaCollectionRequest> {

    /**
     * The request builder for this collection of EducationAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationAssignmentDeltaCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationAssignmentDeltaCollectionRequestBuilder.class, EducationAssignmentDeltaCollectionRequest.class);
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the EducationAssignmentDeltaCollectionRequest instance
     */
    @Override
    @Nonnull
    public EducationAssignmentDeltaCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final EducationAssignmentDeltaCollectionRequest request = super.buildRequest(requestOptions);
        return request;
    }
}

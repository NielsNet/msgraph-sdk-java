// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.identitygovernance.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.identitygovernance.models.LifecycleWorkflowsContainer;
import com.microsoft.graph.identitygovernance.models.Workflow;
import com.microsoft.graph.models.User;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.identitygovernance.requests.WorkflowCollectionRequestBuilder;
import com.microsoft.graph.identitygovernance.requests.WorkflowRequestBuilder;
import com.microsoft.graph.identitygovernance.requests.WorkflowCollectionRequest;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.identitygovernance.models.WorkflowActivateParameterSet;
import com.microsoft.graph.identitygovernance.models.WorkflowCreateNewVersionParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workflow Collection Request Builder.
 */
public class WorkflowCollectionRequestBuilder extends BaseCollectionRequestBuilder<Workflow, WorkflowRequestBuilder, WorkflowCollectionResponse, WorkflowCollectionPage, WorkflowCollectionRequest> {

    /**
     * The request builder for this collection of LifecycleWorkflowsContainer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkflowCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WorkflowRequestBuilder.class, WorkflowCollectionRequest.class);
    }



    /**
     * Gets the raw count request for the collection
     * @return The raw count request for the collection
     */
    @Nonnull
    public PrimitiveRequestBuilder<Long> count() {
        return new PrimitiveRequestBuilder<Long>(getRequestUrlWithAdditionalSegment("$count"), getClient(), null, Long.class);
    }
}

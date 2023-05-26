// Template Source: BaseEntityCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Synchronization;
import com.microsoft.graph.models.SynchronizationJob;
import com.microsoft.graph.models.SynchronizationJobApplicationParameters;
import com.microsoft.graph.models.StringKeyStringValuePair;
import com.microsoft.graph.models.SynchronizationJobRestartCriteria;
import com.microsoft.graph.models.SynchronizationSecretKeyStringValuePair;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.SynchronizationJobCollectionRequestBuilder;
import com.microsoft.graph.requests.SynchronizationJobRequestBuilder;
import com.microsoft.graph.requests.SynchronizationJobCollectionRequest;
import com.microsoft.graph.requests.SynchronizationJobValidateCredentialsRequestBuilder;
import com.microsoft.graph.http.BaseCollectionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.PrimitiveRequestBuilder;
import com.microsoft.graph.models.SynchronizationJobProvisionOnDemandParameterSet;
import com.microsoft.graph.models.SynchronizationJobRestartParameterSet;
import com.microsoft.graph.models.SynchronizationJobValidateCredentialsParameterSet;
// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Synchronization Job Collection Request Builder.
 */
public class SynchronizationJobCollectionRequestBuilder extends BaseCollectionRequestBuilder<SynchronizationJob, SynchronizationJobRequestBuilder, SynchronizationJobCollectionResponse, SynchronizationJobCollectionPage, SynchronizationJobCollectionRequest> {

    /**
     * The request builder for this collection of Synchronization
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SynchronizationJobCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SynchronizationJobRequestBuilder.class, SynchronizationJobCollectionRequest.class);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public SynchronizationJobValidateCredentialsRequestBuilder validateCredentials(@Nonnull final SynchronizationJobValidateCredentialsParameterSet parameters) {
        return new SynchronizationJobValidateCredentialsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.validateCredentials"), getClient(), null, parameters);
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
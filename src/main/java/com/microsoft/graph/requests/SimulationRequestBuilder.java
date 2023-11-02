// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.Simulation;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Simulation Request Builder.
 */
public class SimulationRequestBuilder extends BaseRequestBuilder<Simulation> {

    /**
     * The request builder for the Simulation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SimulationRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the SimulationRequest instance
     */
    @Nonnull
    public SimulationRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the SimulationRequest instance
     */
    @Nonnull
    public SimulationRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.SimulationRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets the request builder for LandingPage
     *
     * @return the LandingPageWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.LandingPageWithReferenceRequestBuilder landingPage() {
        return new com.microsoft.graph.requests.LandingPageWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("landingPage"), getClient(), null);
    }

    /**
     * Gets the request builder for LoginPage
     *
     * @return the LoginPageWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.LoginPageWithReferenceRequestBuilder loginPage() {
        return new com.microsoft.graph.requests.LoginPageWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("loginPage"), getClient(), null);
    }

    /**
     * Gets the request builder for Payload
     *
     * @return the PayloadWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.PayloadWithReferenceRequestBuilder payload() {
        return new com.microsoft.graph.requests.PayloadWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("payload"), getClient(), null);
    }
}
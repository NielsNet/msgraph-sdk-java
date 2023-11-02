// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.IosVppEBook;
import com.microsoft.graph.models.ManagedEBookAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.models.ManagedEBookAssignParameterSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Vpp EBook Request Builder.
 */
public class IosVppEBookRequestBuilder extends BaseRequestBuilder<IosVppEBook> {

    /**
     * The request builder for the IosVppEBook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosVppEBookRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IosVppEBookRequest instance
     */
    @Nonnull
    public IosVppEBookRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IosVppEBookRequest instance
     */
    @Nonnull
    public IosVppEBookRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.IosVppEBookRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the ManagedEBookAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.ManagedEBookAssignmentCollectionRequestBuilder assignments() {
        return new com.microsoft.graph.requests.ManagedEBookAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the ManagedEBookAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.ManagedEBookAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new com.microsoft.graph.requests.ManagedEBookAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the DeviceInstallState collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.DeviceInstallStateCollectionRequestBuilder deviceStates() {
        return new com.microsoft.graph.requests.DeviceInstallStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStates"), getClient(), null);
    }

    /**
     * Gets a request builder for the DeviceInstallState item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.DeviceInstallStateRequestBuilder deviceStates(@Nonnull final String id) {
        return new com.microsoft.graph.requests.DeviceInstallStateRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStates") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for EBookInstallSummary
     *
     * @return the EBookInstallSummaryRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.EBookInstallSummaryRequestBuilder installSummary() {
        return new com.microsoft.graph.requests.EBookInstallSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("installSummary"), getClient(), null);
    }
    /**
     *  Gets a request builder for the UserInstallStateSummary collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.UserInstallStateSummaryCollectionRequestBuilder userStateSummary() {
        return new com.microsoft.graph.requests.UserInstallStateSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStateSummary"), getClient(), null);
    }

    /**
     * Gets a request builder for the UserInstallStateSummary item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.UserInstallStateSummaryRequestBuilder userStateSummary(@Nonnull final String id) {
        return new com.microsoft.graph.requests.UserInstallStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("userStateSummary") + "/" + id, getClient(), null);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder
     * @param parameters the parameters for the service method
     */
    @Nonnull
    public ManagedEBookAssignRequestBuilder assign(@Nonnull final ManagedEBookAssignParameterSet parameters) {
        return new ManagedEBookAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, parameters);
    }
}
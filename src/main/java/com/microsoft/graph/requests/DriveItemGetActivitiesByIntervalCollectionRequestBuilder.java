// Template Source: BaseMethodCollectionRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ItemActivityStat;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.DriveItemGetActivitiesByIntervalCollectionRequestBuilder;
import com.microsoft.graph.requests.DriveItemGetActivitiesByIntervalCollectionRequest;
import com.microsoft.graph.requests.DriveItemGetActivitiesByIntervalCollectionResponse;
import com.microsoft.graph.models.DriveItemGetActivitiesByIntervalParameterSet;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseFunctionCollectionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Get Activities By Interval Collection Request Builder.
 */
public class DriveItemGetActivitiesByIntervalCollectionRequestBuilder extends BaseFunctionCollectionRequestBuilder<ItemActivityStat, DriveItemGetActivitiesByIntervalCollectionRequestBuilder, DriveItemGetActivitiesByIntervalCollectionResponse, DriveItemGetActivitiesByIntervalCollectionPage, DriveItemGetActivitiesByIntervalCollectionRequest> {

    /**
     * The request builder for this collection of DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DriveItemGetActivitiesByIntervalCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DriveItemGetActivitiesByIntervalCollectionRequestBuilder.class, DriveItemGetActivitiesByIntervalCollectionRequest.class);
    }
    /**
     * The request builder for this collection of DriveItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public DriveItemGetActivitiesByIntervalCollectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final DriveItemGetActivitiesByIntervalParameterSet parameters) {
        super(requestUrl, client, requestOptions, DriveItemGetActivitiesByIntervalCollectionRequestBuilder.class, DriveItemGetActivitiesByIntervalCollectionRequest.class);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the DriveItemGetActivitiesByIntervalCollectionRequest instance
     */
    @Override
    @Nonnull
    public DriveItemGetActivitiesByIntervalCollectionRequest buildRequest(@Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final DriveItemGetActivitiesByIntervalCollectionRequest request = super.buildRequest(requestOptions);
        if(functionOptions != null) {    
            for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
                request.addFunctionOption(option);
            }
        }
        return request;
    }
}
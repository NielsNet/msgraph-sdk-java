// Template Source: BaseEntityCollectionRequest.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AccessPackageAssignmentPolicy;
import com.microsoft.graph.models.CustomExtensionStageSetting;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseEntityCollectionRequest;
import com.microsoft.graph.requests.CustomExtensionStageSettingCollectionResponse;
import com.microsoft.graph.requests.CustomExtensionStageSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.CustomExtensionStageSettingCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Custom Extension Stage Setting Collection Request.
 */
public class CustomExtensionStageSettingCollectionRequest extends BaseEntityCollectionRequest<CustomExtensionStageSetting, CustomExtensionStageSettingCollectionResponse, CustomExtensionStageSettingCollectionPage> {

    /**
     * The request builder for this collection of CustomExtensionStageSetting
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CustomExtensionStageSettingCollectionRequest(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CustomExtensionStageSettingCollectionResponse.class, CustomExtensionStageSettingCollectionPage.class, CustomExtensionStageSettingCollectionRequestBuilder.class);
    }

    /**
     * Creates a new CustomExtensionStageSetting
     * @param newCustomExtensionStageSetting the CustomExtensionStageSetting to create
     * @return a future with the created object
     */
    @Nonnull
    public java.util.concurrent.CompletableFuture<CustomExtensionStageSetting> postAsync(@Nonnull final CustomExtensionStageSetting newCustomExtensionStageSetting) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CustomExtensionStageSettingRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .postAsync(newCustomExtensionStageSetting);
    }

    /**
     * Creates a new CustomExtensionStageSetting
     * @param newCustomExtensionStageSetting the CustomExtensionStageSetting to create
     * @return the newly created object
     */
    @Nonnull
    public CustomExtensionStageSetting post(@Nonnull final CustomExtensionStageSetting newCustomExtensionStageSetting) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CustomExtensionStageSettingRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newCustomExtensionStageSetting);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    @Nonnull
    public CustomExtensionStageSettingCollectionRequest expand(@Nonnull final String value) {
        addExpandOption(value);
        return this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    @Nonnull
    public CustomExtensionStageSettingCollectionRequest filter(@Nonnull final String value) {
        addFilterOption(value);
        return this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    @Nonnull
    public CustomExtensionStageSettingCollectionRequest orderBy(@Nonnull final String value) {
        addOrderByOption(value);
        return this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    @Nonnull
    public CustomExtensionStageSettingCollectionRequest select(@Nonnull final String value) {
        addSelectOption(value);
        return this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    @Nonnull
    public CustomExtensionStageSettingCollectionRequest top(final int value) {
        addTopOption(value);
        return this;
    }

    /**
     * Sets the count value for the request
     *
     * @param value whether or not to return the count of objects with the request
     * @return the updated request
     */
    @Nonnull
    public CustomExtensionStageSettingCollectionRequest count(final boolean value) {
        addCountOption(value);
        return this;
    }
    /**
     * Sets the count value to true for the request
     *
     * @return the updated request
     */
    @Nonnull
    public CustomExtensionStageSettingCollectionRequest count() {
        addCountOption(true);
        return this;
    }
    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    @Nonnull
    public CustomExtensionStageSettingCollectionRequest skip(final int value) {
        addSkipOption(value);
        return this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    @Nonnull
    public CustomExtensionStageSettingCollectionRequest skipToken(@Nonnull final String skipToken) {
    	addSkipTokenOption(skipToken);
        return this;
    }
}

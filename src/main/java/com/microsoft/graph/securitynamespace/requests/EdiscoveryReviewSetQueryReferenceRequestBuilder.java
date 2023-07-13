
// Template Source: BaseEntityReferenceRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.security.models.EdiscoveryReviewSetQuery;
import com.microsoft.graph.security.models.ExportOptions;
import com.microsoft.graph.security.models.ExportFileStructure;
import java.util.EnumSet;
import com.microsoft.graph.security.models.EdiscoveryReviewTag;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseReferenceRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Review Set Query Reference Request Builder.
 */
public class EdiscoveryReviewSetQueryReferenceRequestBuilder extends BaseReferenceRequestBuilder<EdiscoveryReviewSetQuery, EdiscoveryReviewSetQueryReferenceRequest> {

    /**
     * The request builder for the EdiscoveryReviewSetQuery
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryReviewSetQueryReferenceRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EdiscoveryReviewSetQueryReferenceRequest.class);
    }
}

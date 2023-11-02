// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.AttachmentBaseCreateUploadSessionRequest;
import com.microsoft.graph.models.AttachmentBase;
import com.microsoft.graph.models.AttachmentInfo;
import com.microsoft.graph.models.UploadSession;
import com.microsoft.graph.http.BaseActionRequestBuilder;
import com.microsoft.graph.models.AttachmentBaseCreateUploadSessionParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Attachment Base Create Upload Session Request Builder.
 */
public class AttachmentBaseCreateUploadSessionRequestBuilder extends BaseActionRequestBuilder<UploadSession> {

    /**
     * The request builder for this AttachmentBaseCreateUploadSession
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AttachmentBaseCreateUploadSessionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    private AttachmentBaseCreateUploadSessionParameterSet body;
    /**
     * The request builder for this AttachmentBaseCreateUploadSession
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public AttachmentBaseCreateUploadSessionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final AttachmentBaseCreateUploadSessionParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        this.body = parameters;
    }

    /**
     * Creates the AttachmentBaseCreateUploadSessionRequest
     *
     * @param requestOptions the options for the request
     * @return the AttachmentBaseCreateUploadSessionRequest instance
     */
    @Nonnull
    public AttachmentBaseCreateUploadSessionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the AttachmentBaseCreateUploadSessionRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the AttachmentBaseCreateUploadSessionRequest instance
     */
    @Nonnull
    public AttachmentBaseCreateUploadSessionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final AttachmentBaseCreateUploadSessionRequest request = new AttachmentBaseCreateUploadSessionRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        request.body = this.body;
        return request;
    }
}
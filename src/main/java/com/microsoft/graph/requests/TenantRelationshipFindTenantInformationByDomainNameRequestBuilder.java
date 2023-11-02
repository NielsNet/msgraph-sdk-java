// Template Source: BaseMethodRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.requests.TenantRelationshipFindTenantInformationByDomainNameRequest;
import com.microsoft.graph.models.TenantRelationship;
import com.microsoft.graph.models.TenantInformation;
import com.microsoft.graph.http.BaseFunctionRequestBuilder;
import com.microsoft.graph.models.TenantRelationshipFindTenantInformationByDomainNameParameterSet;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tenant Relationship Find Tenant Information By Domain Name Request Builder.
 */
public class TenantRelationshipFindTenantInformationByDomainNameRequestBuilder extends BaseFunctionRequestBuilder<TenantInformation> {

    /**
     * The request builder for this TenantRelationshipFindTenantInformationByDomainName
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TenantRelationshipFindTenantInformationByDomainNameRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }
    /**
     * The request builder for this TenantRelationshipFindTenantInformationByDomainName
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param parameters     the parameters for the service method
     */
    public TenantRelationshipFindTenantInformationByDomainNameRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, @Nonnull final TenantRelationshipFindTenantInformationByDomainNameParameterSet parameters) {
        super(requestUrl, client, requestOptions);
        if(parameters != null) {
            functionOptions = parameters.getFunctionOptions();
        }
    }

    /**
     * Creates the TenantRelationshipFindTenantInformationByDomainNameRequest
     *
     * @param requestOptions the options for the request
     * @return the TenantRelationshipFindTenantInformationByDomainNameRequest instance
     */
    @Nonnull
    public TenantRelationshipFindTenantInformationByDomainNameRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the TenantRelationshipFindTenantInformationByDomainNameRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the TenantRelationshipFindTenantInformationByDomainNameRequest instance
     */
    @Nonnull
    public TenantRelationshipFindTenantInformationByDomainNameRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        final TenantRelationshipFindTenantInformationByDomainNameRequest request = new TenantRelationshipFindTenantInformationByDomainNameRequest(
                getRequestUrl(),
                getClient(),
                requestOptions);
        for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
        }
        return request;
    }
}
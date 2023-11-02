// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.CustomSecurityAttributeDefinition;
import com.microsoft.graph.requests.CustomSecurityAttributeDefinitionCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.CustomSecurityAttributeDefinitionCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Custom Security Attribute Definition Collection Page.
 */
public class CustomSecurityAttributeDefinitionCollectionPage extends BaseCollectionPage<CustomSecurityAttributeDefinition, CustomSecurityAttributeDefinitionCollectionRequestBuilder> {

    /**
     * A collection page for CustomSecurityAttributeDefinition
     *
     * @param response the serialized CustomSecurityAttributeDefinitionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CustomSecurityAttributeDefinitionCollectionPage(@Nonnull final CustomSecurityAttributeDefinitionCollectionResponse response, @Nonnull final CustomSecurityAttributeDefinitionCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for CustomSecurityAttributeDefinition
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public CustomSecurityAttributeDefinitionCollectionPage(@Nonnull final java.util.List<CustomSecurityAttributeDefinition> pageContents, @Nullable final CustomSecurityAttributeDefinitionCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
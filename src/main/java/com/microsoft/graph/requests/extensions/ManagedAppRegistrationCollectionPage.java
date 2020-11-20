// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedAppRegistration;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.extensions.ManagedAppRegistrationCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed App Registration Collection Page.
 */
public class ManagedAppRegistrationCollectionPage extends BaseCollectionPage<ManagedAppRegistration, ManagedAppRegistrationCollectionRequestBuilder> {

    /**
     * A collection page for ManagedAppRegistration
     *
     * @param response the serialized ManagedAppRegistrationCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public ManagedAppRegistrationCollectionPage(@Nonnull final ManagedAppRegistrationCollectionResponse response, @Nonnull final ManagedAppRegistrationCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for ManagedAppRegistration
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ManagedAppRegistrationCollectionPage(@Nonnull final java.util.List<ManagedAppRegistration> pageContents, @Nullable final ManagedAppRegistrationCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

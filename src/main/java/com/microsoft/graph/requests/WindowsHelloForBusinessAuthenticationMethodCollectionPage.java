// Template Source: BaseEntityCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;
import com.microsoft.graph.models.WindowsHelloForBusinessAuthenticationMethod;
import com.microsoft.graph.requests.WindowsHelloForBusinessAuthenticationMethodCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.requests.WindowsHelloForBusinessAuthenticationMethodCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Hello For Business Authentication Method Collection Page.
 */
public class WindowsHelloForBusinessAuthenticationMethodCollectionPage extends BaseCollectionPage<WindowsHelloForBusinessAuthenticationMethod, WindowsHelloForBusinessAuthenticationMethodCollectionRequestBuilder> {

    /**
     * A collection page for WindowsHelloForBusinessAuthenticationMethod
     *
     * @param response the serialized WindowsHelloForBusinessAuthenticationMethodCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public WindowsHelloForBusinessAuthenticationMethodCollectionPage(@Nonnull final WindowsHelloForBusinessAuthenticationMethodCollectionResponse response, @Nonnull final WindowsHelloForBusinessAuthenticationMethodCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for WindowsHelloForBusinessAuthenticationMethod
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public WindowsHelloForBusinessAuthenticationMethodCollectionPage(@Nonnull final java.util.List<WindowsHelloForBusinessAuthenticationMethod> pageContents, @Nullable final WindowsHelloForBusinessAuthenticationMethodCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
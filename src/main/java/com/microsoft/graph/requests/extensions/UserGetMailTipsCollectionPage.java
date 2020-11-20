// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.generated.MailTipsType;
import com.microsoft.graph.models.extensions.MailTips;
import java.util.EnumSet;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.UserGetMailTipsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserGetMailTipsCollectionPage;
import com.microsoft.graph.requests.extensions.UserGetMailTipsCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Get Mail Tips Collection Page.
 */
public class UserGetMailTipsCollectionPage extends BaseCollectionPage<MailTips, UserGetMailTipsCollectionRequestBuilder> {

    /**
     * A collection page for MailTips.
     *
     * @param response The serialized UserGetMailTipsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public UserGetMailTipsCollectionPage(@Nonnull final UserGetMailTipsCollectionResponse response, @Nonnull final UserGetMailTipsCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for UserGetMailTips
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public UserGetMailTipsCollectionPage(@Nonnull final java.util.List<MailTips> pageContents, @Nullable final UserGetMailTipsCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

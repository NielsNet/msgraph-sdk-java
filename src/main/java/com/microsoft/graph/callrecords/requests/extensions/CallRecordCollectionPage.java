// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.requests.extensions;
import com.microsoft.graph.callrecords.models.extensions.CallRecord;
import com.microsoft.graph.callrecords.requests.extensions.CallRecordCollectionRequestBuilder;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.callrecords.requests.extensions.CallRecordCollectionResponse;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Call Record Collection Page.
 */
public class CallRecordCollectionPage extends BaseCollectionPage<CallRecord, CallRecordCollectionRequestBuilder> {

    /**
     * A collection page for CallRecord
     *
     * @param response the serialized CallRecordCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public CallRecordCollectionPage(@Nonnull final CallRecordCollectionResponse response, @Nonnull final CallRecordCollectionRequestBuilder builder) {
        super(response, builder);
    }

    /**
     * Creates the collection page for CallRecord
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public CallRecordCollectionPage(@Nonnull final java.util.List<CallRecord> pageContents, @Nullable final CallRecordCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}

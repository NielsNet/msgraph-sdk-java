// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookWorksheetProtection;
import com.microsoft.graph.models.extensions.WorkbookWorksheetProtectionOptions;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Worksheet Protection Request Builder.
 */
public class WorkbookWorksheetProtectionRequestBuilder extends BaseRequestBuilder<WorkbookWorksheetProtection> {

    /**
     * The request builder for the WorkbookWorksheetProtection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookWorksheetProtectionRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the WorkbookWorksheetProtectionRequest instance
     */
    @Nonnull
    public WorkbookWorksheetProtectionRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the WorkbookWorksheetProtectionRequest instance
     */
    @Nonnull
    public WorkbookWorksheetProtectionRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.WorkbookWorksheetProtectionRequest(getRequestUrl(), getClient(), requestOptions);
    }



    /**
     * Gets a builder to execute the method
     * @return the request builder 
     * @param options the options
     */
    @Nonnull
    public WorkbookWorksheetProtectionProtectRequestBuilder protect(@Nullable final WorkbookWorksheetProtectionOptions options) {
        return new WorkbookWorksheetProtectionProtectRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.protect"), getClient(), null, options);
    }

    /**
     * Gets a builder to execute the method
     * @return the request builder 
     */
    @Nonnull
    public WorkbookWorksheetProtectionUnprotectRequestBuilder unprotect() {
        return new WorkbookWorksheetProtectionUnprotectRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.unprotect"), getClient(), null);
    }
}

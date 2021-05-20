// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.ImportedWindowsAutopilotDeviceIdentity;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.ImportedWindowsAutopilotDeviceIdentityImportCollectionRequestBuilder;
import com.microsoft.graph.requests.ImportedWindowsAutopilotDeviceIdentityImportCollectionPage;
import com.microsoft.graph.requests.ImportedWindowsAutopilotDeviceIdentityImportCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Windows Autopilot Device Identity Import Collection Page.
 */
public class ImportedWindowsAutopilotDeviceIdentityImportCollectionPage extends BaseCollectionPage<ImportedWindowsAutopilotDeviceIdentity, ImportedWindowsAutopilotDeviceIdentityImportCollectionRequestBuilder> {

    /**
     * A collection page for ImportedWindowsAutopilotDeviceIdentity.
     *
     * @param response The serialized ImportedWindowsAutopilotDeviceIdentityImportCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ImportedWindowsAutopilotDeviceIdentityImportCollectionPage(@Nonnull final ImportedWindowsAutopilotDeviceIdentityImportCollectionResponse response, @Nonnull final ImportedWindowsAutopilotDeviceIdentityImportCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for ImportedWindowsAutopilotDeviceIdentityImport
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public ImportedWindowsAutopilotDeviceIdentityImportCollectionPage(@Nonnull final java.util.List<ImportedWindowsAutopilotDeviceIdentity> pageContents, @Nullable final ImportedWindowsAutopilotDeviceIdentityImportCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
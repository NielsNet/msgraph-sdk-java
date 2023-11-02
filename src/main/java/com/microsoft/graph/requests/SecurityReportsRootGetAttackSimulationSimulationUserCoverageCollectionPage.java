// Template Source: BaseMethodCollectionPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.AttackSimulationSimulationUserCoverage;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.SecurityReportsRootGetAttackSimulationSimulationUserCoverageCollectionRequestBuilder;
import com.microsoft.graph.requests.SecurityReportsRootGetAttackSimulationSimulationUserCoverageCollectionPage;
import com.microsoft.graph.requests.SecurityReportsRootGetAttackSimulationSimulationUserCoverageCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Reports Root Get Attack Simulation Simulation User Coverage Collection Page.
 */
public class SecurityReportsRootGetAttackSimulationSimulationUserCoverageCollectionPage extends BaseCollectionPage<AttackSimulationSimulationUserCoverage, SecurityReportsRootGetAttackSimulationSimulationUserCoverageCollectionRequestBuilder> {

    /**
     * A collection page for AttackSimulationSimulationUserCoverage.
     *
     * @param response The serialized SecurityReportsRootGetAttackSimulationSimulationUserCoverageCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public SecurityReportsRootGetAttackSimulationSimulationUserCoverageCollectionPage(@Nonnull final SecurityReportsRootGetAttackSimulationSimulationUserCoverageCollectionResponse response, @Nonnull final SecurityReportsRootGetAttackSimulationSimulationUserCoverageCollectionRequestBuilder builder) {
       super(response, builder);
    }

	/**
     * Creates the collection page for SecurityReportsRootGetAttackSimulationSimulationUserCoverage
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public SecurityReportsRootGetAttackSimulationSimulationUserCoverageCollectionPage(@Nonnull final java.util.List<AttackSimulationSimulationUserCoverage> pageContents, @Nullable final SecurityReportsRootGetAttackSimulationSimulationUserCoverageCollectionRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
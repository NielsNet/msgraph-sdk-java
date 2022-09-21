// Template Source: BaseEntityRequestBuilder.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EducationClass;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Class Request Builder.
 */
public class EducationClassRequestBuilder extends BaseRequestBuilder<EducationClass> {

    /**
     * The request builder for the EducationClass
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationClassRequestBuilder(@Nonnull final String requestUrl, @Nonnull final IBaseClient<?> client, @Nullable final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the EducationClassRequest instance
     */
    @Nonnull
    public EducationClassRequest buildRequest(@Nullable final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the EducationClassRequest instance
     */
    @Nonnull
    public EducationClassRequest buildRequest(@Nonnull final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.EducationClassRequest(getRequestUrl(), getClient(), requestOptions);
    }


    /**
     *  Gets a request builder for the EducationCategory collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationCategoryCollectionRequestBuilder assignmentCategories() {
        return new com.microsoft.graph.requests.EducationCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignmentCategories"), getClient(), null);
    }

    /**
     * Gets a request builder for the EducationCategory item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationCategoryRequestBuilder assignmentCategories(@Nonnull final String id) {
        return new com.microsoft.graph.requests.EducationCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("assignmentCategories") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for EducationAssignmentDefaults
     *
     * @return the EducationAssignmentDefaultsRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationAssignmentDefaultsRequestBuilder assignmentDefaults() {
        return new com.microsoft.graph.requests.EducationAssignmentDefaultsRequestBuilder(getRequestUrlWithAdditionalSegment("assignmentDefaults"), getClient(), null);
    }
    /**
     *  Gets a request builder for the EducationAssignment collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationAssignmentCollectionRequestBuilder assignments() {
        return new com.microsoft.graph.requests.EducationAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    /**
     * Gets a request builder for the EducationAssignment item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationAssignmentRequestBuilder assignments(@Nonnull final String id) {
        return new com.microsoft.graph.requests.EducationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for EducationAssignmentSettings
     *
     * @return the EducationAssignmentSettingsRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationAssignmentSettingsRequestBuilder assignmentSettings() {
        return new com.microsoft.graph.requests.EducationAssignmentSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("assignmentSettings"), getClient(), null);
    }

    /**
     * Gets the request builder for Group
     *
     * @return the GroupWithReferenceRequestBuilder instance
     */
    @Nonnull
    public com.microsoft.graph.requests.GroupWithReferenceRequestBuilder group() {
        return new com.microsoft.graph.requests.GroupWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("group"), getClient(), null);
    }
    /**
     *  Gets a request builder for the EducationUser collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationUserCollectionWithReferencesRequestBuilder members() {
        return new com.microsoft.graph.requests.EducationUserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("members"), getClient(), null);
    }

    /**
     * Gets a request builder for the EducationUser item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationUserWithReferenceRequestBuilder members(@Nonnull final String id) {
        return new com.microsoft.graph.requests.EducationUserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("members") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the EducationSchool collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationSchoolCollectionWithReferencesRequestBuilder schools() {
        return new com.microsoft.graph.requests.EducationSchoolCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("schools"), getClient(), null);
    }

    /**
     * Gets a request builder for the EducationSchool item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationSchoolWithReferenceRequestBuilder schools(@Nonnull final String id) {
        return new com.microsoft.graph.requests.EducationSchoolWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("schools") + "/" + id, getClient(), null);
    }
    /**
     *  Gets a request builder for the EducationUser collection
     *
     * @return the collection request builder
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationUserCollectionWithReferencesRequestBuilder teachers() {
        return new com.microsoft.graph.requests.EducationUserCollectionWithReferencesRequestBuilder(getRequestUrlWithAdditionalSegment("teachers"), getClient(), null);
    }

    /**
     * Gets a request builder for the EducationUser item
     *
     * @return the request builder
     * @param id the item identifier
     */
    @Nonnull
    public com.microsoft.graph.requests.EducationUserWithReferenceRequestBuilder teachers(@Nonnull final String id) {
        return new com.microsoft.graph.requests.EducationUserWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("teachers") + "/" + id, getClient(), null);
    }
}
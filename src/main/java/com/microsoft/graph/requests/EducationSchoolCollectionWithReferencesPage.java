// Template Source: BaseEntityCollectionWithReferencesPage.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.models.EducationUser;
import com.microsoft.graph.models.EducationSchool;
import java.util.Arrays;
import java.util.EnumSet;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

import com.microsoft.graph.requests.EducationSchoolCollectionWithReferencesRequestBuilder;
import com.microsoft.graph.requests.EducationSchoolCollectionWithReferencesPage;
import com.microsoft.graph.requests.EducationSchoolCollectionResponse;
import com.microsoft.graph.models.EducationSchool;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education School Collection With References Page.
 */
public class EducationSchoolCollectionWithReferencesPage extends BaseCollectionPage<EducationSchool, EducationSchoolCollectionWithReferencesRequestBuilder> {

    /**
     * A collection page for EducationSchool
     *
     * @param response the serialized EducationSchoolCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public EducationSchoolCollectionWithReferencesPage(@Nonnull final EducationSchoolCollectionResponse response, @Nullable final EducationSchoolCollectionWithReferencesRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }

    /**
     * Creates the collection page for EducationSchool
     *
     * @param pageContents       the contents of this page
     * @param nextRequestBuilder the request builder for the next page
     */
    public EducationSchoolCollectionWithReferencesPage(@Nonnull final java.util.List<EducationSchool> pageContents, @Nullable final EducationSchoolCollectionWithReferencesRequestBuilder nextRequestBuilder) {
        super(pageContents, nextRequestBuilder);
    }
}
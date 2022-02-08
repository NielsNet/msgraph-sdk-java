// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.ThreatCategory;
import com.microsoft.graph.models.ThreatAssessmentContentType;
import com.microsoft.graph.models.IdentitySet;
import com.microsoft.graph.models.ThreatExpectedAssessment;
import com.microsoft.graph.models.ThreatAssessmentRequestSource;
import com.microsoft.graph.models.ThreatAssessmentStatus;
import com.microsoft.graph.models.ThreatAssessmentResult;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.ThreatAssessmentResultCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Threat Assessment Request.
 */
public class ThreatAssessmentRequest extends Entity implements IJsonBackedObject {


    /**
     * The Category.
     * The threat category. Possible values are: spam, phishing, malware.
     */
    @SerializedName(value = "category", alternate = {"Category"})
    @Expose
	@Nullable
    public ThreatCategory category;

    /**
     * The Content Type.
     * The content type of threat assessment. Possible values are: mail, url, file.
     */
    @SerializedName(value = "contentType", alternate = {"ContentType"})
    @Expose
	@Nullable
    public ThreatAssessmentContentType contentType;

    /**
     * The Created By.
     * The threat assessment request creator.
     */
    @SerializedName(value = "createdBy", alternate = {"CreatedBy"})
    @Expose
	@Nullable
    public IdentitySet createdBy;

    /**
     * The Created Date Time.
     * The Timestamp type represents date and time information using ISO 8601 format and is always in UTC time. For example, midnight UTC on Jan 1, 2014 is 2014-01-01T00:00:00Z.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Expected Assessment.
     * The expected assessment from submitter. Possible values are: block, unblock.
     */
    @SerializedName(value = "expectedAssessment", alternate = {"ExpectedAssessment"})
    @Expose
	@Nullable
    public ThreatExpectedAssessment expectedAssessment;

    /**
     * The Request Source.
     * The source of the threat assessment request. Possible values are: administrator.
     */
    @SerializedName(value = "requestSource", alternate = {"RequestSource"})
    @Expose
	@Nullable
    public ThreatAssessmentRequestSource requestSource;

    /**
     * The Status.
     * The assessment process status. Possible values are: pending, completed.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public ThreatAssessmentStatus status;

    /**
     * The Results.
     * A collection of threat assessment results. Read-only. By default, a GET /threatAssessmentRequests/{id} does not return this property unless you apply $expand on it.
     */
    @SerializedName(value = "results", alternate = {"Results"})
    @Expose
	@Nullable
    public ThreatAssessmentResultCollectionPage results;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("results")) {
            results = serializer.deserializeObject(json.get("results"), ThreatAssessmentResultCollectionPage.class);
        }
    }
}

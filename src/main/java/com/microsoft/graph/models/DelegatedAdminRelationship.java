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
import com.microsoft.graph.models.DelegatedAdminAccessDetails;
import com.microsoft.graph.models.DelegatedAdminRelationshipCustomerParticipant;
import com.microsoft.graph.models.DelegatedAdminRelationshipStatus;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.DelegatedAdminAccessAssignmentCollectionPage;
import com.microsoft.graph.requests.DelegatedAdminRelationshipOperationCollectionPage;
import com.microsoft.graph.requests.DelegatedAdminRelationshipRequestCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Delegated Admin Relationship.
 */
public class DelegatedAdminRelationship extends Entity implements IJsonBackedObject {


    /**
     * The Access Details.
     * The access details that contain the identifiers of the administrative roles that the partner admin is requesting in the customer tenant.
     */
    @SerializedName(value = "accessDetails", alternate = {"AccessDetails"})
    @Expose
	@Nullable
    public DelegatedAdminAccessDetails accessDetails;

    /**
     * The Activated Date Time.
     * The date and time in ISO 8601 format and in UTC time when the relationship became active. Read-only.
     */
    @SerializedName(value = "activatedDateTime", alternate = {"ActivatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime activatedDateTime;

    /**
     * The Created Date Time.
     * The date and time in ISO 8601 format and in UTC time when the relationship was created. Read-only.
     */
    @SerializedName(value = "createdDateTime", alternate = {"CreatedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime createdDateTime;

    /**
     * The Customer.
     * The display name and unique identifier of the customer of the relationship. This is configured either by the partner at the time the relationship is created or by the system after the customer approves the relationship. Cannot be changed by the customer.
     */
    @SerializedName(value = "customer", alternate = {"Customer"})
    @Expose
	@Nullable
    public DelegatedAdminRelationshipCustomerParticipant customer;

    /**
     * The Display Name.
     * The display name of the relationship used for ease of identification. Must be unique across all delegated admin relationships of the partner. This is set by the partner only when the relationship is in the created status and cannot be changed by the customer.
     */
    @SerializedName(value = "displayName", alternate = {"DisplayName"})
    @Expose
	@Nullable
    public String displayName;

    /**
     * The Duration.
     * The duration of the relationship in ISO 8601 format. Must be a value between P1D and P2Y inclusive. This is set by the partner only when the relationship is in the created status and cannot be changed by the customer.
     */
    @SerializedName(value = "duration", alternate = {"Duration"})
    @Expose
	@Nullable
    public javax.xml.datatype.Duration duration;

    /**
     * The End Date Time.
     * The date and time in ISO 8601 format and in UTC time when the status of relationship changes to either terminated or expired. Calculated as endDateTime = activatedDateTime + duration. Read-only.
     */
    @SerializedName(value = "endDateTime", alternate = {"EndDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime endDateTime;

    /**
     * The Last Modified Date Time.
     * The date and time in ISO 8601 format and in UTC time when the relationship was last modified. Read-only.
     */
    @SerializedName(value = "lastModifiedDateTime", alternate = {"LastModifiedDateTime"})
    @Expose
	@Nullable
    public java.time.OffsetDateTime lastModifiedDateTime;

    /**
     * The Status.
     * The status of the relationship. Read Only. The possible values are: activating, active, approvalPending, approved, created, expired, expiring, terminated, terminating, terminationRequested, unknownFutureValue. Supports $orderBy.
     */
    @SerializedName(value = "status", alternate = {"Status"})
    @Expose
	@Nullable
    public DelegatedAdminRelationshipStatus status;

    /**
     * The Access Assignments.
     * The access assignments associated with the delegated admin relationship.
     */
    @SerializedName(value = "accessAssignments", alternate = {"AccessAssignments"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.DelegatedAdminAccessAssignmentCollectionPage accessAssignments;

    /**
     * The Operations.
     * The long running operations associated with the delegated admin relationship.
     */
    @SerializedName(value = "operations", alternate = {"Operations"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.DelegatedAdminRelationshipOperationCollectionPage operations;

    /**
     * The Requests.
     * The requests associated with the delegated admin relationship.
     */
    @SerializedName(value = "requests", alternate = {"Requests"})
    @Expose
	@Nullable
    public com.microsoft.graph.requests.DelegatedAdminRelationshipRequestCollectionPage requests;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("accessAssignments")) {
            accessAssignments = serializer.deserializeObject(json.get("accessAssignments"), com.microsoft.graph.requests.DelegatedAdminAccessAssignmentCollectionPage.class);
        }

        if (json.has("operations")) {
            operations = serializer.deserializeObject(json.get("operations"), com.microsoft.graph.requests.DelegatedAdminRelationshipOperationCollectionPage.class);
        }

        if (json.has("requests")) {
            requests = serializer.deserializeObject(json.get("requests"), com.microsoft.graph.requests.DelegatedAdminRelationshipRequestCollectionPage.class);
        }
    }
}

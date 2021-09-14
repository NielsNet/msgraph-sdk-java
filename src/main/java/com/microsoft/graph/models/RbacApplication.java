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
import com.microsoft.graph.models.UnifiedRoleAssignment;
import com.microsoft.graph.models.UnifiedRoleDefinition;
import com.microsoft.graph.models.Entity;
import com.microsoft.graph.requests.UnifiedRoleAssignmentCollectionPage;
import com.microsoft.graph.requests.UnifiedRoleDefinitionCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Rbac Application.
 */
public class RbacApplication extends Entity implements IJsonBackedObject {


    /**
     * The Role Assignments.
     * Resource to grant access to users or groups.
     */
    @SerializedName(value = "roleAssignments", alternate = {"RoleAssignments"})
    @Expose
	@Nullable
    public UnifiedRoleAssignmentCollectionPage roleAssignments;

    /**
     * The Role Definitions.
     * Resource representing the roles allowed by RBAC providers and the permissions assigned to the roles.
     */
    @SerializedName(value = "roleDefinitions", alternate = {"RoleDefinitions"})
    @Expose
	@Nullable
    public UnifiedRoleDefinitionCollectionPage roleDefinitions;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {


        if (json.has("roleAssignments")) {
            roleAssignments = serializer.deserializeObject(json.get("roleAssignments"), UnifiedRoleAssignmentCollectionPage.class);
        }

        if (json.has("roleDefinitions")) {
            roleDefinitions = serializer.deserializeObject(json.get("roleDefinitions"), UnifiedRoleDefinitionCollectionPage.class);
        }
    }
}

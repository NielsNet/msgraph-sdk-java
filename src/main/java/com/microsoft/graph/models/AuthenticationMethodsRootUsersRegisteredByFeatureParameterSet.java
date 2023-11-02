// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.UserRegistrationFeatureSummary;
import com.microsoft.graph.models.IncludedUserTypes;
import com.microsoft.graph.models.IncludedUserRoles;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Methods Root Users Registered By Feature Parameter Set.
 */
public class AuthenticationMethodsRootUsersRegisteredByFeatureParameterSet {
    /**
     * The included User Types.
     * 
     */
    @SerializedName(value = "includedUserTypes", alternate = {"IncludedUserTypes"})
    @Expose
	@Nullable
    public IncludedUserTypes includedUserTypes;

    /**
     * The included User Roles.
     * 
     */
    @SerializedName(value = "includedUserRoles", alternate = {"IncludedUserRoles"})
    @Expose
	@Nullable
    public IncludedUserRoles includedUserRoles;


    /**
     * Instiaciates a new AuthenticationMethodsRootUsersRegisteredByFeatureParameterSet
     */
    public AuthenticationMethodsRootUsersRegisteredByFeatureParameterSet() {}
    /**
     * Instiaciates a new AuthenticationMethodsRootUsersRegisteredByFeatureParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected AuthenticationMethodsRootUsersRegisteredByFeatureParameterSet(@Nonnull final AuthenticationMethodsRootUsersRegisteredByFeatureParameterSetBuilder builder) {
        this.includedUserTypes = builder.includedUserTypes;
        this.includedUserRoles = builder.includedUserRoles;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static AuthenticationMethodsRootUsersRegisteredByFeatureParameterSetBuilder newBuilder() {
        return new AuthenticationMethodsRootUsersRegisteredByFeatureParameterSetBuilder();
    }
    /**
     * Fluent builder for the AuthenticationMethodsRootUsersRegisteredByFeatureParameterSet
     */
    public static final class AuthenticationMethodsRootUsersRegisteredByFeatureParameterSetBuilder {
        /**
         * The includedUserTypes parameter value
         */
        @Nullable
        protected IncludedUserTypes includedUserTypes;
        /**
         * Sets the IncludedUserTypes
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public AuthenticationMethodsRootUsersRegisteredByFeatureParameterSetBuilder withIncludedUserTypes(@Nullable final IncludedUserTypes val) {
            this.includedUserTypes = val;
            return this;
        }
        /**
         * The includedUserRoles parameter value
         */
        @Nullable
        protected IncludedUserRoles includedUserRoles;
        /**
         * Sets the IncludedUserRoles
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public AuthenticationMethodsRootUsersRegisteredByFeatureParameterSetBuilder withIncludedUserRoles(@Nullable final IncludedUserRoles val) {
            this.includedUserRoles = val;
            return this;
        }
        /**
         * Instanciates a new AuthenticationMethodsRootUsersRegisteredByFeatureParameterSetBuilder
         */
        @Nullable
        protected AuthenticationMethodsRootUsersRegisteredByFeatureParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public AuthenticationMethodsRootUsersRegisteredByFeatureParameterSet build() {
            return new AuthenticationMethodsRootUsersRegisteredByFeatureParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.includedUserTypes != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("includedUserTypes", includedUserTypes));
        }
        if(this.includedUserRoles != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("includedUserRoles", includedUserRoles));
        }
        return result;
    }
}
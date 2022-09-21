// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Risky User Dismiss Parameter Set.
 */
public class RiskyUserDismissParameterSet {
    /**
     * The user Ids.
     * 
     */
    @SerializedName(value = "userIds", alternate = {"UserIds"})
    @Expose
	@Nullable
    public java.util.List<String> userIds;


    /**
     * Instiaciates a new RiskyUserDismissParameterSet
     */
    public RiskyUserDismissParameterSet() {}
    /**
     * Instiaciates a new RiskyUserDismissParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected RiskyUserDismissParameterSet(@Nonnull final RiskyUserDismissParameterSetBuilder builder) {
        this.userIds = builder.userIds;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static RiskyUserDismissParameterSetBuilder newBuilder() {
        return new RiskyUserDismissParameterSetBuilder();
    }
    /**
     * Fluent builder for the RiskyUserDismissParameterSet
     */
    public static final class RiskyUserDismissParameterSetBuilder {
        /**
         * The userIds parameter value
         */
        @Nullable
        protected java.util.List<String> userIds;
        /**
         * Sets the UserIds
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public RiskyUserDismissParameterSetBuilder withUserIds(@Nullable final java.util.List<String> val) {
            this.userIds = val;
            return this;
        }
        /**
         * Instanciates a new RiskyUserDismissParameterSetBuilder
         */
        @Nullable
        protected RiskyUserDismissParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public RiskyUserDismissParameterSet build() {
            return new RiskyUserDismissParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.userIds != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("userIds", userIds));
        }
        return result;
    }
}
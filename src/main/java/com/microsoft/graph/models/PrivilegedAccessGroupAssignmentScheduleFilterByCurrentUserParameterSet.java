// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.AssignmentScheduleFilterByCurrentUserOptions;
import com.microsoft.graph.models.PrivilegedAccessGroupAssignmentSchedule;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Access Group Assignment Schedule Filter By Current User Parameter Set.
 */
public class PrivilegedAccessGroupAssignmentScheduleFilterByCurrentUserParameterSet {
    /**
     * The on.
     * 
     */
    @SerializedName(value = "on", alternate = {"On"})
    @Expose
	@Nullable
    public AssignmentScheduleFilterByCurrentUserOptions on;


    /**
     * Instiaciates a new PrivilegedAccessGroupAssignmentScheduleFilterByCurrentUserParameterSet
     */
    public PrivilegedAccessGroupAssignmentScheduleFilterByCurrentUserParameterSet() {}
    /**
     * Instiaciates a new PrivilegedAccessGroupAssignmentScheduleFilterByCurrentUserParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected PrivilegedAccessGroupAssignmentScheduleFilterByCurrentUserParameterSet(@Nonnull final PrivilegedAccessGroupAssignmentScheduleFilterByCurrentUserParameterSetBuilder builder) {
        this.on = builder.on;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static PrivilegedAccessGroupAssignmentScheduleFilterByCurrentUserParameterSetBuilder newBuilder() {
        return new PrivilegedAccessGroupAssignmentScheduleFilterByCurrentUserParameterSetBuilder();
    }
    /**
     * Fluent builder for the PrivilegedAccessGroupAssignmentScheduleFilterByCurrentUserParameterSet
     */
    public static final class PrivilegedAccessGroupAssignmentScheduleFilterByCurrentUserParameterSetBuilder {
        /**
         * The on parameter value
         */
        @Nullable
        protected AssignmentScheduleFilterByCurrentUserOptions on;
        /**
         * Sets the On
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public PrivilegedAccessGroupAssignmentScheduleFilterByCurrentUserParameterSetBuilder withOn(@Nullable final AssignmentScheduleFilterByCurrentUserOptions val) {
            this.on = val;
            return this;
        }
        /**
         * Instanciates a new PrivilegedAccessGroupAssignmentScheduleFilterByCurrentUserParameterSetBuilder
         */
        @Nullable
        protected PrivilegedAccessGroupAssignmentScheduleFilterByCurrentUserParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public PrivilegedAccessGroupAssignmentScheduleFilterByCurrentUserParameterSet build() {
            return new PrivilegedAccessGroupAssignmentScheduleFilterByCurrentUserParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.on != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("on", on));
        }
        return result;
    }
}
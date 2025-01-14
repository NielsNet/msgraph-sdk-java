// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.EnrollmentConfigurationAssignment;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Enrollment Configuration Assign Parameter Set.
 */
public class DeviceEnrollmentConfigurationAssignParameterSet {
    /**
     * The enrollment Configuration Assignments.
     * 
     */
    @SerializedName(value = "enrollmentConfigurationAssignments", alternate = {"EnrollmentConfigurationAssignments"})
    @Expose
	@Nullable
    public java.util.List<EnrollmentConfigurationAssignment> enrollmentConfigurationAssignments;


    /**
     * Instiaciates a new DeviceEnrollmentConfigurationAssignParameterSet
     */
    public DeviceEnrollmentConfigurationAssignParameterSet() {}
    /**
     * Instiaciates a new DeviceEnrollmentConfigurationAssignParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DeviceEnrollmentConfigurationAssignParameterSet(@Nonnull final DeviceEnrollmentConfigurationAssignParameterSetBuilder builder) {
        this.enrollmentConfigurationAssignments = builder.enrollmentConfigurationAssignments;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DeviceEnrollmentConfigurationAssignParameterSetBuilder newBuilder() {
        return new DeviceEnrollmentConfigurationAssignParameterSetBuilder();
    }
    /**
     * Fluent builder for the DeviceEnrollmentConfigurationAssignParameterSet
     */
    public static final class DeviceEnrollmentConfigurationAssignParameterSetBuilder {
        /**
         * The enrollmentConfigurationAssignments parameter value
         */
        @Nullable
        protected java.util.List<EnrollmentConfigurationAssignment> enrollmentConfigurationAssignments;
        /**
         * Sets the EnrollmentConfigurationAssignments
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DeviceEnrollmentConfigurationAssignParameterSetBuilder withEnrollmentConfigurationAssignments(@Nullable final java.util.List<EnrollmentConfigurationAssignment> val) {
            this.enrollmentConfigurationAssignments = val;
            return this;
        }
        /**
         * Instanciates a new DeviceEnrollmentConfigurationAssignParameterSetBuilder
         */
        @Nullable
        protected DeviceEnrollmentConfigurationAssignParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DeviceEnrollmentConfigurationAssignParameterSet build() {
            return new DeviceEnrollmentConfigurationAssignParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.enrollmentConfigurationAssignments != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("enrollmentConfigurationAssignments", enrollmentConfigurationAssignments));
        }
        return result;
    }
}

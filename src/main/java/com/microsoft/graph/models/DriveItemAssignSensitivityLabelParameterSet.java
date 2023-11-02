// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.SensitivityLabelAssignmentMethod;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Assign Sensitivity Label Parameter Set.
 */
public class DriveItemAssignSensitivityLabelParameterSet {
    /**
     * The sensitivity Label Id.
     * 
     */
    @SerializedName(value = "sensitivityLabelId", alternate = {"SensitivityLabelId"})
    @Expose
	@Nullable
    public String sensitivityLabelId;

    /**
     * The assignment Method.
     * 
     */
    @SerializedName(value = "assignmentMethod", alternate = {"AssignmentMethod"})
    @Expose
	@Nullable
    public SensitivityLabelAssignmentMethod assignmentMethod;

    /**
     * The justification Text.
     * 
     */
    @SerializedName(value = "justificationText", alternate = {"JustificationText"})
    @Expose
	@Nullable
    public String justificationText;


    /**
     * Instiaciates a new DriveItemAssignSensitivityLabelParameterSet
     */
    public DriveItemAssignSensitivityLabelParameterSet() {}
    /**
     * Instiaciates a new DriveItemAssignSensitivityLabelParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DriveItemAssignSensitivityLabelParameterSet(@Nonnull final DriveItemAssignSensitivityLabelParameterSetBuilder builder) {
        this.sensitivityLabelId = builder.sensitivityLabelId;
        this.assignmentMethod = builder.assignmentMethod;
        this.justificationText = builder.justificationText;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DriveItemAssignSensitivityLabelParameterSetBuilder newBuilder() {
        return new DriveItemAssignSensitivityLabelParameterSetBuilder();
    }
    /**
     * Fluent builder for the DriveItemAssignSensitivityLabelParameterSet
     */
    public static final class DriveItemAssignSensitivityLabelParameterSetBuilder {
        /**
         * The sensitivityLabelId parameter value
         */
        @Nullable
        protected String sensitivityLabelId;
        /**
         * Sets the SensitivityLabelId
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemAssignSensitivityLabelParameterSetBuilder withSensitivityLabelId(@Nullable final String val) {
            this.sensitivityLabelId = val;
            return this;
        }
        /**
         * The assignmentMethod parameter value
         */
        @Nullable
        protected SensitivityLabelAssignmentMethod assignmentMethod;
        /**
         * Sets the AssignmentMethod
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemAssignSensitivityLabelParameterSetBuilder withAssignmentMethod(@Nullable final SensitivityLabelAssignmentMethod val) {
            this.assignmentMethod = val;
            return this;
        }
        /**
         * The justificationText parameter value
         */
        @Nullable
        protected String justificationText;
        /**
         * Sets the JustificationText
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public DriveItemAssignSensitivityLabelParameterSetBuilder withJustificationText(@Nullable final String val) {
            this.justificationText = val;
            return this;
        }
        /**
         * Instanciates a new DriveItemAssignSensitivityLabelParameterSetBuilder
         */
        @Nullable
        protected DriveItemAssignSensitivityLabelParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DriveItemAssignSensitivityLabelParameterSet build() {
            return new DriveItemAssignSensitivityLabelParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.sensitivityLabelId != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("sensitivityLabelId", sensitivityLabelId));
        }
        if(this.assignmentMethod != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("assignmentMethod", assignmentMethod));
        }
        if(this.justificationText != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("justificationText", justificationText));
        }
        return result;
    }
}
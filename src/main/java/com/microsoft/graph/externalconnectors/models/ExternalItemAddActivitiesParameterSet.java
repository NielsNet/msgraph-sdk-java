// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.externalconnectors.models;

import com.microsoft.graph.externalconnectors.models.ExternalActivity;
import com.microsoft.graph.externalconnectors.models.ExternalActivityResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Item Add Activities Parameter Set.
 */
public class ExternalItemAddActivitiesParameterSet {
    /**
     * The activities.
     * 
     */
    @SerializedName(value = "activities", alternate = {"Activities"})
    @Expose
	@Nullable
    public java.util.List<ExternalActivity> activities;


    /**
     * Instiaciates a new ExternalItemAddActivitiesParameterSet
     */
    public ExternalItemAddActivitiesParameterSet() {}
    /**
     * Instiaciates a new ExternalItemAddActivitiesParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ExternalItemAddActivitiesParameterSet(@Nonnull final ExternalItemAddActivitiesParameterSetBuilder builder) {
        this.activities = builder.activities;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ExternalItemAddActivitiesParameterSetBuilder newBuilder() {
        return new ExternalItemAddActivitiesParameterSetBuilder();
    }
    /**
     * Fluent builder for the ExternalItemAddActivitiesParameterSet
     */
    public static final class ExternalItemAddActivitiesParameterSetBuilder {
        /**
         * The activities parameter value
         */
        @Nullable
        protected java.util.List<ExternalActivity> activities;
        /**
         * Sets the Activities
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ExternalItemAddActivitiesParameterSetBuilder withActivities(@Nullable final java.util.List<ExternalActivity> val) {
            this.activities = val;
            return this;
        }
        /**
         * Instanciates a new ExternalItemAddActivitiesParameterSetBuilder
         */
        @Nullable
        protected ExternalItemAddActivitiesParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ExternalItemAddActivitiesParameterSet build() {
            return new ExternalItemAddActivitiesParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.activities != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("activities", activities));
        }
        return result;
    }
}
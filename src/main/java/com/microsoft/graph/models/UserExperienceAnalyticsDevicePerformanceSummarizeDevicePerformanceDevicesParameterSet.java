// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.UserExperienceAnalyticsSummarizedBy;
import com.microsoft.graph.models.UserExperienceAnalyticsDevicePerformance;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Device Performance Summarize Device Performance Devices Parameter Set.
 */
public class UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesParameterSet {
    /**
     * The summarize By.
     * 
     */
    @SerializedName(value = "summarizeBy", alternate = {"SummarizeBy"})
    @Expose
	@Nullable
    public UserExperienceAnalyticsSummarizedBy summarizeBy;


    /**
     * Instiaciates a new UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesParameterSet
     */
    public UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesParameterSet() {}
    /**
     * Instiaciates a new UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesParameterSet(@Nonnull final UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesParameterSetBuilder builder) {
        this.summarizeBy = builder.summarizeBy;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesParameterSetBuilder newBuilder() {
        return new UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesParameterSetBuilder();
    }
    /**
     * Fluent builder for the UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesParameterSet
     */
    public static final class UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesParameterSetBuilder {
        /**
         * The summarizeBy parameter value
         */
        @Nullable
        protected UserExperienceAnalyticsSummarizedBy summarizeBy;
        /**
         * Sets the SummarizeBy
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesParameterSetBuilder withSummarizeBy(@Nullable final UserExperienceAnalyticsSummarizedBy val) {
            this.summarizeBy = val;
            return this;
        }
        /**
         * Instanciates a new UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesParameterSetBuilder
         */
        @Nullable
        protected UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesParameterSet build() {
            return new UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.summarizeBy != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("summarizeBy", summarizeBy));
        }
        return result;
    }
}

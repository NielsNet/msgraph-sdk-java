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
 * The class for the Report Root Get One Drive Usage Account Counts Parameter Set.
 */
public class ReportRootGetOneDriveUsageAccountCountsParameterSet {
    /**
     * The period.
     * 
     */
    @SerializedName(value = "period", alternate = {"Period"})
    @Expose
	@Nullable
    public String period;


    /**
     * Instiaciates a new ReportRootGetOneDriveUsageAccountCountsParameterSet
     */
    public ReportRootGetOneDriveUsageAccountCountsParameterSet() {}
    /**
     * Instiaciates a new ReportRootGetOneDriveUsageAccountCountsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected ReportRootGetOneDriveUsageAccountCountsParameterSet(@Nonnull final ReportRootGetOneDriveUsageAccountCountsParameterSetBuilder builder) {
        this.period = builder.period;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static ReportRootGetOneDriveUsageAccountCountsParameterSetBuilder newBuilder() {
        return new ReportRootGetOneDriveUsageAccountCountsParameterSetBuilder();
    }
    /**
     * Fluent builder for the ReportRootGetOneDriveUsageAccountCountsParameterSet
     */
    public static final class ReportRootGetOneDriveUsageAccountCountsParameterSetBuilder {
        /**
         * The period parameter value
         */
        @Nullable
        protected String period;
        /**
         * Sets the Period
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public ReportRootGetOneDriveUsageAccountCountsParameterSetBuilder withPeriod(@Nullable final String val) {
            this.period = val;
            return this;
        }
        /**
         * Instanciates a new ReportRootGetOneDriveUsageAccountCountsParameterSetBuilder
         */
        @Nullable
        protected ReportRootGetOneDriveUsageAccountCountsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public ReportRootGetOneDriveUsageAccountCountsParameterSet build() {
            return new ReportRootGetOneDriveUsageAccountCountsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.period != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("period", period));
        }
        return result;
    }
}
// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Pduration Parameter Set.
 */
public class WorkbookFunctionsPdurationParameterSet {
    /**
     * The rate.
     * 
     */
    @SerializedName(value = "rate", alternate = {"Rate"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement rate;

    /**
     * The pv.
     * 
     */
    @SerializedName(value = "pv", alternate = {"Pv"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement pv;

    /**
     * The fv.
     * 
     */
    @SerializedName(value = "fv", alternate = {"Fv"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement fv;


    /**
     * Instiaciates a new WorkbookFunctionsPdurationParameterSet
     */
    public WorkbookFunctionsPdurationParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsPdurationParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsPdurationParameterSet(@Nonnull final WorkbookFunctionsPdurationParameterSetBuilder builder) {
        this.rate = builder.rate;
        this.pv = builder.pv;
        this.fv = builder.fv;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsPdurationParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsPdurationParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsPdurationParameterSet
     */
    public static final class WorkbookFunctionsPdurationParameterSetBuilder {
        /**
         * The rate parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement rate;
        /**
         * Sets the Rate
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsPdurationParameterSetBuilder withRate(@Nullable final com.google.gson.JsonElement val) {
            this.rate = val;
            return this;
        }
        /**
         * The pv parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement pv;
        /**
         * Sets the Pv
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsPdurationParameterSetBuilder withPv(@Nullable final com.google.gson.JsonElement val) {
            this.pv = val;
            return this;
        }
        /**
         * The fv parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement fv;
        /**
         * Sets the Fv
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsPdurationParameterSetBuilder withFv(@Nullable final com.google.gson.JsonElement val) {
            this.fv = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsPdurationParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsPdurationParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsPdurationParameterSet build() {
            return new WorkbookFunctionsPdurationParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.rate != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("rate", rate));
        }
        if(this.pv != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("pv", pv));
        }
        if(this.fv != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("fv", fv));
        }
        return result;
    }
}
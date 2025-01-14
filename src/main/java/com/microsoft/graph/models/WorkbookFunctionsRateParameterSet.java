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
 * The class for the Workbook Functions Rate Parameter Set.
 */
public class WorkbookFunctionsRateParameterSet {
    /**
     * The nper.
     * 
     */
    @SerializedName(value = "nper", alternate = {"Nper"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement nper;

    /**
     * The pmt.
     * 
     */
    @SerializedName(value = "pmt", alternate = {"Pmt"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement pmt;

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
     * The type.
     * 
     */
    @SerializedName(value = "type", alternate = {"Type"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement type;

    /**
     * The guess.
     * 
     */
    @SerializedName(value = "guess", alternate = {"Guess"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement guess;


    /**
     * Instiaciates a new WorkbookFunctionsRateParameterSet
     */
    public WorkbookFunctionsRateParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsRateParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsRateParameterSet(@Nonnull final WorkbookFunctionsRateParameterSetBuilder builder) {
        this.nper = builder.nper;
        this.pmt = builder.pmt;
        this.pv = builder.pv;
        this.fv = builder.fv;
        this.type = builder.type;
        this.guess = builder.guess;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsRateParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsRateParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsRateParameterSet
     */
    public static final class WorkbookFunctionsRateParameterSetBuilder {
        /**
         * The nper parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement nper;
        /**
         * Sets the Nper
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsRateParameterSetBuilder withNper(@Nullable final com.google.gson.JsonElement val) {
            this.nper = val;
            return this;
        }
        /**
         * The pmt parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement pmt;
        /**
         * Sets the Pmt
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsRateParameterSetBuilder withPmt(@Nullable final com.google.gson.JsonElement val) {
            this.pmt = val;
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
        public WorkbookFunctionsRateParameterSetBuilder withPv(@Nullable final com.google.gson.JsonElement val) {
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
        public WorkbookFunctionsRateParameterSetBuilder withFv(@Nullable final com.google.gson.JsonElement val) {
            this.fv = val;
            return this;
        }
        /**
         * The type parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement type;
        /**
         * Sets the Type
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsRateParameterSetBuilder withType(@Nullable final com.google.gson.JsonElement val) {
            this.type = val;
            return this;
        }
        /**
         * The guess parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement guess;
        /**
         * Sets the Guess
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsRateParameterSetBuilder withGuess(@Nullable final com.google.gson.JsonElement val) {
            this.guess = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsRateParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsRateParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsRateParameterSet build() {
            return new WorkbookFunctionsRateParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.nper != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("nper", nper));
        }
        if(this.pmt != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("pmt", pmt));
        }
        if(this.pv != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("pv", pv));
        }
        if(this.fv != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("fv", fv));
        }
        if(this.type != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("type", type));
        }
        if(this.guess != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("guess", guess));
        }
        return result;
    }
}

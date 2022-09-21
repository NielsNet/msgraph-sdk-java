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
 * The class for the Workbook Functions Floor_Math Parameter Set.
 */
public class WorkbookFunctionsFloor_MathParameterSet {
    /**
     * The number.
     * 
     */
    @SerializedName(value = "number", alternate = {"Number"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement number;

    /**
     * The significance.
     * 
     */
    @SerializedName(value = "significance", alternate = {"Significance"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement significance;

    /**
     * The mode.
     * 
     */
    @SerializedName(value = "mode", alternate = {"Mode"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement mode;


    /**
     * Instiaciates a new WorkbookFunctionsFloor_MathParameterSet
     */
    public WorkbookFunctionsFloor_MathParameterSet() {}
    /**
     * Instiaciates a new WorkbookFunctionsFloor_MathParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookFunctionsFloor_MathParameterSet(@Nonnull final WorkbookFunctionsFloor_MathParameterSetBuilder builder) {
        this.number = builder.number;
        this.significance = builder.significance;
        this.mode = builder.mode;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookFunctionsFloor_MathParameterSetBuilder newBuilder() {
        return new WorkbookFunctionsFloor_MathParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookFunctionsFloor_MathParameterSet
     */
    public static final class WorkbookFunctionsFloor_MathParameterSetBuilder {
        /**
         * The number parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement number;
        /**
         * Sets the Number
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsFloor_MathParameterSetBuilder withNumber(@Nullable final com.google.gson.JsonElement val) {
            this.number = val;
            return this;
        }
        /**
         * The significance parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement significance;
        /**
         * Sets the Significance
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsFloor_MathParameterSetBuilder withSignificance(@Nullable final com.google.gson.JsonElement val) {
            this.significance = val;
            return this;
        }
        /**
         * The mode parameter value
         */
        @Nullable
        protected com.google.gson.JsonElement mode;
        /**
         * Sets the Mode
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public WorkbookFunctionsFloor_MathParameterSetBuilder withMode(@Nullable final com.google.gson.JsonElement val) {
            this.mode = val;
            return this;
        }
        /**
         * Instanciates a new WorkbookFunctionsFloor_MathParameterSetBuilder
         */
        @Nullable
        protected WorkbookFunctionsFloor_MathParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookFunctionsFloor_MathParameterSet build() {
            return new WorkbookFunctionsFloor_MathParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.number != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("number", number));
        }
        if(this.significance != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("significance", significance));
        }
        if(this.mode != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("mode", mode));
        }
        return result;
    }
}
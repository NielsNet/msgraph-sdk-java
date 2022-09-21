// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.WorkbookRange;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Convert To Range Parameter Set.
 */
public class WorkbookTableConvertToRangeParameterSet {

    /**
     * Instiaciates a new WorkbookTableConvertToRangeParameterSet
     */
    public WorkbookTableConvertToRangeParameterSet() {}
    /**
     * Instiaciates a new WorkbookTableConvertToRangeParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookTableConvertToRangeParameterSet(@Nonnull final WorkbookTableConvertToRangeParameterSetBuilder builder) {
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookTableConvertToRangeParameterSetBuilder newBuilder() {
        return new WorkbookTableConvertToRangeParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookTableConvertToRangeParameterSet
     */
    public static final class WorkbookTableConvertToRangeParameterSetBuilder {
        /**
         * Instanciates a new WorkbookTableConvertToRangeParameterSetBuilder
         */
        @Nullable
        protected WorkbookTableConvertToRangeParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookTableConvertToRangeParameterSet build() {
            return new WorkbookTableConvertToRangeParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        return result;
    }
}
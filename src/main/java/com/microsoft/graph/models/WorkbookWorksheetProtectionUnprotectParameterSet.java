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
 * The class for the Workbook Worksheet Protection Unprotect Parameter Set.
 */
public class WorkbookWorksheetProtectionUnprotectParameterSet {

    /**
     * Instiaciates a new WorkbookWorksheetProtectionUnprotectParameterSet
     */
    public WorkbookWorksheetProtectionUnprotectParameterSet() {}
    /**
     * Instiaciates a new WorkbookWorksheetProtectionUnprotectParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected WorkbookWorksheetProtectionUnprotectParameterSet(@Nonnull final WorkbookWorksheetProtectionUnprotectParameterSetBuilder builder) {
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static WorkbookWorksheetProtectionUnprotectParameterSetBuilder newBuilder() {
        return new WorkbookWorksheetProtectionUnprotectParameterSetBuilder();
    }
    /**
     * Fluent builder for the WorkbookWorksheetProtectionUnprotectParameterSet
     */
    public static final class WorkbookWorksheetProtectionUnprotectParameterSetBuilder {
        /**
         * Instanciates a new WorkbookWorksheetProtectionUnprotectParameterSetBuilder
         */
        @Nullable
        protected WorkbookWorksheetProtectionUnprotectParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public WorkbookWorksheetProtectionUnprotectParameterSet build() {
            return new WorkbookWorksheetProtectionUnprotectParameterSet(this);
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
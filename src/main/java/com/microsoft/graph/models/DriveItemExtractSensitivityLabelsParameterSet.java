// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.ExtractSensitivityLabelsResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Drive Item Extract Sensitivity Labels Parameter Set.
 */
public class DriveItemExtractSensitivityLabelsParameterSet {

    /**
     * Instiaciates a new DriveItemExtractSensitivityLabelsParameterSet
     */
    public DriveItemExtractSensitivityLabelsParameterSet() {}
    /**
     * Instiaciates a new DriveItemExtractSensitivityLabelsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected DriveItemExtractSensitivityLabelsParameterSet(@Nonnull final DriveItemExtractSensitivityLabelsParameterSetBuilder builder) {
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static DriveItemExtractSensitivityLabelsParameterSetBuilder newBuilder() {
        return new DriveItemExtractSensitivityLabelsParameterSetBuilder();
    }
    /**
     * Fluent builder for the DriveItemExtractSensitivityLabelsParameterSet
     */
    public static final class DriveItemExtractSensitivityLabelsParameterSetBuilder {
        /**
         * Instanciates a new DriveItemExtractSensitivityLabelsParameterSetBuilder
         */
        @Nullable
        protected DriveItemExtractSensitivityLabelsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public DriveItemExtractSensitivityLabelsParameterSet build() {
            return new DriveItemExtractSensitivityLabelsParameterSet(this);
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
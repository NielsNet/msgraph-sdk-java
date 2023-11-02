// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.DeviceAndAppManagementData;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Export Device And App Management Data Parameter Set.
 */
public class UserExportDeviceAndAppManagementDataParameterSet {
    /**
     * The skip.
     * 
     */
    @SerializedName(value = "skip", alternate = {"Skip"})
    @Expose
	@Nullable
    public Integer skip;

    /**
     * The top.
     * 
     */
    @SerializedName(value = "top", alternate = {"Top"})
    @Expose
	@Nullable
    public Integer top;


    /**
     * Instiaciates a new UserExportDeviceAndAppManagementDataParameterSet
     */
    public UserExportDeviceAndAppManagementDataParameterSet() {}
    /**
     * Instiaciates a new UserExportDeviceAndAppManagementDataParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected UserExportDeviceAndAppManagementDataParameterSet(@Nonnull final UserExportDeviceAndAppManagementDataParameterSetBuilder builder) {
        this.skip = builder.skip;
        this.top = builder.top;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static UserExportDeviceAndAppManagementDataParameterSetBuilder newBuilder() {
        return new UserExportDeviceAndAppManagementDataParameterSetBuilder();
    }
    /**
     * Fluent builder for the UserExportDeviceAndAppManagementDataParameterSet
     */
    public static final class UserExportDeviceAndAppManagementDataParameterSetBuilder {
        /**
         * The skip parameter value
         */
        @Nullable
        protected Integer skip;
        /**
         * Sets the Skip
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UserExportDeviceAndAppManagementDataParameterSetBuilder withSkip(@Nullable final Integer val) {
            this.skip = val;
            return this;
        }
        /**
         * The top parameter value
         */
        @Nullable
        protected Integer top;
        /**
         * Sets the Top
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public UserExportDeviceAndAppManagementDataParameterSetBuilder withTop(@Nullable final Integer val) {
            this.top = val;
            return this;
        }
        /**
         * Instanciates a new UserExportDeviceAndAppManagementDataParameterSetBuilder
         */
        @Nullable
        protected UserExportDeviceAndAppManagementDataParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public UserExportDeviceAndAppManagementDataParameterSet build() {
            return new UserExportDeviceAndAppManagementDataParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.skip != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("skip", skip));
        }
        if(this.top != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("top", top));
        }
        return result;
    }
}
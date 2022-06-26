// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.ManagedMobileApp;
import com.microsoft.graph.models.TargetedManagedAppGroupType;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Configuration Target Apps Parameter Set.
 */
public class TargetedManagedAppConfigurationTargetAppsParameterSet {
    /**
     * The apps.
     * 
     */
    @SerializedName(value = "apps", alternate = {"Apps"})
    @Expose
	@Nullable
    public java.util.List<ManagedMobileApp> apps;

    /**
     * The app Group Type.
     * 
     */
    @SerializedName(value = "appGroupType", alternate = {"AppGroupType"})
    @Expose
	@Nullable
    public TargetedManagedAppGroupType appGroupType;


    /**
     * Instiaciates a new TargetedManagedAppConfigurationTargetAppsParameterSet
     */
    public TargetedManagedAppConfigurationTargetAppsParameterSet() {}
    /**
     * Instiaciates a new TargetedManagedAppConfigurationTargetAppsParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected TargetedManagedAppConfigurationTargetAppsParameterSet(@Nonnull final TargetedManagedAppConfigurationTargetAppsParameterSetBuilder builder) {
        this.apps = builder.apps;
        this.appGroupType = builder.appGroupType;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static TargetedManagedAppConfigurationTargetAppsParameterSetBuilder newBuilder() {
        return new TargetedManagedAppConfigurationTargetAppsParameterSetBuilder();
    }
    /**
     * Fluent builder for the TargetedManagedAppConfigurationTargetAppsParameterSet
     */
    public static final class TargetedManagedAppConfigurationTargetAppsParameterSetBuilder {
        /**
         * The apps parameter value
         */
        @Nullable
        protected java.util.List<ManagedMobileApp> apps;
        /**
         * Sets the Apps
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TargetedManagedAppConfigurationTargetAppsParameterSetBuilder withApps(@Nullable final java.util.List<ManagedMobileApp> val) {
            this.apps = val;
            return this;
        }
        /**
         * The appGroupType parameter value
         */
        @Nullable
        protected TargetedManagedAppGroupType appGroupType;
        /**
         * Sets the AppGroupType
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public TargetedManagedAppConfigurationTargetAppsParameterSetBuilder withAppGroupType(@Nullable final TargetedManagedAppGroupType val) {
            this.appGroupType = val;
            return this;
        }
        /**
         * Instanciates a new TargetedManagedAppConfigurationTargetAppsParameterSetBuilder
         */
        @Nullable
        protected TargetedManagedAppConfigurationTargetAppsParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public TargetedManagedAppConfigurationTargetAppsParameterSet build() {
            return new TargetedManagedAppConfigurationTargetAppsParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.apps != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("apps", apps));
        }
        if(this.appGroupType != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("appGroupType", appGroupType));
        }
        return result;
    }
}
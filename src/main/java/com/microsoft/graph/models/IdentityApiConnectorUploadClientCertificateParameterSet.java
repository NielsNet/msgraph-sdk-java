// Template Source: BaseMethodParameterSet.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;

import com.microsoft.graph.models.IdentityApiConnector;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import java.util.EnumSet;
import java.util.ArrayList;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Identity Api Connector Upload Client Certificate Parameter Set.
 */
public class IdentityApiConnectorUploadClientCertificateParameterSet {
    /**
     * The pkcs12Value.
     * 
     */
    @SerializedName(value = "pkcs12Value", alternate = {"Pkcs12Value"})
    @Expose
	@Nullable
    public String pkcs12Value;

    /**
     * The password.
     * 
     */
    @SerializedName(value = "password", alternate = {"Password"})
    @Expose
	@Nullable
    public String password;


    /**
     * Instiaciates a new IdentityApiConnectorUploadClientCertificateParameterSet
     */
    public IdentityApiConnectorUploadClientCertificateParameterSet() {}
    /**
     * Instiaciates a new IdentityApiConnectorUploadClientCertificateParameterSet
     * @param builder builder bearing the parameters to initialize from
     */
    protected IdentityApiConnectorUploadClientCertificateParameterSet(@Nonnull final IdentityApiConnectorUploadClientCertificateParameterSetBuilder builder) {
        this.pkcs12Value = builder.pkcs12Value;
        this.password = builder.password;
    }
    /**
     * Gets a new builder for the body
     * @return a new builder
     */
    @Nonnull
    public static IdentityApiConnectorUploadClientCertificateParameterSetBuilder newBuilder() {
        return new IdentityApiConnectorUploadClientCertificateParameterSetBuilder();
    }
    /**
     * Fluent builder for the IdentityApiConnectorUploadClientCertificateParameterSet
     */
    public static final class IdentityApiConnectorUploadClientCertificateParameterSetBuilder {
        /**
         * The pkcs12Value parameter value
         */
        @Nullable
        protected String pkcs12Value;
        /**
         * Sets the Pkcs12Value
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public IdentityApiConnectorUploadClientCertificateParameterSetBuilder withPkcs12Value(@Nullable final String val) {
            this.pkcs12Value = val;
            return this;
        }
        /**
         * The password parameter value
         */
        @Nullable
        protected String password;
        /**
         * Sets the Password
         * @param val the value to set it to
         * @return the current builder object
         */
        @Nonnull
        public IdentityApiConnectorUploadClientCertificateParameterSetBuilder withPassword(@Nullable final String val) {
            this.password = val;
            return this;
        }
        /**
         * Instanciates a new IdentityApiConnectorUploadClientCertificateParameterSetBuilder
         */
        @Nullable
        protected IdentityApiConnectorUploadClientCertificateParameterSetBuilder(){}
        /**
         * Buils the resulting body object to be passed to the request
         * @return the body object to pass to the request
         */
        @Nonnull
        public IdentityApiConnectorUploadClientCertificateParameterSet build() {
            return new IdentityApiConnectorUploadClientCertificateParameterSet(this);
        }
    }
    /**
     * Gets the functions options from the properties that have been set
     * @return a list of function options for the request
     */
    @Nonnull
    public java.util.List<com.microsoft.graph.options.FunctionOption> getFunctionOptions() {
        final ArrayList<com.microsoft.graph.options.FunctionOption> result = new ArrayList<>();
        if(this.pkcs12Value != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("pkcs12Value", pkcs12Value));
        }
        if(this.password != null) {
            result.add(new com.microsoft.graph.options.FunctionOption("password", password));
        }
        return result;
    }
}
// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.security.models.KubernetesNamespaceEvidence;
import com.microsoft.graph.security.models.AlertEvidence;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Kubernetes Secret Evidence.
 */
public class KubernetesSecretEvidence extends AlertEvidence implements IJsonBackedObject {


    /**
     * The Name.
     * The secret name.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Namespace.
     * The secret namespace.
     */
    @SerializedName(value = "namespace", alternate = {"Namespace"})
    @Expose
	@Nullable
    public KubernetesNamespaceEvidence namespace;

    /**
     * The Secret Type.
     * The secret type can include both built-in types and custom ones. Examples of built-in types are: Opaque, kubernetes.io/service-account-token, kubernetes.io/dockercfg, kubernetes.io/dockerconfigjson, kubernetes.io/basic-auth, kubernetes.io/ssh-auth, kubernetes.io/tls, bootstrap.kubernetes.io/token.
     */
    @SerializedName(value = "secretType", alternate = {"SecretType"})
    @Expose
	@Nullable
    public String secretType;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
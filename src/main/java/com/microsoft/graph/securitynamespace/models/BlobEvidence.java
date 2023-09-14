// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.security.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.security.models.BlobContainerEvidence;
import com.microsoft.graph.security.models.FileHash;
import com.microsoft.graph.security.models.AlertEvidence;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Blob Evidence.
 */
public class BlobEvidence extends AlertEvidence implements IJsonBackedObject {


    /**
     * The Blob Container.
     * The container which the blob belongs to.
     */
    @SerializedName(value = "blobContainer", alternate = {"BlobContainer"})
    @Expose
	@Nullable
    public BlobContainerEvidence blobContainer;

    /**
     * The Etag.
     * The Etag associated with this blob.
     */
    @SerializedName(value = "etag", alternate = {"Etag"})
    @Expose
	@Nullable
    public String etag;

    /**
     * The File Hashes.
     * The file hashes associated with this blob.
     */
    @SerializedName(value = "fileHashes", alternate = {"FileHashes"})
    @Expose
	@Nullable
    public java.util.List<FileHash> fileHashes;

    /**
     * The Name.
     * The name of the blob.
     */
    @SerializedName(value = "name", alternate = {"Name"})
    @Expose
	@Nullable
    public String name;

    /**
     * The Url.
     * The full URL representation of the blob.
     */
    @SerializedName(value = "url", alternate = {"Url"})
    @Expose
	@Nullable
    public String url;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
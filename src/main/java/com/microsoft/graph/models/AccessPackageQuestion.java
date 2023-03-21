// Template Source: BaseEntity.java.tt
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.AccessPackageLocalizedText;
import com.microsoft.graph.models.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Access Package Question.
 */
public class AccessPackageQuestion extends Entity implements IJsonBackedObject {


    /**
     * The Is Answer Editable.
     * Specifies whether the requestor is allowed to edit answers to questions for an assignment by posting an update to accessPackageAssignmentRequest.
     */
    @SerializedName(value = "isAnswerEditable", alternate = {"IsAnswerEditable"})
    @Expose
	@Nullable
    public Boolean isAnswerEditable;

    /**
     * The Is Required.
     * Whether the requestor is required to supply an answer or not.
     */
    @SerializedName(value = "isRequired", alternate = {"IsRequired"})
    @Expose
	@Nullable
    public Boolean isRequired;

    /**
     * The Localizations.
     * The text of the question represented in a format for a specific locale.
     */
    @SerializedName(value = "localizations", alternate = {"Localizations"})
    @Expose
	@Nullable
    public java.util.List<AccessPackageLocalizedText> localizations;

    /**
     * The Sequence.
     * Relative position of this question when displaying a list of questions to the requestor.
     */
    @SerializedName(value = "sequence", alternate = {"Sequence"})
    @Expose
	@Nullable
    public Integer sequence;

    /**
     * The Text.
     * The text of the question to show to the requestor.
     */
    @SerializedName(value = "text", alternate = {"Text"})
    @Expose
	@Nullable
    public String text;


    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {

    }
}
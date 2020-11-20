// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.models.extensions.WorkbookSortField;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import javax.annotation.Nullable;
import javax.annotation.Nonnull;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Table Sort.
 */
public class WorkbookTableSort extends Entity implements IJsonBackedObject {


    /**
     * The Fields.
     * Represents the current conditions used to last sort the table. Read-only.
     */
    @SerializedName(value = "fields", alternate = {"Fields"})
    @Expose
	@Nullable
    public java.util.List<WorkbookSortField> fields;

    /**
     * The Match Case.
     * Represents whether the casing impacted the last sort of the table. Read-only.
     */
    @SerializedName(value = "matchCase", alternate = {"MatchCase"})
    @Expose
	@Nullable
    public Boolean matchCase;

    /**
     * The Method.
     * Represents Chinese character ordering method last used to sort the table. The possible values are: PinYin, StrokeCount. Read-only.
     */
    @SerializedName(value = "method", alternate = {"Method"})
    @Expose
	@Nullable
    public String method;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    @Nullable
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
	@Override
    @Nullable
    public ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(@Nonnull final ISerializer serializer, @Nonnull final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;

    }
}

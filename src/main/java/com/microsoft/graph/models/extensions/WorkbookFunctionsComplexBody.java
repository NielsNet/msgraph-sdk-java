// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;

import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import com.google.gson.JsonObject;
import com.microsoft.graph.serializer.ISerializer;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Complex Body.
 */
public class WorkbookFunctionsComplexBody {

    /**
     * The real Num.
     * 
     */
    @SerializedName(value = "realNum", alternate = {"RealNum"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement realNum;

    /**
     * The i Num.
     * 
     */
    @SerializedName(value = "iNum", alternate = {"INum"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement iNum;

    /**
     * The suffix.
     * 
     */
    @SerializedName(value = "suffix", alternate = {"Suffix"})
    @Expose
	@Nullable
    public com.google.gson.JsonElement suffix;


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
